package rest.addressbook.domain;

/**
 * A phone number
 */
public class PhoneNumber {

  private String number;
  private PhoneType type = PhoneType.HOME;

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public PhoneType getType() {
    return type;
  }

  public void setType(PhoneType type) {
    this.type = type;
  }

  // Overriding equals() to compare two PhoneNumber objects 
  @Override
  public boolean equals(Object o) { 

      // If the object is compared with itself then return true   
      if (o == this) { 
          return true; 
      } 

      /* Check if o is an instance of PhoneNumber or not 
        "null instanceof [type]" also returns false */
      if (!(o instanceof PhoneNumber)) { 
          return false; 
      } 
        
      // typecast o to PhoneNumber so that we can compare data members  
      PhoneNumber c = (PhoneNumber) o; 
      
      // Compare the data members and return accordingly
      return (this.number == null && c.number == null)
                  || (this.number != null && this.number.equals(c.number))
          && (this.type == null && c.type == null)
                  || (this.type != null && this.type.equals(c.type));
    } 

}
