package clases;

public class Ppal {

	public static void main(String[] args) {
		
		
		Persona p1 = new Persona();
		
		System.out.println("Persona creada con el constructor"
				+ " sin parámetros");
		p1.mostrar();
		
		p1.setNombre("Ana");
		System.out.println("Persona con el nombre Ana");
		p1.mostrar();
		
		System.out.println("introduciendo edad negativa...");
		p1.setEdad(-4);
		p1.mostrar();
		
		System.out.println("Introduciendo edad de 21");
		p1.setEdad(21);
		p1.mostrar();
		
		System.out.println("introduciendo dni incorrecto 11113");
		p1.setDni("11113");
		p1.mostrar();
		
		System.out.println("introduciendo dni correcto 11111111A");
		p1.setDni("11111111A");
		p1.mostrar();
		
		if (p1.esMayorDeEdad()) {
			System.out.println(p1.getNombre() + " con dni "+p1.getDni()+
					" y edad "+p1.getEdad()+ " es mayor de edad");
		} else {
			System.out.println(p1.getNombre() + " con dni "+p1.getDni()+
					" y edad "+p1.getEdad()+ " es menor de edad");
		}
		
		Persona p2 = new Persona(p1);

	}

}
