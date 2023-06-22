package week1.day1;

public class Mobile {
	
	public void makeCall() {
		String mobileModel="Realme";
		float mobileWeight=0.550f;
		System.out.println(mobileModel);
		System.out.println(mobileWeight);
	}
	public void sendMsgCall() {
		boolean isFullCharged=false;
		int mobileCost=11999;
		System.out.println(isFullCharged);
		System.out.println(mobileCost);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mobile mob=new Mobile();
		mob.makeCall();
		mob.sendMsgCall();
		System.out.println("This is my Mobile");
		
	}

}
