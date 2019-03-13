package massivy;

import java.util.Arrays;

public class bubbles1 {
    public static void main(String[] args) {
        int[] arr1 = {11, 3, 14, 16, 7};
        System.out.println("Исходный массив: "+Arrays.toString(arr1));
        boolean isSorted = false;
        int buf;//переменная для хранения временных значений
        while (!isSorted) {
            isSorted = true;
         for (int i = 0; i < arr1.length - 1; i++) {   
            if(arr1[i] > arr1[i+1]){
                isSorted = false;
                buf = arr1[i];//новое значение
                arr1[i] = arr1[i + 1];
                arr1[i + 1] = buf;
            }
          System.out.println("Виток - "+i+" "+Arrays.toString(arr1));  
        }
         System.out.println(Arrays.toString(arr1));
        }
        System.out.println("Ответ: "+Arrays.toString(arr1));

    }
}
