import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static <T> List<T> reverseList(List<T> inputList) {
        if (inputList == null) {
            return new ArrayList<>();
        }

        List<T> reversedList = new ArrayList<>(inputList.size());

        for (int i = inputList.size() - 1; i >= 0; i--) {
            reversedList.add(inputList.get(i));
        }

        return reversedList;
    }

    public  static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Исходный список чисел: " + list);
        System.out.println("Перевёрнутый список: " + reverseList(list));
        System.out.println();

        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Red", "Green", "Orange"));
        System.out.println("Исходный список цветов: " + list2);
        System.out.println("Перевёрнутый список: " + reverseList(list2));
        System.out.println();
    }
}
