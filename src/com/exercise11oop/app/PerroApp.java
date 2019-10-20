package com.exercise11oop.app;
import com.exercise11oop.model.Perro;

public class PerroApp 
{

	public static void main(String[] args) 
	{
		//Way 1
		Perro pluto;
		pluto = new Perro();
		
		//Way 2
		//Perro tribilin = new Perro();
		
		System.out.println("Pluto큦 age: "+pluto.age);
		System.out.println("Pluto큦 height: "+pluto.height);
		System.out.println("Pluto큦 id:"+pluto.id);
		
		pluto.age = 15;
		pluto.height = 50;
		pluto.id = 10;
		
		System.out.println("Pluto큦 age: "+pluto.age);
		System.out.println("Pluto큦 height: "+pluto.height);
		System.out.println("Pluto큦 id:"+pluto.id);
		
		Perro firulais = new Perro(1, "Firulais", "Labrador",5,60.0);
		
		System.out.println("Firulais age: " +firulais.age);
		System.out.println("Firulais height: " +firulais.height);
		System.out.println("Firulais id: " +firulais.id);
	
		
		
	}

}
