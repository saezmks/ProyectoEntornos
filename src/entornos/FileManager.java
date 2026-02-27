package entornos;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Clase refactorizada para la Tarea 3.
 * Se han aplicado patrones de Rename Variable y Extract Method.
 */
public class FileManager {

  
    private List<String> libros = new ArrayList<>();
    private List<String> usuarios = new ArrayList<>();
    
    public void procesarPrestamo(String usuario, String libro, int dias) {
       
        if (usuarios.contains(usuario) && libros.contains(libro)) {
            System.out.println("Verificando disponibilidad...");
            
            libros.remove(libro);
            System.out.println("Prestamo realizado");

            // MODIFICACIÓN: Se ha aplicado "Extract Method".
             // En lugar de calcular la fecha aquí mismo, llamamos a un método especializado.
 
            Date fechaDevolucion = calcularFechaDevolucion(dias);
            System.out.println("Fecha devolucion: " + fechaDevolucion);
        }
    }

    
     //MÉTODO AÑADIDO: Patrón "Extract Method" (Tarea 3)
     // Este método se encarga exclusivamente del cálculo de fechas.
     
    private Date calcularFechaDevolucion(int dias) {
        // MODIFICACIÓN: Patrón "Rename Variable" (Tarea 3).
         //Se ha cambiado el nombre de la variable 'cal' por 'calendario' 
         // para que el código sea más legible (Clean Code).
         
        Calendar calendario = Calendar.getInstance();
        calendario.add(Calendar.DAY_OF_MONTH, dias);
        
        return calendario.getTime();
    }

    public static void main(String[] args) {
        System.out.println("Sistema de gestión FileManager activo.");
    }
}