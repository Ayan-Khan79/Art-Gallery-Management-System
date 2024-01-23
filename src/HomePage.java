import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePage extends JDialog {
    private JPanel panel1;
    private JButton btnLogin;
    private JButton btnRegister;
    private JPanel HomePage;

    public HomePage(JFrame parent){
        super(parent);
        setTitle("Home Page");
        setContentPane(panel1);
        setMinimumSize(new Dimension(500,300));
        setModal(true);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(true);
            }
        });

    }

    public static void main(String[] args) {
        HomePage homePage = new HomePage(null);
    }
}


