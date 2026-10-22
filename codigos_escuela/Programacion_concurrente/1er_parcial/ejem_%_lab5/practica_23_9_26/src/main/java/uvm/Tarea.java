package uvm;

public class Tarea extends Thread {
    private int repetir;

    private String msg;

    private int vel;

    public Tarea(int r, String m){
        repetir = r;
        msg = m;
        this.vel = 1000;
    }

    public void aumnetarVel(int x){
        vel = x;
    }
        
    @Override public void run(){
        for(int i=0; i<repetir; i++){
            System.out.println(msg);
            try{
                sleep(vel);
            } catch (InterruptedException e){

                System.out.println("Error en la tarea porque no se que ");
            }
        }
        
    }

}
