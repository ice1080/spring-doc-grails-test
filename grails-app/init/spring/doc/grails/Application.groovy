package spring.doc.grails

import grails.boot.GrailsApp
import grails.boot.config.GrailsAutoConfiguration
import groovy.transform.CompileStatic
import io.swagger.v3.oas.annotations.ExternalDocumentation
import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Info

@OpenAPIDefinition(
        info = @Info(
                title = "Test Grails API",
                version = "1.0",
                description = "Grails API to test SpringDoc"
        ),
        externalDocs = @ExternalDocumentation(
                description = "SpringDoc Documentation",
                url = "https://springdoc.org/v1/"
        )
)
@CompileStatic
class Application extends GrailsAutoConfiguration {
    static void main(String[] args) {
        GrailsApp.run(Application, args)
    }
}
