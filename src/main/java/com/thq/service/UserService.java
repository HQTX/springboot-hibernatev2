package com.thq.service;
import com.thq.entry.Tuser;
import org.springframework.data.domain.Page;

import java.awt.print.Book;


public interface UserService {
	Tuser findByName(String username);
/*	Page<Tuser> findBookNoCriteria(Integer page, Integer size);
	Page<Tuser> findBookCriteria(Integer page,Integer size,Tuser Tuser);*/

}
