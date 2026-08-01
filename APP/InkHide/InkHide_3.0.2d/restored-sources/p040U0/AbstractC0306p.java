package p040U0;

import p006D.AbstractC0079h;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: U0.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0306p extends AbstractC0305o {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    public static Integer m530Z(String str) {
        boolean z2;
        int i2;
        AbstractC0223g.m418e(str, "<this>");
        AbstractC0079h.m181e(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char cCharAt = str.charAt(0);
        int i4 = 1;
        int i5 = -2147483647;
        if ((cCharAt < '0' ? (byte) -1 : cCharAt == '0' ? (byte) 0 : (byte) 1) >= 0) {
            z2 = false;
            i4 = 0;
        } else {
            if (length == 1) {
                return null;
            }
            if (cCharAt == '-') {
                i5 = Integer.MIN_VALUE;
                z2 = true;
            } else {
                if (cCharAt != '+') {
                    return null;
                }
                z2 = false;
            }
        }
        int i6 = -59652323;
        while (i4 < length) {
            int iDigit = Character.digit((int) str.charAt(i4), 10);
            if (iDigit < 0) {
                return null;
            }
            if ((i3 < i6 && (i6 != -59652323 || i3 < (i6 = i5 / 10))) || (i2 = i3 * 10) < i5 + iDigit) {
                return null;
            }
            i3 = i2 - iDigit;
            i4++;
        }
        return z2 ? Integer.valueOf(i3) : Integer.valueOf(-i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a0 */
    public static Long m531a0(String str) {
        AbstractC0079h.m181e(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        boolean z2 = true;
        long j2 = -9223372036854775807L;
        if ((cCharAt < '0' ? (byte) -1 : cCharAt == '0' ? (byte) 0 : (byte) 1) >= 0) {
            z2 = false;
        } else {
            if (length == 1) {
                return null;
            }
            if (cCharAt == '-') {
                j2 = Long.MIN_VALUE;
                i2 = 1;
            } else {
                if (cCharAt != '+') {
                    return null;
                }
                z2 = false;
                i2 = 1;
            }
        }
        long j3 = -256204778801521550L;
        long j4 = 0;
        long j5 = -256204778801521550L;
        while (i2 < length) {
            int iDigit = Character.digit((int) str.charAt(i2), 10);
            if (iDigit < 0) {
                return null;
            }
            if (j4 < j5) {
                if (j5 != j3) {
                    return null;
                }
                j5 = j2 / ((long) 10);
                if (j4 < j5) {
                    return null;
                }
            }
            long j6 = j4 * ((long) 10);
            long j7 = iDigit;
            if (j6 < j2 + j7) {
                return null;
            }
            j4 = j6 - j7;
            i2++;
            j3 = -256204778801521550L;
        }
        return z2 ? Long.valueOf(j4) : Long.valueOf(-j4);
    }
}
