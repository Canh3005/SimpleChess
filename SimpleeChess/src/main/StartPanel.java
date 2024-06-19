package main;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class StartPanel extends JPanel {

    public StartPanel(Main mainFrame) {
        // Thiết lập layout và màu nền
        setLayout(null);
        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(1100, 800)); // Đặt kích thước ưa thích cho JPanel

        // Tạo JLabel cho "New game"
        JLabel newGameLabel = new JLabel("New gamee");
        newGameLabel.setForeground(Color.WHITE);
        newGameLabel.setFont(new Font("Arial", Font.BOLD, 40));
        // Tính toán vị trí để JLabel nằm ở giữa JPanel
        int labelWidth = 200;
        int labelHeight = 50;
        int x = (1100 - labelWidth) / 2;
        int y = (800 - labelHeight) / 2;
        newGameLabel.setBounds(x, y, labelWidth, labelHeight); // Đặt vị trí và kích thước cho JLabel
        add(newGameLabel);

        // Thêm MouseAdapter để bắt sự kiện chuột
        newGameLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                mainFrame.startGame();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                newGameLabel.setText("<html><u>New game</u></html>"); // Thêm gạch dưới
            }

            @Override
            public void mouseExited(MouseEvent e) {
                newGameLabel.setText("New game"); // Trở lại văn bản ban đầu
            }
        });
    }
}
