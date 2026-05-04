package services;

import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

public class Proceso extends Thread {
	
	public int id;
	public int variable;
	public boolean error;
	public int[] compromisos;
	public int[] comisiones;
	public String[] ips;
	public int numProcesos;
	public int quorum;


	public Proceso(int id, boolean tieneError, int numProcesos) {
		this.id = id;
		this.variable = -1;
		this.error = tieneError;
		this.numProcesos = numProcesos;
		this.compromisos = new int[numProcesos];
		this.comisiones = new int[numProcesos];
		this.ips = new String[numProcesos];
		this.quorum = 0;
	}
	
	
	public void propuesta(String ip, int numP, int v) {
		this.variable = 0;
		for(int i = 0; i < this.numProcesos; i++) {
			this.compromisos[i] = 0;
			this.comisiones[i] = 0;
		}
		if(this.error) compromiso("", this.id, 333); // Programar parte de num aleatorio
		else compromiso("", this.id, v);
		
		//Arrays.fill(this.compromisos, 0);
	}
	
	public void compromiso(String ip, int numP, int v) {
		// Recibe los numeros
		// Lo guarda en el sitio
		// Si hay quorum, comision
		this.compromisos[numP] = v;
		if(v == this.variable) this.quorum++;
		if(quorum >= 3) comision();

	}
	
	public void comision() {
		//ToDo();
	}
	
	public void confirmacion() {
		//ToDo();
	}

}
