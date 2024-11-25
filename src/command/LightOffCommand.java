package command;

public class LightOffCommand implements Command{

	Light light;
	
	public LightOffCommand(Light light) {
		this.light=light;
	}
	@Override
	public void exucute() {

		light.off();
		
		
	}
}
