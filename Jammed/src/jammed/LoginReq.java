package jammed;

/*
 * LoginReq handles the Authentication of a user with the server by transmitting 
 * the username and password for the server to verify and initiate the session with
 * 
 * once instantiated the data contained within the object cannot be changed or modified
 */
public class LoginReq extends Request {

	private static final long serialVersionUID = 5L; // For Serialization - @Dettervt
	
	private String username;
  private String password;
  private boolean enroll = false;
	
	//Response constructor - err should be "none" if success is true
	public LoginReq(boolean success, ErrorMessage err){
		this.setSuccess(success);
		this.setError(err);
		this.setEvent(EventType.LOGIN);
		super.setType(MessageType.RESPONSE);
	}

	//Request constructor
	public LoginReq(LoginInfo l, boolean enroll){
		this.username = l.username;
    this.password = l.password;
    this.enroll = enroll;
		this.setEvent(EventType.LOGIN);
		super.setType(MessageType.REQUEST);
	}
	
	
  public String getUsername() { return this.username; }
  public String getPassword() { return this.password; }
  public boolean getEnrolling(){ return this.enroll; }
	
	public String toString(){
		String a = "Login: " + this.username;
		String b = "\nPassword: " + this.password;
		String c = "\nType: " + super.getType();
		String d = "\nSucc: " + super.getSuccess();
		return(a+b+c+d+"\n");
	}

}
