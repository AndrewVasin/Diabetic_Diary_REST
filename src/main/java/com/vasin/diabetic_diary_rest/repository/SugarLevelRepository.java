package com.vasin.diabetic_diary_rest.repository;

import com.vasin.diabetic_diary_rest.model.SugarLevelRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SugarLevelRepository extends JpaRepository<SugarLevelRecord, Long> {
}
