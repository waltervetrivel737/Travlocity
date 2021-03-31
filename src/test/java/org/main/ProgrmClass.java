package org.main;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pom.Homepagepojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utilis.BaseClass;

public class ProgrmClass extends BaseClass {

	Homepagepojo p;
	
	@BeforeClass
	private void start() {
		tolaunch();
		tomax();
	}
	
	@BeforeMethod
	private void bfrTc() {
		loadurl("https://www.travelocity.ca/");
		towait(10);
		Date d=new Date();
		System.out.println("START TC: "+d);
	}
	@AfterMethod
	private void aftTc() throws IOException {
		totakescreenshort("src\\test\\resources\\ScreenShort\\page1.png");
		Date d=new Date();
		System.out.println("END TC: "+d);
	}
	@AfterClass
	private void end() {
		System.out.println("succes");
	}
	
	@Test
	private void tc_01() throws AWTException, InterruptedException {
		p=new Homepagepojo();
		toclick(p.getAccMenu());
		toclick(p.getSigin());
		Thread.sleep(3000);
		totype(p.getEmil(), "waltervetrivel737@gmail.com");
		totype(p.getPass(), "walter4609");
		roboPress(KeyEvent.VK_ENTER);
		roboRels(KeyEvent.VK_ENTER);

	}
	@Test
	private void tc_02() throws InterruptedException {
		toclick(p.getAccMenu());
		toclick(p.getSigin());
		Thread.sleep(3000);
		totype(p.getEmil(), "waltervetrivel37@gmail.com");
		totype(p.getPass(), "walter469");
		toclick(p.getSubmitbtn());

	}

}
