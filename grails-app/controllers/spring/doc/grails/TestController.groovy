package spring.doc.grails

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.Parameter
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping('api/test')
@RestController
@Tag(name = 'test-controller', description = 'Used for Test records')
class TestController {
    @Operation(summary = 'List all records', description = "Returns a list of all records")
    @GetMapping
    def index() {
        render 'all records'
    }

    @Operation(
            summary = 'Retrieve a specific record',
            description = "Returns a single record",
            parameters = [
                    @Parameter(name = 'id', description = 'The id of the record', example = '123')
            ]
    )
    @GetMapping("/{id}")
    def show() {
        render "showing record ${params.id}"
    }

    @PostMapping
    @Operation(summary = 'Create a new record', description = "Creates a new record and returns it in the response")
    def save() {
        render "record saved"
    }

}
