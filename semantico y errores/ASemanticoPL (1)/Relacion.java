class Relacion {

	private String origen, destino;

	public Relacion(String o, String d) {
		origen = o;
		destino = d;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String toString() {
		return origen + " " + destino;

	}

}