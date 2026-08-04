package yyds;

import java.text.DateFormatSymbols;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.TimeZone;
import java.util.TreeMap;

/* JADX INFO: renamed from: yyds.ᛱᛷᛳᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0159 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final TreeMap f971 = new TreeMap(new C1300(11));

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final TreeMap f972 = new TreeMap(new C1300(11));

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final HashSet f973;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final TreeMap f974;

    static {
        HashSet hashSet = new HashSet();
        f973 = hashSet;
        f974 = new TreeMap();
        hashSet.add("à");
        hashSet.add("at");
        hashSet.add("MEZ");
        hashSet.add("Uhr");
        hashSet.add("h");
        hashSet.add("pm");
        hashSet.add("PM");
        hashSet.add("am");
        hashSet.add("AM");
        hashSet.add("min");
        hashSet.add("um");
        hashSet.add("o'clock");
        for (String str : TimeZone.getAvailableIDs()) {
            f974.put(str, TimeZone.getTimeZone(str));
        }
        for (Locale locale : DateFormatSymbols.getAvailableLocales()) {
            if (!"ja".equals(locale.getLanguage()) && !"ko".equals(locale.getLanguage()) && !"zh".equals(locale.getLanguage())) {
                DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
                String[] months = dateFormatSymbols.getMonths();
                for (int i = 0; i < months.length; i++) {
                    if (months[i].length() != 0) {
                        m723(f971, months[i], Integer.valueOf(i));
                    }
                }
                String[] shortMonths = dateFormatSymbols.getShortMonths();
                for (int i2 = 0; i2 < shortMonths.length; i2++) {
                    String str2 = shortMonths[i2];
                    if (str2.length() != 0 && !Character.isDigit(str2.charAt(str2.length() - 1))) {
                        TreeMap treeMap = f971;
                        m723(treeMap, shortMonths[i2], Integer.valueOf(i2));
                        m723(treeMap, shortMonths[i2].replace(".", ""), Integer.valueOf(i2));
                    }
                }
                String[] weekdays = dateFormatSymbols.getWeekdays();
                for (int i3 = 0; i3 < weekdays.length; i3++) {
                    String str3 = weekdays[i3];
                    if (str3.length() != 0) {
                        TreeMap treeMap2 = f972;
                        m723(treeMap2, str3, Integer.valueOf(i3));
                        m723(treeMap2, str3.replace(".", ""), Integer.valueOf(i3));
                    }
                }
                String[] shortWeekdays = dateFormatSymbols.getShortWeekdays();
                for (int i4 = 0; i4 < shortWeekdays.length; i4++) {
                    String str4 = shortWeekdays[i4];
                    if (str4.length() != 0) {
                        TreeMap treeMap3 = f972;
                        m723(treeMap3, str4, Integer.valueOf(i4));
                        m723(treeMap3, str4.replace(".", ""), Integer.valueOf(i4));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static GregorianCalendar m719() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(2000, 0, 0, 0, 0, 0);
        TimeZone timeZone = gregorianCalendar.getTimeZone();
        if (timeZone == null) {
            timeZone = TimeZone.getDefault();
        }
        gregorianCalendar.setTimeInMillis(-timeZone.getRawOffset());
        return gregorianCalendar;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static Date m720(StringTokenizer stringTokenizer, GregorianCalendar gregorianCalendar) {
        return !stringTokenizer.hasMoreTokens() ? gregorianCalendar.getTime() : m721(stringTokenizer.nextToken(), gregorianCalendar, stringTokenizer);
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static Date m721(String str, GregorianCalendar gregorianCalendar, StringTokenizer stringTokenizer) {
        gregorianCalendar.set(11, Integer.parseInt(m722(str, gregorianCalendar, stringTokenizer)));
        if (!stringTokenizer.hasMoreTokens()) {
            return gregorianCalendar.getTime();
        }
        String strM722 = m722(stringTokenizer.nextToken(), gregorianCalendar, stringTokenizer);
        if (strM722 == null) {
            return gregorianCalendar.getTime();
        }
        gregorianCalendar.set(12, Integer.parseInt(strM722));
        if (!stringTokenizer.hasMoreTokens()) {
            return gregorianCalendar.getTime();
        }
        String strM7222 = m722(stringTokenizer.nextToken(), gregorianCalendar, stringTokenizer);
        if (strM7222 == null) {
            return gregorianCalendar.getTime();
        }
        gregorianCalendar.set(13, Integer.parseInt(strM7222));
        if (!stringTokenizer.hasMoreTokens()) {
            return gregorianCalendar.getTime();
        }
        String strM7223 = m722(stringTokenizer.nextToken(), gregorianCalendar, stringTokenizer);
        if (strM7223 == null) {
            return gregorianCalendar.getTime();
        }
        String strM7224 = m722(strM7223, gregorianCalendar, stringTokenizer);
        if (strM7224.length() == 4 && Character.isDigit(strM7224.charAt(0))) {
            gregorianCalendar.set(1, m725(strM7224));
        }
        return gregorianCalendar.getTime();
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static String m722(String str, GregorianCalendar gregorianCalendar, StringTokenizer stringTokenizer) {
        while (true) {
            TimeZone timeZone = (TimeZone) f974.get(str);
            if (timeZone != null) {
                gregorianCalendar.setTimeZone(timeZone);
                if (!stringTokenizer.hasMoreTokens()) {
                    return null;
                }
                str = stringTokenizer.nextToken();
            } else {
                if (!f973.contains(str)) {
                    return str;
                }
                if (str.equalsIgnoreCase("pm")) {
                    gregorianCalendar.add(9, 1);
                }
                if (str.equalsIgnoreCase("am")) {
                    gregorianCalendar.add(9, 0);
                }
                if (!stringTokenizer.hasMoreTokens()) {
                    return null;
                }
                str = stringTokenizer.nextToken();
            }
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static void m723(TreeMap treeMap, String str, Integer num) {
        treeMap.put(str, num);
        treeMap.put(str.replace("é", "e").replace("û", "u"), num);
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static Integer m724(String str) {
        if (Character.isDigit(str.charAt(0))) {
            return Integer.valueOf(Integer.parseInt(str) - 1);
        }
        Integer num = (Integer) f971.get(str);
        if (num != null) {
            return num;
        }
        C0188.m789(AbstractC2104.m4014("can not parse ", str, " as month"));
        return null;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static int m725(String str) {
        int i = Integer.parseInt(str);
        return i < 100 ? i > 30 ? i + 2000 : i + 1900 : i;
    }
}
