package com.tuna.repository;

import com.tuna.entity.Object;
import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ObjectRepository extends JpaRepository<Object,Long> {
    @Query("select b from objects b where b.name = :name")
    Object findByName(@Param(String.class) String name);
}
