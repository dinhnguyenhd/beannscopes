package dinhnguyen.scope.beans;

import java.util.Date;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class RequestBean {
	private Date now;

	public RequestBean() {
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
