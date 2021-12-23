



import java.util.Scanner;


public abstract class DesertItem {
	abstract class DessertItem
	{
	abstract int getCost();



	public static DessertItem getInstance()
	{
	return null;
	}
	}
	class Candy extends DessertItem {
		public int getCost() {



		return (2*60);
		}



		}
		class Coockie extends DessertItem{
		public int getCost() {
		return 3*70;



		}
		}



		class IceCream extends DessertItem{
		public int getCost() {
		return 5;



		}



		}






}
