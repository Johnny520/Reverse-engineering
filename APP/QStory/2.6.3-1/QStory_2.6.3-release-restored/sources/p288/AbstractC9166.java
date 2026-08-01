package p288;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import net.bytebuddy.pool.TypePool;
import p025.AbstractC7012;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏兰世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9166 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final TimeZone f23340 = TimeZone.getTimeZone("UTC");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static int m14411(int i, int i2, String str) {
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

    /* JADX WARN: Removed duplicated region for block: B:101:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f7 A[Catch: IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, TRY_LEAVE, TryCatch #2 {IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:21:0x005b, B:23:0x006b, B:24:0x006d, B:26:0x0079, B:27:0x007c, B:29:0x0082, B:33:0x008c, B:38:0x009c, B:40:0x00a4, B:41:0x00a8, B:43:0x00ae, B:48:0x00bb, B:51:0x00c6, B:62:0x00f1, B:64:0x00f7, B:90:0x01a9, B:72:0x0109, B:73:0x0124, B:74:0x0125, B:78:0x0142, B:80:0x014f, B:83:0x0158, B:85:0x0177, B:88:0x0186, B:89:0x01a8, B:77:0x0131, B:92:0x01da, B:93:0x01e1, B:55:0x00d6, B:56:0x00d9, B:50:0x00c2), top: B:104:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01da A[Catch: IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, TryCatch #2 {IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:21:0x005b, B:23:0x006b, B:24:0x006d, B:26:0x0079, B:27:0x007c, B:29:0x0082, B:33:0x008c, B:38:0x009c, B:40:0x00a4, B:41:0x00a8, B:43:0x00ae, B:48:0x00bb, B:51:0x00c6, B:62:0x00f1, B:64:0x00f7, B:90:0x01a9, B:72:0x0109, B:73:0x0124, B:74:0x0125, B:78:0x0142, B:80:0x014f, B:83:0x0158, B:85:0x0177, B:88:0x0186, B:89:0x01a8, B:77:0x0131, B:92:0x01da, B:93:0x01e1, B:55:0x00d6, B:56:0x00d9, B:50:0x00c2), top: B:104:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e6  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Date m14412(String str, ParsePosition parsePosition) throws ParseException {
        String message;
        int i;
        int i2;
        int iM14411;
        int iM144112;
        int length;
        char cCharAt;
        int length2;
        try {
            int index = parsePosition.getIndex();
            int i3 = index + 4;
            int iM144113 = m14411(index, i3, str);
            if (m14413(str, i3, SignatureVisitor.SUPER)) {
                i3 = index + 5;
            }
            int i4 = i3 + 2;
            int iM144114 = m14411(i3, i4, str);
            if (m14413(str, i4, SignatureVisitor.SUPER)) {
                i4 = i3 + 3;
            }
            int i5 = i4 + 2;
            int iM144115 = m14411(i4, i5, str);
            boolean zM14413 = m14413(str, i5, 'T');
            if (!zM14413 && str.length() <= i5) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(iM144113, iM144114 - 1, iM144115);
                gregorianCalendar.setLenient(false);
                parsePosition.setIndex(i5);
                return gregorianCalendar.getTime();
            }
            if (zM14413) {
                int i6 = i4 + 5;
                int iM144116 = m14411(i4 + 3, i6, str);
                if (m14413(str, i6, ':')) {
                    i6 = i4 + 6;
                }
                int i7 = i6 + 2;
                int iM144117 = m14411(i6, i7, str);
                if (m14413(str, i7, ':')) {
                    i7 = i6 + 3;
                }
                if (str.length() > i7 && (cCharAt = str.charAt(i7)) != 'Z' && cCharAt != '+' && cCharAt != '-') {
                    int i8 = i7 + 2;
                    iM144112 = m14411(i7, i8, str);
                    if (iM144112 > 59 && iM144112 < 63) {
                        iM144112 = 59;
                    }
                    if (m14413(str, i8, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH)) {
                        int i9 = i7 + 3;
                        for (int i10 = i7 + 4; i10 < str.length(); i10++) {
                            char cCharAt2 = str.charAt(i10);
                            if (cCharAt2 >= '0' && cCharAt2 <= '9') {
                            }
                            length2 = i10;
                        }
                        length2 = str.length();
                        int iMin = Math.min(length2, i7 + 6);
                        iM14411 = m14411(i9, iMin, str);
                        int i11 = iMin - i9;
                        if (i11 == 1) {
                            iM14411 *= 100;
                        } else if (i11 == 2) {
                            iM14411 *= 10;
                        }
                        i = iM144116;
                        i5 = length2;
                        i2 = iM144117;
                    } else {
                        i = iM144116;
                        i5 = i8;
                        i2 = iM144117;
                        iM14411 = 0;
                    }
                    if (str.length() > i5) {
                        throw new IllegalArgumentException("No time zone indicator");
                    }
                    char cCharAt3 = str.charAt(i5);
                    TimeZone timeZone = f23340;
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
                    gregorianCalendar2.set(1, iM144113);
                    gregorianCalendar2.set(2, iM144114 - 1);
                    gregorianCalendar2.set(5, iM144115);
                    gregorianCalendar2.set(11, i);
                    gregorianCalendar2.set(12, i2);
                    gregorianCalendar2.set(13, iM144112);
                    gregorianCalendar2.set(14, iM14411);
                    parsePosition.setIndex(length);
                    return gregorianCalendar2.getTime();
                }
                i5 = i7;
                i = iM144116;
                i2 = iM144117;
            } else {
                i = 0;
                i2 = 0;
            }
            iM14411 = 0;
            iM144112 = 0;
            if (str.length() > i5) {
            }
        } catch (IllegalArgumentException e) {
            e = e;
            String strM12149 = str != null ? null : AbstractC7012.m12149('\"', "\"", str);
            message = e.getMessage();
            if (message != null || message.isEmpty()) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException(AbstractC7012.m12140("Failed to parse date [", strM12149, "]: ", message), parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
            if (str != null) {
            }
            message = e.getMessage();
            if (message != null) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException2 = new ParseException(AbstractC7012.m12140("Failed to parse date [", strM12149, "]: ", message), parsePosition.getIndex());
            parseException2.initCause(e);
            throw parseException2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static boolean m14413(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }
}
