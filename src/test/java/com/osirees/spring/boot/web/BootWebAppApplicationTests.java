package com.osirees.spring.boot.web;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class BootWebAppApplicationTests {
	
	@Autowired
	MockMvc mockMvc;

	@Test
	void testApi() throws Exception {
		mockMvc.perform(get("/hi"))
        .andExpect(status().isOk());
	}

}
