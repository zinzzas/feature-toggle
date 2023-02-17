# README #

feature toggle sample using Spring Boot + Togglz

### Requirements ###

* Spring Boot 2.6.7
* Java 18 (feat.corretto-18)
* Gradle .2.x
* Togglz 3.3.3

### Building the artifact ###

```
gradle build
```

### Running the application from command line ###

```
gradle bootRun
```

### Toggles & Actuator Togglz Test URLs

```
java/com/sample/featuretoggle/http/test.http

curl -v http://localhost:9090/api/userName
curl -v http://localhost:9090/actuator/togglz
curl -v http://localhost:9090/actuator/togglz/{togglzName}
```
