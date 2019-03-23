package com.wcg.webone.first.service;

import java.awt.List;
import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wcg.webone.first.domain.Usr;
import com.wcg.webone.first.mapper.UsrMapper;

@Service
public class FirstService {

	@Resource
	UsrMapper usrmapper;
	public ArrayList<Usr> getall(){
		return usrmapper.selectall();
	}
}
