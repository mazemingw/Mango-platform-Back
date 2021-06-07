package com.louis.mango.admin.service;

import java.util.List;

import com.louis.mango.admin.model.SysMenu;
import com.louis.mango.admin.model.SysRole;
import com.louis.mango.admin.model.SysRoleMenu;
import com.louis.mango.core.service.CurdService;


public interface SysRoleService extends CurdService<SysRole> {

	/**
	 * 查询全部
	 * @return
	 */
	List<SysRole> findAll();

	/**
	 * 查询角色菜单集合
	 * @return
	 */
	List<SysMenu> findRoleMenus(Long roleId);

	/**
	 * 保存角色菜单
	 * @param records
	 * @return
	 */
	int saveRoleMenus(List<SysRoleMenu> records);

	/**
	 * 根据名称查询
	 * @param name
	 * @return
	 */
	List<SysRole> findByName(String name);

}
