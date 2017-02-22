/****
@author: regrecario
@description: sample test done in Java
****/
import java.io.*;

 
public class Geekenator{
   String level;
   int age;
   String color;

   public Geekenator(){
      level ="Geek";
      age = 19;
      color="red";
   }


   public String getLevel(){
      return level;
   }

   public void setLevel(String lev){
      this.level = lev;
   }

   public int getAge(){
      return age;
   }

   public void setAge(int a){
      this.age = a;
   }

   public int computeSum(int a, int b) {
   	return a+b;
   }

   public String singSong(String str) {
   	return "Waaa";
   }

   public int dividEdSheeran(int a, int b) {
   	if(a == 0 && b == 0) return -10000; //-10000 "internal" error code for this case
   	else if(a == 0 && b != 0) return -1000; //same idea with -10000
   	else if (a != 0 && b == 0) return -100; //same idea with -10000
   	else return a/b;
   }

}
