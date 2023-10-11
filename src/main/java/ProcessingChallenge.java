//import jdk.nashorn.internal.ir.BlockLexicalContext;
import processing.core.PApplet;

public class ProcessingChallenge extends PApplet {

    public static final int HEIGHT = 480;
    public static final int WIDTH = 640;
    public static final int BALLNUMBER = 4;

    BallParameter[] Balls;
//    public static int position = 0;

    public static void main(String[] args) {
        PApplet.main("ProcessingChallenge", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
        InitializeBall();
    }

    public void InitializeBall()
    {
        Balls = new BallParameter[BALLNUMBER];
        for(int i = 0; i < BALLNUMBER; i++)
        {
            Balls[i] = new BallParameter(this, i+1,(i+1)*HEIGHT/5);
        }
    }

    @Override
    public void draw() {
//        super.draw();
        for(BallParameter Ball : Balls)
        {
            Ball.drawBall();
        }
    }

}
