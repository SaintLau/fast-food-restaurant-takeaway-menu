//THE CLASS
public class MainClass {
    //what do we need from the person -> name, contact info, food, 
    private String FullName;
    private int ContactNumber;
    private double Full_Price;

    public void setFullName(String fullName) {
        this.FullName = fullName;
    }

    public String getFullName() {
        return FullName;
    }

    public void setContactNumber(int contactNumber) {
        this.ContactNumber = contactNumber;
    }

    public int getContactNumber() {
        return ContactNumber;
    }

    public void setFullPrice(double fullPrice) {
        this.Full_Price = fullPrice;
    }

    public double getFullPrice() {
        return Full_Price;
    }
}