# Spring Boot Lazy Initialization example

## Configuration
`spring.main.lazy-initialization` is set to `false` by default. This can be set to `true` to enable Lazy Initialization in the Spring Boot Project.

## Alternatives
- `http://localhost:8080/lazy` - Uses `LazyController` and `LazyService` which can be marked manually as `@Lazy` for specific Beans