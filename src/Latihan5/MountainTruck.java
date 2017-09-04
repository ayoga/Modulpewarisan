/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan5;

/**
 *
 * @author USER
 */
public class MountainTruck extends Truck{
	public int seatHeight;
    private int startHeight;
	public MountainTruck(int startseat, int startcadence, int startspeed, int startgear){
		super(startcadence, startspeed, startgear);
		seatHeight = startHeight;
	}
	
	public void setheight(int newvalue){
		seatHeight = newvalue;
	}
	
	public static void main(String [] args){
		System.out.println("mulai berjalan");
		MountainTruck mb = new MountainTruck(0,0,0,0);
		System.out.println("gear = " + mb.gear);
		System.out.println("speed = " + mb.speed);
		mb.setgear(2);
		mb.speedup(2);
		System.out.println("gear = " + mb.gear);
		System.out.println("speed = " + mb.speed);
		mb.speedup(2);
		System.out.println("gear = " + mb.gear);
		System.out.println("speed = " + mb.speed);
	}
}
