package massivy;

public class massivy {

    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        cars[3] = "Opel";
        System.out.println(cars[3]);
        System.out.println(cars.length);

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        int[] array1 = new int[3];
        array1[0] = 5;
        array1[1] = 120;
        array1[2] = 350;
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        String[] array2 = new String[10];
        array2[0] = "a";
        array2[1] = "b";
        array2[2] = "c";
        array2[3] = "d";
        array2[4] = "e";
        array2[5] = "f";
        array2[6] = "g";
        array2[7] = "h";
        array2[8] = "i";
        array2[9] = "g";
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

    }

}
