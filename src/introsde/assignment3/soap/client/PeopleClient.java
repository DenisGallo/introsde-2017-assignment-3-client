package introsde.assignment3.soap.client;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import introsde.assignment3.soap.ws.PeopleService;
import introsde.assignment3.soap.ws.Activity;
import introsde.assignment3.soap.ws.ActivityType;
import introsde.assignment3.soap.ws.People;
import introsde.assignment3.soap.ws.Person;
import introsde.assignment3.soap.ws.Person.Activities;

public class PeopleClient{
	static PeopleService service;
	static People people;

	public static void main(String[] args) throws Exception {
		service = new PeopleService();
	    people = service.getPeopleImplPort();
	    String response = "";
	    PrintWriter writer = new PrintWriter("client-server.log", "UTF-8");
	    System.out.println("Server WSDL URL is: http://server-as3.herokuapp.com/people?wsdl \n");
	    response+="Server WSDL URL is: http://server-as3.herokuapp.com/people?wsdl "+"\n\n";
	    callInit();
	    System.out.print("Method #1: ");
	    response+=methodOne();
	    System.out.print("done\n");
	    System.out.print("Method #2: ");
	    response+=methodTwo();
	    System.out.print("done\n");
	    System.out.print("Method #3: ");
	    response+=methodThree();
	    System.out.print("done\n");
	    System.out.print("Method #4: ");
	    response+=methodFour();
	    System.out.print("done\n");
	    System.out.print("Method #5: ");
	    response+=methodFive();
	    System.out.print("done\n");
	    System.out.print("Method #6: ");
	    response+=methodSix();
	    System.out.print("done\n");
	    System.out.print("Method #7: ");
	    response+=methodSeven();
	    System.out.print("done\n");
	    System.out.print("Method #8: ");
	    response+=methodEight();
	    System.out.print("done\n");
	    System.out.print("Method #9: ");
	    response+=methodNine();
	    System.out.print("done\n");
	    System.out.print("Method #10: ");
	    response+=methodTen();
	    System.out.print("done\n");
	    System.out.print("Method #11: ");
	    response+=methodEleven();
	    System.out.print("done\n");
	    System.out.print("Method #12: ");
	    response+=methodTwelve();
	    System.out.print("done\n");
	    writer.println(response);
	    writer.close();
	}
	    
	    public static void callInit() {
	    	people.init();
	    }
	    
	    public static String methodOne() {
	    	String r = "";
	    	r+="Method #1: readPersonList() => List<Person>"+"\r\n";
	    	r+="Parameters: ---\r\n";
	    	r+="Response: \r\n\r\n";
	    	List<Person> pList = people.readPersonList();
	    	for(Person p : pList) {
	        	r+=printPerson(p);
	        }
	    	return r;
	    }
	    
	    public static String methodTwo() {
	    	String r = "";
	    	r+="Method #2: readPerson(Long id) => Person"+"\r\n";
	    	r+="Parameters: id=1\r\n";
	    	r+="Response: \r\n\r\n";
	    	Person p = people.readPerson(1);
	    	r+=printPerson(p);
	    	return r;
	    }
	    
