
package Clases;

import Login.VentanaCRUD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class CLogin {
    
    public void validaUsuario(JTextField usuario, JPasswordField contrasenia){
    
        try{
         
            ResultSet rs=null;
            PreparedStatement ps=null;
            
            Clases.CConexion objetoConexion = new Clases.CConexion();
            
            String consulta="SELECT * FROM usuarios WHERE usuarios.nombre_usuario = (?)AND usuarios.contrasena = (?);";
            ps=(PreparedStatement) objetoConexion.establecerConexion().prepareStatement(consulta);
            
            String contra = String.valueOf(contrasenia.getPassword());
            
            ps.setString(1, usuario.getText());
            ps.setString(2, contra);
            
            rs = (ResultSet) ps.executeQuery();
            
            if (rs.next()){
                JOptionPane.showMessageDialog(null, "Acceso Correcto");
                VentanaCRUD objetoCRUD = new VentanaCRUD();
                objetoCRUD.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Usuario Incorrecto, vuelva a intentar!");
            }
        }catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERROR: "+e.toString());
        }
}
    
}
