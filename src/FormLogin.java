import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormLogin extends JFrame{
    private JPanel panelLogin;
    private JTextField txtUsuario;
    private JPasswordField txtContrasenia;
    private JComboBox comboRol;
    private JButton accesoButton;



    public FormLogin(){
        setTitle("Registro");
        setContentPane(panelLogin);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,200);
        setLocationRelativeTo(null);
        setVisible(true);

/*        JPanel panelManual = new JPanel();
        panelManual.setLayout(null); // Layout absoluto
        panelManual.setBounds(10, 200, 460, 150);

        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(10, 10, 100, 25);
        panelManual.add(lblNombre);

        JTextField txtNombre = new JTextField("rellenar");
        txtNombre.setBounds(120, 10, 200, 25);
        panelManual.add(txtNombre);


        JButton boton = new JButton("ACCEDER");
        boton.setBounds(120, 50, 100, 25);
        panelManual.add(boton);

        panelLogin.add(panelManual);*/


        accesoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = txtUsuario.getText(); // <-- aquí estaba el error
                String contrasenia = String.valueOf(txtContrasenia.getPassword());
                String rol = String.valueOf(comboRol.getSelectedItem());

                if (usuario.isEmpty() || contrasenia.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Rellene ambos campos");
                }

                if (rol.equals("Administrador")&&usuario.equals("adm")&&contrasenia.equals("123")){
                    new FormAdm();
                    dispose();
                }

                if (rol.equals("Jugador")&&usuario.equals("jugar")&&contrasenia.equals("123")){
                    new FormJugador();
                    dispose();
                }

            }
        });
    }

    public static void main(String[] args) {
        new FormLogin();
    }



}
