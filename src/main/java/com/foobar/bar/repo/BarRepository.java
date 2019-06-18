package com.foobar.bar.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foobar.bar.domain.Bar;

import java.util.List;
import java.util.UUID;

@Repository
public interface BarRepository extends JpaRepository<Bar, UUID> {

  Bar findById(UUID id);

  @Override
  List<Bar> findAll();

  @Override
  Bar save(Bar bar);
}
