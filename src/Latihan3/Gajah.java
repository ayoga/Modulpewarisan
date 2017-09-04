/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

/**
 *
 * @author USER
 */
    public class Gajah extends Hewan
{
	public static void testclass(){
		System.out.println("The class method in hewan...");
	}
	
	public void testinstance(){
		System.out.println("The instance method in gajah...");
	}
	
	public static void main(String [] args)
	{
		Gajah mygajah = new Gajah();
		Hewan myhewan = new Hewan();
		Hewan.testclass();
		mygajah.testinstance();
	}
}
