package pages;

import org.openqa.selenium.By;

public class Elementos {

	Metodos metodo = new Metodos();

	// Elementos da pagina Enter Vehicle Data
	public By make = By.xpath("//div[@class=\"field idealforms-field idealforms-field-select-one invalid\"]");
	public By opcaoAudi = By.xpath("//select[@id='make']//option[2]");
	public By enginePerformance = By.id("engineperformance");
	public By dateOfManufacture = By.id("dateofmanufacture");
	public By numberOfSeats = By.xpath("//select[@id='numberofseats']");
	public By nineSeats = By.xpath("//select[@id='numberofseats']//option[10]");
	public By fuelType = By.xpath("//select[@id='fuel']");
	public By diesel = By.xpath("//select[@id='fuel']//option[3]");
	public By listPrice = By.id("listprice");
	public By annualMileage = By.id("annualmileage");
	public By nextButton = By.id("nextenterinsurantdata");

	// Elementos da pagina Enter Insurance Data
	public By firstName = By.id("firstname");
	public By lastName = By.id("lastname");
	public By dateOfBirth = By.id("birthdate");
	public By genderMale = By.xpath("//p[@class='group']");
	public By streetAddress = By.id("streetaddress");
	public By country = By.id("country");
	public By brasil = By.xpath("//select[@id='country']//option[32]");
	public By zipCode = By.id("zipcode");
	public By city = By.id("city");
	public By occupation = By.id("occupation");
	public By selfEmployed = By.xpath("//select[@id='occupation']//option[6]");
	public By hobbies = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[2]/span");
	public By nextButton2 = By.id("nextenterproductdata");

	// Elementos da pagina Enter Product Data
	public By startDate = By.id("startdate");
	public By insuranceSum = By.id("insurancesum");
	public By opcao35 = By.xpath("//select[@id='insurancesum']//option[10]");
	public By meritiRating = By.xpath("//*[@id=\"meritrating\"]");
	public By superBonus = By.xpath("//*[@id=\"meritrating\"]/option[2]");
	public By damageInsurance = By.xpath("//*[@id=\"damageinsurance\"]");
	public By fullCoverage = By.xpath("//*[@id=\"damageinsurance\"]/option[4]");
	public By optionalProducts = By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span");
	public By courtesyCar = By.xpath("//*[@id=\"courtesycar\"]");
	public By yesCourtesy = By.xpath("//*[@id=\"courtesycar\"]/option[3]");
	public By nextButton3 = By.id("nextselectpriceoption");

	// Elementos da pagina Select Price Option

	public By silver = By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[1]/span");
	public By gold = By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[2]/span");
	public By platinum = By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[3]/span");
	public By ultimate = By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[4]/span");
	public By nextButton4 = By.xpath("//*[@id=\"nextsendquote\"]");

	public void priceOption(String price) {
		
		if(price.equalsIgnoreCase("Silver")) {
			metodo.clicar(silver);
		}else if(price.equalsIgnoreCase("Gold")) {
			metodo.clicar(gold);
		}else if(price.equalsIgnoreCase("platinum")) {
			metodo.clicar(platinum);
		}else if(price.equalsIgnoreCase("Ultimate")) {
			metodo.clicar(ultimate);
		}else {
			System.out.println("---Opção inválida---");
		} 		
	}
	
	// Elementos da pagina Send Quote
	
	public By email = By.xpath("//*[@id=\"email\"]");
	public By phone = By.xpath("//*[@id=\"phone\"]");
	public By username = By.xpath("//*[@id=\"username\"]");
	public By password = By.xpath("//*[@id=\"password\"]");
	public By confPassword = By.xpath("//*[@id=\"confirmpassword\"]");
	public By sendCote = By.xpath("//*[@id=\"sendemail\"]");
	
	// Elementos da pagina de confirmacao de envio da cotacao
	
	public By msgSucess = By.xpath("/html/body/div[4]/h2");
	public By btnOk = By.xpath("/html/body/div[4]/div[7]/div/button");

}
