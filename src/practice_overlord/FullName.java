package practice_overlord;

public class FullName {
    public String anchorName(String firstName) {
        return firstName + 1;
    }

    public String anchorName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public String anchorName(String firstName, String middleName, String lastName) {
        return firstName + " " + middleName + " " + lastName;
    }
}
