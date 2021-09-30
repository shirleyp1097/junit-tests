import java.util.ArrayList;

public class Student {
    private String name;
    private long id;
    private ArrayList<Integer> grades;

    public Student(String name, long id) {
        this.name = name;
        this.id = id;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
