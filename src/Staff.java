import java.util.Date;

public class Staff {
	private String fullname;
	private Date birthday;
	private boolean gender;
	private String country;
	private boolean married;
	private String[] hobbies;
	private String notes;
	private String photo;
	public Staff() {
		// TODO Auto-generated constructor stub
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public boolean isMarried() {
		return married;
	}
	public void setMarried(boolean married) {
		this.married = married;
	}
	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
}
