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
    public static final TimeZone f7246a = TimeZone.getTimeZone("UTC");

    /* JADX INFO: renamed from: a */
    public static boolean m4188a(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    /* JADX INFO: renamed from: b */
    public static void m4189b(StringBuilder sb, int i, int i2) {
        String string = Integer.toString(i);
        for (int length = i2 - string.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(string);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f6 A[Catch: IllegalArgumentException -> 0x00b8, NumberFormatException -> 0x00bb, IndexOutOfBoundsException -> 0x00be, TRY_LEAVE, TryCatch #2 {IllegalArgumentException -> 0x00b8, IndexOutOfBoundsException -> 0x00be, NumberFormatException -> 0x00bb, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0036, B:13:0x003c, B:17:0x0051, B:19:0x0061, B:20:0x0063, B:22:0x006f, B:23:0x0072, B:25:0x0078, B:29:0x0082, B:34:0x0092, B:36:0x009a, B:37:0x009e, B:39:0x00a4, B:44:0x00b1, B:53:0x00c5, B:64:0x00f0, B:66:0x00f6, B:92:0x01a8, B:74:0x0108, B:75:0x0123, B:76:0x0124, B:80:0x0141, B:82:0x014e, B:85:0x0157, B:87:0x0176, B:90:0x0185, B:91:0x01a7, B:79:0x0130, B:94:0x01d9, B:95:0x01e0, B:57:0x00d5, B:58:0x00d8, B:52:0x00c1), top: B:106:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d9 A[Catch: IllegalArgumentException -> 0x00b8, NumberFormatException -> 0x00bb, IndexOutOfBoundsException -> 0x00be, TryCatch #2 {IllegalArgumentException -> 0x00b8, IndexOutOfBoundsException -> 0x00be, NumberFormatException -> 0x00bb, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0036, B:13:0x003c, B:17:0x0051, B:19:0x0061, B:20:0x0063, B:22:0x006f, B:23:0x0072, B:25:0x0078, B:29:0x0082, B:34:0x0092, B:36:0x009a, B:37:0x009e, B:39:0x00a4, B:44:0x00b1, B:53:0x00c5, B:64:0x00f0, B:66:0x00f6, B:92:0x01a8, B:74:0x0108, B:75:0x0123, B:76:0x0124, B:80:0x0141, B:82:0x014e, B:85:0x0157, B:87:0x0176, B:90:0x0185, B:91:0x01a7, B:79:0x0130, B:94:0x01d9, B:95:0x01e0, B:57:0x00d5, B:58:0x00d8, B:52:0x00c1), top: B:106:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e5  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Date m4190c(String str, ParsePosition parsePosition) throws ParseException {
        String message;
        int i;
        int i2;
        int iM4191d;
        int iM4191d2;
        int length;
        char cCharAt;
        int length2;
        try {
            int index = parsePosition.getIndex();
            int i3 = index + 4;
            int iM4191d3 = m4191d(str, index, i3);
            if (m4188a(str, i3, '-')) {
                i3 = index + 5;
            }
            int i4 = i3 + 2;
            int iM4191d4 = m4191d(str, i3, i4);
            if (m4188a(str, i4, '-')) {
                i4 = i3 + 3;
            }
            int i5 = i4 + 2;
            int iM4191d5 = m4191d(str, i4, i5);
            boolean zM4188a = m4188a(str, i5, 'T');
            if (!zM4188a && str.length() <= i5) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(iM4191d3, iM4191d4 - 1, iM4191d5);
                parsePosition.setIndex(i5);
                return gregorianCalendar.getTime();
            }
            if (zM4188a) {
                int i6 = i4 + 5;
                int iM4191d6 = m4191d(str, i4 + 3, i6);
                if (m4188a(str, i6, ':')) {
                    i6 = i4 + 6;
                }
                int i7 = i6 + 2;
                int iM4191d7 = m4191d(str, i6, i7);
                if (m4188a(str, i7, ':')) {
                    i7 = i6 + 3;
                }
                if (str.length() > i7 && (cCharAt = str.charAt(i7)) != 'Z' && cCharAt != '+' && cCharAt != '-') {
                    int i8 = i7 + 2;
                    iM4191d2 = m4191d(str, i7, i8);
                    if (iM4191d2 > 59 && iM4191d2 < 63) {
                        iM4191d2 = 59;
                    }
                    if (m4188a(str, i8, '.')) {
                        int i9 = i7 + 3;
                        for (int i10 = i7 + 4; i10 < str.length(); i10++) {
                            char cCharAt2 = str.charAt(i10);
                            if (cCharAt2 >= '0' && cCharAt2 <= '9') {
                            }
                            length2 = i10;
                        }
                        length2 = str.length();
                        int iMin = Math.min(length2, i7 + 6);
                        iM4191d = m4191d(str, i9, iMin);
                        int i11 = iMin - i9;
                        if (i11 == 1) {
                            iM4191d *= 100;
                        } else if (i11 == 2) {
                            iM4191d *= 10;
                        }
                        i = iM4191d6;
                        i5 = length2;
                        i2 = iM4191d7;
                    } else {
                        i = iM4191d6;
                        i5 = i8;
                        i2 = iM4191d7;
                        iM4191d = 0;
                    }
                    if (str.length() > i5) {
                        throw new IllegalArgumentException("No time zone indicator");
                    }
                    char cCharAt3 = str.charAt(i5);
                    TimeZone timeZone = f7246a;
                    if (cCharAt3 == 'Z') {
                        length = i5 + 1;
                    } else {
                        if (cCharAt3 != '+' && cCharAt3 != '-') {
                            throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt3 + "'");
                        }
                        String strSubstring = str.substring(i5);
                        if (strSubstring.length() < 5) {
                            strSubstring = strSubstring + "00";
                        }
                        length = i5 + strSubstring.length();
                        if (!"+0000".equals(strSubstring) && !"+00:00".equals(strSubstring)) {
                            String str2 = "GMT" + strSubstring;
                            timeZone = TimeZone.getTimeZone(str2);
                            String id = timeZone.getID();
                            if (!id.equals(str2) && !id.replace(":", "").equals(str2)) {
                                throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str2 + " given, resolves to " + timeZone.getID());
                            }
                        }
                    }
                    GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
                    gregorianCalendar2.setLenient(false);
                    gregorianCalendar2.set(1, iM4191d3);
                    gregorianCalendar2.set(2, iM4191d4 - 1);
                    gregorianCalendar2.set(5, iM4191d5);
                    gregorianCalendar2.set(11, i);
                    gregorianCalendar2.set(12, i2);
                    gregorianCalendar2.set(13, iM4191d2);
                    gregorianCalendar2.set(14, iM4191d);
                    parsePosition.setIndex(length);
                    return gregorianCalendar2.getTime();
                }
                i5 = i7;
                i = iM4191d6;
                i2 = iM4191d7;
            } else {
                i = 0;
                i2 = 0;
            }
            iM4191d = 0;
            iM4191d2 = 0;
            if (str.length() > i5) {
            }
        } catch (IllegalArgumentException e) {
            e = e;
            String str3 = str == null ? null : "\"" + str + '\"';
            message = e.getMessage();
            if (message == null || message.isEmpty()) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException("Failed to parse date [" + str3 + "]: " + message, parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
            if (str == null) {
            }
            message = e.getMessage();
            if (message == null) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException2 = new ParseException("Failed to parse date [" + str3 + "]: " + message, parsePosition.getIndex());
            parseException2.initCause(e);
            throw parseException2;
        } catch (NumberFormatException e3) {
            e = e3;
            if (str == null) {
            }
            message = e.getMessage();
            if (message == null) {
            }
            ParseException parseException22 = new ParseException("Failed to parse date [" + str3 + "]: " + message, parsePosition.getIndex());
            parseException22.initCause(e);
            throw parseException22;
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m4191d(String str, int i, int i2) {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int iDigit = Character.digit(str.charAt(i), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i3 = -iDigit;
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int i5 = i4 + 1;
            int iDigit2 = Character.digit(str.charAt(i4), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i3 = (i3 * 10) - iDigit2;
            i4 = i5;
        }
        return -i3;
    }
}
