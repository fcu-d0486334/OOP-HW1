package fcu.iecs.oop;

public class Hello{
	public static void main(String args[]){
		StringBuffer lyrics=new StringBuffer("Let it go! Let it go! Cannot hold it back anymore");
		lyrics.replace(4,6,"\"her\"");
		lyrics.replace(18,20,"\"her\"");
		lyrics.replace(28,34,"Can't");
		lyrics.replace(39,41,"\"her\"");
		System.out.println(lyrics);
	}
}
