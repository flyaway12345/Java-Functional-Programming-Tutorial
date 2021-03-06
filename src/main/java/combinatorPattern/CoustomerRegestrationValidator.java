package combinatorPattern;

import java.util.function.Function;

public interface CoustomerRegestrationValidator extends Function<Customer, CoustomerRegestrationValidator.ValidationResult> {

    static  CoustomerRegestrationValidator isEmailValid(){
        return customer ->
                customer.getEmail().contains("@")
                        ? ValidationResult.SUCCESS: ValidationResult.EMAIL_NOT_VALID;
    }
    enum ValidationResult{
        SUCCESS,
        PHONE_NUMBER_NOT_VALID,
        EMAIL_NOT_VALID,
        IS_NOT_AN_ADULT
    }
}
