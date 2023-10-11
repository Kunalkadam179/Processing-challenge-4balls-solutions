import processing.core.PApplet;

public class BallParameter {
    PApplet obj;
    private int Position_X;
    private final int x_parameter;
    private final int HEIGHT;

    BallParameter(PApplet obj, int steps, int HEIGHT) {
        this.obj = obj;
        Position_X = 0;
        this.x_parameter = steps;
        this.HEIGHT = HEIGHT;

    }

    public void drawBall() {
        int DIAMETER = 10;
        obj.ellipse(Position_X, HEIGHT, DIAMETER, DIAMETER);
        MoveForward();
    }

    public void MoveForward() {
        this.Position_X += x_parameter;
    }
}
