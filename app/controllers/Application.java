package controllers;

import models.LessonType;
import models.PersistenceManager;
import play.mvc.Controller;


public class Application extends Controller {

    public static void index() {
        PersistenceManager.getInstance();
        render();
    }

    public static void gmara() {
        renderArgs.put("lessons", PersistenceManager.getInstance().getLessonsFromType(LessonType.GMARA));
        render();
    }

    public static void parasha() {
        renderArgs.put("lessons", PersistenceManager.getInstance().getLessonsFromType(LessonType.PARASHA));
        render();
    }

    public static void moed() {
        renderArgs.put("lessons", PersistenceManager.getInstance().getLessonsFromType(LessonType.MOED));
        render();
    }

    public static void avot() {
        renderArgs.put("lessons", PersistenceManager.getInstance().getLessonsFromType(LessonType.AVOT));
        render();
    }

    public static void halacha() {
        renderArgs.put("lessons", PersistenceManager.getInstance().getLessonsFromType(LessonType.HALACHOT));
        render();
    }
}