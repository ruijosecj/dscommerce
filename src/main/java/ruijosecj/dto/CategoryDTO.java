package ruijosecj.dto;

import ruijosecj.entities.Category;

public class CategoryDTO {
	 private Long id;
	 private String name;
	 
	 public CategoryDTO() {
		// TODO Auto-generated constructor stub
	}

	public CategoryDTO(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public CategoryDTO(Category entity) {
		super();
		this.id = entity.getId();
		this.name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
}
