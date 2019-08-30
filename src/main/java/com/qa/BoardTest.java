package src.main.java.com.qa;


import static java.lang.StrictMath.floor;

public class BoardTest {
    private int boardSize = 0;
    private double xTreasure = (floor((Math.random())*100));
    private double yTreasure = (floor((Math.random())*100));


    public BoardTest(int boardSize) {
        this.boardSize = boardSize;
    }

    public void setXTreasure(int xTreasure) {
        this.xTreasure = xTreasure;

    }

    public void setYTresure(int yTreasure) {
        this.yTreasure = yTreasure;
    }

    public double getXTresure() {
        return this.xTreasure;
    }

    public double getYTresure() {
        return this.yTreasure;
    }

}
