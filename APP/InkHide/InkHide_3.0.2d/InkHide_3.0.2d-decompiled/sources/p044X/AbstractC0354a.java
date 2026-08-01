package p044X;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* JADX INFO: renamed from: X.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0354a {

    /* JADX INFO: renamed from: a */
    public static final TimeZone f829a = TimeZone.getTimeZone("UTC");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static boolean m609a(String str, int i2, char c2) {
        return i2 < str.length() && str.charAt(i2) == c2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fa A[Catch: IllegalArgumentException -> 0x00da, NumberFormatException -> 0x00dd, IndexOutOfBoundsException -> 0x00e0, TRY_LEAVE, TryCatch #2 {IllegalArgumentException -> 0x00da, IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:17:0x0055, B:19:0x0065, B:20:0x0067, B:22:0x0073, B:23:0x0076, B:25:0x007c, B:29:0x0086, B:34:0x0096, B:36:0x009e, B:37:0x00a2, B:39:0x00a8, B:44:0x00b5, B:47:0x00c0, B:64:0x00f4, B:66:0x00fa, B:92:0x01ac, B:74:0x010c, B:75:0x0127, B:76:0x0128, B:80:0x0145, B:82:0x0152, B:85:0x015b, B:87:0x017a, B:90:0x0189, B:91:0x01ab, B:79:0x0134, B:94:0x01dd, B:95:0x01e4, B:51:0x00d0, B:52:0x00d3, B:46:0x00bc), top: B:106:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01dd A[Catch: IllegalArgumentException -> 0x00da, NumberFormatException -> 0x00dd, IndexOutOfBoundsException -> 0x00e0, TryCatch #2 {IllegalArgumentException -> 0x00da, IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:17:0x0055, B:19:0x0065, B:20:0x0067, B:22:0x0073, B:23:0x0076, B:25:0x007c, B:29:0x0086, B:34:0x0096, B:36:0x009e, B:37:0x00a2, B:39:0x00a8, B:44:0x00b5, B:47:0x00c0, B:64:0x00f4, B:66:0x00fa, B:92:0x01ac, B:74:0x010c, B:75:0x0127, B:76:0x0128, B:80:0x0145, B:82:0x0152, B:85:0x015b, B:87:0x017a, B:90:0x0189, B:91:0x01ab, B:79:0x0134, B:94:0x01dd, B:95:0x01e4, B:51:0x00d0, B:52:0x00d3, B:46:0x00bc), top: B:106:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e9  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Date m610b(String str, ParsePosition parsePosition) throws ParseException {
        String message;
        int i2;
        int i3;
        int iM611c;
        int iM611c2;
        int length;
        char cCharAt;
        int length2;
        try {
            int index = parsePosition.getIndex();
            int i4 = index + 4;
            int iM611c3 = m611c(str, index, i4);
            if (m609a(str, i4, '-')) {
                i4 = index + 5;
            }
            int i5 = i4 + 2;
            int iM611c4 = m611c(str, i4, i5);
            if (m609a(str, i5, '-')) {
                i5 = i4 + 3;
            }
            int i6 = i5 + 2;
            int iM611c5 = m611c(str, i5, i6);
            boolean zM609a = m609a(str, i6, 'T');
            if (!zM609a && str.length() <= i6) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(iM611c3, iM611c4 - 1, iM611c5);
                gregorianCalendar.setLenient(false);
                parsePosition.setIndex(i6);
                return gregorianCalendar.getTime();
            }
            if (zM609a) {
                int i7 = i5 + 5;
                int iM611c6 = m611c(str, i5 + 3, i7);
                if (m609a(str, i7, ':')) {
                    i7 = i5 + 6;
                }
                int i8 = i7 + 2;
                int iM611c7 = m611c(str, i7, i8);
                if (m609a(str, i8, ':')) {
                    i8 = i7 + 3;
                }
                if (str.length() > i8 && (cCharAt = str.charAt(i8)) != 'Z' && cCharAt != '+' && cCharAt != '-') {
                    int i9 = i8 + 2;
                    iM611c2 = m611c(str, i8, i9);
                    if (iM611c2 > 59 && iM611c2 < 63) {
                        iM611c2 = 59;
                    }
                    if (m609a(str, i9, '.')) {
                        int i10 = i8 + 3;
                        for (int i11 = i8 + 4; i11 < str.length(); i11++) {
                            char cCharAt2 = str.charAt(i11);
                            if (cCharAt2 >= '0' && cCharAt2 <= '9') {
                            }
                            length2 = i11;
                        }
                        length2 = str.length();
                        int iMin = Math.min(length2, i8 + 6);
                        iM611c = m611c(str, i10, iMin);
                        int i12 = iMin - i10;
                        if (i12 == 1) {
                            iM611c *= 100;
                        } else if (i12 == 2) {
                            iM611c *= 10;
                        }
                        i2 = iM611c6;
                        i6 = length2;
                        i3 = iM611c7;
                    } else {
                        i2 = iM611c6;
                        i6 = i9;
                        i3 = iM611c7;
                        iM611c = 0;
                    }
                    if (str.length() > i6) {
                        throw new IllegalArgumentException("No time zone indicator");
                    }
                    char cCharAt3 = str.charAt(i6);
                    TimeZone timeZone = f829a;
                    if (cCharAt3 == 'Z') {
                        length = i6 + 1;
                    } else {
                        if (cCharAt3 != '+' && cCharAt3 != '-') {
                            throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt3 + "'");
                        }
                        String strSubstring = str.substring(i6);
                        if (strSubstring.length() < 5) {
                            strSubstring = strSubstring + "00";
                        }
                        length = i6 + strSubstring.length();
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
                    gregorianCalendar2.set(1, iM611c3);
                    gregorianCalendar2.set(2, iM611c4 - 1);
                    gregorianCalendar2.set(5, iM611c5);
                    gregorianCalendar2.set(11, i2);
                    gregorianCalendar2.set(12, i3);
                    gregorianCalendar2.set(13, iM611c2);
                    gregorianCalendar2.set(14, iM611c);
                    parsePosition.setIndex(length);
                    return gregorianCalendar2.getTime();
                }
                i6 = i8;
                i2 = iM611c6;
                i3 = iM611c7;
            } else {
                i2 = 0;
                i3 = 0;
            }
            iM611c = 0;
            iM611c2 = 0;
            if (str.length() > i6) {
            }
        } catch (IllegalArgumentException e2) {
            e = e2;
            String str3 = str == null ? null : "\"" + str + '\"';
            message = e.getMessage();
            if (message == null || message.isEmpty()) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException("Failed to parse date [" + str3 + "]: " + message, parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        } catch (IndexOutOfBoundsException e3) {
            e = e3;
            if (str == null) {
            }
            message = e.getMessage();
            if (message == null) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException2 = new ParseException("Failed to parse date [" + str3 + "]: " + message, parsePosition.getIndex());
            parseException2.initCause(e);
            throw parseException2;
        } catch (NumberFormatException e4) {
            e = e4;
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static int m611c(String str, int i2, int i3) {
        int i4;
        int i5;
        if (i2 < 0 || i3 > str.length() || i2 > i3) {
            throw new NumberFormatException(str);
        }
        if (i2 < i3) {
            i5 = i2 + 1;
            int iDigit = Character.digit(str.charAt(i2), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i2, i3));
            }
            i4 = -iDigit;
        } else {
            i4 = 0;
            i5 = i2;
        }
        while (i5 < i3) {
            int i6 = i5 + 1;
            int iDigit2 = Character.digit(str.charAt(i5), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i2, i3));
            }
            i4 = (i4 * 10) - iDigit2;
            i5 = i6;
        }
        return -i4;
    }
}
