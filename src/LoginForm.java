import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends Component {
    private JPanel panelPrincipal;
    private JTextField usuarioTexto;
    private JPasswordField passwordTexto;
    private JButton enviarButton;

    public LoginForm() {
        enviarButton.addActionListener(e -> validar());
        enviarButton.addActionListener(e -> validar());
    }

    private void validar() {
        // Leer los valores de los campos de texto
        String usuario = this.usuarioTexto.getText();
        String password = new String(passwordTexto.getPassword());
        if (usuario.equals("admin") && password.equals("1234")) {
            JOptionPane.showMessageDialog(this, "Usuario correcto, bienvenido", "Datos correctos", JOptionPane.INFORMATION_MESSAGE);
        } else if (usuario.equals("admin")) {
            JOptionPane.showMessageDialog(this, "Password incorrecto, corrigelo", "Datos Incorrectos", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Usuario incorrecto, corrigelo", "Datos Incorrectos", JOptionPane.ERROR_MESSAGE);

        }


    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("LoginForm");
        frame.setContentPane(new LoginForm().panelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }
}
