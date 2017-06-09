/**
 * 
 */
package com.li.spring_solr.pojo;


/**
 * 
 * @项目名称：spring-solr
 * @类名称：User
 * @类描述：用户实体类
 * @创建人：liliu
 * @创建时间：2015年11月5日 上午10:42:43 
 * @version：
 */
public class User {

	private Long id;// 用户编号
	private String username;// 用户名
	private String loginPwd;// 用户登录密码
	private String email;// 用户邮箱

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getLoginPwd() {
		return loginPwd;
	}

	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", loginPwd="
				+ loginPwd + ", email=" + email + "]";
	}
}
