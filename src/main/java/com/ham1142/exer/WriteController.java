package com.ham1142.exer;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ham1142.exer_ck.WriteDto;

@Controller

public class WriteController {
	@RequestMapping(value = "/writee")
	public String write() {
		return "write";
	}
	

//	@RequestMapping(value = "/writeOkk")
//	public String writeOk(HttpServletRequest request, Model model) {
//	
//		String wname = request.getParameter("wrname");
//		String wtitle = request.getParameter("wrtitle");
//		String wdetail = request.getParameter("wrdetail");
//		
//		WriteDto writeDto = new WriteDto(wname, wtitle, wdetail);
//		
//		model.addAttribute("Wdto",writeDto);
//		
//		return "writeOk";
//		}
	
	@RequestMapping(value = "/writeOkk", method = RequestMethod.GET)
	public String writeOk(HttpServletRequest request, Model model) {
	
		String wrname = request.getParameter("wrname");
		String wrtitle = request.getParameter("wrtitle");
		String wrdetail = request.getParameter("wrdetail");
		
		WriteDto writedto = new WriteDto();
	
		writedto.setWrName(wrname);
		writedto.setWrTitle(wrtitle);
		writedto.setWrDetail(wrdetail);
		
		model.addAttribute("Wdto", writedto);
		
		return "writeOk";
		}
	@RequestMapping(value = "/writeOkk", method = RequestMethod.POST)
	public String writeOk2() {
		
		System.out.println("post 방식 실행!!");
		return "";
	}
	
	
	
	}
		
	
