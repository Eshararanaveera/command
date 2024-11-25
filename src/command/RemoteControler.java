package command;

public class RemoteControler {

    Command[] onCommands;
    Command[] offCommands;

    public RemoteControler() {
        // Initialize arrays with size 7 to match the loop condition
        onCommands = new Command[7];
        offCommands = new Command[7];

        // Correctly place the loop inside the constructor
        for (int i = 0; i < 7; i++) {
            onCommands[i] = null;
            offCommands[i] = null;
        }
    }

    // Method to set the commands for each slot
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }   
    
    public void onButtonWasPushed(int slot) {
    	onCommands[slot].exucute();
    }
    public void offButtonWaspushed(int slot) {
    	offCommands[slot].exucute();
    }
}




