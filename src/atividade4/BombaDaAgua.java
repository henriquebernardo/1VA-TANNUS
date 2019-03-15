package atividade4;

import java.util.Timer;
import java.util.TimerTask;

public class BombaDaAgua {
    private boolean status;
    Timer tempo = new Timer();

    public void liga(int seg) {
        System.out.println("Bomba ligada");
        this.status = true;
        tempo.schedule(new RemindTask(seg), 0, 1000);
        try {
            Thread.sleep((seg = 1) * 1000);
        } catch (InterruptedException ex) {
        }
    }

    class RemindTask extends TimerTask {
        private int time;
        private int segundos;
        public RemindTask( int time){
        this.time = time;
    }
        public void run () {
        if (this.segundos < this.time) {
            System.out.println("Em " + (this.time - this.segundos) + "segundos a bomba vai ser desligada");
            this.segundos = this.segundos + 1;
        } else {
            desligar();
            tempo.cancel();
        }
    }
    }

    public void desligar() {
        System.out.println("Bomba Desligada");
        this.status = false;
    }
}
