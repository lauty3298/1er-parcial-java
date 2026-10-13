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
public class lanchaTuristica extends vehiculos{
    
    String tipoMotor;
    
    public lanchaTuristica(String tipoMotor, String patente, String marca, int capacidadPasajeros, int anioFabricacion) {
        super(patente, marca, capacidadPasajeros, anioFabricacion);
        this.tipoMotor = tipoMotor;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(int motor) {
        
        try {
            switch (motor) {
            case 1:
                this.tipoMotor = "nafta";
                break;
            case 2:
                this.tipoMotor = "diesel";
                break;
            case 3:
                this.tipoMotor = "electrico";
                break;
            default:
                throw new AssertionError();
        }    
        } catch (Exception e) {
            System.out.println("valor invalido, intentelo de nuevo");
            System.out.println("-tipo de motor"
                + "\n1_ NAFTA"
                + "\n2_ DIESEL"
                + "\n3_ ELECTRICO");
        
            setTipoMotor(in.nextInt());
        }
        
        this.tipoMotor = tipoMotor;
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
        
        System.out.println("-tipo de motor"
                + "\n1_ NAFTA"
                + "\n2_ DIESEL"
                + "\n3_ ELECTRICO");
        
        setTipoMotor(in.nextInt());
        this.aniadir_vehiculos.add("con motor a " + tipoMotor);
        
        return this.aniadir_vehiculos;
    }
    
}