	    public static String methodThree() {
	    	String r = "";
	    	r+="Method #3: updatePerson(Person p) => Person"+"\r\n";
	    	Person p = new Person();
	    	p.setId(1l);
	    	p.setFirstname("Giuseppe");
	    	p.setLastname("Verdi");
	    	String xmlString="";
	    	JAXBContext jaxbContext;
			try {
				jaxbContext = JAXBContext.newInstance(Person.class);
				Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		    	StringWriter sw = new StringWriter();
		    	jaxbMarshaller.marshal(new JAXBElement<Person>(new QName("uri","local"), Person.class, p), sw);
		    	xmlString = sw.toString();
			} catch (JAXBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	r+="Parameters: "+xmlString+"\r\n";
	    	r+="Response: \r\n\r\n";
	    	Person rp = people.updatePerson(p);
	    	r+=printPerson(rp);
	    	return r;
	    }

	    public static String methodFour() {
	    	String r = "";
	    	r+="Method #4: createPerson(Person p) => Person"+"\r\n";
	    	Person p = new Person();
	    	p.setFirstname("Matteo");
	    	p.setLastname("Berti");
	    	p.setBirthdate("24-04-1999");
	    	Activity a = new Activity();
	    	a.setName("Playing LoL");
	    	a.setDescription("Playing competitive League of Legends");
	    	a.setPlace("Mantova");
	    	a.setRating(4);
	    	a.setStartdate("23-12-2017 01:55:00.0");
	    	ActivityType at = new ActivityType();
	    	at.setName("Game");
	    	a.setActivityType(at);
	    	Activities aList = new Activities();
	    	aList.getActivity().add(a);
	    	p.setActivities(aList);
	    	String xmlString="";
	    	JAXBContext jaxbContext;
			try {
				jaxbContext = JAXBContext.newInstance(Person.class);
				Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		    	StringWriter sw = new StringWriter();
		    	jaxbMarshaller.marshal(new JAXBElement<Person>(new QName("uri","local"), Person.class, p), sw);
		    	xmlString = sw.toString();
			} catch (JAXBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	r+="Parameters: "+xmlString+"\r\n";
	    	r+="Response: \r\n\r\n";
	    	Person rp = people.createPerson(p);
	    	r+=printPerson(rp);
	    	return r;
	    }
	    
	    public static String methodFive() {
	    	String r = "";
	    	r+="Method #5: deletePerson(Long id)"+"\r\n";
	    	r+="Parameters: id=6\r\n";
	    	r+="Response: \r\n\r\n";
	    	people.deletePerson(6);
	    	r+="DELETED\r\n\r\n";
	    	return r;
	    }
	    
	    public static String methodSix() {
	    	String r = "";
	    	r+="Method #6: readPersonPreferences(Long id, String activity_type) => List<Activity>"+"\r\n";
	    	r+="Parameters: id=1, activity_type=\"Game\"\r\n";
	    	r+="Response: \r\n\r\n";
	    	List<Activity> aa = people.readPersonPreferences(1, "Game");
	    	for(Activity a : aa) {
	        	r+=printActivity(a,false);
	        	r+="\r\n";
	        }
	    	return r;
	    }
	    
	    public static String methodSeven() {
	    	String r = "";
	    	r+="Method #7: readPreferences() => List<Activity>"+"\r\n";
	    	r+="Parameters: ---\r\n";
	    	r+="Response: \r\n\r\n";
	    	List<Activity> aList = people.readPreferences();
	    	for(Activity a : aList) {
	        	r+=printActivity(a,false);
	        }
	    	return r;
	    }
	    
	    public static String methodEight() {
	    	String r = "";
	    	r+="Method #8: readPersonPreferences(Long id, Long activity_id) => Activity"+"\r\n";
	    	r+="Parameters: id=1, activity_id=1\r\n";
	    	r+="Response: \r\n\r\n";
	    	Activity a = people.readPersonPreferences2(1l, 1l);
	        r+=printActivity(a,false);
	        r+="\r\n";
	    	return r;
	    }
	    
	    public static String methodNine() {
	    	String r = "";
	    	r+="Method #9: savePersonPreferences(Long id, Activity activity)"+"\r\n";
	    	Activity a = new Activity();
	    	a.setName("Machine Learning");
	    	a.setDescription("Doing the machine learning projects");
	    	a.setPlace("UniTN");
	    	a.setRating(1);
	    	a.setStartdate("014-12-2017 15:32:00.0");
	    	ActivityType at = new ActivityType();
	    	at.setName("Programming");
	    	a.setActivityType(at);
	    	String xmlString="";
	    	JAXBContext jaxbContext;
			try {
				jaxbContext = JAXBContext.newInstance(Activity.class);
				Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		    	StringWriter sw = new StringWriter();
		    	jaxbMarshaller.marshal(new JAXBElement<Activity>(new QName("uri","local"), Activity.class, a), sw);
		    	xmlString = sw.toString();
			} catch (JAXBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	r+="Parameters: id=1, "+xmlString+"\r\n";
	    	r+="Response: \r\n\r\n";
	    	people.savePersonPreferences(1l,a);
	    	r+="CREATED\r\n\r\n";
	    	return r;
	    }
	    
	    public static String methodTen() {
	    	String r = "";
	    	r+="Method #10: updatePersonPreferences(Long id, Activity activity) => Activity"+"\r\n";
	    	Activity a = new Activity();
	    	a.setId(1l);
	    	a.setName("SDE Assignment3");
	    	a.setDescription("Finishing assignment 3");
	    	a.setPlace("University of Trento");
	    	a.setRating(2);
	    	a.setStartdate("22-12-2017 13:36:00.0");
	    	ActivityType at = new ActivityType();
	    	at.setName("Programming");
	    	a.setActivityType(at);
	    	
	    	String xmlString="";
	    	JAXBContext jaxbContext;
			try {
				jaxbContext = JAXBContext.newInstance(Activity.class);
				Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		    	StringWriter sw = new StringWriter();
		    	jaxbMarshaller.marshal(new JAXBElement<Activity>(new QName("uri","local"), Activity.class, a), sw);
		    	xmlString = sw.toString();
			} catch (JAXBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	r+="Parameters: id=1, "+xmlString+"\r\n";
	    	r+="Response: \r\n\r\n";
	    	Activity returnActivity =people.updatePersonPreferences(1l,a);
	    	if(returnActivity==null)
	    		return r+"Activity not found\r\n\r\n";
	    	r+=printActivity(returnActivity,false)+"\r\n";
	    	return r;
	    }
	    
	    public static String methodEleven() {
	    	String r = "";
	    	r+="Method #11 (Extra): evaluatePersonPreferences(Long id, Activity activity, int value) => Activity"+"\r\n";
	    	Activity a = new Activity();
	    	a.setId(6l);
	    	String xmlString="";
	    	JAXBContext jaxbContext;
			try {
				jaxbContext = JAXBContext.newInstance(Activity.class);
				Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		    	StringWriter sw = new StringWriter();
		    	jaxbMarshaller.marshal(new JAXBElement<Activity>(new QName("uri","local"), Activity.class, a), sw);
		    	xmlString = sw.toString();
			} catch (JAXBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	
	    	r+="Parameters: id=1, value=5, "+xmlString+"\r\n";
	    	r+="Response: \r\n\r\n";
	    	Activity returnActivity =people.evaluatePersonPreferences(1l,a,5);
	    	if(returnActivity==null)
	    		return r+"Activity not found\r\n\r\n";
	    	r+=printActivity(returnActivity,false)+"\r\n";
	    	return r;
	    }
	    
	    public static String methodTwelve() {
	    	String r = "";
	    	r+="Method #12 (Extra): getBestPersonPreference(Long id) => List<Activity>"+"\r\n";
	    	r+="Parameters: id=1\r\n";
	    	r+="Response: \r\n\r\n";
	    	List<Activity> aList = people.getBestPersonPreferences(1);
	    	for(Activity a : aList) {
	        	r+=printActivity(a,false);
	        }
	    	return r;
	    }
	    
	    public static String printPerson(Person p) {
	    	String r = "";
	    	r+="PERSON\r\n"
	    			+ "Id: " + p.getId() + "\r\n"
	    			+ "Firstname: " + p.getFirstname()+"\r\n"
	    			+ "Lastname: " + p.getLastname() + "\r\n"
	    			+ "Birthdate: " + p.getBirthdate() + "\r\n";
	    	Person.Activities aa = p.getActivities();
	    	for(Activity a : aa.getActivity()) {
	    		r+="\t"+printActivity(a,true);
	    	}
	    	return r+"\r\n";
	    }
	    
	    public static String printActivity(Activity a, boolean indent) {
	    	String r = "";
	    	if(indent) {
		    	r+="ACTIVITY\r\n"
		    			+ "\tId: " + a.getId() +"\r\n"
		    			+ "\tName: " + a.getName() + "\r\n"
		    			+ "\tDescription: " + a.getDescription() + "\r\n"
		    			+ "\tPlace: " + a.getPlace() + "\r\n"
		    			+ "\tRating: " + a.getRating() + "\r\n"
		    			+ "\tStartdate: " + a.getStartdate() + "\r\n"
		    			+ "\tActivity type: " + a.getActivityType().getName() + "\r\n";
	    	}
	    	else
	    	{
	    		r+="ACTIVITY\r\n"
		    			+ "Id: " + a.getId() +"\r\n"
		    			+ "Name: " + a.getName() + "\r\n"
		    			+ "Description: " + a.getDescription() + "\r\n"
		    			+ "Place: " + a.getPlace() + "\r\n"
		    			+ "Rating: " + a.getRating() + "\r\n"
		    			+ "Startdate: " + a.getStartdate() + "\r\n"
		    			+ "Activity type: " + a.getActivityType().getName() + "\r\n";
	    	}
	    	return r+"\r\n";

	    }

}

