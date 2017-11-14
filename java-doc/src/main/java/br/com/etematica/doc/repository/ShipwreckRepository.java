package br.com.etematica.doc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.etematica.doc.model.Shipwreck;

public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long> {

}
