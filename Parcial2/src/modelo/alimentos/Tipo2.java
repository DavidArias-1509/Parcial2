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
public class Tipo2 extends Alimento {

    public Tipo2(double precioVenta, int codigo, int cantidadVenta, String descripcion) {
        super(precioVenta, codigo, cantidadVenta, descripcion);
    }

    @Override
    public double calcularIva() {
    return (super.getPrecioVenta()*super.getCantidadVenta())*0.05;
    }
    
    @Override
    public String toString(){
        return super.toString()+"\nTipo: Con descuento"+"\nImpuesto a recaudar: "+this.calcularIva()+"\n**********";
    }
}
