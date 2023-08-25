package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	private Control control;
	private static int numTV;
	
	public TV(Marca marca, boolean estado){
		this.marca = marca;
		this.estado = estado;
		canal = 1;
		volumen = 1;
		precio = 500;
		numTV++;
	}
	public Marca getMarca() {
		return marca;
	}
	public int getCanal() {
		return canal;
	}
	public int getPrecio() {
		return precio;
	}
	public int getVolumen() {
		return volumen;
	}
	public Control getControl() {
		return control;
	}
	public static int getNumTV() {
		return numTV;
	}
	public boolean getEstado() {
		return estado;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public void setCanal(int canal) {
		if(canal > 0 && estado == true && canal < 121) {
		    this.canal = canal;
		}
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public void setVolumen(int volumen) {
		if(volumen > -1 && estado == true && volumen < 8) {
		    this.volumen = volumen;
		}
	}
	public void setControl(Control control) {
		this.control = control;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	public void canalUp() {
		if(canal < 120 && estado == true) {
			canal++;
		}
	}
	public void canalDown() {
		if(canal > 1 && estado == true) {
			canal--;
		}
	}
	public void volumenUp() {
		if(volumen < 7 && estado == true) {
			volumen++;
		}
	}
	public void volumenDown() {
		if(volumen > 0 && estado == true) {
			volumen--;
		}
	}
	public static void setNumTV(int num) {
		numTV = num;
	}
	public void turnOff() {
		this.setEstado(false);
	}
	public void turnOn() {
		this.setEstado(true);
	}

}
