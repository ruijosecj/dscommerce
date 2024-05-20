package ruijosecj.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import ruijosecj.entities.Product;

public class ProductDTO {
	private Long id;
	
	@Size(min=3, max=80, message = "Nome precisa ter de 3 a 80 caracteres")
	@NotBlank(message = "Campo requerido")
	private String name;
	
	@Size(min=3, message = "Nome precisa no mínimo 10 caracteres")
	@NotBlank(message = "Campo requerido")
	private String description;
	
	@Positive(message = "O preço deve ser positivo")
	private Double price;
	private String imgUrl;

	public ProductDTO(Long id, String name, String description, Double price, String imgUrl) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.imgUrl = imgUrl;
	}
	
	public ProductDTO(Product entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.description = entity.getDescription();
		this.price = entity.getPrice();
		this.imgUrl = entity.getImgUrl();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public Double getPrice() {
		return price;
	}

	public String getImgUrl() {
		return imgUrl;
	}
}
