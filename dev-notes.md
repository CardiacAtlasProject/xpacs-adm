2016-07-17-AS:
* Created init project with Spring boot framework
* Used `spring-boot-starter-web` dependency in `pom.xml`
* Created `/hello` mapping for testing inside `App` class
* Added `spring-boot-devtools` dependency in `pom.xml`, which allows the server started inside Eclipse to automatically refreshed whenever you changed the program
* Added `fork` option true in `pom.xml` inside `spring-boot-maven-plugin`. In this way, you can run the server outside the Eclipse environment using:

   ```bash
   $ mvn spring-boot:start
   ```
   and the server is automatically refreshed when you modify the codes. Cool, eh?

   Stop it using:
   ```bash
   $ mvn spring-boot:stop
   ```

* Found a good cheat sheet for application.properties: [http://makerj.tistory.com/189](http://makerj.tistory.com/189)
* But the common one is here: [http://docs.spring.io/spring-boot/docs/current/reference/html/common-application-properties.html](http://docs.spring.io/spring-boot/docs/current/reference/html/common-application-properties.html)
* Created application.properites.
* Server's context-path = `/xpacs-adm` with port number = 8585.
* Added log file in `application.properties`.
   How to log:

   ```java
   import org.slf4j.Logger;
   import org.slf4j.LoggerFactory;

   public class Foo {
     static final Logger logger = LoggerFactory.getLogger(Foo.class);

     public void doIt() {
       logger.debug("Did it again!");
       logger.info("just an info");
     }
   }
   ```

2016-08-03-AS:
* Create `dev` branch: this is for development.
* Adding [Spring Security](http://projects.spring.io/spring-security/):
  * Added dependency in the pom.xml
