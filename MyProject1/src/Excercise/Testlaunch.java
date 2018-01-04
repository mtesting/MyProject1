package Excercise;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Testlaunch {

	
	Mytesting testme=new Mytesting();
	
	@Test
	public void test() {
		
		//testme.launch();
		testme.launchfirefox();
	}
@After
public void closedriver()
{
	testme.closedriver();
}
 
}
