package main;

import servant.MoveServant;
import serviced.Geometric;
import serviced.Position;
import serviced.Square;
import serviced.Triangle;

public class Main 
{
	public static void main(String [] args)
	{
		char [][] map = new char [10][10];
		// TODO create servant
		// TODO create geometric
		// TODO create position of each geometric
		// TODO uses servant do work for Geometric and Position
		map = ms.createMap(map);
		// TODO give position to the map
		ms.printMap(map);
	}

}
/*Result

**********
****^*****
*****#****
**********
**********
**********
**********
**********
**********

*/
