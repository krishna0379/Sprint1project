package com.capgemini.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.entities.Admin;
import com.capgemini.repository.AdminRepository;
import com.capgemini.services.AdminServiceimpl;
import com.capgemini.services.IAdminService;


@RestController
@RequestMapping("/api/admin")
public class AdminController {

	@Autowired
	AdminServiceimpl adminserviceimpl;
	
	@Autowired
	IAdminService adminservice;
	
	@Autowired
	AdminRepository adminrepository;

	@PostMapping("/addadmin")
	public String createAdmin(@RequestBody Admin admin) {
		adminserviceimpl.createAdmin(admin);
		return "Admin added";
	}

	@GetMapping("/{userId}")
	public String getAdminById(@PathVariable int userId) {
		return adminserviceimpl.findById(userId).getName();
	}

	@GetMapping("/Admins")
	public List<Admin> getAdmin() {
		return adminserviceimpl.getAllAdmin();
	}

}
