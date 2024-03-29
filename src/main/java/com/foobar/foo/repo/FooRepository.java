package com.foobar.foo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foobar.foo.domain.Foo;
import java.util.List;
import java.util.UUID;

@Repository
public interface FooRepository extends JpaRepository<Foo, UUID> {

  Foo findById(UUID id);

  @Override
  List<Foo> findAll();
}
