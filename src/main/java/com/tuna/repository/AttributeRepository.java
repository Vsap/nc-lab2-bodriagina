package com.tuna.repository;

import com.tuna.entity.Attribute;
import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AttributeRepository extends JpaRepository<Attribute,Long> {
    @Query("select b from attributes b where b.name = :name")
    Attribute findByName(@Param(String.class) String name);
}
