package practice;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {
    public static void main(String[] args) {
        // からのリストを生成
        List<String> list = new ArrayList<>();

        // 文字列の追加
        list.add("Kento75");  // 0
        list.add("Takano");   // 1

        System.out.println(list);

        System.out.println(list.get(0));
    }
}
