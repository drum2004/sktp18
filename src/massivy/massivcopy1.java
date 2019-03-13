package massivy;
public class massivcopy1 {
    public static void main(String[] args) {
        String[] stroki = {"A", "B", "C", "D", "E"};
        String[] strokiCopy1 = stroki;
        strokiCopy1[2] = "G";
        System.out.println("stroki[2]= " + stroki[2]
                + " strokiCopy1[2]= " + strokiCopy1[2]);
        
        String[] strokiCopy2 = new String[stroki.length];
        System.arraycopy(stroki, 0, strokiCopy2, 0, stroki.length);
        strokiCopy2[2] = "F";
        System.out.println("stroki[2]= " + stroki[2]
                + " strokiCopy2[2]= " + strokiCopy2[2]);
    }
}
