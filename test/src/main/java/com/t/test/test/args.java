package com.t.test.test;

public class args {
	
	public static void main(String[] args){     // the main method where the arguments of the String type will be accepted

			
			System.out.println("My Show args program accepting two arguments:");  // This will print out the text describing what will
											      // be printed on the next line

			
			for (String test : args)					// this is an enchanced for loop which will print out each
			{							        // argument to the console or command line until there is 
				System.out.println(test);				// no more arguments
			}


		} // end of the main body

	} // end of the class body
