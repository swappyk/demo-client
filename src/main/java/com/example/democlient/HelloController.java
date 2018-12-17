package com.example.democlient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest/hello")
public class HelloController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/test/{username}")
	public String sayHi(@PathVariable String username){
		return restTemplate.getForObject("http://demo-server/rest/hello/test", String.class) + " "   +username;
	} 

}
