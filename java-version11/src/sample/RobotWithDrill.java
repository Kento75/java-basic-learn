package sample;

// Robot ・・・ 親クラス・スーパークラス
// RobotWithDrill ・・・ 子クラス・サブクラス
// 継承できるクラスは1個だけ
public class RobotWithDrill extends Robot {

    RobotWithDrill(String name, String color) {
        super(name, color);
    }

    /**
     * ドリルで土を掘る
     */
    public void dig() {
        System.out.println(name + "は穴を掘った！");
    }

    // オーバーライド
    @Override
    String sayName() {
        return "My name is " + name;
    }
}
