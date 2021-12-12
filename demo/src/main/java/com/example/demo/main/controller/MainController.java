package com.example.demo.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.main.dto.SampleDto;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public ModelAndView main(ModelAndView mav, SampleDto sample) {
		mav.addObject("sample", sample);
		mav.setViewName("main");
		return mav;
	}
	
	@RequestMapping("/ajax")
	public ModelAndView ajax(ModelAndView mav, SampleDto sample) {
		mav.addObject("sample", sample);
		mav.setViewName("ajax");
		return mav;
	}
	
	@RequestMapping("/json")
	public ModelAndView json(ModelAndView mav, SampleDto sample) {
		mav.addObject("sample", sample);
		mav.setViewName("json");
		return mav;
	}
}
