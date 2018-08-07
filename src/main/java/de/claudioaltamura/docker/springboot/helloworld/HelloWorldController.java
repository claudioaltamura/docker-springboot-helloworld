package de.claudioaltamura.docker.springboot.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/helloworld/{name}")
	public String byYear(@PathVariable final String name) {
		if(name == null)
			return "Hello World!";

		return "Hello " + name + "!";
	}

}
