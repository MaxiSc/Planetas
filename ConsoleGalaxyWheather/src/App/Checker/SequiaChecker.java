package App.Checker;

import java.util.List;

import App.Planet;

public class SequiaChecker extends Checker {
	public boolean Condicion(List<Planet> cur) {
		//todos alineados con el sol
		
		//los puntos que estan en la misma recta, y alineados con el sol tienen la misma tangente
				
		//Primero reviso los ejes donde la tangente no esta definida
		if (Math.cos(cur.get(0).getPosition().getRadians()) == 0 &&
		    Math.cos(cur.get(1).getPosition().getRadians()) == 0 &&
		    Math.cos(cur.get(2).getPosition().getRadians()) == 0)
			return true;
		
		if (Math.sin(cur.get(0).getPosition().getRadians()) == 0 &&
			Math.sin(cur.get(1).getPosition().getRadians()) == 0 &&
			Math.sin(cur.get(2).getPosition().getRadians()) == 0)
				return true;
		
		//si no esta en los ejes, aplico la tangente
		if (Math.tan(cur.get(0).getPosition().getRadians()) == Math.tan(cur.get(1).getPosition().getRadians()) &&
			Math.tan(cur.get(1).getPosition().getRadians()) == Math.tan(cur.get(2).getPosition().getRadians()))
				return true;	

		return false;
	}
	
	public String toString() {
		return "Sequia";
	}
	
}
