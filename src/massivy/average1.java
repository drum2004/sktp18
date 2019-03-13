package massivy;
import java.util.Arrays;
public class average1 {
    public static void main(String[] args) {
        int[] mas1 = new int[20];
        for (int i = 0; i < mas1.length; i++) {
            mas1[i] = (int) (Math.random()* mas1.length+1);}
        System.out.println("mas1 " + Arrays.toString(mas1));
        
        //max
        int max=mas1[1];
        for(int i=0;i < mas1.length; i++){
            if(mas1[i]>max){
                max=mas1[i];
            }
        }
       System.out.println("Максимальное число " +max);
       
        //min
       int min=mas1[1];
       for(int i=0;i < mas1.length; i++){
            if(mas1[i]<min){
                min=mas1[i];
            }
        }
       System.out.println("Минимальное число " +min);
       
        
        double average1 = 0;
        for (int i = 2; i < 20; i++) {
            average1 += mas1[i];
        }
        average1 /= mas1.length;
        System.out.println("среднее арифметическое " + average1);
        
        
       
    }
}