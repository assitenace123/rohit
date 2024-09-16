package com.raushan.springframework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Faculty implements College {
	
	@Autowired
	private Subject sub;
	public Subject getSub() {
		return sub;
	}
	public void setSub(Subject sub) {
		this.sub = sub;
	}
	public void disp()
	{
		System.out.println("Faculty teach "+sub);
	}

}