package p319w2;

import p030c3.AbstractC1314a;

/* JADX INFO: renamed from: w2.u3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9142u3 {
    /* JADX INFO: renamed from: a */
    public static final long m35529a(int i10) {
        return m35530b(i10, i10);
    }

    /* JADX INFO: renamed from: b */
    public static final long m35530b(int i10, int i11) {
        return C9137t3.m35512c(m35532d(i10, i11));
    }

    /* JADX INFO: renamed from: c */
    public static final long m35531c(long j10, int i10, int i11) {
        int iM35523n = C9137t3.m35523n(j10);
        if (iM35523n < i10) {
            iM35523n = i10;
        }
        if (iM35523n > i11) {
            iM35523n = i11;
        }
        int iM35518i = C9137t3.m35518i(j10);
        if (iM35518i >= i10) {
            i10 = iM35518i;
        }
        if (i10 <= i11) {
            i11 = i10;
        }
        return (iM35523n == C9137t3.m35523n(j10) && i11 == C9137t3.m35518i(j10)) ? j10 : m35530b(iM35523n, i11);
    }

    /* JADX INFO: renamed from: d */
    public static final long m35532d(int i10, int i11) {
        if (!(i10 >= 0 && i11 >= 0)) {
            AbstractC1314a.m5291a("start and end cannot be negative. [start: " + i10 + ", end: " + i11 + ']');
        }
        return (((long) i11) & 4294967295L) | (((long) i10) << 32);
    }

    /* JADX INFO: renamed from: e */
    public static final String m35533e(CharSequence charSequence, long j10) {
        return charSequence.subSequence(C9137t3.m35521l(j10), C9137t3.m35520k(j10)).toString();
    }
}
