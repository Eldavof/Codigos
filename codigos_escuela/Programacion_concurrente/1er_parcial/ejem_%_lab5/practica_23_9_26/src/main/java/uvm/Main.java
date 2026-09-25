package uvm;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        Tarea miHilo = null;

        do{

            System.out.println("\n--- Menu opciones ---");
            System.out.println("1. Crear e iniciar el hilo");
            System.out.println("2. Conultar el estado del hilo");
            System.out.println("3. Modificar nombre del hilo");
            System.out.println("4. Consultar prioridad del hilo");
            System.out.println("5. Interrumpir el hilo");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opcion: ");

            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1:
                    miHilo = new Tarea(5, "Ejecutando proceso en segundo plano...");
                    miHilo.start();
                    break;

                case 2:
                    if (miHilo != null) {
                        System.out.println("Estado del hilo: " + (miHilo.isAlive() ? "Activo" : "Terminado"));
                    } else {
                        System.out.println("No se ha creado ningún hilo aún.");
                    }

                    break;
                case 3:
                    if (miHilo != null){
                        System.out.println ("Ingrese el nuevo nombre del hilo: ");
                        String nuevoNombre = entrada.next();
                        miHilo.setName(nuevoNombre);
                        System.out.println("Nombre del hilo modificado a: " + miHilo.getName());
                    } else {
                        System.out.println("No se ha creado ningún hilo aún.");
                    }
                    
                    break;
                case 4:
                    if (miHilo != null) {
                        System.out.println("Prioridad del hilo: " + miHilo.getPriority());
                    } else {
                        System.out.println("No se ha creado ningún hilo aún.");
                    }
                    break;
                case 5:
                    if (miHilo != null) {
                        miHilo.interrupt();
                        System.out.println("Hilo interrumpido.");
                    } else {
                        System.out.println("No se ha creado ningún hilo aún.");
                    }
                    break;
                case 0:
                    
                    break;
            }

        } while(opcion != 0);

         entrada.close();
    }
}