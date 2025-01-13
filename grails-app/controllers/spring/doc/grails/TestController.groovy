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
    List<TestObject> index() {
        [
                new TestObject(id: '123', name: "myName1", other: 'otherStuff'),
                new TestObject(id: '456', name: "myName2"),
                new TestObject(id: '789', name: "myName3", other: 'things')
        ]
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

    @Operation(summary = 'Create a new record', description = "Creates a new record and returns it in the response")
    @ApiResponses(value = [
            @ApiResponse(responseCode = '200', description = 'Record saved successfully'),
    ])
    @PostMapping
    // has to be protected for grails to skip it as an endpoint, in order for spring to register it without conflict
    protected TestObject save(@RequestBody TestObject testObject) {
        testObject
    }

}
