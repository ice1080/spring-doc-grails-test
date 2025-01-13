package spring.doc.grails

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.Parameter
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.*

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
            summary = 'Retrieve a specific record by id',
            description = "Returns a single record",
            parameters = [
                    @Parameter(name = 'id', description = 'The id of the record', example = '456')
            ]
    )
    @ApiResponses(value = [
            @ApiResponse(responseCode = '200', description = 'Record found'),
            @ApiResponse(responseCode = '404', description = 'Record not found', content = @Content)
    ])
    @GetMapping(path = "/{id}")
    // has to be protected for grails to skip it as an endpoint, in order for spring to register it without conflict
    protected TestObject show(@PathVariable String id) {
        new TestObject(id: id, name: "myName", other: 'otherStuff')
    }

    @PostMapping
    @Operation(summary = 'Create a new record', description = "Creates a new record and returns it in the response")
    def save() {
        render "record saved"
    }

}
