import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Builder {


    public static void main(String[] args) {

        Stream<String> arraystream= Stream.<String>builder().add("a").add("b").add("c").build();
        System.out.println(arraystream.collect(Collectors.joining()));
    }
}
