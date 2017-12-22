package jupiterpi.readingproject.controller;

import javax.inject.Inject;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/project")
@RestController
public class ProjectController {
	@GetMapping("")
	public Greeting getHello() {
		return new Greeting("hello");
	}
}
