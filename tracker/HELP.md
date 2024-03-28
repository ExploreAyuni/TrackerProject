# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.3.0-SNAPSHOT/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.3.0-SNAPSHOT/maven-plugin/reference/html/#build-image)
* [Spring Boot Testcontainers support](https://docs.spring.io/spring-boot/docs/3.3.0-SNAPSHOT/reference/html/features.html#features.testing.testcontainers)
* [Testcontainers MySQL Module Reference Guide](https://java.testcontainers.org/modules/databases/mysql/)
* [Testcontainers MS SQL Server Module Reference Guide](https://java.testcontainers.org/modules/databases/mssqlserver/)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.3.0-SNAPSHOT/reference/htmlsingle/index.html#using.devtools)
* [Spring Session](https://docs.spring.io/spring-session/reference/)
* [Apache Freemarker](https://docs.spring.io/spring-boot/docs/3.3.0-SNAPSHOT/reference/htmlsingle/index.html#web.servlet.spring-mvc.template-engines)
* [Spring Web Services](https://docs.spring.io/spring-boot/docs/3.3.0-SNAPSHOT/reference/htmlsingle/index.html#io.webservices)
* [OAuth2 Client](https://docs.spring.io/spring-boot/docs/3.3.0-SNAPSHOT/reference/htmlsingle/index.html#web.security.oauth2.client)
* [JDBC API](https://docs.spring.io/spring-boot/docs/3.3.0-SNAPSHOT/reference/htmlsingle/index.html#data.sql)
* [Config Client Quick Start](https://docs.spring.io/spring-cloud-config/docs/current/reference/html/#_client_side_usage)
* [Spring REST Docs](https://docs.spring.io/spring-restdocs/docs/current/reference/htmlsingle/)
* [Testcontainers](https://java.testcontainers.org/)

### Guides
The following guides illustrate how to use some features concretely:

* [Producing a SOAP web service](https://spring.io/guides/gs/producing-web-service/)
* [Accessing Relational Data using JDBC with Spring](https://spring.io/guides/gs/relational-data-access/)
* [Managing Transactions](https://spring.io/guides/gs/managing-transactions/)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)

### Testcontainers support

This project uses [Testcontainers at development time](https://docs.spring.io/spring-boot/docs/3.3.0-SNAPSHOT/reference/html/features.html#features.testing.testcontainers.at-development-time).

Testcontainers has been configured to use the following Docker images:

* [`mysql:latest`](https://hub.docker.com/_/mysql)
* [`mcr.microsoft.com/mssql/server:latest`](https://mcr.microsoft.com/en-us/product/mssql/server/about/)

Please review the tags of the used images and set them to the same as you're running in production.

