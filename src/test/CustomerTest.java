package test;

import domain.Customer;

public class CustomerTest {
    static void main() {
        Customer myCustomer = new Customer();
        myCustomer.setID(-1);
        myCustomer.setNew(false);
        myCustomer.setTotal(10000);
        myCustomer.displayCustomerInfo();
    }
}