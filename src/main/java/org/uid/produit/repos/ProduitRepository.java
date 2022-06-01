package org.uid.produit.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.uid.produit.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
