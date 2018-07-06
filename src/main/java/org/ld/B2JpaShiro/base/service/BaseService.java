package org.ld.B2JpaShiro.base.service;

import org.ld.B2JpaShiro.util.resultJson.ResponseResult;
import org.springframework.data.domain.Page;

/**
 * @author ld
 * @name
 * @table
 * @remarks
 */
public interface BaseService<T> {

    ResponseResult<T> save(T model);

    ResponseResult<T> delete(String uuid);

    ResponseResult<T> update(T model);

    ResponseResult<T> findOne(String uuid);

    ResponseResult<Page<T>> page(int pageNow, int pageSize, T model);
}
