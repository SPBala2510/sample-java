import java.util.Date;

public class Employee {

    private int Id;
    private String Name;
    private int Age;
    private String Address;
    private String CreatedBy;
    private Date CreatedDate;

    public Employee(){}

    public Employee(int Id, String Name, int Age, String Address, String CreatedBy, Date CreatedDate){
        setId(Id);

    }
    public void setId(int Id){
        this.Id = Id;
    }

    public int getId() {
        return Id;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setAge(int age) {
        this.Age = age;
    }

    public int getAge() {
        return Age;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public String getAddress() {
        return Address;
    }

    public void setCreatedBy(String createdBy) {
        CreatedBy = createdBy;
    }

    public String getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedDate(Date createdDate) {
        CreatedDate = createdDate;
    }

    public Date getCreatedDate() {
        return CreatedDate;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Age=" + Age +
                ", Address='" + Address + '\'' +
                ", CreatedBy='" + CreatedBy + '\'' +
                ", CreatedDate=" + CreatedDate +
                '}';
    }
}



