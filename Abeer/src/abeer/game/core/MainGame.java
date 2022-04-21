package abeer.game.core;

import abeer.game.external.BaseButton;
import abeer.game.external.BaseFrame;
import abeer.game.external.BaseLabel;
import abeer.game.external.BasePanel;
import java.awt.Color;

public class MainGame extends BaseFrame {

    BasePanel controlPanel, gamePanel, scorePanel;
    BaseButton restart;
    BaseButton btn11, btn12, btn13, btn21, btn22, btn23, btn31, btn32, btn33;
    BaseLabel player1nameLabel, player2nameLabel;

    /*
    * TODO
    *  Add textField
    *
    * */

    private void initLabel() {
        player1nameLabel = new BaseLabel(controlPanel, "Player1 Name: ", 5, 10, 90, 50);
        player2nameLabel = new BaseLabel(controlPanel, "Player2 Name: ", 5, 70, 90, 50);
    }

    public static void main(String[] args) {
        MainGame frame = new MainGame("TicTakToe", 920, 630);
        frame.setVisible(true);
    }

    public MainGame(String title, int width, int height) {
        super(title, width, height);

        init();
    }

    private void init() {
        initPanel();
        initButton();
        initLabel();
    }

    private void initPanel() {
        controlPanel = new BasePanel(this, 10, 10, 285, 570);
        controlPanel.setBackground(Color.CYAN);

        gamePanel = new BasePanel( this, 305, 10, 390, 570 );
        gamePanel.setBackground(Color.pink);

        scorePanel = new BasePanel( this, 705, 10, 190, 570 );
        scorePanel.setBackground(Color.GRAY);
    }

    private void initButton() {
        restart = new BaseButton(controlPanel, "Restart", 5, 465, 270, 100);

    }
}
