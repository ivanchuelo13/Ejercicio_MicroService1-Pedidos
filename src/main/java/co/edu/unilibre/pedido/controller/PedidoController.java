package co.edu.unilibre.pedido.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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