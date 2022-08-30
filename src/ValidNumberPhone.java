import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidNumberPhone {
    private static Pattern pattern1;

    private Matcher matcher1;

    private static final String NP = "^[(]\\d{2}[)]-[(]\\d{10}[)]$";

    public ValidNumberPhone (){
        pattern1 = Pattern.compile(NP);
    }

    public boolean checkRegex (String regex){
        matcher1 = pattern1.matcher(regex);
        return  matcher1.matches();
    }
}
