package br.com.caelum.eats.pagamento.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InfoPedidoDTO {
	private LocalDateTime dataHora;
}