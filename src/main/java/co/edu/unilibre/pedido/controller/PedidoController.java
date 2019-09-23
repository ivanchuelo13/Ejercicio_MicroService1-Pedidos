package co.edu.unilibre.pedido.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unilibre.pedido.model.Pedido;
import co.edu.unilibre.pedido.service.IPedidoService;

@RestController
public class PedidoController {
	@Autowired
	private IPedidoService pedidoService;
	
	@GetMapping("/Pedidos")
	public List<Pedido> getList(){
		return pedidoService.getAllList();
	}
	
	@GetMapping("/{id}")
	public Pedido getById(@PathVariable Long id) {
		return pedidoService.getById(id);
	}
}
=======
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unilibre.invoice.model.Item;
import co.edu.unilibre.invoice.service.IItemService;

@RestController
public class PedidoController {

	@Autowired(required = true)
	@Qualifier("itemServiceFeign")
	private IItemService itemService;
	
	@GetMapping("/list")
	public List<Item> getAll(){
		return itemService.getAll();
	}
	
	@GetMapping("/{id}/{quantity}")
	public Item getById(@PathVariable Long id, @PathVariable Integer quantity) {
		return itemService.findById(id, quantity);
	}
}
>>>>>>> 92a0640cef91be5abeb6e67e8ea73c38d67be325
