package com.jt.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jt.Mapper.Usermapper;
import com.jt.pojo.User;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private Usermapper usermapper;
	@Override
	public List<User> findAll() {
		
		return usermapper.findAll();
	}
	
	
}
