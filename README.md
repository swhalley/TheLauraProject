# The Laura Project
Spring Boot Application. Implements a simple "contact" application (really it is just names) to try out spring boot and unify some of the knowledge pulled out from a bunch of sources.

Initial look at Spring Boot. The repository consists of two branches, 'standalone' and 'webapp'. 

*note* Gradle is required to be installed for either project to work.

### Standalone
The standalone branch consists of a main method which can be built and ran as a standard jar file. 

```
gradle jar
java -jar build/libs/contactRest.jar
```

### Webapp
The webapp branch has some modifications from the standalone app. Instead of creating a jar file, the webapp creates a war that can be delivered to any servlet 3.1+ container. In the example application Docker is used to create a Webspher LP server where the application will be deployed

```
gradle war
docker-compose up
```

Once the server is running, hit the index file here - http://localhost:9080/contactRest/


### Additional Help
See Docker log files ```docker-compose logs```
Run docker 
