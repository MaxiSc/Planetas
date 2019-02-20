package App;

public abstract class Planet {
	protected Position position;
	protected int RADIUS;
	protected int DEGREE;
	
	public Position getPosition() {
		return position;
	}
	
	public void AddDay()
	{
		this.position.Move(this.DEGREE);
		System.out.println(this.toString() + " " + this.position.getDegrees() + "(" + this.position.getX() + "," + this.position.getY() + ")");
	}
	
	public Planet(int radius,int degree)
	{
		this.DEGREE = degree;
		this.RADIUS = radius;
		this.position = new Position(RADIUS);
	}
}
