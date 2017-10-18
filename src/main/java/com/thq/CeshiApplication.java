package com.thq;

import com.sun.tools.internal.ws.processor.model.Model;
import com.thq.entry.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@SpringBootApplication
@EnableAutoConfiguration
public class CeshiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CeshiApplication.class, args);
	}
  @RequestMapping("/hello")
	public  String hello(){

		return "hello world!!!!!";

   }

/*	@RequestMapping("/person")
	public String index(Model model){
		Person single=new Person("aa",1);
		List<Person> people=new ArrayList<Person>();
		Person p1=new Person("bb",2);
		Person p2=new Person("cc",3);
		Person p3=new Person("dd",4);
		people.add(p1);
		people.add(p2);
		people.add(p3);
		model.addAttribute("singlePerson",single);
		model.addAttribute("people",people);
		return "index";
	}*/

}
