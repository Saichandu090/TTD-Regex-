import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidCases
{
    public boolean getRegFirstName(String input)
    {
        Pattern pattern=Pattern.compile("^[A-Z][a-z ]{2,}$");
        Matcher matcher=pattern.matcher(input);

        return matcher.matches();
    }

    public boolean getRegLastName(String input)
    {
        Pattern pattern=Pattern.compile("^[A-Z][a-zA-Z ]{2,}$");
        Matcher matcher=pattern.matcher(input);

        return matcher.matches();
    }

    public boolean getRegEmail(String input)
    {
        Pattern pattern=Pattern.compile("^[a-zA-Z0-9_$+-]+(\\.[a-zA-Z0-9]+)?@[a-z0-9]+\\.[a-zA-Z]{2,}(\\.[a-z]+)?$");
        Matcher matcher=pattern.matcher(input);

        return matcher.matches();
    }

    public boolean getRegMobileNumber(String input)
    {
        Pattern pattern=Pattern.compile("^(\\+)?[0-9]{1,3}\s[0-9]{10}$");
        Matcher matcher=pattern.matcher(input);

        return matcher.matches();
    }

    public boolean getRegPassword(String input)
    {
        Pattern pattern=Pattern.compile("^(?=.*[A-Z])(?=.*\\d).{8,}$");
        Matcher matcher=pattern.matcher(input);

        return matcher.matches();
    }
}
