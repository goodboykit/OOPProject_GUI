package queuemanagement;

public class AppointmentRequest {
    private String surname;
    private String firstName;
    private String middleName;
    private String email;
    private String documentType;
    private String proofOfPayment;
    private String purpose;

    public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getProofOfPayment() {
		return proofOfPayment;
	}

	public void setProofOfPayment(String proofOfPayment) {
		this.proofOfPayment = proofOfPayment;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public AppointmentRequest(String surname, String firstName, String middleName, String email,
                              String documentType, String proofOfPayment, String purpose) {
        this.surname = surname;
        this.firstName = firstName;
        this.middleName = middleName;
        this.email = email;
        this.documentType = documentType;
        this.proofOfPayment = proofOfPayment;
        this.purpose = purpose;
    }

    public Object[] toRow() {
        return new Object[]{surname, firstName, middleName, email, documentType, proofOfPayment, purpose};
    }
    
    @Override
    public String toString() {
        return surname + "," + firstName + "," + middleName + "," + email + "," +
                documentType + "," + proofOfPayment + "," + purpose;
    }
}




