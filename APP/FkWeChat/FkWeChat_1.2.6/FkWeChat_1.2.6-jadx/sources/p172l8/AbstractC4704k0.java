package p172l8;

import p024b9.AbstractC1061t;
import p299ub.AbstractC8610a;

/* JADX INFO: renamed from: l8.k0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4704k0 {
    /* JADX INFO: renamed from: a */
    public static final int m18783a(int i10, int i11) {
        return AbstractC1061t.m3843d(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: b */
    public static final int m18784b(long j10, long j11) {
        return AbstractC1061t.m3844e(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE);
    }

    /* JADX INFO: renamed from: c */
    public static final double m18785c(long j10) {
        return ((j10 >>> 11) * ((double) 2048)) + (j10 & 2047);
    }

    /* JADX INFO: renamed from: d */
    public static final String m18786d(long j10, int i10) {
        if (j10 >= 0) {
            String string = Long.toString(j10, AbstractC8610a.m33053a(i10));
            string.getClass();
            return string;
        }
        long j11 = i10;
        long j12 = ((j10 >>> 1) / j11) << 1;
        long j13 = j10 - (j12 * j11);
        if (j13 >= j11) {
            j13 -= j11;
            j12++;
        }
        StringBuilder sb2 = new StringBuilder();
        String string2 = Long.toString(j12, AbstractC8610a.m33053a(i10));
        string2.getClass();
        sb2.append(string2);
        String string3 = Long.toString(j13, AbstractC8610a.m33053a(i10));
        string3.getClass();
        sb2.append(string3);
        return sb2.toString();
    }
}
