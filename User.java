

/**
 *
 * @author Dybik
 */
public class User 
{
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private int zarobki;
    
    public User(int ID, String FirstName, String LastName, int Age, int Zarobki)
    {
        this.id = ID;
        this.firstName = FirstName;
        this.lastName = LastName;
        this.age = Age;
        this.zarobki = Zarobki;
    }
    
     public int getId()
    {
        return id;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastNAme()
    {
        return lastName;
    }
    
    public int getAge()
    {
        return age;
    }

    public int getZarobki() {return zarobki;}
    
}
