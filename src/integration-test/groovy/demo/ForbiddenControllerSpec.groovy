package demo

import grails.plugins.rest.client.RestBuilder
import grails.test.mixin.integration.Integration
import spock.lang.Specification

@Integration
class ForbiddenControllerSpec extends Specification {

    def "delete has ben excluded, thus return 404"() {
        when:
        RestBuilder rest = new RestBuilder()
        def resp = rest.get("http://localhost:${serverPort}/forbidden") {
            accept('application/json')
        }

        then:
        resp.status == 403
        resp.text == 'error controller, action is forbidden'
    }
}
