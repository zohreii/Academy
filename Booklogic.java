package businesslogic;

import dataaccess.Membermanager;

public class Booklogic
{
	
	public void AddMember(common.member m)
	{
		// Check Semantic Error
		
		
		
		// if all of them done, Register it into Database
		Membermanager.Insert(m);
	}
	
	
}