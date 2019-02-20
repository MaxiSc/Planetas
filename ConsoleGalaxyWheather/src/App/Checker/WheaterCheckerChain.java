package App.Checker;

import java.util.Arrays;
import java.util.List;

import App.Planet;

public class WheaterCheckerChain {
	
	private List<Checker> chequers = Arrays.asList(new SequiaChecker(), new LluviaChecker(), new BuenClimaChecker());

	
	public void  Start(List<Planet> planet) {
		chequers.get(0).check(planet);
		
	}
	
	public WheaterCheckerChain() {
		chequers.get(1).setNextChain(chequers.get(2));	
		chequers.get(0).setNextChain(chequers.get(1));
	}
}
