package rest.addressbook.config;

import org.eclipse.persistence.jaxb.rs.MOXyJsonProvider;
import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;

import rest.addressbook.web.AddressBookController;
import rest.addressbook.domain.AddressBook;

public class ApplicationConfig extends ResourceConfig {

	/**
     * Default constructor
     */
    public ApplicationConfig() {
    	this(new AddressBook());
    }


    /**
     * Main constructor
     * @param addressBook a provided address book
     */
    public ApplicationConfig(final AddressBook addressBook) {
    	register(AddressBookController.class);
    	register(MOXyJsonProvider.class);
    	register(new AbstractBinder() {

			@Override
			protected void configure() {
				bind(addressBook).to(AddressBook.class);
			}});
	}	

}
