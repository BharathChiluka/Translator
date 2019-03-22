package com.Translator.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Translator.model.Script;

@RestController
public class Translatecontroller 
{
	
	@Autowired Sender sender;
	
	@PostMapping("/send")
	public void message(@RequestBody Script script) throws IOException
	{
	       Sender.send(script);
	}

}
