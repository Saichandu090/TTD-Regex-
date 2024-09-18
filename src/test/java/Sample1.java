import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Sample1
{
    UserValidCases obj=new UserValidCases();

    @Test
    public void sadFirstName()
    {
        String fName = "Marri";
        boolean rs = obj.getRegFirstName(fName);
        Assertions.assertTrue(rs);
    }

    @Test
    public void sadLastName()
    {
        String lName="Sai Chandu";
        boolean rs= obj.getRegLastName(lName);
        Assertions.assertTrue(rs);
    }

    @Test
    public void sadEmail()
    {
        String email="marrisaichandu143@gmail.com";
        boolean rs= obj.getRegEmail(email);
        Assertions.assertTrue(rs);
    }

    @Test
    public void sadMobileNumber()
    {
        String num="+91 6301941367";
        boolean rs= obj.getRegMobileNumber(num);
        Assertions.assertTrue(rs);
    }

    @Test
    public void sadPassword()
    {
        String pass="Saichandu@090";
        boolean rs= obj.getRegPassword(pass);
        Assertions.assertTrue(rs);
    }
}
