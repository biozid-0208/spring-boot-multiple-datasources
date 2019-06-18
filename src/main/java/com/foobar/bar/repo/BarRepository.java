package com.foobar.bar.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foobar.bar.domain.Bar;

import java.util.List;

@Repository
public interface BarRepository extends JpaRepository<Bar, Long> {

  Bar findById(Long id);

  @Override
  List<Bar> findAll();

  @Override
  Bar save(Bar bar);
}
