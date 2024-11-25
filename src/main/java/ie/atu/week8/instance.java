package ie.atu.week8;

public class instance {
    public static void main(String[] args) {
        Customer part1customer = new Customer("Eoin", "kilmaine", "089273654858", "057874", true);

        System.out.println(part1customer.toString());

        Customer part2customer = new Customer();
        part2customer.setName("Anz");
        part2customer.setAddress("Galway");
        part2customer.setPhone("049362875896");
        part2customer.setCustomerNumber("98529386597");
        part2customer.setMaillingList(false);

        System.out.println(part2customer.toString());

        preferredCustomer preferredCustomer2 = new preferredCustomer();
        preferredCustomer2.setName("Paul");
        preferredCustomer2.setAddress("ATU");
        preferredCustomer2.setPhone("091 775678");
        preferredCustomer2.setCustomerNumber("8573965");
        preferredCustomer2.setMaillingList(false);
        preferredCustomer2.setLoyaltypoints(700);
        System.out.println(preferredCustomer2);

        preferredCustomer2.setLoyaltypoints(2000); // Accumulate more points
        System.out.println(preferredCustomer2);
    }
}
