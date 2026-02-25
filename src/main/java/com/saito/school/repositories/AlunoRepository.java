package com.saito.school.repositories;

import com.saito.school.models.AlunoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository <AlunoModel, Long> {

}
