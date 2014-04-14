package com.luoka.base.model.user;

import java.util.List;

import com.luoka.base.data.domain.User;

public interface IUserAdminService {

	public User create(User user);
	
	public List<User> listAll();
	
	public long total();
}
