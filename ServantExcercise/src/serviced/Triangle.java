package serviced;

public class Triangle implements Geometric
{
	private Position p;
	private char symbol;
	@Override
	public void setPosition(Position p) 
	{
		this.p = p;
		symbol = '^';
	}

	@Override
	public Position getPosition() 
	{
		// TODO return position of triangle
	}

	@Override
	public char getSymbol() {
		// TODO return symbol of triangle
	}
	
	
}
