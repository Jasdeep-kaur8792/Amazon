package Pages;

import org.openqa.selenium.WebDriver;

public class PageFactory
{

        WebDriver driver;
    private Url homepageUrl;
    private select selectData;
        public PageFactory(WebDriver driver)
        {
            this.driver= driver;
        }

    public Url getUrl()
    {
        if(homepageUrl==null)
        {
            homepageUrl =new Url(driver);
        }
        return homepageUrl;
    }
    public select getselect()
    {
        if(selectData==null)
        {
            selectData =new select(driver);
        }
        return selectData;
    }


    }


