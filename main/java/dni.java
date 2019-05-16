
public class dni {

	private String dni;

	private static String tabla[] = { "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S",
			"Q", "V", "H", "L", "C", "K", "E" };

	public dni() {
		
	}

	public static boolean validarDni(String dni) {

		if (dni.length() == 9 && Character.isLetter(dni.charAt(8)) == true) {

			return true;

		} else {

			return false;
		}
	}

	public static String generarLetra(String dni) {

		int resto = Integer.parseInt(dni.substring(0, 8)) % 23;

		String letraGenerada = tabla[resto].toUpperCase();

		return letraGenerada;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public static dni getUsuario01() {

		dni usuario = new dni();
		usuario.setDni("43219718G");
		return usuario;
	}

	public static dni getUsuario02() {

		dni usuario = new dni();
		usuario.setDni("00000000T");
		return usuario;
	}

}
