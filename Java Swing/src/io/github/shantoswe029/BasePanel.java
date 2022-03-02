
package io.github.shantoswe029;

import javax.swing.JPanel;

public class BasePanel extends JPanel{
    
    public BasePanel(BaseFrame frame, int x, int y, int width, int height) {
        this.setBounds(x, y, width, height);
        this.setLayout(null);
        frame.add(this);
    }
}
