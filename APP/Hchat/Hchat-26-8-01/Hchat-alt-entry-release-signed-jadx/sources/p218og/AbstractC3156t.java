package p218og;

import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p068eh.AbstractC0921a;
import p136j8.C2104o;
import p222p.AbstractC3199a;
import tf.AbstractC4159f;
import tf.C4153c;

/* JADX INFO: renamed from: og.t */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3156t extends AbstractC3155s {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    public static String m6732V(char[] cArr, int i9, int i10) {
        C4153c c4153c = AbstractC4159f.Companion;
        int length = cArr.length;
        c4153c.getClass();
        if (i9 < 0 || i10 > length) {
            C2104o.m5280e(length, AbstractC0921a.m2256s(i9, i10, "startIndex: ", ", endIndex: ", ", size: "));
            return null;
        }
        if (i9 <= i10) {
            return new String(cArr, i9, i10 - i9);
        }
        C2104o.m5294t(AbstractC3199a.m6837j(i9, "startIndex: ", " > endIndex: ", i10));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    public static boolean m6733W(String str, String str2, boolean z9) {
        str.getClass();
        str2.getClass();
        return !z9 ? str.endsWith(str2) : str.regionMatches(true, str.length() - str2.length(), str2, 0, str2.length());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X */
    public static boolean m6734X(String str, String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public static final boolean m6735Y(String str, int i9, String str2, int i10, int i11, boolean z9) {
        str.getClass();
        str2.getClass();
        return !z9 ? str.regionMatches(i9, str2, i10, i11) : str.regionMatches(z9, i9, str2, i10, i11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    public static String m6736Z(int i9, String str) {
        if (i9 < 0) {
            C2104o.m5279d(i9, "Count 'n' must be non-negative, but was ");
            return null;
        }
        if (i9 == 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        int i10 = 1;
        if (i9 == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (length != 1) {
            StringBuilder sb2 = new StringBuilder(str.length() * i9);
            if (1 <= i9) {
                while (true) {
                    sb2.append((CharSequence) str);
                    if (i10 == i9) {
                        break;
                    }
                    i10++;
                }
            }
            return sb2.toString();
        }
        char cCharAt = str.charAt(0);
        char[] cArr = new char[i9];
        for (int i11 = 0; i11 < i9; i11++) {
            cArr[i11] = cCharAt;
        }
        return new String(cArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a0 */
    public static String m6737a0(String str, String str2, String str3, boolean z9) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        int i9 = 0;
        int iM6716o0 = AbstractC3149m.m6716o0(str, str2, 0, z9);
        if (iM6716o0 < 0) {
            return str;
        }
        int length = str2.length();
        int i10 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        do {
            sb2.append((CharSequence) str, i9, iM6716o0);
            sb2.append(str3);
            i9 = iM6716o0 + length;
            if (iM6716o0 >= str.length()) {
                break;
            }
            iM6716o0 = AbstractC3149m.m6716o0(str, str2, iM6716o0 + i10, z9);
        } while (iM6716o0 > 0);
        sb2.append((CharSequence) str, i9, str.length());
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b0 */
    public static String m6738b0(String str, char c10, char c11) {
        str.getClass();
        String strReplace = str.replace(c10, c11);
        strReplace.getClass();
        return strReplace;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c0 */
    public static boolean m6739c0(String str, String str2, int i9, boolean z9) {
        str.getClass();
        return !z9 ? str.startsWith(str2, i9) : m6735Y(str, i9, str2, 0, str2.length(), z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d0 */
    public static boolean m6740d0(String str, String str2, boolean z9) {
        str.getClass();
        str2.getClass();
        return !z9 ? str.startsWith(str2) : m6735Y(str, 0, str2, 0, str2.length(), z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e0 */
    public static Integer m6741e0(int i9, String str) {
        boolean z9;
        int i10;
        int i11;
        str.getClass();
        AbstractC0000a.m96w(i9);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char cCharAt = str.charAt(0);
        int i13 = -2147483647;
        if (cCharAt < '0') {
            i10 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z9 = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i13 = Integer.MIN_VALUE;
                z9 = true;
            }
        } else {
            z9 = false;
            i10 = 0;
        }
        int i14 = -59652323;
        while (i10 < length) {
            int iDigit = Character.digit((int) str.charAt(i10), i9);
            if (iDigit < 0) {
                return null;
            }
            if ((i12 < i14 && (i14 != -59652323 || i12 < (i14 = i13 / i9))) || (i11 = i12 * i9) < i13 + iDigit) {
                return null;
            }
            i12 = i11 - iDigit;
            i10++;
        }
        return z9 ? Integer.valueOf(i12) : Integer.valueOf(-i12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f0 */
    public static Integer m6742f0(String str) {
        str.getClass();
        return m6741e0(10, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g0 */
    public static Long m6743g0(String str) {
        boolean z9;
        str.getClass();
        AbstractC0000a.m96w(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i9 = 0;
        char cCharAt = str.charAt(0);
        long j3 = -9223372036854775807L;
        if (cCharAt < '0') {
            z9 = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z9 = false;
                i9 = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j3 = Long.MIN_VALUE;
                i9 = 1;
            }
        } else {
            z9 = false;
        }
        long j4 = 0;
        long j5 = -256204778801521550L;
        while (i9 < length) {
            int iDigit = Character.digit((int) str.charAt(i9), 10);
            if (iDigit < 0) {
                return null;
            }
            if (j4 < j5) {
                if (j5 != -256204778801521550L) {
                    return null;
                }
                j5 = j3 / ((long) 10);
                if (j4 < j5) {
                    return null;
                }
            }
            long j10 = j4 * ((long) 10);
            long j11 = iDigit;
            if (j10 < j3 + j11) {
                return null;
            }
            j4 = j10 - j11;
            i9++;
        }
        return z9 ? Long.valueOf(j4) : Long.valueOf(-j4);
    }
}
