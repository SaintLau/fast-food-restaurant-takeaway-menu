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

        $food_choice = Integer.valueOf(JOptionPane.showInputDialog(null, "Please choose a main dish: " +
                "\n1. Burger" +
                "\n2. Pasta" +
                "\n3. Taco"
            ));

        $drink_choice = Integer.valueOf(JOptionPane.showInputDialog(null, "Please choose a drink: " +
                "\n1. Coke Can" +
                "\n2. Coke Bottle" +
                "\n3. Water" +
                "\n4. Pepsi" +
                "\n5. Monster Energy"
            ));

        $side_choice = Integer.valueOf(JOptionPane.showInputDialog(null, "Please choose a side dish: " +
                "\n1. Chips" +
                "\n2. Salad" +
                "\n3. Onion Rings" +
                "\n4. Bread Stix"
            ));

        //case scenerios for total amount
        //food options
        switch ($food_choice) {
            case 0:
                $total = $total + $burger;
                break;
            case 1:
                $total = $total + $pasta;
                break;
            case 2:
                $total = $total + $taco;
                break;
        }
        //drink options
        switch ($drink_choice) {
            case 0:
                $total = $total + $coke_Can;
                break;
            case 1:
                $total = $total + $coke_bottle;
                break;
            case 2:
                $total = $total + $water;
                break;
            case 3:
                $total = $total + $pepsi;
                break;
            case 4:
                $total = $total + $monster_energy;
                break;
        }
        //Side choice
        switch ($side_choice) {
            case 0:
                $total = $total + $chips;
                break;
            case 1:
                $total = $total + $salad;
                break;
            case 2:
                $total = $total + $onionRings;
                break;
            case 3:
                $total = $total + $breadStix;
                break;
        }
        //return full price (total)
        mc.setFullPrice($total);

        JOptionPane.showInputDialog(null, "Customer Receipt" +
                "\nCustomer Name. " + mc.getFull_Name() +
                "\nCustomer Contact Details: " + mc.get$contact_Number() +
                "\nTotal Amount of Purchase: " + mc.getFullPrice() + " €"
        );
    }
}
