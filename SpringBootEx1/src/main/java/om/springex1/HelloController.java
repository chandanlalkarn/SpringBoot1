package om.springex1;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String hello1() {
		return "Greetings from AWS Spring Boot Examples...";
	}

}
