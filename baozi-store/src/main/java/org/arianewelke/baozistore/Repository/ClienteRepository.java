package org.arianewelke.baozistore.Repository;

import org.arianewelke.baozistore.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
