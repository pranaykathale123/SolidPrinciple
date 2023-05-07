package srp;

public class NotificationService {
	public void sendOTP(String medium) {
		if(medium.equalsIgnoreCase("email")) {
			//use javaMailSender JMS
		}
		if(medium.equalsIgnoreCase("phone")) {
			//use twilio api 
		}
	}

}
