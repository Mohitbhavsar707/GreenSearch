package hackTheEarth;

import java.util.Scanner;

public class gradeFoodItem {

	public static void scan() {

		int gallonsOfWater = 0;
		int transportation = 0;
		int farmingConditions = 0;

		Scanner input = new Scanner(System.in);
		System.out.println("Write the name of the food below");

		String choice = input.nextLine();
		System.out.println("Which type of apple have you selected? State organic or normal");

		String organic = input.nextLine();

		if (organic.contains("organic")) {
			farmingConditions = 3;

			System.out.println("Please read the label on the food item and state the location of the food");
			System.out.println("");
			System.out.println("Select from the following options :  " + "Ontario or " + " Outside of Ontario");

			String location = input.nextLine();
			if (location.equals("Ontario")) {
				System.out.println("Product Details... Uploading ");
				System.out.println("_____________________________________________________________________________");
				transportation = 4;

				String information = input.nextLine();
				gallonsOfWater = 5;
				System.out.println("Gallons of water used to create product : 18.5 Gallons (70 L) ");
				System.out.println("The product was domestically raised as no pesticides or herbicides were applied");
				System.out.println("_____________________________________________________________________________");
				System.out.println("");
				System.out.println("Press enter to view your products climate grade");

				String gradeScore = input.nextLine();

				int total = transportation + farmingConditions + gallonsOfWater;
				if (total >= 12 || total == 15) {
					System.out.println("Your score is A ");
					
				} else if (total >= 9 || total == 11) {
					System.out.println("Your score is B");
					
				} else if (total >= 6 || total == 10) {
					System.out.println("Your score is C");
					
				} else if (total >= 3 || total == 5) {
					System.out.println("Your score is D");

				} else if (total <= 3) {
					System.out.println("Your score is F");
				}

			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scan();
	}

}


