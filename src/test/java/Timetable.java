import java.util.HashMap;
import java.util.Map;

public class Timetable {
    
    
    public String course;

    public String getCourse() {
        return course;
    }

    public String getIdopont() {
        return idopont;
    }

    public String idopont="";
  public   HashMap<String,String> map = new HashMap<>();
    
    
    
    public void newCourse(String course) {
        this.course=course;
        map.put(course,idopont);
        
    }

    public void getCourses() {
        for (Map.Entry<String, String> e : map.entrySet())
            System.out.println( e.getKey() +" "
                    + e.getValue());
    }

    public void removeCourse(String remove) {


        if (map.containsKey(remove) ||map.containsValue(remove))
        {
            map.remove(remove);
        }


    }
}
