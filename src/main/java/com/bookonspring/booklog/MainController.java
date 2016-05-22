package com.bookonspring.booklog;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // ①
public class MainController {

	@RequestMapping("/") // ②
	public String viewMain(Model model) { // ③
		model.addAttribute("title", "On Spring Blog"); // ④
		model.addAttribute("message", "Hello, World!"); // ④
		model.addAttribute("date", new Date());// ④
		return "main"; // ⑤
	}
}
