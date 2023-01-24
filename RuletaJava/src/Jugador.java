
public class Jugador {

	String nombre;
	String apellido;
	int dineroApuesta;
	int dinero;
	int color;
	int dineroMaximo;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getDineroApuesta() {
		return dineroApuesta;
	}
	public void setDineroApuesta(int dineroApuesta) {
		this.dineroApuesta = dineroApuesta;
	}
	public int getDinero() {
		return dinero;
	}
	public void setDinero(int dinero) {
		this.dinero = dinero;
	}
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}
	public int getDineroMaximo() {
		return dineroMaximo;
	}
	public void setDineroMaximo(int dineroMaximo) {
		this.dineroMaximo = dineroMaximo;
	}
	public Jugador(String nombre, String apellido, int dinero) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dinero = dinero;
	}
	
	
	
}
