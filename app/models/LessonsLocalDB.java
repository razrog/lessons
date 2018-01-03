package models;

import java.util.ArrayList;
import java.util.List;

public class LessonsLocalDB {

    private static LessonsLocalDB lessonsLocalDB;
    private List<Lessons> lessons;

    public static LessonsLocalDB getInstance() {
        synchronized (LessonsLocalDB.class) {
            if (lessonsLocalDB == null) {
                lessonsLocalDB = new LessonsLocalDB();
            }
            return lessonsLocalDB;
        }
    }


    private LessonsLocalDB() {
        lessons = new ArrayList<>();

        //*************************************
        // ******** GMARA *********************
        //*************************************

        lessons.add(new Lessons(1, "GMARA", "01", "פרק ב דף מא.", "הרב מרדכי סרודי", "2017-12-04", "/public/music/MP3/Gmara/01_perek_b_ma.mp3"));
        lessons.add(new Lessons(2, "GMARA", "02", "פרק ב דף מא.", "הרב מרדכי סרודי", "2017-12-06", "/public/music/MP3/Gmara/02_perek_b_ma.mp3"));
        lessons.add(new Lessons(3, "GMARA", "03", "פרק ב דף מא:", "הרב מרדכי סרודי", "2017-12-11", "/public/music/MP3/Gmara/03_ma_b.mp3"));
        lessons.add(new Lessons(8, "GMARA", "04", "פרק ב עמוד מב.", "הרב מרדכי סרודי", "2017-12-13", "/public/music/MP3/Gmara/04_mb.mp3"));
        lessons.add(new Lessons(69, "GMARA", "05", "פרק ב׳ עמוד מב.", "הרב מרדכי סרודי", "2017-12-18", "/public/music/MP3/Gmara/05_mb_a.mp3"));
        lessons.add(new Lessons(70, "GMARA", "06", "פרק ב׳ עמוד מב:", "הרב מרדכי סרודי", "2017-12-20", "/public/music/MP3/Gmara/06_mb_b.mp3"));
        lessons.add(new Lessons(73, "GMARA", "07", "פרק ב׳ עמוד מב: + מג.", "הרב מרדכי סרודי", "2017-12-25", "/public/music/MP3/Gmara/07_mb_b_02.mp3"));
        lessons.add(new Lessons(76, "GMARA", "08", "פרק ב׳ עמוד מג.", "הרב מרדכי סרודי", "2017-12-27", "/public/music/MP3/Gmara/08_perek_b_amud_m_gimel.mp3"));

        //*************************************
        // ******** HALACHOT *********************
        //*************************************


        lessons.add(new Lessons(9, "HALACHOT", "01", "הלכות שבת", "הרב מרדכי סרודי", "2017-12-15", "/public/music/MP3/HalahotShabat/01.mp3"));
        lessons.add(new Lessons(10, "HALACHOT", "02", "הלכות שבת", "הרב מרדכי סרודי", "2017-12-15", "/public/music/MP3/HalahotShabat/02.mp3"));
        lessons.add(new Lessons(11, "HALACHOT", "03", "הלכות שבת", "הרב מרדכי סרודי", "2017-12-15", "/public/music/MP3/HalahotShabat/03.mp3"));
        lessons.add(new Lessons(12, "HALACHOT", "04", "הלכות שבת", "הרב מרדכי סרודי", "2017-12-15", "/public/music/MP3/HalahotShabat/04.mp3"));
        lessons.add(new Lessons(13, "HALACHOT", "05", "הלכות שבת", "הרב מרדכי סרודי", "2017-12-15", "/public/music/MP3/HalahotShabat/05.mp3"));
        lessons.add(new Lessons(14, "HALACHOT", "06", "הלכות שבת", "הרב מרדכי סרודי", "2017-12-15", "/public/music/MP3/HalahotShabat/06.mp3"));
        lessons.add(new Lessons(15, "HALACHOT", "07", "הלכות שבת", "הרב מרדכי סרודי", "2017-12-15", "/public/music/MP3/HalahotShabat/07.mp3"));
        lessons.add(new Lessons(16, "HALACHOT", "08", "הלכות שבת", "הרב מרדכי סרודי", "2017-12-15", "/public/music/MP3/HalahotShabat/08.mp3"));
        lessons.add(new Lessons(17, "HALACHOT", "09", "הלכות שבת", "הרב מרדכי סרודי", "2017-12-15", "/public/music/MP3/HalahotShabat/09.mp3"));
        lessons.add(new Lessons(18, "HALACHOT", "10", "הלכות שבת", "הרב מרדכי סרודי", "2017-12-15", "/public/music/MP3/HalahotShabat/10.mp3"));
        lessons.add(new Lessons(19, "HALACHOT", "11", "הלכות שבת", "הרב מרדכי סרודי", "2017-12-15", "/public/music/MP3/HalahotShabat/11.mp3"));
        lessons.add(new Lessons(20, "HALACHOT", "12", "הלכות שבת", "הרב מרדכי סרודי", "2017-12-15", "/public/music/MP3/HalahotShabat/12.mp3"));
        lessons.add(new Lessons(21, "HALACHOT", "13", "הלכות שבת", "הרב מרדכי סרודי", "2017-12-15", "/public/music/MP3/HalahotShabat/13.mp3"));
        lessons.add(new Lessons(22, "HALACHOT", "14", "הלכות שבת", "הרב מרדכי סרודי", "2017-12-15", "/public/music/MP3/HalahotShabat/14.mp3"));
        lessons.add(new Lessons(23, "HALACHOT", "15", "הלכות שבת", "הרב מרדכי סרודי", "2017-12-15", "/public/music/MP3/HalahotShabat/15.mp3"));
        lessons.add(new Lessons(24, "HALACHOT", "16", "הלכות שבת", "הרב מרדכי סרודי", "2017-12-15", "/public/music/MP3/HalahotShabat/16.mp3"));
        lessons.add(new Lessons(25, "HALACHOT", "17", "הלכות שבת", "הרב מרדכי סרודי", "2017-12-15", "/public/music/MP3/HalahotShabat/17.mp3"));
        lessons.add(new Lessons(71, "HALACHOT", "18", "הלכות שבת (הבדלה)", "הרב מרדכי סרודי", "2017-12-18", "/public/music/MP3/HalahotShabat/18_shabat_havdala.mp3"));
        lessons.add(new Lessons(74, "HALACHOT", "19", "הלכות שבת (הבדלה)", "הרב מרדכי סרודי", "2017-12-25", "/public/music/MP3/HalahotShabat/19_halachot_havdala.mp3"));

        //*************************************
        // ******** MOED *********************
        //*************************************

        lessons.add(new Lessons(26, "MOED", "01", "הלכות עשרת ימי תשובה", "הרב מרדכי סרודי", "2017-12-16", "/public/music/MP3/Moed/00_ten_days_tsuva.mp3"));
        lessons.add(new Lessons(27, "MOED", "02", "ראש השנה ערוב תבשילין ויום טוב", "הרב מרדכי סרודי", "2017-12-16", "/new Lessonspublic/music/MP3/Moed/01_yom_tov.mp3"));
        lessons.add(new Lessons(28, "MOED", "03", "ראש השנה ביאורי תפילה", "הרב מרדכי סרודי", "2017-12-16", "/public/music/MP3/Moed/02_rosh_hasana_beyiurey_tfila.mp3"));
        lessons.add(new Lessons(29, "MOED", "04", "ראש השנה ביאורי תפילה", "הרב מרדכי סרודי", "2017-12-16", "/public/music/MP3/Moed/04_rosh_hasana_halchot.mp3"));
        lessons.add(new Lessons(30, "MOED", "05", "יום כיפור הלכות", "הרב מרדכי סרודי", "2017-12-16", "/public/music/MP3/Moed/05_yom_kipur.mp3"));
        lessons.add(new Lessons(31, "MOED", "06", "סוכות - הלכות", "הרב מרדכי סרודי", "2017-12-16", "/public/music/MP3/Moed/06_sukut_halacha.mp3"));
        lessons.add(new Lessons(32, "MOED", "07", "א באב - הלכות", "הרב מרדכי סרודי", "2017-12-16", "/public/music/MP3/Moed/07_a_bahav.mp3"));
        lessons.add(new Lessons(33, "MOED", "08", "טו באב - הלכות", "הרב מרדכי סרודי", "2017-12-16", "/public/music/MP3/Moed/08_tu_bahav.mp3"));
        lessons.add(new Lessons(34, "MOED", "09", "פסח - הלכות סעודה", "הרב מרדכי סרודי", "2017-12-16", "/public/music/MP3/Moed/09_peseh_halachot.mp3"));
        lessons.add(new Lessons(35, "MOED", "10", "פורים - הלכות", "הרב מרדכי סרודי", "2017-12-16", "/public/music/MP3/Moed/10_purim.mp3"));
        lessons.add(new Lessons(36, "MOED", "11", "חנוכה - הלכות", "הרב מרדכי סרודי", "2017-12-16", "/public/music/MP3/Moed/11_halachot_hanuca.mp3"));


        //*************************************
        // ********* AVOT *********************
        //*************************************


        lessons.add(new Lessons(37, "AVOT", "01", "פרקי אבות", "הרב מרדכי סרודי", "2017-12-16", "/public/music/MP3/PerkeyAvot/01.mp3"));
        lessons.add(new Lessons(38, "AVOT", "02", "פרקי אבות", "הרב מרדכי סרודי", "2017-12-16", "/public/music/MP3/PerkeyAvot/02.mp3"));
        lessons.add(new Lessons(39, "AVOT", "03", "פרקי אבות", "הרב מרדכי סרודי", "2017-12-16", "/public/music/MP3/PerkeyAvot/03.mp3"));
        lessons.add(new Lessons(40, "AVOT", "04", "פרקי אבות", "הרב מרדכי סרודי", "2017-12-16", "/public/music/MP3/PerkeyAvot/04.mp3"));
        lessons.add(new Lessons(41, "AVOT", "05", "פרקי אבות", "הרב מרדכי סרודי", "2017-12-16", "/public/music/MP3/PerkeyAvot/05.mp3"));
        lessons.add(new Lessons(42, "AVOT", "06", "פרקי אבות", "הרב מרדכי סרודי", "2017-12-16", "/public/music/MP3/PerkeyAvot/06.mp3"));
        lessons.add(new Lessons(43, "AVOT", "07", "פרקי אבות", "הרב מרדכי סרודי", "2017-12-16", "/public/music/MP3/PerkeyAvot/07.mp3"));
        lessons.add(new Lessons(44, "AVOT", "08", "פרקי אבות", "הרב מרדכי סרודי", "2017-12-16", "/public/music/MP3/PerkeyAvot/08.mp3"));
        lessons.add(new Lessons(45, "AVOT", "09", "פרקי אבות", "הרב מרדכי סרודי", "2017-12-16", "/public/music/MP3/PerkeyAvot/09.mp3"));
        lessons.add(new Lessons(46, "AVOT", "10", "פרקי אבות", "הרב מרדכי סרודי", "2017-12-16", "/public/music/MP3/PerkeyAvot/10.mp3"));
        lessons.add(new Lessons(47, "AVOT", "11", "פרקי אבות", "הרב מרדכי סרודי", "2017-12-16", "/public/music/MP3/PerkeyAvot/11.mp3"));
        lessons.add(new Lessons(48, "AVOT", "12", "פרקי אבות", "הרב מרדכי סרודי", "2017-12-16", "/public/music/MP3/PerkeyAvot/12.mp3"));
        lessons.add(new Lessons(49, "AVOT", "13", "פרקי אבות", "הרב מרדכי סרודי", "2017-12-12", "/public/music/MP3/PerkeyAvot/13.mp3"));
        lessons.add(new Lessons(72, "AVOT", "14", "פרק ג משנה יא", "הרב מרדכי סרודי", "2017-12-19", "/public/music/MP3/PerkeyAvot/14_perek_g_misna_ya.mp3"));


        //******************************************
        // *********** PARASHA *********************
        //******************************************

        lessons.add(new Lessons(50, "PARASHA", "01", "פרשת מטות מסעי", "הרב מרדכי סרודי", "2017-12-16", "/public/music/MP3/Parashot/01_matot_massaye.mp3"));
        lessons.add(new Lessons(51, "PARASHA", "02", "פרשת מטות", "הרב מרדכי סרודי", "2017-12-16", "/public/music/MP3/Parashot/02_matot.mp3"));
        lessons.add(new Lessons(52, "PARASHA", "03", "פרשת כי תצא", "הרב מרדכי סרודי", "2017-12-16", "/public/music/MP3/Parashot/03_ki_teche.mp3"));
        lessons.add(new Lessons(53, "PARASHA", "04", "פרשת כי תבוא", "הרב מרדכי סרודי", "2017-12-16", "/public/music/MP3/Parashot/04_ki_tavo.mp3.mp3"));
        lessons.add(new Lessons(54, "PARASHA", "05", "פרשת חוקת", "הרב מרדכי סרודי", "2017-12-16", "/public/music/MP3/Parashot/05_hukat.mp3"));
        lessons.add(new Lessons(55, "PARASHA", "06", "פרשת שופטים", "הרב מרדכי סרודי", "2017-12-16", "/public/music/MP3/Parashot/06_softim.mp3"));
        lessons.add(new Lessons(56, "PARASHA", "07", "פרשת לך לך", "הרב מרדכי סרודי", "2017-11-1", "/public/music/MP3/Parashot/07_leh_leh.mp3"));
        lessons.add(new Lessons(57, "PARASHA", "08", "פרשת וירא", "הרב מרדכי סרודי", "2017-11-8", "/public/music/MP3/Parashot/08_yayare.mp3"));
        lessons.add(new Lessons(58, "PARASHA", "09", "פרשת חיי שרה", "הרב מרדכי סרודי", "2017-11-15", "/public/music/MP3/Parashot/09_hayei_sarah.mp3"));
        lessons.add(new Lessons(59, "PARASHA", "10", "פרשת תולדות", "הרב מרדכי סרודי", "2017-11-22", "/public/music/MP3/Parashot/10_toldot.mp3"));
        lessons.add(new Lessons(60, "PARASHA", "11", "פרשת ויצא", "הרב מרדכי סרודי", "2017-11-29", "/public/music/MP3/Parashot/11_vayeche.mp3"));
        lessons.add(new Lessons(61, "PARASHA", "12", "פרשת וישלח", "הרב מרדכי סרודי", "2017-12-6", "/public/music/MP3/Parashot/12_veyislah.mp3"));
        lessons.add(new Lessons(62, "PARASHA", "13", "פרשת וישב", "הרב מרדכי סרודי", "2017-12-13", "/public/music/MP3/Parashot/13_parashat_hasavuh_veyesev.mp3"));
        lessons.add(new Lessons(68, "PARASHA", "14", "פרשת ויגש", "הרב מרדכי סרודי", "2017-12-20", "/public/music/MP3/Parashot/14_parashay_veyigash.mp3"));
        lessons.add(new Lessons(75, "PARASHA", "15", "פרשת השבוע ויחי", "הרב מרדכי סרודי", "2017-12-27", "/public/music/MP3/Parashot/15_parashat_veyichi.mp3"));

    }

    public List<Lessons> getAllLessons(){
        System.out.println("[LessonsLocalDB] returning all lessons");
        return lessons;
    }
}
