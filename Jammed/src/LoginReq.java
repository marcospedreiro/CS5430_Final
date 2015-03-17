

/*
 * LoginReq handles the Authentication of a user with the server by transmitting 
 * the username and password for the server to verify and initiate the session with
 * 
 * once instantiated the data contained within the object cannot be changed or modified
 */
public class LoginReq extends Request {

	private String username;
	private String password;
	
	public LoginReq(LoginInfo l){
		this.username=l.username;
		this.password=l.password;
	}
	
	
	public String getUsername(){return this.username;}
	public String getPassword(){return this.password;}
//	public void setUsername(String u){this.username=u;}
//	public void setPassword(String p){this.password=p;}

}
