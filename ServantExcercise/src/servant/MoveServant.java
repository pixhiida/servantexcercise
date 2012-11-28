package servant;

import serviced.Geometric;
import serviced.Position;

public class MoveServant 
{
	public void moveBy(Geometric g,int x,int y)
	{
		//TODO move position by x and y
	}
	
	public void moveTo(Geometric g,Position p)
	{
		//set position for geometric
	}
	
	public char [][] createMap(char [][] map)
	{
		
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				map[i][j] = '*';
			}
		}
		return map;
	}
	
	public char [][] buildMap(Geometric g, char [][] map)
	{
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				if(i == (g.getPosition().xpos)-1 && j == (g.getPosition().ypos)-1)
				{
					if(map[i][j] == '*' )
						map[i][j] = g.getSymbol();
				}
			}
		}
		return map;
	}
	
	public void printMap(char map [][])
	{
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}
	
	

}
