/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rapifood.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Fedep
 */
public class MesaData {
    private final Connection con;
    
    public MesaData(Conexion conexion){
        con = conexion.getConnection();
    }
    
    public void guardarMesa(Mesa mesa){
        
        try{     
            //CONSULTA A REALIZAR
            //String sql = "INSERT INTO mesa (max_comensales,estado) VALUES (?,?);";
            String sql = "INSERT INTO mesa(max_comensales,estado,id) VALUES (?,?,?);";
                
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);    
            //PREPARANDO LOS ARGUMENTOS A ENVIAR.
            ps.setInt(1, mesa.getMax_comensales());
            ps.setBoolean(2, mesa.isEstado());
            ps.setInt(3, mesa.getId());
            
            //CONSULTA ENVIADA.
            ps.executeUpdate();
            
            //RETORNO DE LAS KEYS GENERADAS.
            //ResultSet rs = ps.getGeneratedKeys();
            
            //AL OBJETO MESA LE ASIGNAMOS EL ID_MESA DADO EN LA BASE DE DATOS.
            /*if(rs.next()){
                mesa.setId(rs.getInt(1));
            }
            else{
                JOptionPane.showMessageDialog(null, "No se pudo obtener el ID.");
            }*/
            ps.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error al guardar la mesa.");
        }
    }
    
    public List<Mesa> obtenerMesas(){
        List<Mesa> mesas = new ArrayList<>();
        try{
            //CONSULTA A REALIZAR.
            String sql = "SELECT * FROM mesa;";
            
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            Mesa mesa;
            
            //MIENTRAS HAYA MESAS HACER
            while(resultSet.next()){
                mesa = new Mesa();
                mesa.setId(resultSet.getInt("id"));
                mesa.setMax_comensales(resultSet.getInt("max_comensales"));
                mesa.setEstado(resultSet.getBoolean("estado"));
                mesas.add(mesa);
            }
            statement.close();
        }
        catch(SQLException e){
            System.out.println("Error al obtener las mesas: "+e.getMessage());
        }
        return mesas;
    }
    
    public Mesa buscarMesa(int id){
        Mesa mesa=null;
        String sql = "SELECT * FROM mesa WHERE id=?";
        try{
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                mesa = new Mesa();
                mesa.setId(rs.getInt("id"));
                mesa.setMax_comensales(rs.getInt("max_comensales"));
                mesa.setEstado(rs.getBoolean("estado"));
            }
            ps.close();
        }
        catch(SQLException e){
            System.out.println("Error: "+e.getMessage());
        }
        return mesa;
    }
    
    public void actualizarMesa(Mesa mesa){
        try{
            String sql = ("UPDATE mesa SET max_comensales=?,estado=? WHERE id=?");
            
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, mesa.getMax_comensales());
            ps.setBoolean(2, mesa.isEstado());
            ps.setInt(3, mesa.getId());
            
            ps.executeUpdate();
            
            ps.close();
        }
        catch(SQLException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
    
    public void borrarMesa (int id){
        String sql = "DELETE FROM mesa WHERE id=?";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            ps.executeUpdate();
        }
        catch(SQLException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
