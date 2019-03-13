package massivy;
public class massivy3 {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        array1[0] = 4;
        array1[1] = 16;
        array1[2] = 32;
        array1[3] = 64;
        array1[4] = 128;
        
        int sum = 0;

        for (int i = 0; i < array1.length; i++) {
            sum += array1[i];
        }
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println("Сумма - "+ sum);
    }
}
