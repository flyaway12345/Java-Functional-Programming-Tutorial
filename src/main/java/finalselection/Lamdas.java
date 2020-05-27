package finalselection;

import java.util.function.Function;

public class Lamdas {
    public static void main(String[] args) {
        Function<String, String> upperCaseName = name -> {
            if(name.isBlank()) throw new IllegalArgumentException("");

        return name.toUpperCase();
    };
        System.out.println(upperCaseName.apply("evan"));
    }
}
