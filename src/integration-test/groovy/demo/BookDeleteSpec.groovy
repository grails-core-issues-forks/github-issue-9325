package demo

import grails.plugins.rest.client.RestBuilder
import grails.test.mixin.integration.Integration
import spock.lang.Specification

@Integration
class BookDeleteSpec extends Specification {

    def "delete has ben excluded, thus return 404"() {
        when:
        RestBuilder rest = new RestBuilder()
        def resp = rest.delete("http://localhost:${serverPort}/books/1") {
            accept('application/json')
        }

        then:
        resp.status == 404
    }
}
