package harshachalla;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {


        List<String> list = Arrays.asList("harsha", "challa");
        List<String> anotherList = new ArrayList<>();
        anotherList.add("harsha");
        anotherList.add("challa");
        list.forEach(System.out::println);
        anotherList.forEach(System.out::println);
    }
}
