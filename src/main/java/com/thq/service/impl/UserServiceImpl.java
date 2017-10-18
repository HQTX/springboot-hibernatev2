package com.thq.service.impl;

import com.thq.dao.TUserDao;
import com.thq.entry.Tuser;
import com.thq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private TUserDao userdao;
	
	@Override
	public Tuser findByName(String username) {
		return userdao.findByUserName(username);
	}
}
