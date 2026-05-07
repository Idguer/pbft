package services;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Cliente extends Thread {
	public final int numProcesos = 6;
	
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		
		
		List<Thread> procesos = new ArrayList<>();
		
		for(int i = 0; i < cliente.numProcesos; i++) {
			procesos.add(new Proceso(i, false, cliente.numProcesos));
		}
		
		for(Thread px : procesos) {
			px.start();
		}

		
		
		
		
		
		
		
		
		
		String respuesta;
		Scanner sc = new Scanner(System.in);
		
		cliente.ayuda();
		
		while (true) {
			try {
				System.out.print("> ");
				respuesta = sc.nextLine().trim().toLowerCase(); // trim permitecoger toda la línea escrita por el
																// usuario

				if (respuesta.isEmpty()) {
					System.out.println("Error");
					cliente.ayuda();
					continue;
				}

				char instruccion = respuesta.charAt(0); // coge el caracter en posición 0

				switch (instruccion) {
					case 'f':
						if (respuesta.length() > 1) {
							int idProceso = Integer.parseInt(respuesta.substring(1).trim()); // permitir más de 6
																								// procesos o no?
							if (idProceso < 0 || idProceso > cliente.numProcesos - 1) {
								System.out.println("Error: rango de ids 0-5");
							} else {
								cliente.fallo(idProceso);
							}
						} else {
							System.out.println("Error: uso fN");
						}
						break;
					case 's':
						if (respuesta.length() == 1)
							cliente.mostrarEstado();
						else {
							int valor = Integer.parseInt(respuesta.substring(1).trim());
							if (valor < 0 || valor > 100) {
								System.out.println("Error: el valor debe estar entre 0 y 100");
							} else {
								cliente.cambiarValor(valor);
							}
						}
						break;
					case 'h':
						cliente.ayuda();
						break;
					default:
						System.out.println("Error en el formato del comando. Revisa la ayuda (h).");
				}

			} catch (Exception e) {
				System.out.println("Error en el formato");
			}
		}
		
		//sc.close(); solo se puede poner si hay en condición de salida sino da error
		
		
		/*if(respuesta.length() >= 2) {
			if(respuesta.startsWith("f")) System.out.println("F");
			else if(respuesta.startsWith("s")) System.out.println("S");
			else System.out.println(respuesta);
		} else {
			if(respuesta.startsWith("s")) System.out.println("s");
			else if(respuesta.startsWith("h")) System.out.println("h");
			else System.out.println(respuesta);
		}*/

		
		// Hacer Start a los procesos
		// Tienen que esperar
		// Ante la orden del usuario, comienzan a hacer cosas
		
		

	}
	
	
	
	// Crear metodo para modificar el estado de fallo de un proceso
	public void fallo(int id) 
	{
		
	}

	// Crear metodo para cambiar el valor de la variable
	public void cambiarValor(int x) 
	{
		// mandar de alguna forma a los procesos el valor de x
		for(int i = 0; i < numProcesos; i++) 
		{
			
		}
	}
	
	// Crear metodo para mostrar una tabla con la informacion
	public void mostrarEstado() 
	{
		// cabecera
		System.out.println("id\tvar\tcompromisos\terror");
		//el cliente tiene que recibir la información de los procesos
	}
		
	// Crear metodo para mostrar las instrucciones
	public void ayuda() 
	{
		// Instrucciones al usuario
				System.out.println("Estas son las instrucciones:\n"
						+ "Fallo (fN): Modifica el estado de fallo del proceso N\n"
						+ "Cambiar valor (sX): proponer un cambio de valor de la variable a X\n"
						+ "Estado (s): muestra una tabla separada por tabuladores indicando, para cada nodo, su id, el valor de su variable, los compromisos recibidos y su estado de fallo\n"
						+ "Ayuda (h): muestra las opciones disponibles y sus combinaciones de teclas.\n");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * EJEMPLO CREAR HILOS
	 * 
	 * 
	 * 
	 * long tIni = System.currentTimeMillis();
		
		Thread atleta1 = new Atleta("Margarete", 1);
		Thread atleta2 = new Atleta("Lauren", 2);
		Thread atleta3 = new Atleta("Marta", 3);
		Thread atleta4 = new Atleta("Jasmine", 4);
		List<Thread> atletas = new ArrayList<>();
		atletas.add(atleta1);
		atletas.add(atleta2);
		atletas.add(atleta3);
		atletas.add(atleta4);
		
		System.out.println("Bienvenidos a la carrera\n");
		for(Thread actAtleta : atletas) {
			actAtleta.start();
		}
		try {
			for(Thread actAtleta : atletas) {
				actAtleta.join();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		long tFin = System.currentTimeMillis();
		double tRun = (tFin-tIni) / 1000.0;
		System.out.println("\nTiempo total de la carrera: " + tRun + " segundos");
		
	 */

}
