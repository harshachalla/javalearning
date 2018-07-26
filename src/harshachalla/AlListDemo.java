package harshachalla;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlListDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 1, 1, 4, 3, 3, 3);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}

