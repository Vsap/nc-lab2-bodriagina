package com.tuna.repository;

import com.tuna.entity.ObjectType;
import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ObjectTypeRepository extends JpaRepository<ObjectType, Long> {
    @Query("select b from object_types b where b.name = :name")
    ObjectType findByName(@Param(String.class) String name);
}