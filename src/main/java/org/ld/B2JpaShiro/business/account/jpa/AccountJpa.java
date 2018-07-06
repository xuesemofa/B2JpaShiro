package org.ld.B2JpaShiro.business.account.jpa;

import org.ld.B2JpaShiro.base.jpa.BaseJpa;
import org.ld.B2JpaShiro.business.account.model.AccountModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * @author ld
 * @name
 * @table
 * @remarks
 */
public interface AccountJpa extends BaseJpa<AccountModel,String> {

    List<AccountModel> findByAccount(String account);
}
