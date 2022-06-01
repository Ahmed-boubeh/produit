package org.uid.produit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.uid.produit.entities.Produit;
import org.uid.produit.repos.ProduitRepository;

public class ProduitService {
	
	@Autowired
	private ProduitRepository produitRepository;

	public Produit saveProduit(Produit produit) {
		return produitRepository.save(produit);
	}
	
	public List<Produit> findAllProduit() {
		return produitRepository.findAll();
	}

}
