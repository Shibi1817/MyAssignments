package week1.day1;

public class MoblieNew {
	
	public void sendsms() {
		System.out.println("Hello Testleaf");
	}
	protected void allowVoiceCall() {
		System.out.println("voice call");
	}

	private void takeVideo() {
		System.out.println("take video");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MoblieNew mob=new MoblieNew();
		mob.sendsms();
		mob.allowVoiceCall();
		mob.takeVideo();
	}

}
