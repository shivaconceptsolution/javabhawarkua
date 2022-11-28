package scs;

public class SI {
  float p,r,t,si;	
  void accept()
  {
	  p=54000;
	  r=2;
	  t=2;
	  
  }
  void calc()
  {
	  si = (p*r*t)/100;
  }
  void display()
  {
	  System.out.println(si);
  }
}
