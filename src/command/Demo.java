package command;

public class Demo {

	public static void main(String[] args) {
		Light lr=new Light("living room");
		Light k=new Light("kitch");
		
		LightOnCommand onlr=new LightOnCommand(lr);
		LightOffCommand offlr=new LightOffCommand(lr);
		
		LightOnCommand onk=new LightOnCommand(k);
		LightOffCommand offk=new LightOffCommand(k);

		
		RemoteControler rc =new RemoteControler();
		
		rc.setCommand(0, onk, offk);
		rc.setCommand(1, onlr, offlr);
		
		rc.onButtonWasPushed(0);
		rc.offButtonWaspushed(0);
		rc.offButtonWaspushed(1);
		rc.onButtonWasPushed(1);
	}
}
