package com.dio.live.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import org.hibernate.envers.Audited;

import com.dio.live.model.Movimentacao.MovimentacaoId;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity

public class BancoHoras {

	
	@AllArgsConstructor
	@NoArgsConstructor
	@EqualsAndHashCode
	@Embeddable
	public class BancoHorasId implements Serializable {	 
		
		private static final long serialVersionUID = -5670417088935297635L;	
		
		private Long movimentacaoId;
		private Long bancoHorasId;
		private Long usuarioId;
	}

	@EmbeddedId
	private BancoHorasId id;
	
	private LocalDateTime dataHoraTrabalhada;

	private BigDecimal quantidadeHoraHoras;
	
	private BigDecimal saldoHoras;
	
}
