package rest.addressbook.domain;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * A person entry in an address book
 */
public class Person {

  private String name;
  private int id;
  private String email;
  private URI href;
  private List<PhoneNumber> phoneList = new ArrayList<>();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void addPhone(PhoneNumber phone) {
    getPhoneList().add(phone);
  }

  public List<PhoneNumber> getPhoneList() {
    return phoneList;
  }

  public void setPhoneList(List<PhoneNumber> phones) {
    this.phoneList = phones;
  }

  public boolean hasEmail() {
    return getEmail() != null;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public URI getHref() {
    return href;
  }

  public void setHref(URI href) {
    this.href = href;
  }

  // Overriding equals() to compare two Person objects 
  @Override
  public boolean equals(Object o) { 

      // If the object is compared with itself then return true   
      if (o == this) { 
          return true; 
      } 

      /* Check if o is an instance of Person or not 
        "null instanceof [type]" also returns false */
      if (!(o instanceof Person)) { 
          return false; 
      } 
        
      // typecast o to Person so that we can compare data members  
      Person c = (Person) o; 
      
      // Compare the data members and return accordingly
      return (this.name == null && c.name == null)
                  || (this.name != null && this.name.equals(c.name))
          && this.id == c.id
          && (this.email == null && c.email == null)
                  || (this.email != null && this.email.equals(c.email))
          && (this.href == null && c.href == null)
                  || (this.href != null && this.href.equals(c.href))
          && (this.phoneList == null && c.phoneList == null)
                  || (this.phoneList != null && this.phoneList.equals(c.phoneList));
    } 
}
