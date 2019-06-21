package practice;

public class EqualsPractice {
    public static void main(String[] args) {
        String a = new String("abcde");
        String b = new String("abcde");

        // 参照先アドレスの比較になるので不一致となる
        boolean result = a == b;
        System.out.println(result);

        // 参照先の値を比較するので一致する
        boolean result2 = a.equals(b);
        System.out.println(result2);
    }
}
