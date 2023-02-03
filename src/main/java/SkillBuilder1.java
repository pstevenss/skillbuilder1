import java.util.Scanner;

/**
 * Skill Builder 1
 *
 * @author (You)
 * @version (2.1, 2.2)
 */
public class SkillBuilder1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("You're Jane's friend!");
        System.out.println("\"What's your name?\"");
        String userName = input.nextLine();

        System.out.println("Enter a floating-point number:");
        double spice = input.nextDouble();
        double nuum = Math.pow(spice,3);
        double num = Math.sqrt(5);
        double numm = (4.0/3)*Math.pow(2,(num/nuum));


        System.out.println("Well "+ userName +", the spice value resulted in "+ numm);
        System.out.println("And the converted value is " + String.format("%.2f" , numm));
        double runds = Math.round(numm * 100.0)/100.0;

    }
    public static void calcWallPaint() {
        Scanner input = new Scanner(System.in);
        double wallHeight;
        double wallWidth;
        double wallArea;
        double gallonsPaintNeeded;
        int cansNeeded;

        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;

        // Prompt user to input wall's width
        System.out.println("Enter wall height (feet):");
        wallHeight = input.nextDouble();

        // Prompt user to input wall's width
        System.out.println("Enter wall width (feet):");
        wallWidth = input.nextDouble();

        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: "+ wallArea + " square feet");

        gallonsPaintNeeded = wallArea/squareFeetPerGallons;
        System.out.println("Paint needed: "+ String.format("%,.2f", gallonsPaintNeeded) + "gallons");

        cansNeeded = (int)(Math.ceil(gallonsPaintNeeded/gallonsPerCan));
        System.out.println("Cans needed: " + cansNeeded + " can(s)");
    }
}
