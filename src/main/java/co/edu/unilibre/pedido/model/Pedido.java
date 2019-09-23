package co.edu.unilibre.pedido.model;

<<<<<<< HEAD
public class Pedido implements Serializable{
=======
public class Pedido {
	private Inventary inventary;
	private Integer cantidad;
>>>>>>> 8652fa41baab587250da5f5d7c95c3bdf6659477
	
	public Pedido(Inventary inventary, Integer cantidad) {
		super();
		this.inventary = inventary;
		this.cantidad = cantidad;
	}

	public Inventary getInventary() {
		return inventary;
	}

	public void setInventary(Inventary inventary) {
		this.inventary = inventary;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

}