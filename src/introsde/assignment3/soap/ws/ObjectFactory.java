
package introsde.assignment3.soap.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the introsde.assignment3.soap.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ReadPersonPreferences2_QNAME = new QName("http://ws.soap.assignment3.introsde/", "readPersonPreferences2");
    private final static QName _ReadPersonPreferences_QNAME = new QName("http://ws.soap.assignment3.introsde/", "readPersonPreferences");
    private final static QName _Activity_QNAME = new QName("http://ws.soap.assignment3.introsde/", "activity");
    private final static QName _ReadPreferences_QNAME = new QName("http://ws.soap.assignment3.introsde/", "readPreferences");
    private final static QName _ReadPersonPreferences2Response_QNAME = new QName("http://ws.soap.assignment3.introsde/", "readPersonPreferences2Response");
    private final static QName _UpdatePersonPreferencesResponse_QNAME = new QName("http://ws.soap.assignment3.introsde/", "updatePersonPreferencesResponse");
    private final static QName _SavePersonPreferencesResponse_QNAME = new QName("http://ws.soap.assignment3.introsde/", "savePersonPreferencesResponse");
    private final static QName _ReadPersonPreferencesResponse_QNAME = new QName("http://ws.soap.assignment3.introsde/", "readPersonPreferencesResponse");
    private final static QName _ReadPersonList_QNAME = new QName("http://ws.soap.assignment3.introsde/", "readPersonList");
    private final static QName _ActivityType_QNAME = new QName("http://ws.soap.assignment3.introsde/", "activity_type");
    private final static QName _GetBestPersonPreferencesResponse_QNAME = new QName("http://ws.soap.assignment3.introsde/", "getBestPersonPreferencesResponse");
    private final static QName _EvaluatePersonPreferences_QNAME = new QName("http://ws.soap.assignment3.introsde/", "evaluatePersonPreferences");
    private final static QName _ReadPersonListResponse_QNAME = new QName("http://ws.soap.assignment3.introsde/", "readPersonListResponse");
    private final static QName _ReadPreferencesResponse_QNAME = new QName("http://ws.soap.assignment3.introsde/", "readPreferencesResponse");
    private final static QName _DeletePersonResponse_QNAME = new QName("http://ws.soap.assignment3.introsde/", "deletePersonResponse");
    private final static QName _CreatePerson_QNAME = new QName("http://ws.soap.assignment3.introsde/", "createPerson");
    private final static QName _EvaluatePersonPreferencesResponse_QNAME = new QName("http://ws.soap.assignment3.introsde/", "evaluatePersonPreferencesResponse");
    private final static QName _InitResponse_QNAME = new QName("http://ws.soap.assignment3.introsde/", "initResponse");
    private final static QName _SavePersonPreferences_QNAME = new QName("http://ws.soap.assignment3.introsde/", "savePersonPreferences");
    private final static QName _CreatePersonResponse_QNAME = new QName("http://ws.soap.assignment3.introsde/", "createPersonResponse");
    private final static QName _Init_QNAME = new QName("http://ws.soap.assignment3.introsde/", "init");
    private final static QName _DeletePerson_QNAME = new QName("http://ws.soap.assignment3.introsde/", "deletePerson");
    private final static QName _UpdatePerson_QNAME = new QName("http://ws.soap.assignment3.introsde/", "updatePerson");
    private final static QName _UpdatePersonPreferences_QNAME = new QName("http://ws.soap.assignment3.introsde/", "updatePersonPreferences");
    private final static QName _Person_QNAME = new QName("http://ws.soap.assignment3.introsde/", "person");
    private final static QName _ReadPerson_QNAME = new QName("http://ws.soap.assignment3.introsde/", "readPerson");
    private final static QName _UpdatePersonResponse_QNAME = new QName("http://ws.soap.assignment3.introsde/", "updatePersonResponse");
    private final static QName _GetBestPersonPreferences_QNAME = new QName("http://ws.soap.assignment3.introsde/", "getBestPersonPreferences");
    private final static QName _ReadPersonResponse_QNAME = new QName("http://ws.soap.assignment3.introsde/", "readPersonResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: introsde.assignment3.soap.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link ReadPersonPreferences2Response }
     * 
     */
    public ReadPersonPreferences2Response createReadPersonPreferences2Response() {
        return new ReadPersonPreferences2Response();
    }

    /**
     * Create an instance of {@link UpdatePersonPreferencesResponse }
     * 
     */
    public UpdatePersonPreferencesResponse createUpdatePersonPreferencesResponse() {
        return new UpdatePersonPreferencesResponse();
    }

    /**
     * Create an instance of {@link Activity }
     * 
     */
    public Activity createActivity() {
        return new Activity();
    }

    /**
     * Create an instance of {@link ReadPreferences }
     * 
     */
    public ReadPreferences createReadPreferences() {
        return new ReadPreferences();
    }

    /**
     * Create an instance of {@link ReadPersonPreferences }
     * 
     */
    public ReadPersonPreferences createReadPersonPreferences() {
        return new ReadPersonPreferences();
    }

    /**
     * Create an instance of {@link ReadPersonPreferences2 }
     * 
     */
    public ReadPersonPreferences2 createReadPersonPreferences2() {
        return new ReadPersonPreferences2();
    }

    /**
     * Create an instance of {@link ReadPersonListResponse }
     * 
     */
    public ReadPersonListResponse createReadPersonListResponse() {
        return new ReadPersonListResponse();
    }

    /**
     * Create an instance of {@link ReadPreferencesResponse }
     * 
     */
    public ReadPreferencesResponse createReadPreferencesResponse() {
        return new ReadPreferencesResponse();
    }

    /**
     * Create an instance of {@link EvaluatePersonPreferences }
     * 
     */
    public EvaluatePersonPreferences createEvaluatePersonPreferences() {
        return new EvaluatePersonPreferences();
    }

    /**
     * Create an instance of {@link DeletePersonResponse }
     * 
     */
    public DeletePersonResponse createDeletePersonResponse() {
        return new DeletePersonResponse();
    }

    /**
     * Create an instance of {@link ReadPersonList }
     * 
     */
    public ReadPersonList createReadPersonList() {
        return new ReadPersonList();
    }

    /**
     * Create an instance of {@link GetBestPersonPreferencesResponse }
     * 
     */
    public GetBestPersonPreferencesResponse createGetBestPersonPreferencesResponse() {
        return new GetBestPersonPreferencesResponse();
    }

    /**
     * Create an instance of {@link ActivityType }
     * 
     */
    public ActivityType createActivityType() {
        return new ActivityType();
    }

    /**
     * Create an instance of {@link SavePersonPreferencesResponse }
     * 
     */
    public SavePersonPreferencesResponse createSavePersonPreferencesResponse() {
        return new SavePersonPreferencesResponse();
    }

    /**
     * Create an instance of {@link ReadPersonPreferencesResponse }
     * 
     */
    public ReadPersonPreferencesResponse createReadPersonPreferencesResponse() {
        return new ReadPersonPreferencesResponse();
    }

    /**
     * Create an instance of {@link DeletePerson }
     * 
     */
    public DeletePerson createDeletePerson() {
        return new DeletePerson();
    }

    /**
     * Create an instance of {@link CreatePersonResponse }
     * 
     */
    public CreatePersonResponse createCreatePersonResponse() {
        return new CreatePersonResponse();
    }

    /**
     * Create an instance of {@link Init }
     * 
     */
    public Init createInit() {
        return new Init();
    }

    /**
     * Create an instance of {@link InitResponse }
     * 
     */
    public InitResponse createInitResponse() {
        return new InitResponse();
    }

    /**
     * Create an instance of {@link SavePersonPreferences }
     * 
     */
    public SavePersonPreferences createSavePersonPreferences() {
        return new SavePersonPreferences();
    }

    /**
     * Create an instance of {@link CreatePerson }
     * 
     */
    public CreatePerson createCreatePerson() {
        return new CreatePerson();
    }

    /**
     * Create an instance of {@link EvaluatePersonPreferencesResponse }
     * 
     */
    public EvaluatePersonPreferencesResponse createEvaluatePersonPreferencesResponse() {
        return new EvaluatePersonPreferencesResponse();
    }

    /**
     * Create an instance of {@link GetBestPersonPreferences }
     * 
     */
    public GetBestPersonPreferences createGetBestPersonPreferences() {
        return new GetBestPersonPreferences();
    }

    /**
     * Create an instance of {@link UpdatePersonResponse }
     * 
     */
    public UpdatePersonResponse createUpdatePersonResponse() {
        return new UpdatePersonResponse();
    }

    /**
     * Create an instance of {@link ReadPersonResponse }
     * 
     */
    public ReadPersonResponse createReadPersonResponse() {
        return new ReadPersonResponse();
    }

    /**
     * Create an instance of {@link ReadPerson }
     * 
     */
    public ReadPerson createReadPerson() {
        return new ReadPerson();
    }

    /**
     * Create an instance of {@link UpdatePersonPreferences }
     * 
     */
    public UpdatePersonPreferences createUpdatePersonPreferences() {
        return new UpdatePersonPreferences();
    }

    /**
     * Create an instance of {@link UpdatePerson }
     * 
     */
    public UpdatePerson createUpdatePerson() {
        return new UpdatePerson();
    }

    /**
     * Create an instance of {@link Person.Activities }
     * 
     */
    public Person.Activities createPersonActivities() {
        return new Person.Activities();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonPreferences2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment3.introsde/", name = "readPersonPreferences2")
    public JAXBElement<ReadPersonPreferences2> createReadPersonPreferences2(ReadPersonPreferences2 value) {
        return new JAXBElement<ReadPersonPreferences2>(_ReadPersonPreferences2_QNAME, ReadPersonPreferences2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonPreferences }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment3.introsde/", name = "readPersonPreferences")
    public JAXBElement<ReadPersonPreferences> createReadPersonPreferences(ReadPersonPreferences value) {
        return new JAXBElement<ReadPersonPreferences>(_ReadPersonPreferences_QNAME, ReadPersonPreferences.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Activity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment3.introsde/", name = "activity")
    public JAXBElement<Activity> createActivity(Activity value) {
        return new JAXBElement<Activity>(_Activity_QNAME, Activity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPreferences }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment3.introsde/", name = "readPreferences")
    public JAXBElement<ReadPreferences> createReadPreferences(ReadPreferences value) {
        return new JAXBElement<ReadPreferences>(_ReadPreferences_QNAME, ReadPreferences.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonPreferences2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment3.introsde/", name = "readPersonPreferences2Response")
    public JAXBElement<ReadPersonPreferences2Response> createReadPersonPreferences2Response(ReadPersonPreferences2Response value) {
        return new JAXBElement<ReadPersonPreferences2Response>(_ReadPersonPreferences2Response_QNAME, ReadPersonPreferences2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonPreferencesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment3.introsde/", name = "updatePersonPreferencesResponse")
    public JAXBElement<UpdatePersonPreferencesResponse> createUpdatePersonPreferencesResponse(UpdatePersonPreferencesResponse value) {
        return new JAXBElement<UpdatePersonPreferencesResponse>(_UpdatePersonPreferencesResponse_QNAME, UpdatePersonPreferencesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SavePersonPreferencesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment3.introsde/", name = "savePersonPreferencesResponse")
    public JAXBElement<SavePersonPreferencesResponse> createSavePersonPreferencesResponse(SavePersonPreferencesResponse value) {
        return new JAXBElement<SavePersonPreferencesResponse>(_SavePersonPreferencesResponse_QNAME, SavePersonPreferencesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonPreferencesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment3.introsde/", name = "readPersonPreferencesResponse")
    public JAXBElement<ReadPersonPreferencesResponse> createReadPersonPreferencesResponse(ReadPersonPreferencesResponse value) {
        return new JAXBElement<ReadPersonPreferencesResponse>(_ReadPersonPreferencesResponse_QNAME, ReadPersonPreferencesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment3.introsde/", name = "readPersonList")
    public JAXBElement<ReadPersonList> createReadPersonList(ReadPersonList value) {
        return new JAXBElement<ReadPersonList>(_ReadPersonList_QNAME, ReadPersonList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment3.introsde/", name = "activity_type")
    public JAXBElement<ActivityType> createActivityType(ActivityType value) {
        return new JAXBElement<ActivityType>(_ActivityType_QNAME, ActivityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBestPersonPreferencesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment3.introsde/", name = "getBestPersonPreferencesResponse")
    public JAXBElement<GetBestPersonPreferencesResponse> createGetBestPersonPreferencesResponse(GetBestPersonPreferencesResponse value) {
        return new JAXBElement<GetBestPersonPreferencesResponse>(_GetBestPersonPreferencesResponse_QNAME, GetBestPersonPreferencesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EvaluatePersonPreferences }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment3.introsde/", name = "evaluatePersonPreferences")
    public JAXBElement<EvaluatePersonPreferences> createEvaluatePersonPreferences(EvaluatePersonPreferences value) {
        return new JAXBElement<EvaluatePersonPreferences>(_EvaluatePersonPreferences_QNAME, EvaluatePersonPreferences.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment3.introsde/", name = "readPersonListResponse")
    public JAXBElement<ReadPersonListResponse> createReadPersonListResponse(ReadPersonListResponse value) {
        return new JAXBElement<ReadPersonListResponse>(_ReadPersonListResponse_QNAME, ReadPersonListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPreferencesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment3.introsde/", name = "readPreferencesResponse")
    public JAXBElement<ReadPreferencesResponse> createReadPreferencesResponse(ReadPreferencesResponse value) {
        return new JAXBElement<ReadPreferencesResponse>(_ReadPreferencesResponse_QNAME, ReadPreferencesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment3.introsde/", name = "deletePersonResponse")
    public JAXBElement<DeletePersonResponse> createDeletePersonResponse(DeletePersonResponse value) {
        return new JAXBElement<DeletePersonResponse>(_DeletePersonResponse_QNAME, DeletePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment3.introsde/", name = "createPerson")
    public JAXBElement<CreatePerson> createCreatePerson(CreatePerson value) {
        return new JAXBElement<CreatePerson>(_CreatePerson_QNAME, CreatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EvaluatePersonPreferencesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment3.introsde/", name = "evaluatePersonPreferencesResponse")
    public JAXBElement<EvaluatePersonPreferencesResponse> createEvaluatePersonPreferencesResponse(EvaluatePersonPreferencesResponse value) {
        return new JAXBElement<EvaluatePersonPreferencesResponse>(_EvaluatePersonPreferencesResponse_QNAME, EvaluatePersonPreferencesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment3.introsde/", name = "initResponse")
    public JAXBElement<InitResponse> createInitResponse(InitResponse value) {
        return new JAXBElement<InitResponse>(_InitResponse_QNAME, InitResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SavePersonPreferences }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment3.introsde/", name = "savePersonPreferences")
    public JAXBElement<SavePersonPreferences> createSavePersonPreferences(SavePersonPreferences value) {
        return new JAXBElement<SavePersonPreferences>(_SavePersonPreferences_QNAME, SavePersonPreferences.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment3.introsde/", name = "createPersonResponse")
    public JAXBElement<CreatePersonResponse> createCreatePersonResponse(CreatePersonResponse value) {
        return new JAXBElement<CreatePersonResponse>(_CreatePersonResponse_QNAME, CreatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Init }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment3.introsde/", name = "init")
    public JAXBElement<Init> createInit(Init value) {
        return new JAXBElement<Init>(_Init_QNAME, Init.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment3.introsde/", name = "deletePerson")
    public JAXBElement<DeletePerson> createDeletePerson(DeletePerson value) {
        return new JAXBElement<DeletePerson>(_DeletePerson_QNAME, DeletePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment3.introsde/", name = "updatePerson")
    public JAXBElement<UpdatePerson> createUpdatePerson(UpdatePerson value) {
        return new JAXBElement<UpdatePerson>(_UpdatePerson_QNAME, UpdatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonPreferences }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment3.introsde/", name = "updatePersonPreferences")
    public JAXBElement<UpdatePersonPreferences> createUpdatePersonPreferences(UpdatePersonPreferences value) {
        return new JAXBElement<UpdatePersonPreferences>(_UpdatePersonPreferences_QNAME, UpdatePersonPreferences.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment3.introsde/", name = "person")
    public JAXBElement<Person> createPerson(Person value) {
        return new JAXBElement<Person>(_Person_QNAME, Person.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment3.introsde/", name = "readPerson")
    public JAXBElement<ReadPerson> createReadPerson(ReadPerson value) {
        return new JAXBElement<ReadPerson>(_ReadPerson_QNAME, ReadPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment3.introsde/", name = "updatePersonResponse")
    public JAXBElement<UpdatePersonResponse> createUpdatePersonResponse(UpdatePersonResponse value) {
        return new JAXBElement<UpdatePersonResponse>(_UpdatePersonResponse_QNAME, UpdatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBestPersonPreferences }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment3.introsde/", name = "getBestPersonPreferences")
    public JAXBElement<GetBestPersonPreferences> createGetBestPersonPreferences(GetBestPersonPreferences value) {
        return new JAXBElement<GetBestPersonPreferences>(_GetBestPersonPreferences_QNAME, GetBestPersonPreferences.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment3.introsde/", name = "readPersonResponse")
    public JAXBElement<ReadPersonResponse> createReadPersonResponse(ReadPersonResponse value) {
        return new JAXBElement<ReadPersonResponse>(_ReadPersonResponse_QNAME, ReadPersonResponse.class, null, value);
    }

}
