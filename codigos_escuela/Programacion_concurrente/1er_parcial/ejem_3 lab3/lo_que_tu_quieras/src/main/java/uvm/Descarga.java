package uvm;

public class Descarga extends Thread{

    private int tam;
        public Descarga(int w){
            tam = w;
        }
        public int getTam(){
            return tam;
        }
        
     @Override

    public void run() {
        System.out.println("Descargando archivo...");
        System.out.println(getName());
        for (int i=1; i<=tam; i++){

            System.out.println(getName() + "#" + i);
            try {
                sleep(750);}
                catch (InterruptedException e) {
                    System.out.println("Error en la descarga");
        }

    }System.out.println(getName() + " Descarga completa");
    }
} 
