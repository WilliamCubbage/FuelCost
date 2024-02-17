import java.util.Scanner;

public class FuelCost
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double curGal = 0;
        double fuelEff = 0;
        double priceGas = 0;

        do
        {

            System.out.println("Enter how many gallons of gas are in your tank: "); //prompt user for current gal of gas
            if (in.hasNextDouble()) {
                curGal = in.nextDouble();
                break;
            }
            else {
                in.nextLine();
                System.out.println("You input was invalid, please try again."); //invalid input loop

            }
        }
        while (true);

        do
        {
            System.out.println("Enter your fuel efficiency (How many miles per gallon): "); //prompt user for the fuel eff
            if (in.hasNextDouble())
            {
                fuelEff = in.nextDouble();
                break;
            }
            else {
                in.nextLine();
                System.out.println("You input was invalid, please try again."); //invalid input loop
            }
        }
        while (true);

        do {

            System.out.println("Enter the price per gallon of gas: "); //prompt user for cost of gas
            if (in.hasNextDouble()) {
                priceGas = in.nextDouble();
                break;
            }
            else {
                in.nextLine();
                System.out.println("You input was invalid, please try again."); //invalid input loop
            }

        }
        while (true);

        double costPerHun = (100 / fuelEff) * priceGas;
        String costPerHunDisplay = String.format("%1.2f", costPerHun);
        System.out.println("You will pay $" + costPerHunDisplay + " to drive 100 miles. Your car can go " + fuelEff * curGal + " more miles before empty.");
    }
}