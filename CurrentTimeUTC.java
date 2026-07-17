public class CurrentTimeUTC{
    public static void main(String[] args){
	long totalMS = System.currentTimeMillis();
	long totalS = totalMS / 1000;
	long currentS = totalS % 60;
	long totalM = totalS / 60;
	long currentM = totalM % 60;
	long totalH = totalM / 60;
	long currentH = totalH % 24;
	System.out.println("Current time (UTC) is: "+currentH+":"+currentM+":"+currentS);
    }
}