package com.PEDR.O.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.PEDR.O.demo.domain.Cidade;

@Repository

public interface CidadeRepository extends JpaRepository<Cidade, Integer>{

}
