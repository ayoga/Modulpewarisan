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
public class Truck {
	
	public int cadence;
	public int gear;
	public int speed;
	
	public Truck (int startcadence, int startspeed, int startgear)
	{
		gear = startgear;
		cadence = startcadence;
		speed = startspeed;
	}
	
	public void setcadence(int newValue)
	{
		cadence = newValue;
	}
	
	public void setgear(int newValue)
	{
		gear = newValue;
	}
	
	public void applybreak (int decrement)
	{
		speed = decrement;
	}
	
	public void speedup(int increment)
	{
		speed = increment;
	}
}
