package br.com.nailton.course.repositories;

import br.com.nailton.course.entities.OrderItem;
import br.com.nailton.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
