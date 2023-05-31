package Modelo;

import java.awt.image.BufferedImage;


public class Productos {
    int ID_PRODUCTO;
    String NOMBRE;
    float PRECIO;
    float LONGITUD;
    float ANCHO;
    float ALTURA;
    String DESCRIPCION;
    BufferedImage IMAGEN;
    int TOTAL_ENEXISTENCIAS;
    String ESTATUS_PRODUCTO;
    int ID_VENTA;

    public Productos() {
    }

    public Productos(int ID_PRODUCTO, String NOMBRE, float PRECIO, float LONGITUD, float ANCHO, float ALTURA, String DESCRIPCION, BufferedImage IMAGEN, int TOTAL_ENEXISTENCIAS, String ESTATUS_PRODUCTO, int ID_VENTA) {
        this.ID_PRODUCTO = ID_PRODUCTO;
        this.NOMBRE = NOMBRE;
        this.PRECIO = PRECIO;
        this.LONGITUD = LONGITUD;
        this.ANCHO = ANCHO;
        this.ALTURA = ALTURA;
        this.DESCRIPCION = DESCRIPCION;
        this.IMAGEN = IMAGEN;
        this.TOTAL_ENEXISTENCIAS = TOTAL_ENEXISTENCIAS;
        this.ESTATUS_PRODUCTO = ESTATUS_PRODUCTO;
        this.ID_VENTA = ID_VENTA;
    }

    public int getID_PRODUCTO() {
        return ID_PRODUCTO;
    }

    public void setID_PRODUCTO(int ID_PRODUCTO) {
        this.ID_PRODUCTO = ID_PRODUCTO;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public float getPRECIO() {
        return PRECIO;
    }

    public void setPRECIO(float PRECIO) {
        this.PRECIO = PRECIO;
    }

    public float getLONGITUD() {
        return LONGITUD;
    }

    public void setLONGITUD(float LONGITUD) {
        this.LONGITUD = LONGITUD;
    }

    public float getANCHO() {
        return ANCHO;
    }

    public void setANCHO(float ANCHO) {
        this.ANCHO = ANCHO;
    }

    public float getALTURA() {
        return ALTURA;
    }

    public void setALTURA(float ALTURA) {
        this.ALTURA = ALTURA;
    }

    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    public void setDESCRIPCION(String DESCRIPCION) {
        this.DESCRIPCION = DESCRIPCION;
    }

    public BufferedImage getIMAGEN() {
        return IMAGEN;
    }

    public void setIMAGEN(BufferedImage IMAGEN) {
        this.IMAGEN = IMAGEN;
    }

    public int getTOTAL_ENEXISTENCIAS() {
        return TOTAL_ENEXISTENCIAS;
    }

    public void setTOTAL_ENEXISTENCIAS(int TOTAL_ENEXISTENCIAS) {
        this.TOTAL_ENEXISTENCIAS = TOTAL_ENEXISTENCIAS;
    }

    public String getESTATUS_PRODUCTO() {
        return ESTATUS_PRODUCTO;
    }

    public void setESTATUS_PRODUCTO(String ESTATUS_PRODUCTO) {
        this.ESTATUS_PRODUCTO = ESTATUS_PRODUCTO;
    }

    public int getID_VENTA() {
        return ID_VENTA;
    }

    public void setID_VENTA(int ID_VENTA) {
        this.ID_VENTA = ID_VENTA;
    }
    
    
    
}
