package models;

import play.Logger;
import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;
import java.util.stream.Collectors;

@Entity
@Table(name = "lessons")
public class Lessons extends Model {
    public String type;
    public String name;
    private String description;
    private String rabbi;
    private String dateAdded;
    private String pathToFile;

    public Lessons(String type, String name, String description, String rabbi, String dateAdded, String pathToFile) {
        this.type = type;
        this.name = name;
        this.description = description;
        this.rabbi = rabbi;
        this.dateAdded = dateAdded;
        this.pathToFile = pathToFile;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getRabbi() {
        return rabbi;
    }

    public String getRowId() {
        return "row_id_" + getId();
    }
    public String getRecordId() {
        return "record_id_" + getId();
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public String getPathToFile() {
        return pathToFile;
    }

    static List<Lessons> getAllLessons() {
        Logger.info("[DB] \t Getting All Lessons from DB");
        return Lessons.find("order by id").fetch();
    }
}
