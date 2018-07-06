package org.ld.B2JpaShiro.business.account.service;

import org.ld.B2JpaShiro.base.service.BaseService;
import org.ld.B2JpaShiro.business.account.model.AccountModel;
import org.ld.B2JpaShiro.util.resultJson.ResponseResult;

/**
 * @author ld
 * @name
 * @table
 * @remarks
 */
public interface AccountService extends BaseService<AccountModel> {

    ResponseResult<AccountModel> findByAccount(String account);

}
