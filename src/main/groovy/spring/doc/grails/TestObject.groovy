package spring.doc.grails

import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = 'Example object for showing Schema descriptions', type = 'object')
class TestObject implements Serializable {
    @Schema(description = 'The id of the object', example = '123', requiredMode = Schema.RequiredMode.REQUIRED)
    String id
    @Schema(description = 'The name of the object', example = 'myName', requiredMode = Schema.RequiredMode.REQUIRED)
    String name
    @Schema(description = 'The other of the object', example = 'otherStuff', requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    String other
}
