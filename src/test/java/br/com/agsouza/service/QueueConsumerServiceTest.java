package br.com.agsouza.service;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class QueueConsumerServiceTest {

    @Autowired
    private QueueConsumerService consume;

    @Test
    void testReceive() {
        
    	String fileBody = "Test message";   	    
    	    
    	consume.receive(fileBody);    	    
    	
    }
}
    	    