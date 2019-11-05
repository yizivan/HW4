/**
 * 
 */
import java.util.Scanner;

/**
 * @author Larry Shannon
 *
 */
public class CarTester
{
	private static Scanner keyboard = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Car[] myGarage = new Car[3];
		Car myCarOne = null;
		Car myCarTwo = null;
		Car myCarThree = null;
		Car myCloneCar = null;
		Car mySameCar = null;
		myCarOne = new Car();// Create a new default Car object.
		myCarTwo = new Car();// Create a new default Car object.
		System.out.printf("Car One: %s \n", myCarOne);// Uses the .toString() method.
		System.out.printf("Car Two: %s \n", myCarTwo);// Uses the .toString() method.

		if (myCarOne.equals((Object) myCarTwo))
			System.out.println("The the two cars are in fact the same Car object.");
		else
			System.out.println("The the two cars are different Car objects.");

		if (myCarOne.equals(myCarTwo))
		{
			System.out.println("The the two cars are the same make, model, color, and year.");
		} else
			System.out.println("The the two cars are not the same make, model, color, and year.");
		myCarThree = new Car("Red", "Ford", "Model T", 1919);// Create a new "red" Car object.
		System.out.printf("Car One: %s \n", myCarOne);// Uses the .toString() method.
		System.out.printf("Car Three: %s \n", myCarThree);// Uses the .toString() method.

		if (myCarOne.equals((Object) myCarThree))
			System.out.println("The the two cars are in fact the same Car object.");
		else
			System.out.println("The the two cars are different Car objects.");
		if (myCarOne.equals(myCarThree))
		{
			System.out.println("The the two cars are the same make, model, color, and year.");
		} else
			System.out.println("The the two cars are not the same make, model, color, and year.");
		myCloneCar = new Car(myCarOne);// Uses the Car objects state date to create a new Car object.
		System.out.printf("Car One: %s \n", myCarOne);// Uses the .toString() method.
		System.out.printf("Car Clone: %s \n", myCloneCar);// Uses the .toString() method.

		if (myCarOne.equals((Object) myCloneCar))
			System.out.println("The the two cars are in fact the same Car object.");
		else
			System.out.println("The the two cars are different Car objects.");

		if (myCarOne.equals(myCloneCar))
		{
			System.out.println("The the two cars are the same make, model, color, and year.");
		} else
			System.out.println("The the two cars are not the same make, model, color, and year.");
		mySameCar = myCarOne;// Copy the memory ID of the Car object stored in myCarOne into myExtraCar.
		System.out.printf("Car One: %s \n", myCarOne);// Uses the .toString() method.
		System.out.printf("Same Car object: %s \n", myCloneCar);// Uses the .toString() method.

		if (myCarOne.equals((Object) mySameCar))
			System.out.println("The the two cars are in fact the same Car object.");
		else
			System.out.println("The the two cars are different Car objects.");

		if (myCarOne.equals(mySameCar))
		{
			System.out.println("The the two cars are the same make, model, color, and year.");
		} else
			System.out.println("The the two cars are not the same make, model, color, and year.");
		myGarage[0] = myCarOne;
		myGarage[1] = myCarTwo;
		myGarage[2] = myCarThree;
		letsGoForADrive(myGarage);

	}

	private static void letsGoForADrive(Car[] pMyGarage)
	{
		boolean goodTrip = false;
		int numberOfCars = pMyGarage.length;
		int carNumber = 0;
		double drivingDistance = 0.0;
		double averageSpeed = 0.0;
		String menuChoiceString = null;
		String yesOrNo = "yes";
		do
		{
			System.out.println("Let's take a car out for a drive!");
			System.out.println("I have a garage with " + numberOfCars + " cars.");
			System.out.println("Which car would you like to drive!");
			for (int index = 0; index < numberOfCars; index++)
			{
				menuChoiceString = "" + (char) (index + 65);
				System.out.printf("%s) %s\n", menuChoiceString, pMyGarage[index]);
			}
			do
			{
				System.out.println("Please select one of the menu choices.");
				menuChoiceString = keyboard.next();
			} while (!menuChoiceString.equalsIgnoreCase("a") && !menuChoiceString.equalsIgnoreCase("b")
					&& !menuChoiceString.equalsIgnoreCase("c"));
			carNumber = (int) menuChoiceString.toUpperCase().charAt(0) - 65;
			System.out.printf("You have chosen to drive the %s.\n", pMyGarage[carNumber]);
			System.out.println("Please enter how far you would like to drive.");
			drivingDistance = keyboard.nextDouble();
			System.out.println("Please enter how fast you would like to drive.");
			averageSpeed = keyboard.nextDouble();
			pMyGarage[carNumber].setUpTrip(averageSpeed, drivingDistance);
			pMyGarage[carNumber].driveCar();
			System.out.println("Would you like to drive some more?");
			do
			{
				System.out.println("Please enter \"yes\" or \"no\".");
				yesOrNo = keyboard.next();
			} while (!yesOrNo.equalsIgnoreCase("yes") && !yesOrNo.equalsIgnoreCase("no"));
		} while (yesOrNo.equalsIgnoreCase("yes"));
		System.out.println("The state of the cars are now.");
		for (int index = 0; index < numberOfCars; index++)
		{
			System.out.printf("%s\n", pMyGarage[index]);
		}

	}

}
