package br.com.caelum.eats.pagamento.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.caelum.eats.pagamento.dto.InfoPedidoDTO;
import br.com.caelum.eats.pagamento.dto.PedidoDTO;

@FeignClient("monolito")
public interface PedidoClient {
	
	@RequestMapping("/pedidos/{pedidoId}/status")
	InfoPedidoDTO atualizaStatus(@PathVariable Long pedidoId, @RequestBody PedidoDTO pedidoParaAtualizar);
}
