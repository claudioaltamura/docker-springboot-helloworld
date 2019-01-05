package de.claudioaltamura.docker.springboot.helloworld;

import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

  private static final Logger log = LoggerFactory.getLogger(HelloWorldController.class);
  
  @GetMapping(value = {"/helloworld", "/helloworld/{name}"})
  public String greet(@PathVariable final Optional<String> name) {
    log.debug("greet '{}'", name.isPresent() ?  name.get() : "");
    
    if (name.isPresent())
      return "Hello " + name.get() + "!";
    else {
      return "Hello World!";
    }
  }

}
