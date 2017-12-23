package models;

import java.util.List;
import java.util.stream.Collectors;

public class PersistenceManager {

    private static PersistenceManager persistenceManager;
    private static List<Lessons> lessons;

    private PersistenceManager() {
        lessons = Lessons.getAllLessons();
    }

    public List<Lessons> getLessonsFromType(LessonType lessonType) {
        return lessons.stream().filter(lesson -> lesson.getType().equals(lessonType.toString())).collect(Collectors.toList());
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
