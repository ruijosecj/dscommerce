package ruijosecj.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ruijosecj.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
