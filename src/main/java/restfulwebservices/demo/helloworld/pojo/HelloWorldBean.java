package restfulwebservices.demo.helloworld.pojo;

public class HelloWorldBean {
	private String messagge;

	public HelloWorldBean(String message)
	{
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	}
	
}
