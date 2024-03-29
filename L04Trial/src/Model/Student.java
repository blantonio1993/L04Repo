package Model;

import java.util.ArrayList;

public class Student
{
    //---------Declaring attributes----

    String firstName;
    String lastName;
    int age;
    MailAddress address;
    int credits;
    //------------------------------
    //----------Constructor------------

    public Student(String a, String b, int c, MailAddress d)
    {
        firstName = a;
        lastName = b;
        age = c;
        address = d;
        credits = creditsThisSemester();
    }

    //---------- METHODS --------
    public String getInfo()
    {
        return "NAME = " + firstName + "  " + lastName + "  " + "Age = " + age + ", address=" + address.toString() + " credits=" + credits;
    }

    //------------------------------------------------
    public int creditsThisSemester()
    {
        //calculate randomly a new value for credits in the semester
        //and updates the attribute credits
        double dn = Math.random();
        credits = (int) (15.0 * dn);
        return credits;
    }


}
