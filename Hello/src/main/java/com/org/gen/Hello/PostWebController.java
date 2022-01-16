package com.org.gen.Hello;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.org.post.PostData;
import com.org.post.PostDataResponse;

@RestController
public class PostWebController {
	
	@RequestMapping(value="/postdata", method=RequestMethod.POST)
	public PostDataResponse Test(@RequestBody PostData p) {
		
		PostDataResponse p1=new PostDataResponse();
		p1.setName("Hello"+p.getName());
		p1.setPhoneno(p.getPhoneNo());
		p1.setProjectName("working on project");
		return p1;
	}

}
