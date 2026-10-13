/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.de.gestión.de.transporte.turístico;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jackspock
 */
public abstract class vehiculos {

    protected String patente;
    protected String marca;
    protected int capacidadPasajeros;
    protected int anioFabricacion;
    List<Object> aniadir_vehiculos = new ArrayList<>();
    LocalDate fecha = LocalDate.now();
    int año = fecha.getYear();
    Scanner in = new Scanner(System.in);

    public vehiculos(String patente, String marca, int capacidadPasajeros, int anioFabricacion) {
        this.patente = patente;
        this.marca = marca;
        this.capacidadPasajeros = capacidadPasajeros;
        this.anioFabricacion = anioFabricacion;
    }

    public String getPatente() {
        return patente;
    }

    public String getMarca() {
        return marca;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setPatente(String patente) {
        
        if("".equals(patente) || patente.length() != 6){
            System.out.println("patente invalida"
            + "\nla patente no debe quedar vacia y debe tener 6 caracteres"
            + "\n----"
            + "\nintentalo de nuevo ");
        
            setPatente(in.nextLine());
            
        } else{
            this.patente = patente;
            System.out.println("patente registrada " + patente + " con exito");
        }          
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        
        if (0 < capacidadPasajeros && capacidadPasajeros < 1000){
                
            this.capacidadPasajeros = capacidadPasajeros;
            System.out.println("capacidad registrada con exito");
        }else {
            System.out.println("valor de capacidad fuera de rango"
            +"\n --- se requiere que sea mayor a 0 pero menor a 1000"
            +"\nintentelo de nuevo");

            setCapacidadPasajeros(in.nextInt());
        }   
        
    }

    public void setAnioFabricacion(int anioFabricacion) {
        
        
        if (anioFabricacion >= 1990 && anioFabricacion <= año){
            this.anioFabricacion = anioFabricacion;
        
        }else {
            System.out.println("fecha de fabricacion no valida"
                    + "\n---"
                    + "\nintentelo de nuevo");
            setAnioFabricacion(in.nextInt());
        }
        
    }
    
    public abstract List setAniadir_vehiculos(Object aniadir_vehiculos);
}
