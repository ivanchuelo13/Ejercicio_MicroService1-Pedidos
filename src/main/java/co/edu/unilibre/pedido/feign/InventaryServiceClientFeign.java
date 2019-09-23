package co.edu.unilibre.pedido.feign;

import java.util.List;

import org.springframework.ccloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import co.edu.unilibre.pedido.model.Inventary;

@FeignClient (name = "product-service", url = "localhost:10010")
public interface InventaryServiceClientFeign {
	
	@GetMapping("/list")
	public List<Inventary> getList();
	
	@GetMapping("/{id}")
	public Inventary getById(@PathVariable Long id);
}