/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ESTUDIANTES
 */
public class Vehiculo extends Producto{
    private double valorComercial;
    private String marca;
    private String modelo;
    private String linea;
    
    //constructor
    public Vehiculo(double valorComercial, String marca, String modelo, String linea) {
        this.valorComercial = valorComercial;
        this.marca = marca;
        this.modelo = modelo;
        this.linea = linea;
    }
    
    //getter
    public double getValorComercial() {
        return valorComercial;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getLinea() {
        return linea;
    }
    
    //setter
    public void setValorComercial(double valorComercial) {
        this.valorComercial = valorComercial;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    @Override
    public double calcularIva() {
        double impuesto;
        if(this.valorComercial<=49470000){
            impuesto = this.getValorComercial()*0.015;
        }else{
            if((this.valorComercial>49_470_000)&&(this.valorComercial<=111_305_000)){
                impuesto = this.getValorComercial()*0.025;
            }else{
                impuesto = this.getValorComercial()*0.035;
            }
        }
        return impuesto;
    }
    //nuevo
    @Override
    public String toString(){
        return "Vehiculo \nValor comercial: "+valorComercial+"\nModelo: "+modelo+"\nMarca: "+marca+"\nLinea: "+linea+"\n******";
    }
}
