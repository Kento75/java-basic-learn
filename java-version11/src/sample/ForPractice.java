package sample;

import java.util.List;

// for文
public class ForPractice {
    public static void main(String[] args) {
        List<String> list = List.of("aaa", "bbbbb", "cccccccc");

        for (String str: list) {
            System.out.println(str);
        }

        System.out.println("終わり！！");
    }
}
