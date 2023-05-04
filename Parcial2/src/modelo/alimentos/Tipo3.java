/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.alimentos;

import modelo.Alimento;

/**
 *
 * @author ESTUDIANTES
 */
public class Tipo3 extends Alimento{

    public Tipo3(double precioVenta, int codigo, int cantidadVenta, String descripcion) {
        super(precioVenta, codigo, cantidadVenta, descripcion);
    }
    
    @Override
    public double calcularIva() {
        return (super.getPrecioVenta()*super.getCantidadVenta())*0.19;
    }
    
    @Override
    public String toString(){
        return super.toString()+"\nTipo: Sin descuento"+"\nImpuesto a recaudar: "+this.calcularIva()+"\n**********";
    }
    
}
