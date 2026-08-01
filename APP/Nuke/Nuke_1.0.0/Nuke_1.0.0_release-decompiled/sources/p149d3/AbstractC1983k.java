package p149d3;

import com.bumptech.glide.AbstractC1926h;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: d3.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1983k extends AbstractC1982j {
    /* JADX INFO: renamed from: M */
    public static boolean m3650M(String str, String str2) {
        AbstractC1665j.m2985e(str, "<this>");
        return str.endsWith(str2);
    }

    /* JADX INFO: renamed from: N */
    public static boolean m3651N(String str, int i5, String str2, int i6, int i7, boolean z5) {
        AbstractC1665j.m2985e(str, "<this>");
        AbstractC1665j.m2985e(str2, "other");
        return !z5 ? str.regionMatches(i5, str2, i6, i7) : str.regionMatches(z5, i5, str2, i6, i7);
    }

    /* JADX INFO: renamed from: O */
    public static String m3652O(String str, int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i5 + '.').toString());
        }
        if (i5 == 0) {
            return "";
        }
        int i6 = 1;
        if (i5 == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = str.charAt(0);
            char[] cArr = new char[i5];
            for (int i7 = 0; i7 < i5; i7++) {
                cArr[i7] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(str.length() * i5);
        if (1 <= i5) {
            while (true) {
                sb.append((CharSequence) str);
                if (i6 == i5) {
                    break;
                }
                i6++;
            }
        }
        String string = sb.toString();
        AbstractC1665j.m2982b(string);
        return string;
    }

    /* JADX INFO: renamed from: P */
    public static String m3653P(String str, char c5, char c6) {
        AbstractC1665j.m2985e(str, "<this>");
        String strReplace = str.replace(c5, c6);
        AbstractC1665j.m2984d(strReplace, "replace(...)");
        return strReplace;
    }

    /* JADX INFO: renamed from: Q */
    public static String m3654Q(String str, String str2, String str3) {
        AbstractC1665j.m2985e(str, "<this>");
        int iM3633a0 = AbstractC1976d.m3633a0(str, str2, 0, false);
        if (iM3633a0 < 0) {
            return str;
        }
        int length = str2.length();
        int i5 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i6 = 0;
        do {
            sb.append((CharSequence) str, i6, iM3633a0);
            sb.append(str3);
            i6 = iM3633a0 + length;
            if (iM3633a0 >= str.length()) {
                break;
            }
            iM3633a0 = AbstractC1976d.m3633a0(str, str2, iM3633a0 + i5, false);
        } while (iM3633a0 > 0);
        sb.append((CharSequence) str, i6, str.length());
        String string = sb.toString();
        AbstractC1665j.m2984d(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: R */
    public static boolean m3655R(String str, String str2, int i5, boolean z5) {
        AbstractC1665j.m2985e(str, "<this>");
        return !z5 ? str.startsWith(str2, i5) : m3651N(str, i5, str2, 0, str2.length(), z5);
    }

    /* JADX INFO: renamed from: S */
    public static boolean m3656S(String str, String str2, boolean z5) {
        AbstractC1665j.m2985e(str, "<this>");
        AbstractC1665j.m2985e(str2, "prefix");
        return !z5 ? str.startsWith(str2) : m3651N(str, 0, str2, 0, str2.length(), z5);
    }

    /* JADX INFO: renamed from: T */
    public static Integer m3657T(String str) {
        boolean z5;
        int i5;
        int i6;
        AbstractC1665j.m2985e(str, "<this>");
        AbstractC1926h.m3565h(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i7 = 0;
        char cCharAt = str.charAt(0);
        int i8 = -2147483647;
        if (AbstractC1665j.m2987g(cCharAt, 48) < 0) {
            i5 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z5 = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i8 = Integer.MIN_VALUE;
                z5 = true;
            }
        } else {
            z5 = false;
            i5 = 0;
        }
        int i9 = -59652323;
        while (i5 < length) {
            int iDigit = Character.digit((int) str.charAt(i5), 10);
            if (iDigit < 0) {
                return null;
            }
            if ((i7 < i9 && (i9 != -59652323 || i7 < (i9 = i8 / 10))) || (i6 = i7 * 10) < i8 + iDigit) {
                return null;
            }
            i7 = i6 - iDigit;
            i5++;
        }
        return z5 ? Integer.valueOf(i7) : Integer.valueOf(-i7);
    }

    /* JADX INFO: renamed from: U */
    public static Long m3658U(String str, int i5) {
        boolean z5;
        AbstractC1665j.m2985e(str, "<this>");
        AbstractC1926h.m3565h(i5);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i6 = 0;
        char cCharAt = str.charAt(0);
        long j5 = -9223372036854775807L;
        if (AbstractC1665j.m2987g(cCharAt, 48) < 0) {
            z5 = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z5 = false;
                i6 = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j5 = Long.MIN_VALUE;
                i6 = 1;
            }
        } else {
            z5 = false;
        }
        long j6 = 0;
        long j7 = -256204778801521550L;
        while (i6 < length) {
            int iDigit = Character.digit((int) str.charAt(i6), i5);
            if (iDigit < 0) {
                return null;
            }
            if (j6 < j7) {
                if (j7 != -256204778801521550L) {
                    return null;
                }
                j7 = j5 / ((long) i5);
                if (j6 < j7) {
                    return null;
                }
            }
            long j8 = j6 * ((long) i5);
            long j9 = iDigit;
            if (j8 < j5 + j9) {
                return null;
            }
            j6 = j8 - j9;
            i6++;
        }
        return z5 ? Long.valueOf(j6) : Long.valueOf(-j6);
    }
}
