package Polymorphism;

public class WebDriverTester {
    public static void main(String[] args) {
       /* WebDriver webDriver=new Firfox();
        webDriver.startBrowser();
        webDriver.openURL();
        webDriver.testLoginPage();
        webDriver.closeBrowser();*/
        // an Array of type super class can hold the objects of the subclasses
WebDriver[]browser={new Chrome(),new Safari(),new Firfox()};
        for(WebDriver browsers:browser){
            browsers.startBrowser();
            browsers.openURL();
            browsers.testLoginPage();
            browsers.closeBrowser();

        }
    }
}
