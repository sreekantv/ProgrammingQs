import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MogranStanely {

	public static void main(String[] args){
		
		/*
		 
•You can use java.util.Calendar:
Calendar c = Calendar.getInstance();
c.setTime(yourDate);
int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);


•if you need the output to be Tue rather than 3 (Days of week are indexed starting at 1), instead of going through a calendar, just reformat the string: new SimpleDateFormat("EE").format(date) (EE meaning "day of week, short version")


•if you have your input as string, rather than Date, you should use SimpleDateFormat to parse it: new SimpleDateFormat("dd/M/yyyy").parse(dateString)


SimpleDateFormat newDateFormat = new SimpleDateFormat("dd/MM/yyyy");
Date MyDate = newDateFormat.parse("28/12/2013");
newDateFormat.applyPattern("EEEE d MMM yyyy")
String MyDate = newDateFormat.format(MyDate);


		 */
		
	//	Calendar c = c.getInstance();
	
		SimpleDateFormat newDateFormat = new SimpleDateFormat("dd/MM/yyy");
		java.util.Date date;
		try {
			date = newDateFormat.parse("03/10/1975");
			newDateFormat.applyPattern("EEEE");
			System.out.println( newDateFormat.format(date));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	//	java.util.Date date= new SimpleDateFormat("EEEE, dd/MM/yyyy").parse("03/10/1975");
		
		
		
		
		
		
		
		
	}
	
	
}
