package stroki;
public class stroki1 {
    public static void main(String[] args) {
        char[] chars = {'Г', 'р', 'у', 'п', 'п', 'а', ' ',
            'S', 'P', 'T', 'V',  '1', '8'};
        String s1 = "Строки";
        System.out.println(
                "Строка s1 до copyValueOf: 	" + s1);
        s1 = s1.copyValueOf(chars);
        System.out.println(
                "Строка s1 после copyValueOf: 	" + s1);
        
        System.out.println();
        
        String s2 = s1.copyValueOf(chars);
        String s3 = s1.copyValueOf(chars, 2, 7);
        System.out.println(
                "Строка без смещения:	" + s2);
        System.out.println(
                "Строка со смещением в 2 и длинной 7: " + s3);
        
        
        
    }
}
