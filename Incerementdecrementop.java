package Com.bridgelabzs;

public class Incerementdecrementop {
    public static void main(String[] args) {
        int z =  21;
        int res1 = z++ + z++ + ++z + ++z + z++; // 21 + 22 + 23 + 24 + 25
        System.out.println(z); // 26
        System.out.println(res1); //117

        int res2 = z-- - z-- + z++ + --z + z-- - ++z + --z;
        System.out.println(z);// 26 - 25 + 24 + 24 + 24 - 24 + 23
        System.out.println(res2);
    }

}
