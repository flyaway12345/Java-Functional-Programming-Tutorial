package optionals;

import javax.swing.text.html.Option;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional.ofNullable(null).orElseGet(() -> "default value");
    }
}
