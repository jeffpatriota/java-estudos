package Application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class DataCalendar {
	
	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2022-03-03T14:52:52Z"));
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY,4);
		d = cal.getTime();
		int minutes = cal.get(Calendar.MINUTE); // este comando informa os minutos da linha 14
		int month = 1 + cal.get(Calendar.MONTH); // o mes começa no valor 0, por isso imprimiu o mes 2 e nao 3 como era para ser 
		
		System.out.println(sdf.format(d));
		System.out.println(minutes);
		System.out.println(month);
		
		
		
		
		
		
	}

}
