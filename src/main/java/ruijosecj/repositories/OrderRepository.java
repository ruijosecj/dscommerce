package ruijosecj.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ruijosecj.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
