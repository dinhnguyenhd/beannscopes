package dinhnguyen.scope.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import dinhnguyen.scope.beans.ApplicationScope;
import dinhnguyen.scope.beans.RequestBean;
import dinhnguyen.scope.beans.SessionBean;

@RestController
public class SessionController {

	@Autowired
	private RequestBean rqBean;
	@Autowired
	private SessionBean ssBean;

	@Autowired
	private ApplicationScope appBean;

	@GetMapping("/test/session")
	public String test() {
		String s = "Request now : " + this.rqBean.getNow() + " session now :  " + this.ssBean.getNow() + " App Scope "
				+ this.appBean.getNow();
		System.out.println(s);
		return s;

	}

}
