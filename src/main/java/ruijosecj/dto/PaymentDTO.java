package ruijosecj.dto;

import java.time.Instant;

import ruijosecj.entities.Payment;

public class PaymentDTO {
	private Long id;
	private Instant moment;
	
	public PaymentDTO() {
		// TODO Auto-generated constructor stub
	}

	public PaymentDTO(Long id, Instant moment) {
		super();
		this.id = id;
		this.moment = moment;
	}
	
	public PaymentDTO(Payment entity) {
		super();
		this.id = entity.getId();
		this.moment = entity.getMoment();
	}

	public Long getId() {
		return id;
	}

	public Instant getMoment() {
		return moment;
	}
}
