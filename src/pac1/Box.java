package pac1;

public class Box {
    //instance variables
    private double dblWidth;
    private double dblHeight;
    private double dblDepth;

    // static variable 
    private static int boxid;

    Box(double dblWidth, double dblHeight, double dblDepth) {
        this.dblWidth = dblWidth;
        this.dblHeight = dblHeight;
        this.dblDepth = dblDepth;
    }

    public double calcVolume() {
        //local variable
        double volume = dblWidth * dblHeight * dblDepth;
        return volume;
    }

    public int getID() {
        return boxid;
    }

}
