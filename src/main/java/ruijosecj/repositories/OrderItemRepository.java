package ruijosecj.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ruijosecj.entities.OrderItem;
import ruijosecj.entities.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
