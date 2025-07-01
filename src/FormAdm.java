import javax.swing.*;

public class FormAdm extends JFrame{
    private JPanel panelAdm;

    public  FormAdm(){
        setTitle("Administrador");
        setContentPane(panelAdm);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,200);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
