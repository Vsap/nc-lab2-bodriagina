package com.tuna.repository;

import com.tuna.entity.Parameter;
import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.*;

import java.util.List;

public interface ParameterRepository extends JpaRepository<Parameter,Long> {
    @Query("select b from param b where b.name = :name")
    Parameter findByName(@Param(String.class) String name);

    @Query("select b from param b where b.object_id = :object_id")
    List<Parameter> findAllByObjectId(@Param(Long.class) Long object_id);

    @Query("select b from param b where b.object_id = :object_id and b.attr_id = :attr_id")
    Parameter findByAttributeAndObject(@Param(Long.class) Long attr_id, @Param(Long.class) Long object_id);

}
