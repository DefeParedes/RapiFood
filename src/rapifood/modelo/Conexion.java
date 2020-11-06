/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rapifood.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Fedep
 */
public class Conexion {
    private final String base = "rapifood";
    private final String url = "jdbc:mysql://localhost:3306/"+base;
    private final String user = "root";
    private final String pass = "";
    //1 - DECLARO VARIABLE CONNECTION
    private Connection con; 
    
    public Connection getConnection(){
        try{
            //2 - DECLARO DRIVER
            Class.forName("com.mysql.jdbc.Driver");
            //3 - ESTABLEZCO CONEXION
            con = (Connection) DriverManager.getConnection(url,user,pass);
        }
        catch(SQLException | ClassNotFoundException e){
            System.err.print(e);
        }
        return con;
    }
}
