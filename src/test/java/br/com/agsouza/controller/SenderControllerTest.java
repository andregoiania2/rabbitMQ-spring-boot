package br.com.agsouza.controller;

import java.net.URI;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import br.com.agsouza.service.QueueSenderService;

@WebMvcTest({SenderController.class})
class SenderControllerTest {
	@Autowired
	private MockMvc mockMvc;
	
    @MockBean
    private QueueSenderService service;    
	
	@Test
	void test() throws Exception {
		URI uri = new URI("/teste");
	    String request = "{\"msg\": \"msg de teste\"}";
	    
	    mockMvc
	            .perform(MockMvcRequestBuilders
	                    .post(uri)
	                    .content(request)						
	                    .contentType(MediaType.APPLICATION_JSON))
	            .andExpect(MockMvcResultMatchers
	                    .status()
	                    .is(200)
	            )
	            .andReturn();
		
	}

}
