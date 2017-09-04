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
public class B extends A{
	private int b;
	public void setb(int nilai)
	{
		b = nilai;
	}
	
	public int getb()
	{
		return b;
	}
	
	public void tampilkan(){
			super.tampilkan();
			System.out.println("Nilai b : " +getb());
	}
}
