package pl.vignesh.snake.gameobjects;

import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;

import static pl.vignesh.snake.Main.GRID_SIZE;

public class Berry {
    public Pixel position;

    public Berry(Snake snake)
    {
        do
        {
            position = new Pixel(ThreadLocalRandom.current().nextInt(1, GRID_SIZE - 1), ThreadLocalRandom.current().nextInt(1, GRID_SIZE - 1));
        } while (snake.contains(position));
    }

    public void render(Graphics2D g, Color color)
    {
        position.render(g, color);
    }
}
