package practice;

public class RobotWithDrill extends Robot {

    RobotWithDrill(String name, String color) {
        super(name, color);
    }

    /**
     * ドリルで土を掘る
     */
    public void dig() {
        System.out.println(name + "は穴を掘った!");
    }
}
