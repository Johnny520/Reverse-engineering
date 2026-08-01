package p299ub;

import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: ub.z */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8644z extends AbstractC8643y {
    /* JADX INFO: renamed from: r */
    public static final Void m33251r(String str) {
        str.getClass();
        throw new NumberFormatException("Invalid number format: '" + str + '\'');
    }

    /* JADX INFO: renamed from: s */
    public static Integer m33252s(String str) {
        str.getClass();
        return m33253t(str, 10);
    }

    /* JADX INFO: renamed from: t */
    public static final Integer m33253t(String str, int i10) {
        boolean z10;
        int i11;
        int i12;
        str.getClass();
        AbstractC8610a.m33053a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i13 = 0;
        char cCharAt = str.charAt(0);
        int i14 = -2147483647;
        if (AbstractC1061t.m3843d(cCharAt, 48) < 0) {
            i11 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z10 = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i14 = Integer.MIN_VALUE;
                z10 = true;
            }
        } else {
            z10 = false;
            i11 = 0;
        }
        int i15 = -59652323;
        while (i11 < length) {
            int iM33054b = AbstractC8610a.m33054b(str.charAt(i11), i10);
            if (iM33054b < 0) {
                return null;
            }
            if ((i13 < i15 && (i15 != -59652323 || i13 < (i15 = i14 / i10))) || (i12 = i13 * i10) < i14 + iM33054b) {
                return null;
            }
            i13 = i12 - iM33054b;
            i11++;
        }
        return z10 ? Integer.valueOf(i13) : Integer.valueOf(-i13);
    }

    /* JADX INFO: renamed from: u */
    public static Long m33254u(String str) {
        str.getClass();
        return m33255v(str, 10);
    }

    /* JADX INFO: renamed from: v */
    public static final Long m33255v(String str, int i10) {
        boolean z10;
        str.getClass();
        AbstractC8610a.m33053a(i10);
        int length = str.length();
        Long l10 = null;
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char cCharAt = str.charAt(0);
        long j10 = -9223372036854775807L;
        if (AbstractC1061t.m3843d(cCharAt, 48) < 0) {
            z10 = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z10 = false;
                i11 = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j10 = Long.MIN_VALUE;
                i11 = 1;
            }
        } else {
            z10 = false;
        }
        long j11 = 0;
        long j12 = -256204778801521550L;
        while (i11 < length) {
            int iM33054b = AbstractC8610a.m33054b(str.charAt(i11), i10);
            if (iM33054b < 0) {
                return l10;
            }
            if (j11 < j12) {
                if (j12 != -256204778801521550L) {
                    return l10;
                }
                j12 = j10 / ((long) i10);
                if (j11 < j12) {
                    return l10;
                }
            }
            Long l11 = l10;
            int i12 = i11;
            long j13 = j11 * ((long) i10);
            long j14 = iM33054b;
            if (j13 < j10 + j14) {
                return l11;
            }
            j11 = j13 - j14;
            i11 = i12 + 1;
            l10 = l11;
        }
        return z10 ? Long.valueOf(j11) : Long.valueOf(-j11);
    }
}
