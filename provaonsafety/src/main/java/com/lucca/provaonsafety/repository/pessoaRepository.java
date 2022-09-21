package com.lucca.provaonsafety.repository;
import com.lucca.provaonsafety.model.pessoaModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface pessoaRepository extends JpaRepository<pessoaModel, Long> {
    
}
