package p235s2;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* JADX INFO: renamed from: s2.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3184a {

    /* JADX INFO: renamed from: a */
    public static final TimeZone f9935a = TimeZone.getTimeZone("UTC");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static boolean m5455a(String str, int i5, char c5) {
        return i5 < str.length() && str.charAt(i5) == c5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f7 A[Catch: IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, TRY_LEAVE, TryCatch #2 {IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:21:0x005b, B:23:0x006b, B:24:0x006d, B:26:0x0079, B:27:0x007c, B:29:0x0082, B:33:0x008c, B:38:0x009c, B:40:0x00a4, B:41:0x00a8, B:43:0x00ae, B:48:0x00bb, B:51:0x00c6, B:62:0x00f1, B:64:0x00f7, B:90:0x01a9, B:72:0x0109, B:73:0x0124, B:74:0x0125, B:78:0x0142, B:80:0x014f, B:83:0x0158, B:85:0x0177, B:88:0x0186, B:89:0x01a8, B:77:0x0131, B:92:0x01da, B:93:0x01e1, B:55:0x00d6, B:56:0x00d9, B:50:0x00c2), top: B:104:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01da A[Catch: IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, TryCatch #2 {IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:21:0x005b, B:23:0x006b, B:24:0x006d, B:26:0x0079, B:27:0x007c, B:29:0x0082, B:33:0x008c, B:38:0x009c, B:40:0x00a4, B:41:0x00a8, B:43:0x00ae, B:48:0x00bb, B:51:0x00c6, B:62:0x00f1, B:64:0x00f7, B:90:0x01a9, B:72:0x0109, B:73:0x0124, B:74:0x0125, B:78:0x0142, B:80:0x014f, B:83:0x0158, B:85:0x0177, B:88:0x0186, B:89:0x01a8, B:77:0x0131, B:92:0x01da, B:93:0x01e1, B:55:0x00d6, B:56:0x00d9, B:50:0x00c2), top: B:104:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e6  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Date m5456b(String str, ParsePosition parsePosition) throws ParseException {
        String message;
        int i5;
        int i6;
        int iM5457c;
        int iM5457c2;
        int length;
        char cCharAt;
        int length2;
        try {
            int index = parsePosition.getIndex();
            int i7 = index + 4;
            int iM5457c3 = m5457c(index, i7, str);
            if (m5455a(str, i7, '-')) {
                i7 = index + 5;
            }
            int i8 = i7 + 2;
            int iM5457c4 = m5457c(i7, i8, str);
            if (m5455a(str, i8, '-')) {
                i8 = i7 + 3;
            }
            int i9 = i8 + 2;
            int iM5457c5 = m5457c(i8, i9, str);
            boolean zM5455a = m5455a(str, i9, 'T');
            if (!zM5455a && str.length() <= i9) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(iM5457c3, iM5457c4 - 1, iM5457c5);
                gregorianCalendar.setLenient(false);
                parsePosition.setIndex(i9);
                return gregorianCalendar.getTime();
            }
            if (zM5455a) {
                int i10 = i8 + 5;
                int iM5457c6 = m5457c(i8 + 3, i10, str);
                if (m5455a(str, i10, ':')) {
                    i10 = i8 + 6;
                }
                int i11 = i10 + 2;
                int iM5457c7 = m5457c(i10, i11, str);
                if (m5455a(str, i11, ':')) {
                    i11 = i10 + 3;
                }
                if (str.length() > i11 && (cCharAt = str.charAt(i11)) != 'Z' && cCharAt != '+' && cCharAt != '-') {
                    int i12 = i11 + 2;
                    iM5457c2 = m5457c(i11, i12, str);
                    if (iM5457c2 > 59 && iM5457c2 < 63) {
                        iM5457c2 = 59;
                    }
                    if (m5455a(str, i12, '.')) {
                        int i13 = i11 + 3;
                        for (int i14 = i11 + 4; i14 < str.length(); i14++) {
                            char cCharAt2 = str.charAt(i14);
                            if (cCharAt2 >= '0' && cCharAt2 <= '9') {
                            }
                            length2 = i14;
                        }
                        length2 = str.length();
                        int iMin = Math.min(length2, i11 + 6);
                        iM5457c = m5457c(i13, iMin, str);
                        int i15 = iMin - i13;
                        if (i15 == 1) {
                            iM5457c *= 100;
                        } else if (i15 == 2) {
                            iM5457c *= 10;
                        }
                        i5 = iM5457c6;
                        i9 = length2;
                        i6 = iM5457c7;
                    } else {
                        i5 = iM5457c6;
                        i9 = i12;
                        i6 = iM5457c7;
                        iM5457c = 0;
                    }
                    if (str.length() > i9) {
                        throw new IllegalArgumentException("No time zone indicator");
                    }
                    char cCharAt3 = str.charAt(i9);
                    TimeZone timeZone = f9935a;
                    if (cCharAt3 == 'Z') {
                        length = i9 + 1;
                    } else {
                        if (cCharAt3 != '+' && cCharAt3 != '-') {
                            throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt3 + "'");
                        }
                        String strSubstring = str.substring(i9);
                        if (strSubstring.length() < 5) {
                            strSubstring = strSubstring + "00";
                        }
                        length = i9 + strSubstring.length();
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
                    gregorianCalendar2.set(1, iM5457c3);
                    gregorianCalendar2.set(2, iM5457c4 - 1);
                    gregorianCalendar2.set(5, iM5457c5);
                    gregorianCalendar2.set(11, i5);
                    gregorianCalendar2.set(12, i6);
                    gregorianCalendar2.set(13, iM5457c2);
                    gregorianCalendar2.set(14, iM5457c);
                    parsePosition.setIndex(length);
                    return gregorianCalendar2.getTime();
                }
                i9 = i11;
                i5 = iM5457c6;
                i6 = iM5457c7;
            } else {
                i5 = 0;
                i6 = 0;
            }
            iM5457c = 0;
            iM5457c2 = 0;
            if (str.length() > i9) {
            }
        } catch (IllegalArgumentException e5) {
            e = e5;
            String str3 = str != null ? null : "\"" + str + '\"';
            message = e.getMessage();
            if (message != null || message.isEmpty()) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException("Failed to parse date [" + str3 + "]: " + message, parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        } catch (IndexOutOfBoundsException e6) {
            e = e6;
            if (str != null) {
            }
            message = e.getMessage();
            if (message != null) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException2 = new ParseException("Failed to parse date [" + str3 + "]: " + message, parsePosition.getIndex());
            parseException2.initCause(e);
            throw parseException2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static int m5457c(int i5, int i6, String str) {
        int i7;
        int i8;
        if (i5 < 0 || i6 > str.length() || i5 > i6) {
            throw new NumberFormatException(str);
        }
        if (i5 < i6) {
            i8 = i5 + 1;
            int iDigit = Character.digit(str.charAt(i5), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i5, i6));
            }
            i7 = -iDigit;
        } else {
            i7 = 0;
            i8 = i5;
        }
        while (i8 < i6) {
            int i9 = i8 + 1;
            int iDigit2 = Character.digit(str.charAt(i8), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i5, i6));
            }
            i7 = (i7 * 10) - iDigit2;
            i8 = i9;
        }
        return -i7;
    }
}
