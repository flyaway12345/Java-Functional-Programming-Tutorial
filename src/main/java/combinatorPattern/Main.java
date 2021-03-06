package combinatorPattern;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alice@gmail.com",
                "+0123456789654",
                LocalDate.of(2000,1,1)
        );
        System.out.println(new customerVaildatorService().isValid(customer));
    }
}
