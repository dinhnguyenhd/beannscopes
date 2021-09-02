package dinhnguyen.scope.beans;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
@org.springframework.web.context.annotation.ApplicationScope
public class ApplicationScope {
	private Date now;

	public ApplicationScope() {
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
