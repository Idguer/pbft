package services;

import java.util.concurrent.ConcurrentHashMap;

public class Proceso extends Thread {
	
	public int id;
	public int variable;
	public boolean error;
	//public int[] compromisos;
	public int[] compromisos;
	public int[] comisiones;
	public int numProcesos;
	public int quorum;


	public Proceso(int id, boolean tieneError, int numProcesos) {
		this.id = id;
		this.variable = -1;
		this.error = tieneError;
		this.numProcesos = numProcesos;
		this.quorum = 0;
	}
	
	
	public void propuesta() {
		//ToDo();
	}
	
	public void compromiso() {
		//ToDo();
	}
	
	public void comision() {
		//ToDo();
	}
	
	public void confirmacion() {
		//ToDo();
	}

}
