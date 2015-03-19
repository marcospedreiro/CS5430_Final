



/*
 * TerminationReq subclass of Requests that communicates the termination of 
 * connections between client and server
 * 
 * once instantiated the data contained within the object cannot be changed or modified
 */
public class TerminationReq extends Request {
	
	//reason for close? timeout, user request, server goign to explode
	public enum Term{timeout,userReq,armageddon,none}
	
	private Term reason;
	
	//Request
	public TerminationReq(Term reason){
		this.reason=reason;
		this.setEvent(EventType.termination);
	}
	//Response
	public TerminationReq(boolean success, ErrorMessage err){
		this.setSuccess(success);
		this.setError(err);
		this.setEvent(EventType.termination);

	}
	
	public Term getReason(){return this.reason;}

}
