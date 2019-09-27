package com.trama.mystore;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class StoreApplicationTests {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void contextLoads() {
	}

	@Test
    public void checkCorrectChartReturn() throws Exception {

		mockMvc.perform(get("/getchart")
			.accept(MediaType.APPLICATION_JSON))
    		.andDo(MockMvcResultHandlers.print())
      		.andExpect(MockMvcResultMatchers.status().isOk())
			.andExpect(MockMvcResultMatchers.jsonPath("$.chartItems").exists())
			.andExpect(MockMvcResultMatchers.jsonPath("$.sumItems").exists());
	}

}
