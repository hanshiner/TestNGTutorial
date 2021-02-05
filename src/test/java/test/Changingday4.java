package test;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//rahulonlinetutor@gmail.com

public class Changingday4 {
	
	
	
	public static void main(String[] args) {
		System.out.println();
	}

    @Parameters({ "URL" })
    @Test
    public void WebloginHomeLoan(String uname)
    {
    	
    	System.out.println("noliyi burda");
        //selenium
        System.out.println("webloginhomesdfsdfsPersonalLoanxsdsdsadsdsfsdfsfs");
        System.out.println(uname);

    }


    @Test(groups={"Smoke"})
    public void MobileLoginHomeLoan()
    {
        //Appium
        System.out.println("MobileloginHome");
    }

    @Test
    public void LoginAPIHomeLoan()
    {
        //Rest API automation
        System.out.println("APIloginHome");
    }
}
