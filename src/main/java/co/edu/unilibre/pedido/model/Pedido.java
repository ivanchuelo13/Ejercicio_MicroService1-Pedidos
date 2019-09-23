package co.edu.unilibre.pedido.model;

<<<<<<< HEAD
import java.io.Serializable;

public class Pedido implements Serializable{
	
=======
import co.edu.unilibre.pedido.model.Inventary;;

public class Pedido {

	private Inventary inventary;
	private Integer cantidad;
	
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
>>>>>>> 92a0640cef91be5abeb6e67e8ea73c38d67be325
}
