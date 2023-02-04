package spring.model;

public class User {
	
	private String email;
	private String userName;
	private String userPaasword;
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPaasword() {
		return userPaasword;
	}
	public void setUserPaasword(String userPaasword) {
		this.userPaasword = userPaasword;
	}
	@Override
	public String toString() {
		return "User [email=" + email + ", userName=" + userName + ", userPaasword=" + userPaasword + "]";
	}
	

}
