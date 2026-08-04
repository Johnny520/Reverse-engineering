package yyds;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* JADX INFO: renamed from: yyds.ᛴᲇᛸᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0982 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final TimeZone f4488 = TimeZone.getTimeZone("UTC");

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static boolean m2136(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00f4 A[Catch: IllegalArgumentException | IndexOutOfBoundsException -> 0x004e, TRY_LEAVE, TryCatch #0 {IllegalArgumentException | IndexOutOfBoundsException -> 0x004e, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:19:0x0058, B:21:0x0068, B:22:0x006a, B:24:0x0076, B:25:0x0079, B:27:0x007f, B:31:0x0089, B:36:0x0099, B:38:0x00a1, B:39:0x00a5, B:41:0x00ab, B:46:0x00b8, B:49:0x00c3, B:60:0x00ee, B:62:0x00f4, B:88:0x01a6, B:88:0x01a6, B:70:0x0106, B:70:0x0106, B:71:0x0121, B:71:0x0121, B:72:0x0122, B:72:0x0122, B:76:0x013f, B:76:0x013f, B:78:0x014c, B:78:0x014c, B:81:0x0155, B:81:0x0155, B:83:0x0174, B:83:0x0174, B:86:0x0183, B:86:0x0183, B:87:0x01a5, B:87:0x01a5, B:75:0x012e, B:75:0x012e, B:90:0x01d7, B:90:0x01d7, B:91:0x01de, B:91:0x01de, B:53:0x00d3, B:54:0x00d6, B:48:0x00bf), top: B:102:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d7 A[Catch: IllegalArgumentException | IndexOutOfBoundsException -> 0x004e, IllegalArgumentException | IndexOutOfBoundsException -> 0x004e, TryCatch #0 {IllegalArgumentException | IndexOutOfBoundsException -> 0x004e, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:19:0x0058, B:21:0x0068, B:22:0x006a, B:24:0x0076, B:25:0x0079, B:27:0x007f, B:31:0x0089, B:36:0x0099, B:38:0x00a1, B:39:0x00a5, B:41:0x00ab, B:46:0x00b8, B:49:0x00c3, B:60:0x00ee, B:62:0x00f4, B:88:0x01a6, B:88:0x01a6, B:70:0x0106, B:70:0x0106, B:71:0x0121, B:71:0x0121, B:72:0x0122, B:72:0x0122, B:76:0x013f, B:76:0x013f, B:78:0x014c, B:78:0x014c, B:81:0x0155, B:81:0x0155, B:83:0x0174, B:83:0x0174, B:86:0x0183, B:86:0x0183, B:87:0x01a5, B:87:0x01a5, B:75:0x012e, B:75:0x012e, B:90:0x01d7, B:90:0x01d7, B:91:0x01de, B:91:0x01de, B:53:0x00d3, B:54:0x00d6, B:48:0x00bf), top: B:102:0x0004 }] */
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Date m2137(String str, ParsePosition parsePosition) throws ParseException {
        int i;
        int i2;
        int iM2138;
        int iM21382;
        int length;
        char cCharAt;
        int length2;
        try {
            int index = parsePosition.getIndex();
            int i3 = index + 4;
            int iM21383 = m2138(str, index, i3);
            if (m2136(str, i3, '-')) {
                i3 = index + 5;
            }
            int i4 = i3 + 2;
            int iM21384 = m2138(str, i3, i4);
            if (m2136(str, i4, '-')) {
                i4 = i3 + 3;
            }
            int i5 = i4 + 2;
            int iM21385 = m2138(str, i4, i5);
            boolean zM2136 = m2136(str, i5, 'T');
            if (!zM2136 && str.length() <= i5) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(iM21383, iM21384 - 1, iM21385);
                gregorianCalendar.setLenient(false);
                parsePosition.setIndex(i5);
                return gregorianCalendar.getTime();
            }
            if (zM2136) {
                int i6 = i4 + 5;
                int iM21386 = m2138(str, i4 + 3, i6);
                if (m2136(str, i6, ':')) {
                    i6 = i4 + 6;
                }
                int i7 = i6 + 2;
                int iM21387 = m2138(str, i6, i7);
                if (m2136(str, i7, ':')) {
                    i7 = i6 + 3;
                }
                if (str.length() > i7 && (cCharAt = str.charAt(i7)) != 'Z' && cCharAt != '+' && cCharAt != '-') {
                    int i8 = i7 + 2;
                    iM21382 = m2138(str, i7, i8);
                    if (iM21382 > 59 && iM21382 < 63) {
                        iM21382 = 59;
                    }
                    if (m2136(str, i8, '.')) {
                        int i9 = i7 + 3;
                        for (int i10 = i7 + 4; i10 < str.length(); i10++) {
                            char cCharAt2 = str.charAt(i10);
                            if (cCharAt2 >= '0' && cCharAt2 <= '9') {
                            }
                            length2 = i10;
                        }
                        length2 = str.length();
                        int iMin = Math.min(length2, i7 + 6);
                        iM2138 = m2138(str, i9, iMin);
                        int i11 = iMin - i9;
                        if (i11 == 1) {
                            iM2138 *= 100;
                        } else if (i11 == 2) {
                            iM2138 *= 10;
                        }
                        i = iM21386;
                        i5 = length2;
                        i2 = iM21387;
                    } else {
                        i = iM21386;
                        i5 = i8;
                        i2 = iM21387;
                        iM2138 = 0;
                    }
                    if (str.length() > i5) {
                        throw new IllegalArgumentException("No time zone indicator");
                    }
                    char cCharAt3 = str.charAt(i5);
                    TimeZone timeZone = f4488;
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
                        if (!strSubstring.equals("+0000") && !strSubstring.equals("+00:00")) {
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
                    gregorianCalendar2.set(1, iM21383);
                    gregorianCalendar2.set(2, iM21384 - 1);
                    gregorianCalendar2.set(5, iM21385);
                    gregorianCalendar2.set(11, i);
                    gregorianCalendar2.set(12, i2);
                    gregorianCalendar2.set(13, iM21382);
                    gregorianCalendar2.set(14, iM2138);
                    parsePosition.setIndex(length);
                    return gregorianCalendar2.getTime();
                }
                i5 = i7;
                i = iM21386;
                i2 = iM21387;
            } else {
                i = 0;
                i2 = 0;
            }
            iM2138 = 0;
            iM21382 = 0;
            if (str.length() > i5) {
            }
        } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
            String str3 = str == null ? null : "\"" + str + '\"';
            String message = e.getMessage();
            if (message == null || message.isEmpty()) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException("Failed to parse date [" + str3 + "]: " + message, parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static int m2138(String str, int i, int i2) {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int iDigit = Character.digit(str.charAt(i), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: ".concat(str.substring(i, i2)));
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
                throw new NumberFormatException("Invalid number: ".concat(str.substring(i, i2)));
            }
            i3 = (i3 * 10) - iDigit2;
            i4 = i5;
        }
        return -i3;
    }
}
