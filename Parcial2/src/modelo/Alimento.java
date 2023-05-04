/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ESTUDIANTES
 */
public abstract class Alimento extends Producto {
    private double precioVenta;
    private int codigo;
    private int cantidadVenta;
    private String descripcion;
    
    //constructor
    public Alimento(double precioVenta, int codigo, int cantidadVenta, String descripcion) {
        this.precioVenta = precioVenta;
        this.codigo = codigo;
        this.cantidadVenta = cantidadVenta;
        this.descripcion = descripcion;
    }
    
    //getter
    public double getPrecioVenta() {
        return precioVenta;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getCantidadVenta() {
        return cantidadVenta;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    //setter
    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setCantidadVenta(int cantidadVenta) {
        this.cantidadVenta = cantidadVenta;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    @Override
    public abstract double calcularIva();
    
    @Override
    public String toString(){
        return "Descripcion: "+descripcion+"\nCodigo: "+codigo+"\nCantidad vendida: "+cantidadVenta+"\nPrecio de Venta: "+precioVenta;
    }
}
