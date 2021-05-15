package com.capgemini.services;

import java.util.List;

import com.capgemini.entities.Admin;

public interface IAdminService {

	public boolean createAdmin(Admin admin);

	public Admin findById(int userId);

	public List<Admin> getAllAdmin();
}
