import java.util.*;

public class TestCalendar{
	public static void main(String[] args){
		Calendar cal=Calendar.getInstance();//��ȡ��ǰʱ��
		Date date=cal.getTime();
		System.out.println(cal.get(Calendar.SECOND));
		System.out.println(Calendar.MONTH);//����ģ���Ҳ��֪����ʲô��
		System.out.println(cal.get(Calendar.MONTH));//����������;get�ᵼ������ֵ�����¼���
		System.out.println(date);

	}
}