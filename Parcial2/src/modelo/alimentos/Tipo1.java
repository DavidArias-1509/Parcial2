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
public class Tipo1 extends Alimento{

    public Tipo1(double precioVenta, int codigo, int cantidadVenta, String descripcion) {
        super(precioVenta, codigo, cantidadVenta, descripcion);
    }

    @Override
    public double calcularIva() {
      return 0;  
      }
    
    @Override
    public String toString(){
        return super.toString()+"\nTipo: Exento de iva"+"\nImpuesto a recaudar: "+this.calcularIva()+"\n**********";
    }
}
