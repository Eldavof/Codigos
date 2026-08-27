package uvm;

public class MiHilo extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("hello wordl");
            Thread.sleep(5000);
            System.out.println("hello wordl");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.err.println("Excepcion: " + e.getMessage());
        }

        System.out.println("Hola mundo soy el hilo!");
    }
}