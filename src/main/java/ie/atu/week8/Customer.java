
package ie.atu.week8;

public class Customer extends Person {

    private String customerNumber;

    private boolean maillingList;
    public Customer() {
        super();//this is my super to get person details
        this.customerNumber="";
        this.maillingList=false;
    }

    public Customer(String name, String address, String phone, String customerNumber, boolean maillingList) {
        super(name, address, phone);
        this.customerNumber = customerNumber;
        this.maillingList = maillingList;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public boolean isMaillingList() {
        return maillingList;
    }

    public void setMaillingList(boolean maillingList) {
        this.maillingList = maillingList;
    }

    @Override
    public String toString() {
        return
                super.toString()+ //this is my super to print person details
                        "customerNumber='" + customerNumber + '\'' +
                        ", maillingList=" + maillingList;
    }
}

