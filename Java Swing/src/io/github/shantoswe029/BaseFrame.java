package io.github.shantoswe029;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class BaseFrame extends JFrame{
    
    public BaseFrame(String title, int width, int height ) {
        super();
        this.setTitle(title);
        this.setSize(width, height);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void setFrameIcon(String location) {
        ImageIcon icon = new ImageIcon(location);
        this.setIconImage(icon.getImage());
    }
}
