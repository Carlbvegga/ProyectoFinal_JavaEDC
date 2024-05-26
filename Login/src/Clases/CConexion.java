
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class CConexion {
    Connection conectar;

String usuario = "root";
String contrasena = "";
String bd = "codigoedc";
String ip = "localhost";
String puerto = "3306";


String cadena ="jdbc:mysql://"+ip+":"+puerto+"/"+bd;


public java.sql.Connection establecerConexion()
{
    try{
    
        
        Class.forName("com.mysql.jdbc.Driver");
        
        
        conectar = (Connection) DriverManager.getConnection(cadena,usuario,contrasena);
        
        
    } catch (ClassNotFoundException | SQLException e)
    {
        JOptionPane.showMessageDialog(null,"Problemas en la Conexión"+e.toString());
    }
    
    return conectar;
    }
}

