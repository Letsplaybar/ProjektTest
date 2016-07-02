package de.letsplaybar.test;

public class Main {
	
	public static void main(String[] args){
		String name;
		if(args.length == 0)
			name= "Michael";
		else
			name = args[0];
		System.out.println(Methode.getMassage(name));
	}
	
}
