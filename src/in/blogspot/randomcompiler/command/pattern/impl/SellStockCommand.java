package in.blogspot.randomcompiler.command.pattern.impl;

import in.blogspot.randomcompiler.command.pattern.api.Command;

public class SellStockCommand implements Command {
	private Stock stock;
	
	public SellStockCommand(Stock stock) {
		this.stock = stock;
	}
	
	public void execute() {
		stock.sell();
	}
}
