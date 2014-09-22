package in.blogspot.randomcompiler.command.pattern.demo;

import in.blogspot.randomcompiler.command.pattern.api.Command;
import in.blogspot.randomcompiler.command.pattern.impl.Broker;
import in.blogspot.randomcompiler.command.pattern.impl.BuyStockCommand;
import in.blogspot.randomcompiler.command.pattern.impl.SellStockCommand;
import in.blogspot.randomcompiler.command.pattern.impl.Stock;

public class CommandPatternDemo {

	public static void main(String[] args) {
		Broker broker = new Broker();
		
		Stock s = new Stock();
		
		Command c1 = new BuyStockCommand(s);
		broker.takeCommand(c1);
		
		Command c2 = new SellStockCommand(s);
		broker.takeCommand(c2);
		
		Command c3 = new BuyStockCommand(s);
		broker.takeCommand(c3);
		
		Command c4 = new SellStockCommand(s);
		broker.takeCommand(c4);
		
		broker.placeCommands();
	}

}
