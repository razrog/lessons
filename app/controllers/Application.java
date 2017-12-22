package controllers;

import models.LessonType;
import models.Lessons;
import play.mvc.Controller;
import play.mvc.Http;

import java.io.File;

public class Application extends Controller {

    public static void index() {
        render();
    }

    public static void gmara() {
        renderArgs.put("lessons", Lessons.getLessonsFromType(LessonType.GMARA));
        render();
    }

    public static void parasha() {
        renderArgs.put("lessons", Lessons.getLessonsFromType(LessonType.PARASHA));
        render();
    }

    public static void moed() {
        renderArgs.put("lessons", Lessons.getLessonsFromType(LessonType.MOED));
        render();
    }

    public static void avot() {
        renderArgs.put("lessons", Lessons.getLessonsFromType(LessonType.AVOT));
        render();
    }

    public static void halacha() {
        renderArgs.put("lessons", Lessons.getLessonsFromType(LessonType.HALACHOT));
        render();
    }

    public static void upload() {
       render();
    }

    public static void uploadFile() {

        render();
    }
}