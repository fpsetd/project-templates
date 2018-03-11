# project-templates

- 打算建几个常用的项目骨架，包括一些项目配置，方便以后使用

- 使用骨架所需 JDK 版本为 1.8 及以上

- 所有骨架均使用 Maven 构建

## thymeleaf-spring-mybatis

- 使用 `thymeleaf` + `springmvc` + `spring` + `mybatis` 搭建而成，经典口味

- 使用 Java 的方式配置 `springmvc`

- `springmvc` 中配置有对 `LocalDate` 和 `LocalDateTime` 的转换，提交和打印的格式都为 `yyyy-MM-dd(LocalDate)` 或 `yyyy-MM-dd HH:mm:ss(LocalDateTime)`

- `mybatis` 支持 `LocalDate` 和 `LocalDateTime` 到 JDBC 类型的转换：

> **NOTE** Since version 3.4.5, The MyBatis has been supported JSR-310(Date and Time API) by default.

## thymeleaf-spring-jpa

// TODO
