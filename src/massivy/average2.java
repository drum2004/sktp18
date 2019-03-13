package massivy;
import java.util.Arrays;
public class average2 {
    public static void main(String[] args) {
        int[] mas1 = new int[5];
        int[] mas2 = new int[5];
        for (int i = 0; i < 5; i++) {
            mas1[i] = (int) (Math.random() * 6);
            mas2[i] = (int) (Math.random() * 6);
        }
        System.out.println("mas1 " + Arrays.toString(mas1));
        System.out.println("mas2 " + Arrays.toString(mas2));
        //создаем переменные для хранения средних арифметических массивов
        double average1 = 0;
        double average2 = 0;
        //находим сумму элементов массивов
        for (int i = 0; i < 5; i++) {
            average1 += mas1[i];
            average2 += mas2[i];
        } 
        //нахождение среднего арифметического
        average1/=5;
        average2/=5;
        
        
         if(average1 > average2){
            System.out.println("Среднее арифметическое "
                    + "первого массива ("+average1+") больше среднего "
                            + "арифметического "+
                    "второго массива ("+average2+")");
        } else if(average1 < average2){
            System.out.println("Среднее арифметическое "
                    + "первого массива ("+average1+") меньше среднего "
                            + "арифметического "+
                    "второго массива ("+average2+")");
        } else {
            System.out.println("Средние арифметические "
                    + "массивов равны ("+average1+") = ("+average2+")");
        }
    }
}
