/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @author USER
 */
public class A {
	private int a;
	public void seta(int nilai){
		a = nilai;
	}
	
	public int geta(){
		return a;
	}
	
	public void tampilkan()
	{
		System.out.println("nilai a : "+geta());
	}
}
