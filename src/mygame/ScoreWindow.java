package mygame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ScoreWindow extends JPanel implements ActionListener {

    public int score = 0;
    public Timer timer;

    public ScoreWindow() {
        this.setPreferredSize(new Dimension(GamePanel.SCREEN_WIDTH, GamePanel.SCREEN_HEIGHT/8));
        this.setBackground(Color.BLACK);
        timer = new Timer(GamePanel.DELAY, this);
        timer.start();
    }

    public void setScore(int number) {
        score = number;
    }

    public void draw(Graphics g) {
        g.setColor(Color.red);
        g.setFont(new Font("MV Boli", Font.BOLD, 40));
        FontMetrics metrics = getFontMetrics(g.getFont());
        g.drawString("Score: " + score, (GamePanel.SCREEN_WIDTH - metrics.stringWidth("Score: " + score)) / 2, g.getFont().getSize());
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        draw(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (score != GamePanel.applesEaten) {
            setScore(GamePanel.applesEaten);
        }
        repaint();
    }
}
