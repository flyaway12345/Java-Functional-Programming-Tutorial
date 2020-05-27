package functionInterface;

public class _Customer {
    public static void main(String[] args) {

    }
    //static Customer<Customer> greetCustomerConsumer = customer ->
        //    System.out.println("Hello " + customer.customerName + ", thanks for regestering your phone number");
    static class Customer{
        private final String customerName;
        private final String customerNumber;

        public Customer(String customerName, String customerNumber) {
            this.customerName = customerName;
            this.customerNumber = customerNumber;
        }
        @Override
        public String toString() {
            return "_Customer{" +
                    "customerName='" + customerName + '\'' +
                    ", customerNumber='" + customerNumber + '\'' +
                    '}';
        }
    }
}
