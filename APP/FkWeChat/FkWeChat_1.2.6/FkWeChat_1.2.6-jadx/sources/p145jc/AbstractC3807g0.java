package p145jc;

import p299ub.AbstractC8644z;

/* JADX INFO: renamed from: jc.g0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3807g0 {
    /* JADX INFO: renamed from: a */
    public static final int m15163a(String str, int i10, int i11, int i12) {
        return (int) AbstractC3803e0.m15154c(str, i10, i11, i12);
    }

    /* JADX INFO: renamed from: b */
    public static final long m15164b(String str, long j10, long j11, long j12) {
        String strM15155d = AbstractC3803e0.m15155d(str);
        if (strM15155d == null) {
            return j10;
        }
        Long lM33254u = AbstractC8644z.m33254u(strM15155d);
        if (lM33254u == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + strM15155d + '\'').toString());
        }
        long jLongValue = lM33254u.longValue();
        if (j11 <= jLongValue && jLongValue <= j12) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j11 + ".." + j12 + ", but is '" + jLongValue + '\'').toString());
    }

    /* JADX INFO: renamed from: c */
    public static final String m15165c(String str, String str2) {
        String strM15155d = AbstractC3803e0.m15155d(str);
        return strM15155d == null ? str2 : strM15155d;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m15166d(String str, boolean z10) {
        String strM15155d = AbstractC3803e0.m15155d(str);
        return strM15155d != null ? Boolean.parseBoolean(strM15155d) : z10;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ int m15167e(String str, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i11 = 1;
        }
        if ((i13 & 8) != 0) {
            i12 = Integer.MAX_VALUE;
        }
        return AbstractC3803e0.m15153b(str, i10, i11, i12);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ long m15168f(String str, long j10, long j11, long j12, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j11 = 1;
        }
        long j13 = j11;
        if ((i10 & 8) != 0) {
            j12 = Long.MAX_VALUE;
        }
        return AbstractC3803e0.m15154c(str, j10, j13, j12);
    }
}
