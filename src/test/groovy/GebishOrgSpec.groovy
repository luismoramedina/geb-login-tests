import geb.spock.GebReportingSpec
import org.openqa.selenium.Cookie

class GebishOrgSpec extends GebReportingSpec {

    def "go to login"() {
        when:
        go "index.html"

        then:
        title == "Index"
    }

    def "login"() {
        given:
        go "index.html"

        when:
        username = "admin"

        and:
        $("input[type=submit]").click()

        then:
        title == "Server"
    }

    def "login with cookie"() {
        given:
        go "index.html"

        when:
        Cookie cookie = new Cookie("uno", "dos");
        driver.manage().addCookie( cookie )
        $("input[type=submit]").click()

        then:
        title == "Server"
    }
}