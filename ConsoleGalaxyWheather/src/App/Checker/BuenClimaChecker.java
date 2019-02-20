package App.Checker;

import java.util.List;

import App.Planet;

public class BuenClimaChecker extends Checker {
	public boolean Condicion(List<Planet> cur) {
		//descarto que no esten en la misma absisa u ordenanda
		if (cur.get(0).getPosition().getX() == cur.get(1).getPosition().getX() &&
			cur.get(1).getPosition().getX() == cur.get(2).getPosition().getX() ) {
			return true;
		}
				
			
		if (cur.get(0).getPosition().getY() == cur.get(1).getPosition().getY() &&
			cur.get(1).getPosition().getY() == cur.get(2).getPosition().getY() ) {
			return true;
		}

		if (generateFunction(cur.get(0).getPosition().getX(),
							cur.get(0).getPosition().getY(),
							cur.get(1).getPosition().getX(),
							cur.get(1).getPosition().getY(),
							cur.get(2).getPosition().getX(),
							cur.get(2).getPosition().getY())
			){
			return true;
		}
			
		
		return false;
	}
	
	public String toString() {
		return "BuenClima";
	}
	
	private boolean generateFunction(double x1,double y1, double x2, double y2, double xn, double yn) {
		//no puede dividir por cero, por que sino saltaria en la condicon anterior
		double m = (y1 - y2) / (x1 - x2);
		double b = y1 - (m * x1);
		double result = (m * xn) + b;
		//System.out.println("	" +m + "x + " + b);
		//System.out.println("	" +m + " * " +xn + " + "  + b + " = " + result);
		System.out.println("assad " + ((double)result-yn));
		if (((double)result-yn) < 100 && ((double)result-yn) > -100)
		{
			System.out.println("CERCA");
			System.out.println(result + " $ " + yn);
		}
		return result == yn;
	}
	
	private void testGenerateFunction() {
		if (generateFunction(1,1,2,2,3,3))
		{
			System.out.println("a) 11 " + generateFunction(0,5,5,20,2 ,11));
			System.out.println("b) 2 " + generateFunction(2,0,0,-1,6, 2));
			
		}
	}
}

