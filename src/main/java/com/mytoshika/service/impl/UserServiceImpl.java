package com.mytoshika.service.impl;

import org.springframework.stereotype.Service;

import com.mytoshika.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public String userDetails() {
		return "Getting User Details......";
	}

}
