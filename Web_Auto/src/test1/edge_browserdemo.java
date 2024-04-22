package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class edge_browserdemo 
{

	public static WebDriver obrowser=null;
	public static void main(String[] args)
	{
		launchbrowser();
		navigateur();
		cloaseapp();
	}
	
	private static void launchbrowser()
	{
		try
		{
			obrowser=new EdgeDriver();
			
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void navigateur()
	{	
		try
		{
			obrowser.get("http://localhost:90/login.do");
			Thread.sleep(5000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void cloaseapp()
	{
		try
		{
			obrowser.quit();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
