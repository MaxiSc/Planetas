package App;

import java.util.Arrays;

import App.Checker.WheaterCheckerChain;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Planet vulcano = new Vulcano();
		Planet betasoide = new Betasoide();
		Planet ferengi = new Ferengi();
		WheaterCheckerChain wc = new WheaterCheckerChain();

		for (int i = 0; i <(365*5); i++) {
			vulcano.AddDay();
			betasoide.AddDay();
			ferengi.AddDay();
			wc.Start(Arrays.asList(vulcano, betasoide, ferengi));
		}
		
		
	}
	

}
