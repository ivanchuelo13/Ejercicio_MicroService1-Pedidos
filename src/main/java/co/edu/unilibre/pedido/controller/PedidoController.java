package co.edu.unilibre.pedido.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unilibre.pedido.model.Pedido;
import co.edu.unilibre.pedido.service.PedidoService;

@RestController
public class PedidoController {
<<<<<<< HEAD
	
	@Autowired(required = true)
	@Qualifier("pedidoServiceFeign")
	private PedidoController pedidoService;
=======
<<<<<<< HEAD
<<<<<<< HEAD
	@Autowired
	private PedidoService pedidoService;
=======
	@Autowired(required = true)
=======
	@Autowired
>>>>>>> parent of f4cef5b... se corrigio modelo y config
	private IPedidoService pedidoService;
>>>>>>> f4cef5b78a721e40540ca7c530187a4707e4dac4
>>>>>>> 36da9c19299c13e6f44bf3cce59b66d63315b7d1
	
	@GetMapping("/list")
	public List<Pedido> getAll(){
		return pedidoService.getAll();
	}
	
	@GetMapping("/{id}/{cantidad}")
	public Pedido getById(@PathVariable Long id, @PathVariable Integer cantidad) {
		return pedidoService.findById(id, cantidad);
	}
<<<<<<< HEAD
}
=======
}
>>>>>>> 36da9c19299c13e6f44bf3cce59b66d63315b7d1
