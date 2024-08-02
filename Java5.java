// Lab3
public class Java5{
	public static void main(String[] args){

		String[] splitted = args[0].split("/",3);

		int date = Integer.parseInt(splitted[0]);
		int month = Integer.parseInt(splitted[1]);
		int year = Integer.parseInt(splitted[2]);

		System.out.println("entered Date : "+date+"/"+month+"/"+year);

		if(month<3){
			month += 12;
			year -= 1;
		}

		String myDay = Day(date,month,year);
		System.out.println("Day : "+myDay);
	}
	public static String Day(int d,int m,int y){
		int j = y/100;
		int k = y%100;
		int h = (d+((13*(m+1))/5)+k+(k/4)+(j/4)+(5*j))%7;
		switch(h){
			case 0:
				return "Saturday";
			case 1:
				return "Sunday";
			case 2:
				return "Monday";
			case 3:
				return "Tuesday";
			case 4:
				return "Wednesday";
			case 5:
				return "Thursday";
			case 6:
				return "Friday";
			default:
				return "none";
		}
	}
}