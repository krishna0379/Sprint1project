package com.capgemini.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.entities.Admin;
import com.capgemini.services.AdminServiceimpl;

@RestController
@RequestMapping("/server/admin")
public class AdminController {

	@Autowired
	private AdminServiceimpl adminserviceimpl;

	@PostMapping("/addadmin")
	public String createAdmin(@RequestBody Admin admin) {
		adminserviceimpl.createAdmin(admin);
		return "Admin added";
	}

	@GetMapping("/{userId}")
	public String getAdminById(@PathVariable int userId) {
		return adminserviceimpl.findById(userId).getAdminname();
	}

	@GetMapping("/Admins")
	public List<Admin> getAdmin() {
		return adminserviceimpl.getAllAdmin();
	}

}
