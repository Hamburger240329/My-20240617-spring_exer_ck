package com.ham1142.exer;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ham1142.exer_ck.WriteDto;

@Controller

public class WriteController {
	
@RequestMapping(value = "writeOkk")
public String wreteOk(HttpServletRequest request, Model model) {

	String wrname = request.getParameter("wrname");
	String wrtitle = request.getParameter("wrtitle");
	String wrdetail = request.getParameter("wrdetail");
	
	WriteDto writedto = new WriteDto();

	writedto.setWrName(wrname);
	writedto.setWrTitle(wrtitle);
	writedto.setWrDetail(wrdetail);
	
	model.addAttribute("wdto", writedto);
	
	return "WriteOk";
	}
}
	

