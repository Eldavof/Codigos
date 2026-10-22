package uvm;

public class Alambre extends Thread {

    private int periodo;
    private boolean terminar;

    public Alambre(int timepo) {
        this.periodo = timepo;
        this.terminar = false;
        
    }
    @Override 
    public void run(){
        int vueltas = 1;
        while(!terminar){
            try{
                sleep(periodo);
                System.out.println("Vueltas: " + vueltas);
                vueltas++;
            }
            catch (interruptedException ex){

            }
        }

    }

}
