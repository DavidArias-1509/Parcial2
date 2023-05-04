/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ESTUDIANTES
 */
public class Contrato extends Producto {
    private double valorContrato;
    private double deducciones;

    //constructor
    public Contrato(double valorContrato, double deducciones) {
        this.valorContrato = valorContrato;
        this.deducciones = deducciones;
    }

    //getter
    public double getValorContrato() {
        return valorContrato;
    }

    public double getDeducciones() {
        return deducciones;
    }

    //setter
    public void setValorContrato(double valorContrato) {
        this.valorContrato = valorContrato;
    }

    public void setDeducciones(double deducciones) {
        this.deducciones = deducciones;
    }

    @Override
    public double calcularIva() {
    double ganancias = this.valorContrato-this.deducciones;
    return ganancias*0.19;
    }
    
   public String toString(){
       return "Contrato \nvalor conrato: "+valorContrato+"\nDeducciones: "+deducciones;
       
   }
}
