/**
 *
 */
package com.internousdev.login2.action;


import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.login2.dto.LoginDTO;
import com.intrnousdev.login2.dao.LoginDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internousdev
 *
 */
public class LoginAction extends ActionSupport implements SessionAware{
	private String username;
	private String password;
	private Map<String,Object> session;
	public String execute(){
		String ret =ERROR;
		LoginDAO dao =new LoginDAO();
		LoginDTO dto =dao.select(username,password);

		if(username.equals(dto.getUsername())){
			if(password.equals(dto.getPassword())){
				session.put("user" ,"taro");
				System.out.println((String)session.get("user"));

				session.put("pass","123");
				System.out.println((String)session.get("pass"));

				session.put("username","jiro");
				System.out.println((String)session.get("username"));

				session.put("password","456");
				System.out.println((String)session.get("password"));

				ret =SUCCESS;
			}
		}
		return ret;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setSession(Map<String,Object>session){
		this.session = session;
	}
	public Map<String,Object> getSession(){
		return this.session;
	}



}
