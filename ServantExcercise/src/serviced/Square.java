package serviced;


public class Square implements Geometric
{

	private Position p;
	private char symbol;
	@Override
	public void setPosition(Position p) 
	{
		this.p = p;
		symbol = '#';
	}

	@Override
	public Position getPosition() 
	{
		// TODO return position of square
	}

	@Override
	public char getSymbol() {
		// TODO return symbol of square
	}

}
