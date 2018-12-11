package controllers;

import models.LessonType;
import models.Lessons;
import models.PersistenceManager;
import play.mvc.Controller;


public class Application extends Controller {

    public static void index() {
        renderArgs.put("lessonsSize", PersistenceManager.getInstance().getLessonsSize());
        render();
    }

    public static void lessons() throws Exception {
        String lessonType = request.params.get("type");
        LessonType type = LessonType.getLessonFromString(lessonType);
        if (type == null) {
            error();
        } else {
            String title = LessonType.getTitleFromType(type);
            renderArgs.put("pageTitle", title);
            renderArgs.put("lessons", PersistenceManager.getInstance().getLessonsFromType(type));
            render();
        }
    }

    public static void addLesson() {
        Long lessonsLastId = PersistenceManager.getInstance().getLessonsLastId();
        renderArgs.put("lessonId", lessonsLastId + 5);
        render();
    }

    public static void addNewLesson(String lessonId, String lessonType, String lessonName, String lessonDescription, String lessonRabbi, String lessonDate, String lessonFilePath) {
        Lessons.addOrUpdateLesson(Long.parseLong(lessonId), lessonType, lessonName, lessonDescription, lessonRabbi, lessonDate, lessonFilePath);
    }

    public static void refresh() {
        String password = request.params.get("password");
        if (password != null && password.equals("12345678")) {
            PersistenceManager.getInstance().initLessons();
            renderText("DB Refreshed successfully!");
        } else {
            renderText(" 500 - DB Refresh Failed - Incorrect Password");
        }
    }
}