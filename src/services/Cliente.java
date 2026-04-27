package services;

class Cliente {
	public final int numProcesos = 6;
	
	public static void main(String[] args) {
		// Instrucciones al usuario
		System.out.println("Estas son las instrucciones:\n"
				+ "Fallo (fN): Modifica el estado de fallo del proceso N\n"
				+ "Cambiar valor (sX): proponer un cambio de valor de la variable a X\n"
				+ "Estado (s): muestra una tabla separada por tabuladores indicando, para cada nodo, su id, el valor de su variable, los compromisos recibidos y su estado de fallo\n"
				+ "Ayuda (h): muestra las opciones disponibles y sus combinaciones de teclas.\n");
		
		// Hacer Start a los procesos
		// Tienen que esperar
		// Ante la orden del usuario, comienzan a hacer cosas
	}
	
	
	
	// Crear metodo para modificar el estado de fallo de un proceso
	
	// Crear metodo para cambiar el valor de la variable de un proceso
	
	// Crear metodo para mostrar una tabla con la informacion
	
	// Crear metodo para mostrar las instrucciones
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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
