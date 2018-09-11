package de.claudioaltamura.docker.springboot.helloworld;

import java.util.Optional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

  @GetMapping(value = {"/helloworld", "/helloworld/{name}"})
  public String greet(@PathVariable final Optional<String> name) {
    if (name.isPresent())
      return "Hello " + name.get() + "!";
    else {
      return "Hello World!";
    }
  }

}
