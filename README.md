# The Laura Project
Spring Boot Application. Implements a simple "contact" application (really it is just names) to try out spring boot and unify some of the knowledge pulled out from a bunch of sources.

Initial look at Spring Boot. The repository consists of three branches, 'standalone', 'webapp' and 'orm'. 

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

If modifying the application; after the server is up and running, simple rebuild the war and websphere will automatically redeploy the jar from the /build/libs directory. The docker compose file has a volume mapped internally to the docker image so any changes to the war file will automatically be picked up. Simply running ```gradle war``` again is enough to trigger the redeploy

### ORM
   - This branch is a work in progress.

Using MyBatis version for spring boot, looking at ways to adapt the web app to now use mybatis and connection strings that can be found in the container rather than the application. The application will be backed by a Postgres DB.

```
gradle war
docker-compose up
```

   - Application can still be hit using the url http://localhost:9080/contactRest/
   - Postgres database is available on port 5432
   - The docker compose file initializes the database with the seed data found in `seedData.sql`. Adding new queries here will be added to the DB when the container starts up


### Additional Help
See Docker log files ```docker-compose logs```
Run docker 
