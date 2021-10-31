package dad.login;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.apache.commons.codec.digest.DigestUtils;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Model {

	private StringProperty user = new SimpleStringProperty();
	private StringProperty passwdProperty = new SimpleStringProperty();
	private BooleanProperty ldap=new SimpleBooleanProperty();
	
	public final StringProperty userProperty() {
		return this.user;
	}
	
	public final String getUserProperty() {
		return this.userProperty().get();
	}
	
	public final void setUserProperty(final String userProperty) {
		this.userProperty().set(userProperty);
	}
	
	public final StringProperty passwdProperty() {
		return this.passwdProperty;
	}
	
	public final String getPasswdProperty() {
		return this.passwdProperty().get();
	}
	
	public final void setPasswdProperty(final String passwdProperty) {
		this.passwdProperty().set(passwdProperty);
	}
	
	public final BooleanProperty ldapProperty() {
		return this.ldap;
	}
	
	public final boolean isldap() {
		return this.ldapProperty().get();
	}
	
	public final void setLDAP(final boolean ldap) {
		this.ldapProperty().set(ldap);
	}
}
