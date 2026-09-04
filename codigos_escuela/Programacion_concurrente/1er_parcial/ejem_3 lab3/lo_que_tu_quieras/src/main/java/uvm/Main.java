package uvm;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        ArrayList<Descarga> colecta;
        colecta = new ArrayList<>();

        do{
            System.out.println("\n--- Menu opciones ---");
            System.out.println("1. Agregar descarga");
            System.out.println("2. Quitar descarga");
            System.out.println("3. Ver descarga");
            System.out.println("4. Modificar descarga");
            System.out.println("5. Ver toda la info");
            System.out.println("6. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.print("Ingrese el tamaño de la descarga: "); //numero de iteraciones
                    int tam = entrada.nextInt();
                    Descarga nueva = new Descarga(tam);
                    colecta.add(nueva);
                    System.out.println("Descarga agregada: " + nueva.getName());
                    break;

                case 2:
                    if (colecta.isEmpty()){
                        System.out.println("No hay descargas para quitar.");
                    } else {
                        colecta.remove(colecta.size() - 1);
                        System.out.println("Ultima descarga quitada.");
                    }

                    break;
                case 3:
                    if (colecta.isEmpty()){
                        System.out.println("No hay descargas iniciables mi bro.");
                    } else {
                        System.out.println("Iniciando la primera descarga en la lista...");
                        colecta.get(0).start();
                    }

                    try{
                        colecta.get(0).join();
                    } catch (InterruptedException e) {
                        System.out.println("Error al esperar la descarga.");
                    }

                    break;
                case 4:
                    System.out.println("Modificar descarga no implementado aún.");
                    
                    break;
                case 5:
                    if (colecta.isEmpty()){
                        System.out.println("No hay descargas para ver.");
                    } else {
                        System.out.println("Información de todas las descargas:");
                        for (Descarga d : colecta) {
                            System.out.println("Hilo " + d.getName() + "Estado: " + d.getState()+ " Tamaño: " + d.getTam());
                        }
                    }
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion invalida. Intente nuevamente.");
                    break;
            }

        } while(opcion != 6);

         entrada.close();
    }
}