import processing.core.PApplet;

public class Sketch extends PApplet {
    static final int WIDTH=640;
    static final int HEIGHT= 480;

    public class Balls {
        final int diameter=20;
        int position;
        int height;
        int speed;
        Balls(int height, int speed)
        {
            this.position=1;
            this.height=height;
            this.speed=speed;
        }
        void roll() {
            ellipse(position * speed, height, diameter, diameter);
            position++;
        }
    }

    Balls ball1,ball2,ball3,ball4;

    public static void main(String[] args) {
        PApplet.main("Sketch",args);

    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void setup() {
        ball1=new Balls((HEIGHT*1)/5,1);
        ball2=new Balls((HEIGHT*2)/5,2);
        ball3=new Balls((HEIGHT*3)/5,3);
        ball4=new Balls((HEIGHT*4)/5,4);
    }

    @Override
    public void draw() {
        ball1.roll();
        ball2.roll();
        ball3.roll();
        ball4.roll();
    }
}
