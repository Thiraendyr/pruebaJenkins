package com.example.demo.controller;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class Controller {
	@RequestMapping("")
	public String getCoso() {
		return "Holo caracolo";
	}
}
