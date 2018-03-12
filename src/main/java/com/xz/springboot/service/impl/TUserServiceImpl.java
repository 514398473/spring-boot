package com.xz.springboot.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.xz.springboot.mapper.TUserMapper;
import com.xz.springboot.model.TUser;
import com.xz.springboot.service.ITUserService;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author xz
 * @since 2018-03-12
 */
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements ITUserService {

	@Override
	public List<TUser> getList() {
		List<TUser> selectList = selectList(new EntityWrapper<TUser>());
		return selectList;
	}

	@Override
	public Page<TUser> getPageList(Page<TUser> page) {
		Page<TUser> selectPage = selectPage(page);
		return selectPage;
//		return null;
	}

}
