package run;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import pages.Browsers;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/feature",
		glue = "steps",
		tags = "@form",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty", "html:target/report.html", "json:target/report.json"},
		snippets = SnippetType.CAMELCASE)

public class Executa extends Browsers{

	public void abrirNavegador(String site) {
		try {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver= new ChromeDriver();
			driver.get(site);
			driver.manage().window().maximize();
		} catch (Exception e) {
			System.err.println("---------- erro ao abrir navegador ---------- " + e.getMessage());
			System.err.println("---------- causa do erro ----------" + e.getCause());
		}

	}
}
