/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.de.gestión.de.transporte.turístico;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jackspock
 */
public class ColectivoTuristico extends vehiculos{
    
    private int cantidadPisos;
    
    Scanner in1 = new Scanner(System.in);
    
    public ColectivoTuristico(int cantidadPisos, String patente, String marca, int capacidadPasajeros, int anioFabricacion) {
        super(patente, marca, capacidadPasajeros, anioFabricacion);
        this.cantidadPisos = cantidadPisos;
    }
    
    public void setCantidadPisos(int cantidadPisos) {
        
        if (cantidadPisos == 1 || cantidadPisos == 2) {
            this.cantidadPisos = cantidadPisos;
            System.out.println("cantidad de pisos registrada");
        }else{
            System.out.println("la cantidad de pisos esta fuera de rango");
        }
        
    }

    @Override
    public List setAniadir_vehiculos(Object aniadir_vehiculos) {
        
        boolean bandera = true;
        
        this.aniadir_vehiculos.add("colectivo");
        
        System.out.println("empezemos\n-patente");
        
        setPatente(in1.nextLine());
        this.aniadir_vehiculos.add(getPatente());
        
        System.out.println("-marca");
        
        marca = in1.nextLine();
        this.aniadir_vehiculos.add(marca);
        
        System.out.println("-capacidad de pasajeros");
        
        do {
            try {
                System.out.println("Ingrese un número entero:");
                setCapacidadPasajeros(in.nextInt());

                bandera = false;

            } catch (Exception e) {
                System.out.println("Error: debe ingresar un número entero.");
                in.nextLine(); 
            }

        } while (bandera == true);
        this.aniadir_vehiculos.add(capacidadPasajeros);
        
        System.out.println("-año de fabricacion");
        
        do {
            try {
                System.out.println("Ingrese un número entero:");
                setAnioFabricacion(in.nextInt());

                bandera = false;

            } catch (Exception e) {
                System.out.println("Error: debe ingresar un número entero.");
                in.nextLine(); 
            }

        } while (bandera == true);
        this.aniadir_vehiculos.add(anioFabricacion);
        
        System.out.println("-cantidad de pisos");
        
        setCantidadPisos(in1.nextInt());
        this.aniadir_vehiculos.add("cantidad de pisos " + cantidadPisos);
        
        return this.aniadir_vehiculos;
    }  
}
