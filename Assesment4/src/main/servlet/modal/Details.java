package main.servlet.modal;

public class Details {
String title,city,zip,desc,email;

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public Details(String title, String city, String zip, String desc, String email) {
	super();
	this.title = title;
	this.city = city;
	this.zip = zip;
	this.desc = desc;
	this.email = email;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getZip() {
	return zip;
}

public void setZip(String zip) {
	this.zip = zip;
}

public String getDesc() {
	return desc;
}

public void setDesc(String desc) {
	this.desc = desc;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}
}
