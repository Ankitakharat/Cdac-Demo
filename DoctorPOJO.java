//POJO Class(only Setter Getter)

package study;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="Doctor")
public class DoctorPOJO 
{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int docId;
	private String dcoName;
	private String docSpecification;


	public DoctorPOJO() {
		super();
	}

	
	public DoctorPOJO(int docId, String dcoName, String docSpecification) {
		super();
		this.docId = docId;
		this.dcoName = dcoName;
		this.docSpecification = docSpecification;
	}



	public int getDocId() {
		return docId;
	}
	public void setDocId(int docId) {
		this.docId = docId;
	}
	public String getDcoName() {
		return dcoName;
	}
	public void setDcoName(String dcoName) {
		this.dcoName = dcoName;
	}
	public String getDocSpecification() {
		return docSpecification;
	}
	public void setDocSpecification(String docSpecification) {
		this.docSpecification = docSpecification;
	}



}
