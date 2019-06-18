package com.foobar.foo.repo;

import com.foobar.foo.domain.Foo2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface Foo2Repository extends JpaRepository<Foo2, UUID> {

  Foo2 findById(UUID id);

  @Override
  List<Foo2> findAll();
}
