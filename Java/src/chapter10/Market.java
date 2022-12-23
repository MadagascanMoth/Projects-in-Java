package chapter10;

public class Market {

	
	 public static void main(String[] args){
	        Fruit apple = new Apple();
	        ((Apple) apple).removeSeeds();

	        Apple apple2 = new Apple();
	        apple2.removeSeeds();

	        Banana banana = new Banana();
	        banana.peel();

	        Banana banana2 = new Banana();
	        ((Banana) banana2).peel();

	        Fruit orange = new Fruit();

	        squeeze(apple);
	        squeeze(banana);
	        squeeze(banana2);
	        squeeze(orange);

	    }

	    private static void squeeze(Banana banana) {
		// TODO Auto-generated method stub
		
	}

		public static void squeeze(Fruit orange){
	        System.out.print("Squeezing...");
	        orange.makeJuice();
	    }
}
