import processing.core.PApplet;

public class TryProcessing extends PApplet{

    public static final int HEIGHT = 1200;
    public static final int ONE_HEIGHT_UNIT = HEIGHT / 5;
    public static final int WIDTH = 1800;
    public static final int DIAMETER = 70;
    public static final int START = 200;

    public static int increment = 0;

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        paintWhite();
    }

    private void paintWhite() {
        background(255);
    }

    @Override
    public void draw() {
        move4Circles();
    }

    private void move4Circles() {

        for (int i = 1; i <= 4; i ++) {
            ellipse(getWidthPosition(i), getHeightPosition(i), DIAMETER, DIAMETER);
        }

        increment += 1;

    }

    private int getHeightPosition(int i) {
        return i * ONE_HEIGHT_UNIT;
    }

    private int getWidthPosition(int i) {
        return START + increment * i;
    }


}
