package com.todo.restfullwebservice.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class helloworldController {

	@GetMapping(path ="/helloworld")
	public String helloworld() {
		return "hello World";
	}
	
	@GetMapping(path ="/helloworld-bean")
	public helloworldBean helloworldBean() {
		throw new RuntimeException("Some error has occured!! contact support at 100....!!!");
//		return new helloworldBean("hello World");
	}
	
	@GetMapping(path ="/helloworld/path-variable/{name}")
	public helloworldBean helloWorldVariable(@PathVariable String name) {
		return new helloworldBean(String.format("hello World, %s",name));
	} 
}
