package sample;

// クラス
// クラス名・・・Robot
class Robot {
    // フィールド
    // インスタンスに状態を保持する変数のようなもの
    String name;
    String color;
    int energy;

    // コンストラクタ (メソッドのようだけど、メソッドではない！)
    // 戻り値の型がない
    // クラス名と同じ名前
    // インスタンス生成時に呼び出される特殊な処理
    // インスタンスの初期処理を行う
    Robot(String name, String color) {
        // フィールドにコンストラクタ呼び出し時に渡された引数をセットしている
        this.name = name;
        this.color = color;
    }

    // メソッド
    String sayName() {
        return name + "です。";
    }

    // 充電
    String charge(int energy) throws CrashException {
        this.energy = this.energy + energy;

        if (this.energy >= 10) {
            throw new CrashException("こわれました！");
        }

        return "充電しました：現在のエネルギーは" + this.energy;
    }
}
