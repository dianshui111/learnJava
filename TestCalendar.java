import java.util.*;

public class TestCalendar{
	public static void main(String[] args){
		Calendar cal=Calendar.getInstance();//获取当前时间
		Date date=cal.getTime();
		System.out.println(cal.get(Calendar.SECOND));
		System.out.println(Calendar.MONTH);//输出的，我也不知道是什么鬼
		System.out.println(cal.get(Calendar.MONTH));//输出结果正常;get会导致日历值的重新计算
		System.out.println(date);

	}
}