package rest.addressbook.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * A really simple Address Book. This class is not thread safe.
 */
public class AddressBook {

  private int nextId = 1;
  private List<Person> personList = new ArrayList<>();

  /**
   * The value of next unique identifier.
   *
   * @return the next unique identifier.
   */
  public int getNextId() {
    return nextId;
  }

  public void setNextId(int nextId) {
    this.nextId = nextId;
  }

  /**
   * The list of persons in this address book.
   *
   * @return a person list.
   */
  public List<Person> getPersonList() {
    return personList;
  }

  public void setPersonList(List<Person> persons) {
    this.personList = persons;
  }

  /**
   * Returns the old next identifier and increases the new value in one.
   *
   * @return an identifier.
   */
  public int nextId() {
    int oldValue = nextId;
    nextId++;
    return oldValue;
  }


  // Overriding equals() to compare two AddressBook objects 
  @Override
  public boolean equals(Object o) { 

      // If the object is compared with itself then return true   
      if (o == this) { 
          return true; 
      } 

      /* Check if o is an instance of Complex or not 
        "null instanceof [type]" also returns false */
      if (!(o instanceof AddressBook)) { 
          return false; 
      } 
        
      // typecast o to Complex so that we can compare data members  
      AddressBook c = (AddressBook) o; 
      
      // Compare the data members and return accordingly
      return this.getNextId() == c.getNextId() && this.personList.equals(c.personList);
    } 
}
