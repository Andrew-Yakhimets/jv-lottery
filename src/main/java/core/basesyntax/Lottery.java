package core.basesyntax;

import java.util.Random;

public class Lottery {

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        int value = random.nextInt(100);
        ball.setNum(value);
        ball.setColor(colorSupplier.getRandomColor());
        return ball;
    }
}
