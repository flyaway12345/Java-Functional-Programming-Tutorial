package functionInterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBConnectionURL.get());
    }

    static Supplier<List<String>> getDBConnectionURL = () -> List.of("jdbc://localhost:8080",
            "jdbc://localhost:8081");
}
