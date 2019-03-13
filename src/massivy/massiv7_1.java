package massivy;
import java.util.Arrays; 
public class massiv7_1 {
    public static void main(String[] args) {
        int[] numbers = new int [10];
        //fill(int[]a, int val)
        Arrays.fill(numbers, 5);
        //fill(int[]a, int fromIndex, int toIndex, int val)
        Arrays.fill(numbers, 0, 4, 25);
        System.out.println(Arrays.toString(numbers));
        
        int[]numbersCopy=Arrays.copyOf(numbers,numbers.length);
        Arrays.sort(numbersCopy);
        System.out.println("Sorting: "
                +Arrays.toString(numbersCopy));
        
        System.out.println("Равен ли массив "
                + "[numbers] массиву [numbersCopy]? " 
                + Arrays.equals(numbers, numbersCopy));
        
    }
}
