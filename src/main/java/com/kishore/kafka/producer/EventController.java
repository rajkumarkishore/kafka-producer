package com.kishore.kafka.producer;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

	@Autowired
	private MessageProducer producer;

	@GetMapping(path = "/home")
	public String home() {
		producer.sendMessage("Event logged at : " + new Date());
		return "Welcome home! Today is:" + new Date() ;
	}

}
