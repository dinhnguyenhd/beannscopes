package dinhnguyen.scope.controllers;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

@RestController
@RequestScope
public class RequestController {

	@GetMapping("/test/request")
	public String test() {
		Date date = new Date();
		return date.toString();

	}

}
