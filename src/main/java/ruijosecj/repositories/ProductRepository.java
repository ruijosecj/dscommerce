package ruijosecj.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ruijosecj.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
