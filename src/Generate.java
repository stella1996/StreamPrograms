import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Generate {


    public static void main(String[] args) {

        Stream<String> arraystream= Stream.generate(()-> ("element")).limit(10);
                arraystream.forEach(System.out::println);
    }
}
