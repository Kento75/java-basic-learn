package practice;

public class Robot {
    String name;
    String color;

    // コンストラクタ
    Robot(String name, String color) {
        this.name = name;
        this.color = color;
    }

    String sayName() {
        return name + "です。";
    }
}
