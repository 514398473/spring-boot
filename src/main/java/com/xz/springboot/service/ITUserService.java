package com.xz.springboot.service;

import java.util.List;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.xz.springboot.model.TUser;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author xz
 * @since 2018-03-12
 */
public interface ITUserService extends IService<TUser> {

	List<TUser> getList();

	Page<TUser> getPageList(Page<TUser> page);

}
