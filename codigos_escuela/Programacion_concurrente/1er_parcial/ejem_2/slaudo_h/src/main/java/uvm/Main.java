package uvm;

public class Main {
    public static void main(String[] args) {
        System.out.println("Soy main puto!");
        MiHilo obj;
        obj = new MiHilo();
        System.out.println("Nombre del hilo: " + obj.getName());
        System.out.println("Prioridad del hilo: " + obj.getPriority());
        System.out.println("Id del hilo: " + obj.threadId());
        System.out.println("Estado del hilo: " + obj.getState());
        obj.start();
        System.out.println("Estado del hilo: " + obj.getState());

        try {
            obj.join();
        } catch (InterruptedException abue) {
            System.err.println("Excepcion: " + abue.getMessage());
        }

        System.out.println("Estado del hilo: " + obj.getState());
        System.out.println("Fin del main");
    }
}

//agregar quitar, ver, modificar, ver toda la info