package spring.doc.grails.test

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification
import spring.doc.grails.TestController

class TestControllerSpec extends Specification implements ControllerUnitTest<TestController> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
