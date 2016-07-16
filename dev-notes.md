2016-07-17-AS:
* Created init project with Spring boot framework
* Used `spring-boot-starter-web` dependency in `pom.xml`
* Created `/hello` mapping for testing inside `App` class
* Added `spring-boot-devtools` dependency in `pom.xml`, which allows the server started inside Eclipse to automatically refreshed whenever you changed the program
* Added `fork` option true in `pom.xml` inside `spring-boot-maven-plugin`. In this way, you can run the server outside the Eclipse enviroment using:

```bash
$ mvn spring-boot:run
```

   and the server is automatically refreshed when you modify the codes. Cool, eh?
