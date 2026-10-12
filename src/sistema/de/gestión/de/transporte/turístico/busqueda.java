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
public class busqueda {
    
    private String buscar;
    private int buscar_capacidad;
    
    Scanner in = new Scanner(System.in);

    public busqueda(String buscar) {
        this.buscar_capacidad = buscar_capacidad;
        this.buscar = buscar;
    }

    public String getBuscar() {
        return buscar;
    }

    public int getBuscar_capacidad() {
        return buscar_capacidad;
    }

    public void setBuscar(List encontrar_patente) {
        System.out.println("ingrese la patente para iniciar la busqueda");
        this.buscar = in.nextLine();
        
        for (int i = 0; i < encontrar_patente.size(); i++) {
                        List<?> interior = (List<?>) encontrar_patente.get(i);
                        
                        String reemplazo = (String) interior.get(1);
                        if (reemplazo == null ? getBuscar() == null : reemplazo.equals(getBuscar())){
                            System.out.println("\nse encontro un coincidencia");
                            for (int h = 0; h < interior.size(); h++) {
                                System.out.print(interior.get(h) + "  ||     ");
                            }
                                
                            }
                          
                         System.out.println("\n");       
                                
                    }
    }
    
    public void setBuscar_capacidad(List encontrar_patente) {
        
        System.out.println("añada a partir de que capacidad quiere ver");
        this.buscar_capacidad = in.nextInt();
        
        System.out.println("a continuacion se encuentran vehiculos con mayor capacidad de la pedida");
        System.out.println("\n    tipo      || patente   || marca   || capacidad   || año de fabricacion   || dato especifico");
        for (int i = 0; i < encontrar_patente.size(); i++) {
                        List<?> interior = (List<?>) encontrar_patente.get(i);
                        int capacidad = (int) interior.get(3);
                        
                        
                        if (capacidad >= getBuscar_capacidad()) {
                            
                            for (int h = 0; h < interior.size(); h++) {
                                System.out.print(interior.get(h) + "  ||     ");
                            }
                                
                            }
                          
                         System.out.println("\n");       
                                
                    }
    }
    
    
    
}
