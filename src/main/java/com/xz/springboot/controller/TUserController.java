package com.xz.springboot.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baomidou.mybatisplus.plugins.Page;
import com.xz.springboot.model.TUser;
import com.xz.springboot.service.ITUserService;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author xz
 * @since 2018-03-12
 */
@Controller
@RequestMapping("/tUser")
public class TUserController {

	@Autowired
	private ITUserService userService;

	@RequestMapping("/test")
	public String test(Model model) {
		List<TUser> list = userService.getList();
		model.addAttribute("list", list);
		return "test";
	}
	
	@RequestMapping("/testPage")
	public String testPage(Model model) {
		Page<TUser> page = new Page<TUser>(1, 5);
		Page<TUser> pageList = userService.getPageList(page);
		model.addAttribute("pageList", pageList);
		return "testPage";
	}
}

