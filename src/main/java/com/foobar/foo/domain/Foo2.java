package com.foobar.foo.domain;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
@Table(name = "tbl_foo2")
public class Foo2 {

  @Id
  @GeneratedValue(generator = "UUID")
  @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
  @Column(nullable = false)
  private UUID id;

  @Column
  private String foo;

}
