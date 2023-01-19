class mymovie1
{

  String title;
  String studio;
  String rating;


 public mymovie1(String title,String studio,String rating)


   {
      this.title=title;
      this.studio=studio;
      this.rating=rating;
          
   }

   public mymovie1(String title,String studio)
 {
    this.title=title;
      this.studio=studio;

}

public String getrating()
{
  return rating;
}

public void setrating(String rating)
{
 this.rating=rating;
}

  public static void main(String[] arg)
{
   mymovie1 m=new mymovie1("kranthi","d-beats production","pg-12");
   mymovie1 n=new mymovie1("kranthi2","boss production","pg-13");
   System.out.println("----First constructor display---\n my movie title:-" +m.title);
   System.out.println("studio name:-" +m.studio);
   System.out.println("");
   System.out.println("----second constructo display---\n my movie title:-" +n.title);
   System.out.println("studio name:-" +n.studio); 
   System.out.println("");
   System.out.println(m.getrating());
}
}
