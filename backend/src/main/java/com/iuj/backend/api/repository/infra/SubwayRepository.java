package com.iuj.backend.api.repository.infra;

import com.iuj.backend.api.domain.entity.infra.Subway;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubwayRepository extends JpaRepository<Subway, Integer> {
}
