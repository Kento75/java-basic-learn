package practice;

public class Sum {
    public static void main(String[] args) {
        Sum sum = new Sum();
        sum.execute();
    }

    void execute() {
        outputSum(1, 2);
    }

    // メソッド
    void outputSum(int numberA, int numberB) {
        System.out.println(sum(numberA, numberB));
    }

    // 戻り値を持つメソッド
    int sum(int numberA, int numberB) {
        return numberA + numberB;
    }
}
