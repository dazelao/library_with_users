package libraryprj.models;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class People {
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public People(String fullName, int birthYear, int id) {
        this.fullName = fullName;
        this.birthYear = birthYear;
        this.id = id;
    }

    @NotEmpty(message = "Name should not be empty")
    @Size(min = 6, max = 60, message = "Full name should be between 6 and 60 characters as format")
    @Pattern(regexp = "^\\p{Lu}\\p{Ll}+ \\p{Lu}\\p{Ll}+ \\p{Lu}\\p{Ll}+$", message = "Invalid name format, must be like Surname Name Fathers")
    private String fullName;
    @Size(min = 4, max = 4, message = "birthYear must me with format like 1994")
    private int birthYear;
    private int id;


}
