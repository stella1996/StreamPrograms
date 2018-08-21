import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayStream {
    public static void main(String[] args) {

        Stream<String> arraystream= Stream.of("a","b","c");
        System.out.println(arraystream.collect(Collectors.joining()));
    }

}
