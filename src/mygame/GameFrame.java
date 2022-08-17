package mygame;

import java.awt.BorderLayout;
import javax.swing.*;

public class GameFrame extends JFrame{
    public GameFrame(){
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(new ScoreWindow(), BorderLayout.NORTH);
        this.add(new GamePanel());
        this.pack();
        this.setLocationRelativeTo(null);
    }
}
