package in.blogspot.randomcompiler.command.pattern.impl;

import in.blogspot.randomcompiler.command.pattern.api.Command;

public class BuyStockCommand implements Command {
	private Stock stock;
	
	public BuyStockCommand(Stock stock) {
		this.stock = stock;
	}
	
	public void execute() {
		stock.buy();
	}
}
