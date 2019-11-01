package View;

import javax.swing.*;

public class MainFrame extends JFrame {

    private InitialPanel ip;

    public MainFrame() {
        super("Student Information App");
        setupLayoutForMacs();
        ip = new InitialPanel();
        add(ip, "Center");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 500);
        setVisible(true);
    }

    private void setupLayoutForMacs() {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public InitialPanel getIp() {
        return ip;
    }

    public void setIp(InitialPanel ip) {
        this.ip = ip;
    }
}