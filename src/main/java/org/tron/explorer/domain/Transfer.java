package org.tron.explorer.domain;

public class Transfer {

  private String Address;
  private String toAddress;
  private String Amount;

  public String getAmount() {
    return Amount;
  }

  public void setToAddress(String toAddress) {
    this.toAddress = toAddress;
  }

  public void setAmount(String amount) {
    Amount = amount;
  }

  public String getToAddress() {
    return toAddress;
  }

  public Transfer() {
  }


  public void setAddress(String address) {
    Address = address;
  }


  public String getAddress() {
    return Address;
  }


  @Override
  public String toString() {
    return "Address{" +
        "Address='" + Address + '\'' +
        ", toAddress='" + toAddress + '\'' +
        ", Amount='" + Amount + '\'' +
        '}';
  }
}
