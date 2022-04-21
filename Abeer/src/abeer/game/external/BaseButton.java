package abeer.game.external;

import javax.swing.JButton;

public class BaseButton extends JButton{

    public BaseButton(BaseFrame frame, String text, int x, int y, int width, int height) {
        super(text);
        this.setBounds(x, y, width, height);
        this.setFocusable( false );
        frame.add( this );
    }

    public BaseButton(BasePanel panel, String text, int x, int y, int width, int height) {
        super(text);
        this.setBounds(x, y, width, height);
        this.setFocusable( false );
        panel.add( this );
    }
}
