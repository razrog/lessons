package models;

import play.Logger;

import java.util.List;
import java.util.stream.Collectors;

public class PersistenceManager {

    private static PersistenceManager persistenceManager;
    private static List<Lessons> lessons;

    private PersistenceManager() {
        lessons = Lessons.getAllLessons();
//        lessons = LessonsLocalDB.getInstance().getAllLessons(); //TODO - Locally;

    }

    public int getLessonsSize() {
        return lessons.size();
    }

    public Long getLessonsLastId() {
        return Lessons.getLastId().getId();
    }

    public List<Lessons> getLessonsFromType(LessonType lessonType) {
        return lessons.stream().filter(lesson -> lesson.getType().equals(lessonType.toString())).collect(Collectors.toList());
    }

    public void initLessons() {
        Logger.info("[DB] \t Refreshing Lessons from DB");
        lessons = Lessons.getAllLessons();//TODO - From DB
//        lessons = LessonsLocalDB.getInstance().getAllLessons();//TODO - Locally
    }

    public static PersistenceManager getInstance() {
        synchronized (PersistenceManager.class) {
            if (persistenceManager == null) {
                persistenceManager = new PersistenceManager();
            }
            return persistenceManager;
        }
    }
}
