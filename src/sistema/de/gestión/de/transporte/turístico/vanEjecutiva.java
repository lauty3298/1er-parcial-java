/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.de.gestión.de.transporte.turístico;

import java.util.List;

/**
 *
 * @author jackspock
 */
public class vanEjecutiva extends vehiculos{
    
    private boolean aireAcondicionado;
    private int confirmacion;

    public vanEjecutiva(boolean aireAcondicionado, String patente, String marca, int capacidadPasajeros, int anioFabricacion) {
        super(patente, marca, capacidadPasajeros, anioFabricacion);
        this.aireAcondicionado = aireAcondicionado;
    }
    @Override
    public List setAniadir_vehiculos(Object aniadir_vehiculos) {
        
        boolean bandera = true;
        
        this.aniadir_vehiculos.add("colectivo");
        
        System.out.println("empezemos\n-patente");
        
        setPatente(in.nextLine());
        this.aniadir_vehiculos.add(getPatente());
        
        System.out.println("-marca");
        
        marca = in.nextLine();
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
        
        System.out.println("1- con aire acondicionado"
                + "\n2- sin aire acondicionado");
        
        confirmacion = in.nextInt();
        
        switch (confirmacion) {
            case 1 -> this.aniadir_vehiculos.add("equipada con aire acondicionado");
            case 2 -> this.aniadir_vehiculos.add("equipada sin aire acondicionado");
            default -> throw new AssertionError();
        }
        
        return this.aniadir_vehiculos;
    }
    
    
    
    
    
    
}
