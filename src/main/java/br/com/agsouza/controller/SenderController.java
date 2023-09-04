package br.com.agsouza.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.agsouza.service.QueueSenderService;

@RestController
@RequestMapping("/teste")
public class SenderController {
	
	@Autowired
	private QueueSenderService service;

	@PostMapping
    public String send(@RequestBody String request){
        service.send(request);
        return "ok. done";
    }

}
