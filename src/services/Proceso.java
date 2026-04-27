package services;

import java.util.concurrent.ConcurrentHashMap;

public class Proceso extends Thread {
	
	public int id;
	public int variable;
	public boolean error;
	//public int[] compromisos;
	public ConcurrentHashMap<Integer, Integer> compromisos;
	public ConcurrentHashMap<Integer, Integer> comisiones;


	public Proceso() {
		this.id = -1;
		this.variable = -1;
		this.error = false;
		this.compromisos = new ConcurrentHashMap<>();
		this.comisiones = new ConcurrentHashMap<>();
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
