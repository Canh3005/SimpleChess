package main;

import javax.swing.*;

public class Main extends JFrame {

    private GamePanel gamePanel;
    private StartPanel startPanel;

    public Main() {
        // Thiết lập JFrame
        setTitle("SimpleeChess");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        // Tạo và thêm StartPanel vào JFrame
        startPanel = new StartPanel(this);
        add(startPanel);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        // Set logo
        ImageIcon img = new ImageIcon(this.getClass().getResource("icon.png"));
        this.setIconImage(img.getImage());
    }

    // Phương thức để bắt đầu trò chơi
    public void startGame() {
        // Xóa StartPanel và thêm GamePanel
        remove(startPanel);
        gamePanel = new GamePanel();
        add(gamePanel);
        revalidate();
        repaint();
        gamePanel.launchGame();
    }

    public static void main(String[] args) {
        new Main();
    }
}
