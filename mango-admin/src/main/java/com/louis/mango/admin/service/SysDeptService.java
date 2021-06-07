package com.louis.mango.admin.service;

import java.util.List;

import com.louis.mango.admin.model.SysDept;
import com.louis.mango.core.service.CurdService;


public interface SysDeptService extends CurdService<SysDept> {

	/**
	 * 查询机构树
	 * @param userId 
	 * @return
	 */
	List<SysDept> findTree();
}
