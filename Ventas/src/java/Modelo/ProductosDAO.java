/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ftalvr
 */
public class ProductosDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;
    
    public Productos buscar(int ID_PRODUCTO){
      Productos p=new Productos();
      String sql="select * from productos where idproductos="+ID_PRODUCTO;
      try {
          con=cn.Conexion();
          ps=con.prepareStatement(sql);
          rs=ps.executeQuery();
          while (rs.next()) {
              p.setID_PRODUCTO(rs.getInt(1));
              p.setNOMBRE(rs.getString(2));
              p.setPRECIO(rs.getFloat(3));
              p.setLONGITUD(rs.getFloat(4));
              p.setANCHO(rs.getFloat(5));
              p.setALTURA(rs.getFloat(6));
              p.setDESCRIPCION(rs.getString(7));
              p.setIMAGEN(rs.getBufferedImage(8));
              p.setTOTAL_ENEXISTENCIAS(rs.getInt(9));
              p.setESTATUS_PRODUCTO(rs.getString(10));
              p.setID_VENTA(rs.getInt(11));
              
              
          }
      } catch (Exception e) {
      }
     return p;
  }
  public int actualizarstock(int ID_PRODUCTO, int TOTAL_ENEXISTENCIAS){
      String sql="update productos set Stock=? where idproductos=?";
      try {
          con=cn.Conexion();
          ps=con.prepareStatement(sql);
          ps.setInt(1, TOTAL_ENEXISTENCIAS);
          ps.setInt(2, ID_PRODUCTO);
          ps.executeUpdate();
      } catch (Exception e) {
      }
      return r;
  }
    
  //*******Operaciones CRUD***************//    
    public List listar(){
        String sql="select * from productos";
        List<Productos>lista=new ArrayList<>();
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                Productos em=new Productos();
                em.setID_PRODUCTO(rs.getInt(1));
                em.setNOMBRE(rs.getString(2));
                em.setPRECIO(rs.getFloat(3));
                em.setLONGITUD(rs.getFloat(4));
                em.setANCHO(rs.getFloat(5));
                em.setALTURA(rs.getFloat(6));
                em.setDESCRIPCION(rs.getString(7));
                em.setIMAGEN(rs.getBufferedImage(8));
                em.setTOTAL_ENEXISTENCIAS(rs.getInt(9));
                em.setESTATUS_PRODUCTO(rs.getString(10));
                em.setID_VENTA(rs.getInt(11));              
                lista.add(em);
            }
        } catch (Exception e) {
        }
        return lista;
    }
    public int agregar(Productos p){ 
        String sql="insert into productos(NOMBRES, PRECIO, LONGITUD, ANCHO, ALTURA, DESCRIPCION, IMAGEN, TOTAL_ENEXISTENCIAS, ESTATUS_PRODUCTO, ID_VENTA)values(?,?,?,?,?,?,?,?,?,?)";
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1,p.getNOMBRE());
            ps.setFloat(2,p.getPRECIO());
            ps.setFloat(3,p.getLONGITUD());
            ps.setFloat(4,p.getANCHO());
            ps.setFloat(5,p.getALTURA());
            ps.setString(6, p.getDESCRIPCION());
            ps.setBufferedImage(7,p.getIMAGEN());
            ps.setInt(8,p.getTOTAL_ENEXISTENCIAS());
            ps.setString(9,p.getESTATUS_PRODUCTO());
            ps.setInt(10,p.getID_VENTA());
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
        
    }
    public Productos listarId(int ID_PROCUCTO){
        Productos pr=new Productos();
        String sql="select * from productos where IdProducto="+ID_PRODUCTO;
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                pr.setID_PRODUCTO(rs.getInt(1));
                pr.setNOMBRE(rs.getString(2));
                pr.setPRECIO(rs.getFloat(3));
                pr.setLONGITUD(rs.getFloat(4));
                pr.setANCHO(rs.getFloat(5));
                pr.setALTURA(rs.getFloat(6));
                pr.setDESCRIPCION(rs.getString(7));
                pr.setIMAGEN(rs.getBufferedImage(8));
                pr.setTOTAL_ENEXISTENCIAS(rs.getInt(9));
                pr.setESTATUS_PRODUCTO(rs.getString(10));
                pr.setID_VENTA(rs.getInt(11));     
            }
        } catch (Exception e) {
        }
        return pr;
    }
    public int actualizar(Producto em){
        String sql="update productos set NOMBRE=?, PRECIO=?, LONGITUD=?, ANCHO=?, ALTURA=?, DESCRIPCION=?, IMAGEN=?, TOTAL_ENEXISTENCIAS=?, ESTATUS_PRODUCTO=?, ID_VENTA=? where ID_PRODUCTO=?";
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, em.getNOMBRE());
            ps.setFloat(2,em.getPRECIO());
            ps.setFloat(3,em.getLONGITUD());
            ps.setFloat(4,em.getANCHO());
            ps.setFloat(5,em.getALTURA());
            ps.setString(6, em.getDESCRIPCION());
            ps.setBufferedImage(7,em.getIMAGEN());
            ps.setInt(8,em.getTOTAL_ENEXISTENCIAS());
            ps.setString(9,em.getESTATUS_PRODUCTO());
            ps.setInt(10,em.getID_VENTA());
             ps.setString(11,em.getNOMBRE());
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }
    public void delete(int id){
        String sql="delete from productos where IdProducto="+id;
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
}
