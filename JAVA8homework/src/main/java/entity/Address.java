package entity;

public class Address {

  private String masterNumber;

  private String country;

  private String city;

  private String street;

  public Address(String masterNumber, String country, String city, String street) {
    this.masterNumber = masterNumber;
    this.country = country;
    this.city = city;
    this.street = street;
  }

  public void setMasterNumber(String masterNumber) {
    this.masterNumber = masterNumber;
  }

  public String getMasterNumber() {
    return masterNumber;
  }

  public String getCountry() {
    return country;
  }

  public String getCity() {
    return city;
  }

  public String getStreet() {
    return street;
  }
}


