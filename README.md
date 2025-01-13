# SpringDoc and Grails 6

Grails 6 example project with SpringDoc OpenAPI UI.

## Running the app locally

```shell
./gradlew bootRun
```

## Viewing the API

Open the Swagger UI
at [http://localhost:8080/newContext/swagger-ui.html](http://localhost:8080/newContext/swagger-ui.html)

## Notes

* The `newContext` path is added in application.yml to demonstrate that this works for modified context paths.
* Additional dependencies are added to the build.gradle file to support SpringDoc.
* This project also demonstrates a RestController that is not tied to a specific domain class, as that was needed in our
  use case.
* Modifications to springdoc can also be made in application.yml using the standard config keys from springdoc ([reference](https://springdoc.org/v1/#springdoc-openapi-core-properties))
* This repo has auth disabled, but it should be easy to add via configuration

