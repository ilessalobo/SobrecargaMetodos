package a;

/**
 * Sobrecarga de método significa que o número de parametros ou os tipos dos
 * parametros são diferentes
 */

class Overloader {

	// Neste exemplo os metodos não sobrecarregam
	public void metodoX() {

	}

	public int metodoX() {
		return 1;
	}
	
	// ----------------------------------------------------------------------------
	// Metodos que sobrecarregariam
	

	public void metodo(Object y, String x) {
		System.out.println("Object e String");
	}

	public void metodo(String x, Object y) {
		System.out.println("String e Object");
	}

	// Os dois metodos acima causam ambiguidade se caso não for informado sua
	// especificidade

	public void metodo(String x, String y) {
		System.out.println("String e String");
	}

	// O metodo acima será o mais especifico para duas strings como parametros

	public void metodo(String x, int y) {
		System.out.println("String e int");

	}

	public void metodo(int x, String y) {
		System.out.println("Int e String");

	}

	public void metodo(String x) {
		System.out.println("com string");

	}

	public void metodo(Object x) {
		System.out.println("com object");

	}

	public void metodo(int x) {
		System.out.println("com int");

	}

	public void metodo(double x) {
		System.out.println("com double");

	}

	public void metodo() {
		System.out.println("sem nada");
	}

}

	//----------------------------------------------------------------------------

	public class SobrecargaMetodo {

		public static void main(String[] args) {

		// Procura chamar o método mais especifico
		new Overloader().metodo("Gui", "Ana");
		new Overloader().metodo("Bruno");
		new Overloader().metodo(new Object());
		new Overloader().metodo("Bruno", 15);
		new Overloader().metodo(15, "Bruno");
		new Overloader().metodo(15);
		new Overloader().metodo(15.5);
		new Overloader().metodo();

	}

}
