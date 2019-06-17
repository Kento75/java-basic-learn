package sample;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {
    public static void main(String[] args) {
        // 空のリストを作成
        List<String> list = new ArrayList<>();

        // 文字列を1個追加
        list.add("きのこ"); // 0  要素
        list.add("たけのこ"); // 1

        System.out.println(list);

        System.out.println(list.get(1));
    }
}
