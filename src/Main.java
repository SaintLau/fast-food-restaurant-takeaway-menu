package src;

//imports
import javax.swing.*;


public class Main {
    public static MainClass mc = new MainClass();

    public static String full_Name;
    public static String contactNumber;
    public static int $food_choice, $drink_choice, $side_choice;
    public static double $price;
    public static double $total;

    // Menu prices

    //Food
    public static double $burger = 5.45;
    public static double $pasta = 11.65;
    public static double $taco = 7.75;

    //Drinks
    public static double $coke_Can = 1.90;
    public static double $coke_bottle = 2.50;
    public static double $water = 1.00;
    public static double $pepsi = 2.10;
    public static double $monster_energy = 3.65;

    //Side
    public static double $chips = 4.95;
    public static double $salad = 5.25;
    public static double $onionRings = 3.65;
    public static double $breadStix = 1.85;

    public static void main(String[] args) {
        full_Name = JOptionPane.showInputDialog(null, "Please, enter your full name");
        mc.setFull_Name(full_Name);

        contactNumber = JOptionPane.showInputDialog(null, "Please, enter contact number");
        mc.set$contact_Number(contactNumber);

        $food_choice = Integer.valueOf(JOptionPane.showInputDialog(null, "Please choose an item below: " +
                "\n1. Burger" +
                "\n2. Pasta" +
                "\n3. Taco"
                ));


    }
}
