package org.arianewelke.baozistore.Repository;

import org.arianewelke.baozistore.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
