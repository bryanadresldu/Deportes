import javax.swing.*;

public class FormJugador extends JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JButton agregarButton;
    private JButton mostrarButton;
    private JButton limpiarButton;
    private JTable table1;
    private JPanel panelJugador;

    public  FormJugador(){
        setTitle("Administrador");
        setContentPane(panelJugador);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,200);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
