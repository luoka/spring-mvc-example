package com.luoka.base.model.user.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import com.luoka.base.data.domain.User;
import com.luoka.base.data.repository.UserRepository;
import com.luoka.base.model.user.IUserAdminService;

public class UserAdminServiceImpl implements IUserAdminService {

	UserRepository userRepository;
	
	public void setUserRepository(UserRepository userRepository){
		this.userRepository = userRepository;
	}

	@Override
	public User create(User user) {
		if(StringUtils.isEmpty(user.getUserName())){
			return null;
		}
		return this.userRepository.save(user);
	}

	@Override
	public List<User> listAll() {
		return this.userRepository.findAll();
	}

	@Override
	public long total() {
		return this.userRepository.count();
	}
	
}
