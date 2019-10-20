package com.exercise11oop.app;
import com.exercise11oop.model.Cat;
import com.exercise11oop.model.Angora;
import com.exercise11oop.model.Persa;

public class CatApp 
{

	public static void main(String[] args) 
	{
		/*Cat michi = new Cat();
		
		michi.setId(1);
		michi.setName("Michi");
		michi.setAge(3);
		
		System.out.println("Michi´s Id: " + michi.setId());
		System.out.println("Michi´s Name: " + michi.setName());
		System.out.println("Michi´s Age: " + michi.setAge());
		
		System.out.println(michi.ToString());
		*/
		Cat michi;
		michi = new Persa();
		michi = new Angora();
		
		Angora tom = new Angora(2, "Tom", 4,3.2);
		System.out.println(tom.ToString());
				
	}

}
