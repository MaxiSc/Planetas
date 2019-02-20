package App.Checker;

import java.util.List;

import App.Planet;


public abstract class Checker implements IChain {
	private IChain chain;
	

	public void setNextChain(IChain nextChain) {
		this.chain=nextChain;
	}

	public void check(List<Planet> cur) {
		//sSystem.out.println("Chequeando " + this.toString());
		if(Condicion(cur)){
			System.out.println("Hay " + this.toString());
		}else{
			if (this.chain != null)
			this.chain.check(cur);
		}
	}
	
	protected abstract boolean Condicion(List<Planet> cur);
}
