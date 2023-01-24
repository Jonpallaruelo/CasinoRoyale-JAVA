import java.util.Random;
import java.util.Scanner;

public class main {

	private static Jugador jugador;
	private static Scanner sc = new Scanner(System.in);
	private static Random rd = new Random();
	public static boolean seguirjugando=true;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ResgistrarUsuario();
		do{
			HacerApuesta();
		    GirarRuleta();
		    ControlMonetario();
		System.out.println("El dinero maximo del jugador ha sido" + jugador.getDineroMaximo() + "Ahora tiene"
				+ jugador.getDinero());
		 if(seguirjugando)
		 {
			seguirjugando= ComprobarSeguirJugando();
		 }
		
		}while(seguirjugando);
	}

	private static void ResgistrarUsuario()

	{
		System.out.println("Bienvenido a la ruleta");
		System.out.println("Introduce tu nombre");
		String nombre = sc.next();
		System.out.println("Introduce tu apellido");
		String apellido = sc.next();
		System.out.println("¿Con cuanto dinero quieres jugar?");
		int dinero = sc.nextInt();

		jugador = new Jugador(nombre, apellido, dinero);

	}

	private static void HacerApuesta() {
		System.out.println("Cuanto dinero quieres apostar?");
		int apuestaDinero = sc.nextInt();
		jugador.setDineroApuesta(apuestaDinero);

		System.out.println("A que color quieres apostar /0 rojo /1 negro");
		int apuestaColor = sc.nextInt();

		jugador.setColor(apuestaColor);

	}

	private static void GirarRuleta() {
		int resultadoApuesta = rd.nextInt(2);
		String colorResultado;

		if (resultadoApuesta == 0) {
			colorResultado = "ROJO";

		} else {

			colorResultado = "Negro";
		}

		boolean Acertado = false;
		String resultadoString;
		if (jugador.getColor() == resultadoApuesta) {

			Acertado = true;

		}
		if (Acertado) {
			System.out.println("HAS GANADO");

			jugador.setDinero(jugador.getDinero() + jugador.getDineroApuesta());

		} else {

			System.out.println("HAS PERDIDO");
			jugador.setDinero(jugador.getDinero() - jugador.getDineroApuesta());
		}

	}

	private static void ControlMonetario()

	{
		if (jugador.getDinero() == 0) {

			System.out.println("Te has quedado sin dinero");
			
			seguirjugando= ComprobarSeguirJugando();
			if(seguirjugando) {
				
				
			}
		}

		if (jugador.getDinero() > jugador.getDineroMaximo()) {
			jugador.setDineroMaximo(jugador.getDinero());
		}

	}
	
	private static boolean ComprobarSeguirJugando()
	
	{
		int eleccion;
		
		do {
			System.out.println("Quieres seguir jugando? /0 salir /1 Seguir jugando  ");
			eleccion= sc.nextInt();
			
			if(eleccion!=0 && eleccion!= 1)
			{
				System.out.println("Opcion na valida");
				
			
				
			}
			}while(eleccion!=0 && eleccion!=1);
			
			
			return eleccion==1;
			
		}
		
		
		
	}


