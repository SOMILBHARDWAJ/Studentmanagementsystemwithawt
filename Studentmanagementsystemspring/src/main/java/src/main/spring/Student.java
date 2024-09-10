package src.main.spring;
import org.springframework.data.annotation.Id;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "students")
@Setter
@Getter
public class Student {
	  @Id
	    private String id;
	    private String name;
	    private String contactDetails;
	    private String address;
	    private String pincode;
}
