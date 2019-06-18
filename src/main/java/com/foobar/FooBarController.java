package com.foobar;

import com.foobar.foo.domain.Foo2;
import com.foobar.foo.repo.Foo2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.foobar.bar.domain.Bar;
import com.foobar.bar.repo.BarRepository;
import com.foobar.foo.domain.Foo;
import com.foobar.foo.repo.FooRepository;

import java.util.List;
import java.util.UUID;

@RestController
public class FooBarController {

  private final FooRepository fooRepo;
  private final BarRepository barRepo;
  private final Foo2Repository foo2Repo;

  @Autowired
  FooBarController(FooRepository fooRepo, BarRepository barRepo, Foo2Repository foo2Repo) {
    this.fooRepo = fooRepo;
    this.barRepo = barRepo;
    this.foo2Repo = foo2Repo;
  }

  @RequestMapping("/foobar/{id}")
  public String fooBar(@PathVariable("id") UUID id) {
    Foo foo = fooRepo.findById(id);
    Bar bar = barRepo.findById(id);

    return foo.getFoo() + " " + bar.getBar() + "!";
  }

  @GetMapping("/foo")
  public List<Foo> getAllFoo() {
    List<Foo> foo = fooRepo.findAll();
    return foo;
  }

  @GetMapping("/foo2")
  public List<Foo2> getAllFoo2() {
    List<Foo2> foo2 = foo2Repo.findAll();
    return foo2;
  }

  @GetMapping("/bar")
  public List<Bar> getAllBar() {
    List<Bar> bar = barRepo.findAll();
    return bar;
  }

  @PostMapping("/bar")
  public Bar saveBar(@RequestBody Bar bar) {
    return barRepo.save(bar);
  }

  @PostMapping("/foo")
  public Foo saveFoo(@RequestBody Foo foo) {
    return fooRepo.save(foo);
  }

  @PostMapping("/foo2")
  public Foo2 saveFoo2(@RequestBody Foo2 foo) {
    return foo2Repo.save(foo);
  }

}
