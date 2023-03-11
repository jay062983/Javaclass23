package Polymorphism;

public class WebDriver {

    public void startBrowser() {
        System.out.println("Starting Google chrome");
    }

    public void openURL() {
        System.out.println("Opening the url");
    }

    public void testLoginPage() {
        System.out.println("Testing the login page in chrome");
    }

    public void closeBrowser() {
        System.out.println("Closing the Google Chrome");
    }
}

    class Chrome extends WebDriver{


    public void startBrowser(){
        System.out.println("Starting Google chrome");
    }
    public void openURL(){
        System.out.println("Opening the url");
    }
    public void testLoginPage(){
        System.out.println("Testing the login page in chrome");
    }
    public void closeBrowser(){
        System.out.println("Closing the Google Chrome");
    }
}
class Safari extends WebDriver{


    public void startBrowser(){
        System.out.println("Starting safari");
    }
    public void openURL(){
        System.out.println("Opening the safari url");
    }
    public void testLoginPage(){
        System.out.println("Testing the login page in safari");
    }
    public void closeBrowser(){
        System.out.println("Closing the safari");
    }
}
class Firfox extends WebDriver{


    public void startBrowser(){
        System.out.println("Starting Firfox");
    }
    public void openURL(){
        System.out.println("Opening the Firfox url");
    }
    public void testLoginPage(){
        System.out.println("Testing the login page in Firfox");
    }
    public void closeBrowser(){
        System.out.println("Closing the Firfox");
    }
}
