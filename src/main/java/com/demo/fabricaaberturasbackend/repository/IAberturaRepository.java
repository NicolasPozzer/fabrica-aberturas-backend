package com.demo.fabricaaberturasbackend.repository;

import com.demo.fabricaaberturasbackend.model.Abertura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAberturaRepository extends JpaRepository<Abertura, Long> {
}
