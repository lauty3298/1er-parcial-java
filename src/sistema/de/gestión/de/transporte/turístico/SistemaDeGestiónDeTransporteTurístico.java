/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistema.de.gestión.de.transporte.turístico;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jackspock
 */
public class SistemaDeGestiónDeTransporteTurístico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int menu;
        boolean bandera = true;
        
        
        List<Object> vehiculos_disponibles = new ArrayList<>();
        
        Scanner in = new Scanner(System.in);
        
        ColectivoTuristico vehiculo1 = new ColectivoTuristico(0, "", "", 0, 0);
        vanEjecutiva vehiculo2 = new vanEjecutiva(bandera, "", "", 0, 0);
        lanchaTuristica vehiculo3 = new lanchaTuristica("", "", "", 0, 0);
        busqueda buscando = new busqueda("");
        ordenamiento ordenado = new ordenamiento();
        
        System.out.println("bienvenido"
        + "\n----");
       
        do{
            System.out.println("que quiere hacer?\n" +
                    "1. Agregar vehículo\n" +
                    "2. Mostrar todos los vehículos\n" +
                    "3. Realizar servicios turísticos\n" +
                    "4. Buscar vehículo por patente\n" +
                    "5. Mostrar vehículos con capacidad mayor a un valor ingresado\n" +
                    "6. Mostrar vehículos ordenados por año de fabricación descendente\n" +
                    "7. Mostrar vehículos ordenados por capacidad de pasajeros descendente\n" +
                    "8. Salir");
            try {
                
                menu = in.nextInt();
            switch (menu) {
                case 1:
                    
                    System.out.println("elija el tipo de vehiculo:\n" +
                            "1 ColectivoTuristico:\n"+ 
                            "2 VanEjecutiva:\n"+
                            "3 LanchaTuristica:\n");
                            
                            try {
                                menu = in.nextInt();
                            switch (menu) {
                        case 1:
                            vehiculos_disponibles.add(vehiculo1.setAniadir_vehiculos(vehiculo1)); 
                            
                            System.out.println("el colectivo fue creado correctamente");
                            break;
                        case 2:
                            
                            vehiculos_disponibles.add(vehiculo2.setAniadir_vehiculos(vehiculo2));
                            
                            System.out.println("la van fue creado correctamente");
                            break;
                        case 3:
                            
                            vehiculos_disponibles.add(vehiculo3.setAniadir_vehiculos(vehiculo3));
                            
                            System.out.println("la lancha fue creado correctamente");
                            break;
                        default:
                            throw new AssertionError();
                    }
                        
                            } catch (Exception e) {
                                System.out.println("el valor ingresado es invalido, intentelo de nuevo con un numero entero");
                                in.nextLine();
                            }
                            
                    break;
                case 2:
                    // me disculpo de antemano, no sabia como hacer esta parte y que quedara bien.
                    System.out.println("elija alguno de vehiculos disponibles"
                     + "\n    tipo      || patente   || marca   || capacidad   || año de fabricacion   || dato especifico");

                    for (int i = 0; i < vehiculos_disponibles.size(); i++) {
                        List<?> interior = (List<?>) vehiculos_disponibles.get(i);
                        System.out.println((i+1) + "     || ");
                        
                        for (int j = 0; j < interior.size(); j++) {
                            System.out.print(interior.get(j) + "  ||     ");
                        }

                        System.out.println();
                    }
                    break;
                case 3:
                    
                    System.out.println("elija alguno de vehiculos disponibles por su numero a la izquierda"
                     + "\n    tipo      || patente   || marca   || capacidad   || año de fabricacion   || dato especifico");

                    for (int i = 0; i < vehiculos_disponibles.size(); i++) {
                        List<?> interior = (List<?>) vehiculos_disponibles.get(i);
                        System.out.print((i+1) + "     || ");
                        
                        for (int j = 0; j < interior.size(); j++) {
                            System.out.print(interior.get(j) + "  ||     ");
                        }

                        System.out.println();
                    }
                    
                    menu = in.nextInt();
                    List<?> interior = (List<?>) vehiculos_disponibles.get(menu-1);
                    
                    for (int i = 0; i < interior.size(); i++) {
                            System.out.print(interior.get(i) + "  ||     ");
                        }
                    System.out.println("---\ntodo listo\n----\n\n usted se ira en el " + interior.get(0) + " a las 9:00hs, buen viaje");
                    
                    
                    break;
                case 4:
                    
                    buscando.setBuscar(vehiculos_disponibles);
                    
                    break;
                case 5:
                    
                    buscando.setBuscar_capacidad(vehiculos_disponibles);
                    break;
                case 6:
                    
                    ordenado.setLista_temp_anio(vehiculos_disponibles);
                    ordenado.getLista_temp();
                    
                    vehiculos_disponibles = ordenado.getlistanueva();
                    
                    break;
                case 7:
                    
                    ordenado.setLista_temp_capacidad(vehiculos_disponibles);
                    ordenado.getLista_temp();
                    
                    vehiculos_disponibles = ordenado.getlistanueva();
                    
                    break;
                case 8:
                    bandera = false;
                    
                    System.out.println("adios...");
                    break;
                default:
                    throw new AssertionError();
            }
                
            } catch (Exception e) {
                System.out.println("el valor ingresado es invalido, intentelo de nuevo con un numero entero");
                in.nextLine();
            }
            
            
        }while (bandera == true);
        
        
    }
    
}
