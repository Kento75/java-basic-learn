package sample;

public class EqualsPractice {
    public static void main(String[] args) {
        String a = new String("abcde");
        String b = new String("abcde");

        boolean result = a.equals(b);
        System.out.println(result);

        // プリミティブ型 ・・・ int, boolean など
        // 参照型 ・・・ String
    }
}
