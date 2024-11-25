package command;

public class Light {

	private String location;
	
	
	public Light(String location ) {
		this.location=location;
	}
	public void on() {
		System.out.println("light is on ");
	}
	public void off() {
		System.out.println("light is off");
	}
}
