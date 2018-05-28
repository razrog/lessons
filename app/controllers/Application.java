package controllers;

import models.LessonType;
import models.PersistenceManager;
import play.mvc.Controller;


public class Application extends Controller {

    public static void index() {
        renderArgs.put("lessonsSize",PersistenceManager.getInstance().getLessonsSize());
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