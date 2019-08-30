package src.main.java.com.qa;

import static java.lang.StrictMath.floor;

public class Movement {
    private int xPosition = 0;
    private int yPosition = 0;
    //private double yTreasure = (floor((Math.random())*100));




    public void setXPositionPlayer(int xPosition){
        this.xPosition = xPosition;
    }
    public int getXPostionPlayer(){
        return this.xPosition;
    }

    public void setYPositionPlayer(int yPosition){
        this.yPosition = yPosition;
    }
    public int getYPostionPlayer(){
        return this.yPosition;
    }



    public void north(int boardSize){
        this.xPosition = (xPosition +1)% boardSize;
    }

    public void south(int boardSize){
        this.xPosition = ((xPosition -1)+boardSize)% boardSize;
    }
    public void east(int boardSize){
        this.yPosition = (yPosition +1)% boardSize;
    }

    public void west(int boardSize){
        this.yPosition = ((yPosition -1)+boardSize)% boardSize;
    }

    public Movement(){}

}
