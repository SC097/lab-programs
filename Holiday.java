class Holiday
{
  String holidayname;
  int holiday;
  String  holimonth;  
  
  public Holiday(String name,int day,String month)
{
  holidayname = name;
  holiday = day;
  holimonth = month;
}
  
 public static void main(String[] arg)
{
    Holiday Test= new Holiday("bakrid",10,"feb");
    System.out.println(Test.holidayname+" ");
	System.out.println(Test.holiday+" ");
	System.out.println(Test.holimonth+" ");

 }

  
}