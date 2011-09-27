package com.pangratz;

import java.util.Properties;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.project.MavenProject;

/**
 * @goal create-property
 */
public class CreateGaeFriendlyVersionMojo extends AbstractMojo {

	/**
	 * @parameter expression="${project}" required="true"
	 */
	private MavenProject mavenProject;

	/**
	 * @parameter expression="${create-property.propertyName}"
	 *            default-value="gaeFriendlyVersion"
	 */
	private String propertyName;

	public void execute() throws MojoExecutionException {
		String version = mavenProject.getVersion();
		Properties props = mavenProject.getProperties();

		String newVersion = version.toLowerCase();
		newVersion = newVersion.replace('.', '-');
		newVersion = newVersion.toLowerCase();
		props.put(propertyName, newVersion);

		getLog().info("added property " + propertyName + "=" + newVersion);
	}
}
