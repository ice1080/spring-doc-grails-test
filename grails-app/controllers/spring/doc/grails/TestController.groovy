package spring.doc.grails

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping('/api/test')
@RestController
class TestController {

    /** List all records */
    @GetMapping
    def index() {
        render 'all records'
    }

//    def show(@PathVariable() @Parameter(example = "123") String id) {

    /** Show a single record */
    @GetMapping("/{id}")
    def show() {
        render "showing record ${params.id}"
    }

    /** Create a new record */
    @PostMapping
    def save() {
        render "record saved"
    }

}
