/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;
import modelo.*;
import java.util.*;
import modelo.alimentos.*;//nuevo
/**
 *
 * @author ESTUDIANTES
 */
public class Principal {

    /**
     */
    public static List<Producto> productos = new ArrayList();
    public static void main(String[] args) {
        char continuar='S';
        while(continuar=='S'){
           int option=menu();
           switch(option){
               case 1: agregar();
                break;
               case 2: listado();
                break;
               case 3: recaudo();
                break;
               case 4: continuar='N';
           }
        }
    }
    
    public static int menu(){
        int op=0;
        System.out.println("1- Cargar productos");
        System.out.println("2- Ver lista");
        System.out.println("3- Obtener recaudo esperado");
        System.out.println("4- salir");
        do{
            op=Entrada.leerEntero("Seleccione una Opcion: ");
        }while((op<1)||(op>4));
        return op;
    }
    
    public static void agregar(){
        char op='S';
        while(op=='S'){
            Producto p= null;
            char tipo;
            do{
               System.out.println("Que producto desea agregar..");
               tipo=Entrada.leerCaracter("Alimeto (A) - Vehiculo (V) - Contrato (C): ");
            }while((tipo!='A')&&(tipo!='V')&&(tipo!='C'));
            
            switch(tipo){
                case 'A':int type;
                        do{
                            System.out.println("Tipo de alimento:");
                            type=Entrada.leerEntero("1- Excento de iva \n2-Con descuento \n3-Sin descuento");
                        }while((type<1)||(type>3));
                        Alimento A = null;
                        int codigo = Entrada.leerEntero("Codigo: ");
                        double precioVenta=Entrada.leerDouble("Precio de venta: ");
                        int cantidadVenta = Entrada.leerEntero("Cantidad vendida: ");
                        String descripcion = Entrada.leerString("Descripcion: ");
                        switch(type){
                            case 1: A = new Tipo1(precioVenta, codigo, cantidadVenta, descripcion);
                                break;
                            case 2: A = new Tipo2(precioVenta, codigo, cantidadVenta, descripcion);
                                break;
                            case 3: A = new Tipo3(precioVenta, codigo, cantidadVenta, descripcion);
                                break;
                        }
                        p= A;
                    break;
                    
                case 'V':
                double valorComercial= Entrada.leerDouble("Valor comercial");
                String marca= Entrada.leerString("Marca");
                String modelo = Entrada.leerString("Modelo");
                String linea = Entrada.leerString("linea: ");
                p = new Vehiculo(valorComercial, marca, modelo, linea);
                    break;
                    
                case 'C':
                    double valorContrato = Entrada.leerDouble("Valor del contrato");
                    double deducciones = Entrada.leerDouble("Deducciones y gastos: ");
                    p = new Contrato(valorContrato, deducciones);
                    break;
            }
           productos.add(p); 
           //nuevo
           op=Entrada.leerCaracter("Desea agregar un producto mas? S/N :");
        }
    }
   
    public static void listado(){
        System.out.println("Listado");
        if(productos == null){
            System.out.println("No hay productos");
        }else{
            for(Producto p : productos){
                System.out.println(p);
            }
        }
    }
    
    public static void recaudo(){
        System.out.println("Recaudo");
        double recaudo=0;
        for(Producto p : productos){
            recaudo=+p.calcularIva();
        }
        System.out.println("El recaudo esperado es de: "+recaudo);
    }
}
