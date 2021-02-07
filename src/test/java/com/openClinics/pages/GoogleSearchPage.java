package com.openClinics.pages;

import com.openClinics.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// In this class I put all my elements which I located

public class GoogleSearchPage {
public GoogleSearchPage (){
    PageFactory.initElements(Driver.getDriver(), this );
}
@FindBy(xpath = "//input[@name='q']")
    public WebElement searchBox;

@FindBy(xpath = "//input[@class='gNO89b']")
    public WebElement GoogleSearchButton;


@FindBy(xpath = "(//div[@role='button'])[2]")
    public WebElement VoiceSearch;

@FindBy(id ="spchb")
    public WebElement SpeakNow;



}
