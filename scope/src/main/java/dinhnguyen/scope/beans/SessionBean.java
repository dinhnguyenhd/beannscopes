package dinhnguyen.scope.beans;

import java.util.Date;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class SessionBean {
	private Date now;

	public SessionBean() {
		super();
		this.now = new Date();
	}

	public Date getNow() {
		return now;
	}

	public void setNow(Date now) {
		this.now = now;
	}

}
