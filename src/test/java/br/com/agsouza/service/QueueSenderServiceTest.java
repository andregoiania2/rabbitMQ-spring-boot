package br.com.agsouza.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

@ExtendWith(MockitoExtension.class)
class QueueSenderServiceTest {

	@Mock
    private RabbitTemplate rabbitTemplate;
    
    @Mock
    private Queue queue;
    
    @Captor
    private ArgumentCaptor<String> captor;
    
    @InjectMocks
    private QueueSenderService queueSenderService;
    
    @Test
    void testSend() {
        String order = "example order";
        
        queueSenderService.send(order);
        
        verify(rabbitTemplate).convertAndSend(isNull(), captor.capture());
        assertEquals(order, captor.getValue());
    }


}
