package practice;

public class Robot {
    String name;
    String color;
    int energy;

    // コンストラクタ
    Robot(String name, String color) {
        this.name = name;
        this.color = color;
    }

    String sayName() {
        return name + "です。";
    }

    // 充電メソッド
    String charge(int energy) throws CrashException {
        this.energy += energy;

        if(this.energy >= 10) {
            throw new CrashException("壊れました！");
        }

        return "充電しました：現在のエネルギーは" + this.energy;
    }
}
