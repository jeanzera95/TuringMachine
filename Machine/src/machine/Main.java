/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package machine;



public class Main 
{

	public static void main(String[] args) 
	{
		TuringMachine TM1 = MachineLibrary.EqualBinaryWords();
		
		boolean done = TM1.Run("010000110101#010000110101", false);
		if (done==true)
		{
			System.out.println("A entrada foi aceita.");
		}
		else
		{
			System.out.println("A entrada foi rejeitada.");
		}
	}

}