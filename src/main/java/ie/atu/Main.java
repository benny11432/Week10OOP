package ie.atu;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main
{
    public static void main(String[] args)
    {
        Person person = new Person("john", "Dublin", "33333");
        System.out.println(person.toString());
        Customer customer = new Customer();
        Customer myCustomer = new Customer("Ben","oranmore","123456", 12, true);
        System.out.println(myCustomer.toString());
    }
}