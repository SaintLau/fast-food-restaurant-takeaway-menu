//imports
import java.swing.JOptionPane; 


// MAIN METHOD CLASS

public class main {
    //variables for set methods
    public static String FullName;
    public static int ContactDetails;
    public static double Price;
    public static double FullPrice = 0;
 
    //Menu Items Cost

    //Food
    public static double Burger = 12.50;
    public static double Pasta = 15;
    public static double Taco = 7.50;

    //Drinks
    public static double CokeCan = 5.00;
    public static double BotCoke = 7.00;
    public static double Water = 2.00;
    public static double Pepsi = 2.50;
    public static double Monster = 4.50;

    //Sides
    public static double Chips = 3.50;
    public static double Salad = 5.25;
    public static double OnionRings = 3.95;
    public static double BreadSticks = 4.25;


    //static method
    static MainClass mc;

    Run|Debug //check if works
    public static void main(String[] args) {
        System.out.println(mc.getFullName(););
        System.out.println(mc.getContactNumber(););

        
        
    }

    //method for Name
    public void getFullName() {
        FullName = JOptionPane.showInputDialog(null, "Please enter your full name");

        mc.setFullName(FullName);
    }

    public void getContactInfo() {
        ContactDetails = Integer.valueOf(JOptionPane.showInputDialog(null, "Please enter your contact number");

        mc.setContactNumber(ContactDetails);
    }

    public void getFood() {
      //  Price = 
    }
}