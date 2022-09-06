package Test;

public class UrlTest extends Baseclass
{

    public static void main(String[] args) throws InterruptedException
    {
        setup();
        pageFactory.getUrl().click();
        pageFactory.getselect().select();
        pageFactory.getUrl().verification();


    }
}

