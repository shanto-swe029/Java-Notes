package abeer.game.external;

import javax.swing.JLabel;

public class BaseLabel extends JLabel {

    public BaseLabel(BaseFrame frame, String text, int x, int y, int width, int height) {
        super();
        this.setText(text);
        this.setBounds(x, y, width, height);
        frame.add(this);
    }

    public BaseLabel(BasePanel panel, String text, int x, int y, int width, int height) {
        super();
        this.setText(text);
        this.setBounds(x, y, width, height);
        panel.add(this);
    }
}
