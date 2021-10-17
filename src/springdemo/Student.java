package springdemo;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private String favouriteLanguage;
	private String[] favouriteOperatingSystems;
	
	private LinkedHashMap<String, String> countryOptions;
	private LinkedHashMap<String, String> favoriteLanguageOptions;
	private LinkedHashMap<String, String> favoriteOperatingSystemsOptions;
	
	public Student() {
		countryOptions = new LinkedHashMap<>();
		favoriteLanguageOptions = new LinkedHashMap<>();
		favoriteOperatingSystemsOptions = new LinkedHashMap<>();
		countryOptions.put("IN", "India");
		countryOptions.put("UK", "United Kingdom");
		countryOptions.put("BR", "Brazil");
		favoriteLanguageOptions.put("Java", "Java");
        favoriteLanguageOptions.put("C#", "C#");
        favoriteLanguageOptions.put("C", "C");
        favoriteOperatingSystemsOptions.put("Windows", "Windows");
        favoriteOperatingSystemsOptions.put("Mac OS", "Mac OS");
        favoriteOperatingSystemsOptions.put("Linux", "Linux");
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}
	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}
	
	public String[] getFavouriteOperatingSystems() {
		return favouriteOperatingSystems;
	}
	public void setFavouriteOperatingSystems(String[] favouriteOperatingSystems) {
		this.favouriteOperatingSystems = favouriteOperatingSystems;
	}
	public LinkedHashMap<String, String> getFavoriteOperatingSystemsOptions() {
		return favoriteOperatingSystemsOptions;
	}
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
		return favoriteLanguageOptions;
	}
	
	
	
	
}
