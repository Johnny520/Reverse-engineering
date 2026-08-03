package io.sentry.vendor.gson.internal.bind.util;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* JADX INFO: renamed from: io.sentry.vendor.gson.internal.bind.util.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2048a {

    /* JADX INFO: renamed from: a */
    public static final TimeZone f7246a = null;

    static {
        f7246a = TimeZone.getTimeZone("UTC");
    }

    /* JADX INFO: renamed from: a */
    public static boolean m4188a(String r1, int r2, char r3) {
        if (r2 < r1.length()) goto L5;
        return false;
    L5:
        if (r1.charAt(r2) != r3) goto L10;
        return true;
    L10:
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static void m4189b(StringBuilder r1, int r2, int r3) {
        String r22 = Integer.toString(r2);
        int r32 = r3 - r22.length();
    L3:
        if (r32 <= 0) goto L5;
        r1.append('0');
        r32 = r32 - 1;
        goto L3
    L5:
        r1.append(r22);
    }

    /* JADX INFO: renamed from: c */
    public static Date m4190c(String r17, ParsePosition r18) {
        int r0 = r18.getIndex();     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        int r3 = r0 + 4;     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        int r4 = m4191d(r17, r0, r3);     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        if (m4188a(r17, r3, '-') == false) goto L6;
        r3 = r0 + 5;     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
    L6:
        int r02 = r3 + 2;     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        int r6 = m4191d(r17, r3, r02);     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        if (m4188a(r17, r02, '-') == false) goto L9;
        r02 = r3 + 3;     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
    L9:
        int r32 = r02 + 2;     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        int r8 = m4191d(r17, r02, r32);     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        boolean r9 = m4188a(r17, r32, 'T');     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        if (r9 == true) goto L16;
        if (r17.length() > r32) goto L16;
        GregorianCalendar r03 = new GregorianCalendar(r4, r6 - 1, r8);     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        r18.setIndex(r32);     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        return r03.getTime();
    L16:
        if (r9 == false) goto L63;
        int r92 = r02 + 5;     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        int r33 = m4191d(r17, r02 + 3, r92);     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        if (m4188a(r17, r92, ':') == false) goto L20;
        r92 = r02 + 6;     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
    L20:
        int r04 = r92 + 2;     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        int r16 = m4191d(r17, r92, r04);     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        if (m4188a(r17, r04, ':') == false) goto L24;
        r04 = r92 + 3;     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
    L24:
        if (r17.length() <= r04) goto L61;
        char r93 = r17.charAt(r04);     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        if (r93 == 'Z') goto L61;
        if (r93 == '+') goto L61;
        if (r93 == '-') goto L61;
        int r94 = r04 + 2;     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        int r15 = m4191d(r17, r04, r94);     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        if (r15 <= 59) goto L35;
        if (r15 >= 63) goto L35;
        r15 = 59;
    L35:
        if (m4188a(r17, r94, '.') == false) goto L60;
        int r95 = r04 + 3;     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        int r13 = r04 + 4;     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
    L38:
        if (r13 >= r17.length()) goto L52;
        char r7 = r17.charAt(r13);     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        if (r7 < '0') goto L45;
        if (r7 > '9') goto L45;
        r13 = r13 + 1;     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
    L45:
        int r5 = r13;
    L53:
        int r05 = Math.min(r5, r04 + 6);     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        int r72 = m4191d(r17, r95, r05);     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        int r06 = r05 - r95;     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        if (r06 == 1) goto L58;
        if (r06 != 2) goto L59;
        r72 = r72 * 10;     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
    L59:
        int r07 = r33;
        r32 = r5;
        int r52 = r16;
    L65:
        if (r17.length() <= r32) goto L95;
        char r96 = r17.charAt(r32);     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        TimeZone r132 = f7246a;
        if (r96 != 'Z') goto L70;
        int r34 = r32 + 1;
    L92:
        GregorianCalendar r97 = new GregorianCalendar(r132);     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        r97.setLenient(false);     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        r97.set(1, r4);     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        r97.set(2, r6 - 1);     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        r97.set(5, r8);     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        r97.set(11, r07);     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        r97.set(12, r52);     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        r97.set(13, r15);     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        r97.set(14, r72);     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        r18.setIndex(r34);     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        return r97.getTime();
    L70:
        if (r96 != '+') goto L72;
    L76:
        String r98 = r17.substring(r32);     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        if (r98.length() >= 5) goto L80;
        r98 = r98 + "00";     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
    L80:
        r34 = r32 + r98.length();     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        if ("+0000".equals(r98) == true) goto L92;
        if ("+00:00".equals(r98) == true) goto L92;
        String r99 = "GMT" + r98;     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        r132 = TimeZone.getTimeZone(r99);     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        String r11 = r132.getID();     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        if (r11.equals(r99) == true) goto L92;
        if (r11.replace(":", "").equals(r99) == true) goto L92;
        throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + r99 + " given, resolves to " + r132.getID());     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
    L72:
        if (r96 == '-') goto L76;
        throw new IndexOutOfBoundsException("Invalid time zone indicator '" + r96 + "'");     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
    L95:
        throw new IllegalArgumentException("No time zone indicator");     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
    L58:
        r72 = r72 * 100;     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        goto L59
    L52:
        r5 = r17.length();     // Catch: IllegalArgumentException -> L46 NumberFormatException -> L48 IndexOutOfBoundsException -> L50
        goto L53
    L60:
        r07 = r33;
        r32 = r94;
        r52 = r16;
        r72 = 0;
    L61:
        r32 = r04;
        r07 = r33;
        r52 = r16;
    L62:
        r72 = 0;
        r15 = 0;
        goto L65
    L63:
        r07 = 0;
        r52 = 0;
    L46:
        e = e;
    L96:
        if (r17 != null) goto L98;
        String r1 = null;
    L99:
        String r35 = e.getMessage();
        if (r35 != null) goto L102;
    L103:
        r35 = "(" + e.getClass().getName() + ")";
    L104:
        ParseException r42 = new ParseException("Failed to parse date [" + r1 + "]: " + r35, r18.getIndex());
        r42.initCause(e);
        throw r42;
    L102:
        if (r35.isEmpty() == false) goto L104;
    L98:
        r1 = "\"" + r17 + '\"';
    L50:
        e = e;
    L48:
        e = e;
        goto L96
    }

    /* JADX INFO: renamed from: d */
    public static int m4191d(String r5, int r6, int r7) {
        if (r6 < 0) goto L23;
        if (r7 > r5.length()) goto L23;
        if (r6 > r7) goto L23;
        if (r6 >= r7) goto L13;
        int r2 = r6 + 1;
        int r3 = Character.digit(r5.charAt(r6), 10);
        if (r3 < 0) goto L12;
        int r32 = -r3;
    L14:
        if (r2 >= r7) goto L21;
        int r4 = r2 + 1;
        int r22 = Character.digit(r5.charAt(r2), 10);
        if (r22 < 0) goto L19;
        r32 = (r32 * 10) - r22;
        r2 = r4;
        goto L14
    L19:
        throw new NumberFormatException("Invalid number: " + r5.substring(r6, r7));
    L21:
        return -r32;
    L12:
        throw new NumberFormatException("Invalid number: " + r5.substring(r6, r7));
    L13:
        r32 = 0;
        r2 = r6;
    L23:
        throw new NumberFormatException(r5);
    }
}
