package functionInterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(isPhoneNumberValidPredicate.test("00300300300"));
    }

    static Predicate<String> isPhoneNumberValidPredicate = phonenumber ->
            phonenumber.startsWith("07") && phonenumber.length() ==11;
}
