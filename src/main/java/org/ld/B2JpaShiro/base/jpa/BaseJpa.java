package org.ld.B2JpaShiro.base.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

/**
 * @author ld
 * @name
 * @table
 * @remarks
 */
@NoRepositoryBean
public interface BaseJpa<T, ID extends Serializable> extends JpaRepository<T, ID>, JpaSpecificationExecutor<T> {
}
