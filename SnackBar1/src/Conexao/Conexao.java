
package Conexao;


import java.beans.Statement;
import java.sql.*;

/**
 *
 * @author Pedro Malaquias
 */
public class Conexao {
    
    private static Connection conexao;
    private PreparedStatement Ds;
    private Statement statement;
    private ResultSet rs;
    
        public Connection connect (){
            
            try {
                  Class.forName("com.mysql.cj.jbc.Driver");
                  conexao = DriverManager.getConnection ("jbdc.mysql://localhost:3306/snackbar1?zeroDateTimeBehavior= CONVERT_TO_NULL", "root", "");     
            } catch (ClassNotFoundException e){
                
                e.printStackTrace();
                
            } catch (SQLException ex){
                
                ex.printStackTrace ();
            }
          
            return conexao;
        }
    
}
