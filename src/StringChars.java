import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringChars {

    public static void main(String[] args) {

        IntStream arraystream= "abc".chars();
        arraystream.forEach(System.out::println);
    }
}
