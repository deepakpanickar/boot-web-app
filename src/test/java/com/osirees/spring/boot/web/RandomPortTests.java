package com.osirees.spring.boot.web;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class RandomPortTests {

	@LocalServerPort
	private int port;

	@Test
	void contextLoads() throws Exception {
		String responseStr = given().baseUri("http://localhost").port(port).when().get("/hi").then().assertThat()
				.statusCode(HttpStatus.OK.value()).extract().body().asString();
		assertEquals(responseStr, "Hello World");
	}
}
