package in.blogspot.randomcompiler.command.pattern.impl;

import in.blogspot.randomcompiler.command.pattern.api.Command;

import java.util.ArrayList;
import java.util.List;

public class Broker {
	private List<Command> commands = new ArrayList<Command>();
	
	public void takeCommand(Command command) {
		commands.add(command);
	}
	
	public void placeCommands() {
		for(Command c : commands) {
			c.execute();
		}
		commands.clear();
	}
}
