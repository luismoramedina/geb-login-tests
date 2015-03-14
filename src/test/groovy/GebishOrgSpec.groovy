import geb.spock.GebReportingSpec

class GebishOrgSpec extends GebReportingSpec {

    def "go to login"() {
        when:
        go "http://localhost:8000/index.html"

        then:
        title == "Index"
    }

    def "login"() {
        given:
        go "http://localhost:8000/index.html"

        when:
        username = "admin"
        
        and:
        $("input[type=submit]").click()

        then:
        title == "Server"
    }
}