
package sistema.de.gestión.de.transporte.turístico;

import java.util.ArrayList;
import java.util.List;

public class ordenamiento extends SistemaDeGestiónDeTransporteTurístico {

    List<Object> lista_temp = new ArrayList<>();

    public List<Object> getLista_temp() {
        
        System.out.println("elija alguno de vehiculos disponibles"
                     + "\n    tipo      || patente   || marca   || capacidad   || año de fabricacion   || dato especifico");

                    for (int i = 0; i < lista_temp.size(); i++) {
                        List<?> interior = (List<?>) lista_temp.get(i);
                        System.out.println((i+1) + "     || ");
                        
                        for (int j = 0; j < interior.size(); j++) {
                            System.out.print(interior.get(j) + "  ||     ");
                        }

                        System.out.println();
                    }
        return lista_temp;
    }
    
    public List<Object> getlistanueva(){
    
        return lista_temp;
    }

    public void setLista_temp_anio(List<Object> lista_temp) {

        List<Object> lista_comparar = new ArrayList<>(lista_temp);

        for (int i = 0; i < lista_comparar.size(); i++) {

            for (int j = i + 1; j < lista_comparar.size(); j++) {

                List<?> comparar = (List<?>) lista_comparar.get(i);
                List<?> siguiente = (List<?>) lista_comparar.get(j);

                int anio1 = (int) comparar.get(4);
                int anio2 = (int) siguiente.get(4);

                if (anio1 < anio2) {

                    Object temp = lista_comparar.get(i);

                    lista_comparar.set(i, lista_comparar.get(j));
                    lista_comparar.set(j, temp);
                }
            }
        }

        this.lista_temp = lista_comparar;
    }
    
    // si llegaron a este punto, estoy cansao
    
    public void setLista_temp_capacidad(List<Object> lista_temp) {

        List<Object> lista_comparar = new ArrayList<>(lista_temp);

        for (int i = 0; i < lista_comparar.size(); i++) {

            for (int j = i + 1; j < lista_comparar.size(); j++) {

                List<?> comparar = (List<?>) lista_comparar.get(i);
                List<?> siguiente = (List<?>) lista_comparar.get(j);

                int anio1 = (int) comparar.get(3);
                int anio2 = (int) siguiente.get(3);

                if (anio1 < anio2) {

                    Object temp = lista_comparar.get(i);

                    lista_comparar.set(i, lista_comparar.get(j));
                    lista_comparar.set(j, temp);
                }
            }
        }

        this.lista_temp = lista_comparar;
    }
}