---
title: gaefriendly-version-maven-plugin
layout: default
---

### Sample plugin configuration

	<plugins>
		...
		<plugin>
			<groupId>com.pangratz</groupId>
			<artifactId>gaefriendly-version-maven-plugin</artifactId>
			<version>0.0.1-SNAPSHOT</version>
			<configuration>
				<propertyName>myVersion</propertyName>
			</configuration>
			<executions>
				<execution>
					<id>my-id</id>
					<phase>validate</phase>
					<goals>
						<goal>create-property</goal>
					</goals>
				</execution>
			</executions>
		</plugin>
		...
	</plugins>