package App;

public class Position {
	public double getX() {
		return  Math.floor(Math.cos(Math.toRadians(degrees)) * radius * 0.1) / 0.1;
	}
	
	public double getY() {
		return Math.floor(Math.sin(Math.toRadians(degrees)) * radius * 0.1) / 0.1;
	}
	
	public int getDegrees() {
		return degrees;
	}
	
	public double getRadians() {
		return Math.toRadians(degrees);
	}
	public void setDegrees(int degrees) {
		this.degrees = degrees;
	}
	
	private double x = 0;
	private double y = 0;
	private int degrees = 0;
	private int radius = 0;
	
	public Position(int radius) {
		this.radius = radius;
	}
	
	public void Move(int degrees) {
		
		this.degrees = (this.degrees + degrees ) % 360 ;
		//con el mod me aseguro que si da mas de una vuelta, sigue deontro del intervalo permitido [0,359]
		
		if (this.degrees < 0)
		{
			this.degrees += 360;
		}
		//Si paso a grados negativos, le sumo 360 para obtenerlos siempre positivos( aunque avance en sentido horario)
	}
	

}
