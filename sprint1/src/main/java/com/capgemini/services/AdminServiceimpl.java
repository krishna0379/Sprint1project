package com.capgemini.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.entities.Admin;
import com.capgemini.exception.AdminException;
import com.capgemini.repository.AdminRepository;

@Service
public class AdminServiceimpl implements IAdminService {

	
	@Autowired
	AdminRepository adminrepository;
	
	@Autowired
	AdminServiceimpl adminserviceimpl;
	
	@Override
	public boolean createAdmin(Admin admin) {
		// TODO Auto-generated method stub
		adminrepository.save(admin);
		return false;
	}

	@Override
	public Admin findById(int userId) {
		// TODO Auto-generated method stub
		if(!adminrepository.existsById(userId)){
			throw new AdminException("Admin is Not Found!!");
		}
		Admin a= adminrepository.findById(userId).get();
		return a;
	}
	
	@Override
	public List<Admin> getAllAdmin() {
		// TODO Auto-generated method stub
		adminrepository.findAll();
		return null;
	}

}
