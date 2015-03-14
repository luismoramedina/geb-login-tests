/*
	This is the Geb configuration file.
	
	See: http://www.gebish.org/manual/current/configuration.html
*/

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.phantomjs.PhantomJSDriver

driver = { new FirefoxDriver() }
//driver = { new ChromeDriver() }
//driver = { new PhantomJSDriver() }

baseUrl = "http://localhost:8000/"