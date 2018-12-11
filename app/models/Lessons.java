package models;

import play.Logger;
import play.db.jpa.JPA;
import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "lessons")
public class Lessons extends Model {
    public String type;
    public String name;
    public String description;
    public String rabbi;
    public String dateAdded;
    public String pathToFile;

    public Lessons() {
    }

    public Lessons(String type, String name, String description, String rabbi, String dateAdded, String pathToFile) {
        this.type = type;
        this.name = name;
        this.description = description;
        this.rabbi = rabbi;
        this.dateAdded = dateAdded;
        this.pathToFile = pathToFile;
    }

    public Lessons(Integer id, String type, String name, String description, String rabbi, String dateAdded, String pathToFile) {
        this.id = Long.parseLong(id.toString());
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

    public String getPathToFile() throws Exception {
        if (pathToFile.startsWith("/")) {
            return pathToFile;
        } else {
            LessonType lessonType = LessonType.getLessonFromString(this.type);
            return LessonType.getPathToFileFromType(lessonType) + pathToFile;
        }
    }

    static List<Lessons> getAllLessons() {
        Logger.info("[DB] \t Getting All Lessons from DB");
        return Lessons.find("order by dateAdded").fetch();
    }

    static Lessons getLastId() {
        Logger.info("[DB] \t Getting Last Id");
        return (Lessons) Lessons.find("order by id desc").fetch().get(0);
    }

    public static void addOrUpdateLesson(Long id, String type, String name, String description, String rabbi, String dateAdded, String pathToFile) {
        JPA.startTx(JPA.DEFAULT, false);
        Lessons newLesson = new Lessons();
        newLesson.type = type;
        newLesson.name = name;
        newLesson.description = description;
        newLesson.rabbi = rabbi;
        newLesson.dateAdded = dateAdded;
        newLesson.pathToFile = pathToFile;
        newLesson.save();
        JPA.closeTx(JPA.DEFAULT);
    }
}
