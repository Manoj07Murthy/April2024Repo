package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firfoxbrowserdemo 
{
	public static WebDriver obrowser=null;
	public static void main(String[] args)
	{
		launch();
		navigate();
		close();
	}
	
	public static void launch()
	{
		try 
		{
			obrowser=new FirefoxDriver();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void navigate()
	{
		try
		{
			obrowser.get("http://localhost:90/login.do");	
			Thread.sleep(5000);
		} catch (Exception e) 
		{
			e.printStackTrace()	;	
		}
	}
	
	public static void close()
	{
		try 
		{
			obrowser.quit();
		} catch (Exception e) {
			e.printStackTrace();		}
	}

}
