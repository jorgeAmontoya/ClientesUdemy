package com.crud.clientes.demo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ClentesApplicationTests {
	private BrowserGetter browserGetter = new BrowserGetter();

	private WebDriver driver;


	@BeforeAll
	public void beforeAll(){
	driver = browserGetter.getChromeDriver();
	}

	@AfterAll
	public void afterAll(){
	driver.quit();
	}

	@Test
	void contextLoads() {
		String expectedTitle = "Example title";
		driver.get("https://www.example.com");
		assertEquals(expectedTitle, driver.getTitle());
	}
}
