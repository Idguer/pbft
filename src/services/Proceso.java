package services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class Proceso extends Thread {
	
	public int id;
	public int variable;
	public boolean error;
	//public int[] compromisos;
	public int[] compromisos;
	public int[] comisiones;
	public int numProcesos;
	public String[] ips;
	public int quorum;
	public List<Proceso> todosProcesos;
	public Cliente cliente;


	public Proceso(int id, boolean tieneError, int numProcesos) {
		this.id = id;
		this.variable = -1;
		this.error = tieneError;
		this.numProcesos = numProcesos;
		this.compromisos = new int[numProcesos];
		this.comisiones = new int[numProcesos];
		//this.ips = new String[numProcesos];
		this.quorum = numProcesos / 2 + 1;
	}
	
	@Override
	public void run() {
		// Quede a la espera simplemente.
	}
	
	
	public synchronized void propuesta(int v) {
		// Reset de estado
		this.variable = -1;
		this.compromisos = new int[200];
		this.comisiones = new int[200];
		
		int valorEnvio;
		if(error) {
			valorEnvio = numeroGenAleatorio(10);
		} else {
			valorEnvio = v;
		}
		System.out.println("[P" + this.id + "] prop. recibida: " + v + " :: multidifunde compromiso(" + valorEnvio + ")");
		for(Proceso p : this.todosProcesos) {
			p.compromiso(valorEnvio);
		}
		
		
		
		// this.variable = 0;
		// for(int i = 0; i < this.numProcesos; i++) {
		// 	this.compromisos[i] = 0;
		// 	this.comisiones[i] = 0;
		// }
		// if(this.error) compromiso("", this.id, 333); // Programar parte de num aleatorio
		// else compromiso("", this.id, v);
		
		//Arrays.fill(this.compromisos, 0);
	}
	
	public synchronized void compromiso(int v) {
		
		compromisos[v]++;
		
		System.out.println("[P" + this.id + "] compr. recibido: " + v + " (total: " + compromisos[v] + "/" + quorum + ")");
		
		if(compromisos[v] >= quorum) {
			// Evitar volver a emitir para mismo valor
			if(comisiones[v] == 0) {
				System.out.println("[P" + id + "] qu�rum de compromisos :: emite comision(" + v + ")");
				for(Proceso p : todosProcesos) {
					p.comision(v);
				}
			}
		}
	}
	
	public synchronized void comision(int v) {
		comisiones[v]++;
		
		System.out.println("[P" + id + "] comisi�n recibida " + v + " (total: " + comisiones[v] + "/" + quorum + ")");
		
		if(comisiones[v] >= quorum) {
			if(variable == -1) {
				variable = v;
				System.out.println("[P" + id + "] qu�rum de comisiones :: variable = " + v + ", enviando confirmaci�n al cliente");
				cliente.confirmacion();
			}
		}
	}
	
	public void confirmacion() {
		//ToDo();
	}
	
	public int numeroGenAleatorio(int max) {
		// Gestionar posibilidad de que max sea menor que 0 para evitar errores
		return (int)Math.floor(Math.random() * max + 1);
	}

}
