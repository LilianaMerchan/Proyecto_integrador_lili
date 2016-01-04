package TIMER;

import java.util.TimerTask;
import java.util.Timer;
import java.io.IOException; 

public class TIMER_PROYECTO {

	Timer timer = new Timer();  
	public int segundos; 
	public boolean frozen;
	
	
	class MiProyecto extends TimerTask {
		public void run() {
			segundos++;
			System.out.println(segundos);
}
}
	
	public void Start(int pSeg) throws Exception {
		frozen = false;
		
		timer.schedule(new MiProyecto(), 0, pSeg * 1000 * 60);
	}
	
	public void Stop() {
		System.out.println("Stop");
		frozen = true;
	}
	
	public void Reset() {
		System.out.println("Reset");
		frozen = true;
		segundos = 0;
	}
}
		
