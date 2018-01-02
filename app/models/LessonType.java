package models;


public enum LessonType {
    GMARA,
    HALACHOT,
    MOED,
    PARASHA,
    AVOT;

    public static LessonType getLessonFromString(String lessonType) {
        switch (lessonType) {
            case "gmara":
                return GMARA;
            case "halacha":
                return HALACHOT;
            case "avot":
                return AVOT;
            case "parasha":
                return PARASHA;
            case "moed":
                return MOED;
            default:
                return null;
        }
    }

    public static String getTitleFromType(LessonType type) {
        switch (type) {
            case AVOT:
                return "פרקי אבות";
            case MOED:
                return "מועדים";
            case GMARA:
                return "גמרא - מסכת קידושין";
            case PARASHA:
                return "פרשת השבוע";
            case HALACHOT:
                return "הלכות שבת קודש";

            default:
                return null;
        }
    }

}
