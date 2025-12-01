import ie.atu.PreferredCustomer;

public class PreferredCustomerTest {
    public static void main(String[] args) {
        // Create a PreferredCustomer with no-arg constructor
        PreferredCustomer pc = new PreferredCustomer();
        pc.setName("Charlie Customer");
        pc.setAddress("3 Middle Road");
        pc.setPhoneNumber("0871112222");
        pc.setCustomerNumber(2001);
        pc.setMailingList(true);

        // Print before loyalty points
        System.out.println(pc);

        // Add 700 points and print
        pc.addLoyaltyPoints(700);
        System.out.println(pc);

        // Add 800 points and print
        pc.addLoyaltyPoints(800);
        System.out.println(pc);
    }
}
