Depends on:
* [jbrogers63/jakarta-ee-parent](https://github.com/jbrogers63/jakarta-ee-parent)
* [jbrogers63/parent-pom](https://github.com/jbrogers63/parent-pom) (transitive)

To install:

```
git clone https://github.com/jbrogers63/jakartaee-starter-jsf jakartaee-starter-jsf
cd jakartaee-starter-jsf
mvn clean install
```

To use:

```
mvn archetype:generate \
  -DgroupId=YOUR_GROUP_ID \
  -DartifactId=YOUR_ARTIFACT_ID \
  -Dversion=YOUR_VERSION \
  -DarchetypeArtifactId=jakartaee-starter-jsf \
  -DarchetypeGroupId=jbrogers63 \
  -DarchetypeVersion=0.1.0 \
  -DinteractiveMode=false
```

Replace:
* YOUR_GROUP_ID with your own groupId
* YOUR_ARTIFACT_ID with your own artifactId
* YOUR_VERSION with your own version number (semantic or otherwise)
