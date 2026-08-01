package p299ub;

import okhttp3.internal.http2.Settings;
import p024b9.AbstractC1061t;
import p172l8.AbstractC4704k0;
import p172l8.C4684a0;
import p172l8.C4688c0;
import p172l8.C4694f0;
import p172l8.C4718y;
import p215oc.C5706c;

/* JADX INFO: renamed from: ub.i0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8627i0 {
    /* JADX INFO: renamed from: a */
    public static final String m33187a(long j10, int i10) {
        return AbstractC4704k0.m18786d(j10, AbstractC8610a.m33053a(i10));
    }

    /* JADX INFO: renamed from: b */
    public static final byte m33188b(String str) {
        str.getClass();
        C4718y c4718yM33189c = m33189c(str);
        if (c4718yM33189c != null) {
            return c4718yM33189c.m18822k();
        }
        AbstractC8644z.m33251r(str);
        C5706c.m23089a();
        return (byte) 0;
    }

    /* JADX INFO: renamed from: c */
    public static final C4718y m33189c(String str) {
        str.getClass();
        return m33190d(str, 10);
    }

    /* JADX INFO: renamed from: d */
    public static final C4718y m33190d(String str, int i10) {
        str.getClass();
        C4684a0 c4684a0M33193g = m33193g(str, i10);
        if (c4684a0M33193g == null) {
            return null;
        }
        int iM18707j = c4684a0M33193g.m18707j();
        if (Integer.compareUnsigned(iM18707j, C4684a0.m18703c(255)) > 0) {
            return null;
        }
        return C4718y.m18816a(C4718y.m18817c((byte) iM18707j));
    }

    /* JADX INFO: renamed from: e */
    public static final int m33191e(String str) {
        str.getClass();
        C4684a0 c4684a0M33192f = m33192f(str);
        if (c4684a0M33192f != null) {
            return c4684a0M33192f.m18707j();
        }
        AbstractC8644z.m33251r(str);
        C5706c.m23089a();
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public static final C4684a0 m33192f(String str) {
        str.getClass();
        return m33193g(str, 10);
    }

    /* JADX INFO: renamed from: g */
    public static final C4684a0 m33193g(String str, int i10) {
        int i11;
        str.getClass();
        AbstractC8610a.m33053a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char cCharAt = str.charAt(0);
        if (AbstractC1061t.m3843d(cCharAt, 48) < 0) {
            i11 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i11 = 0;
        }
        int iM18703c = C4684a0.m18703c(i10);
        int iDivideUnsigned = 119304647;
        while (i11 < length) {
            int iM33054b = AbstractC8610a.m33054b(str.charAt(i11), i10);
            if (iM33054b < 0) {
                return null;
            }
            if (Integer.compareUnsigned(i12, iDivideUnsigned) > 0) {
                if (iDivideUnsigned == 119304647) {
                    iDivideUnsigned = Integer.divideUnsigned(-1, iM18703c);
                    if (Integer.compareUnsigned(i12, iDivideUnsigned) > 0) {
                    }
                }
                return null;
            }
            int iM18703c2 = C4684a0.m18703c(i12 * iM18703c);
            int iM18703c3 = C4684a0.m18703c(C4684a0.m18703c(iM33054b) + iM18703c2);
            if (Integer.compareUnsigned(iM18703c3, iM18703c2) < 0) {
                return null;
            }
            i11++;
            i12 = iM18703c3;
        }
        return C4684a0.m18702a(i12);
    }

    /* JADX INFO: renamed from: h */
    public static final long m33194h(String str) {
        str.getClass();
        C4688c0 c4688c0M33195i = m33195i(str);
        if (c4688c0M33195i != null) {
            return c4688c0M33195i.m18734k();
        }
        AbstractC8644z.m33251r(str);
        C5706c.m23089a();
        return 0L;
    }

    /* JADX INFO: renamed from: i */
    public static final C4688c0 m33195i(String str) {
        str.getClass();
        return m33196j(str, 10);
    }

    /* JADX INFO: renamed from: j */
    public static final C4688c0 m33196j(String str, int i10) {
        str.getClass();
        AbstractC8610a.m33053a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char cCharAt = str.charAt(0);
        if (AbstractC1061t.m3843d(cCharAt, 48) < 0) {
            i11 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long jM18729c = C4688c0.m18729c(i10);
        long j10 = 0;
        long jDivideUnsigned = 512409557603043100L;
        while (i11 < length) {
            int iM33054b = AbstractC8610a.m33054b(str.charAt(i11), i10);
            if (iM33054b < 0) {
                return null;
            }
            if (Long.compareUnsigned(j10, jDivideUnsigned) > 0) {
                if (jDivideUnsigned == 512409557603043100L) {
                    jDivideUnsigned = Long.divideUnsigned(-1L, jM18729c);
                    if (Long.compareUnsigned(j10, jDivideUnsigned) > 0) {
                    }
                }
                return null;
            }
            long jM18729c2 = C4688c0.m18729c(j10 * jM18729c);
            long jM18729c3 = C4688c0.m18729c(C4688c0.m18729c(((long) C4684a0.m18703c(iM33054b)) & 4294967295L) + jM18729c2);
            if (Long.compareUnsigned(jM18729c3, jM18729c2) < 0) {
                return null;
            }
            i11++;
            j10 = jM18729c3;
        }
        return C4688c0.m18728a(j10);
    }

    /* JADX INFO: renamed from: k */
    public static final short m33197k(String str) {
        str.getClass();
        C4694f0 c4694f0M33198l = m33198l(str);
        if (c4694f0M33198l != null) {
            return c4694f0M33198l.m18761j();
        }
        AbstractC8644z.m33251r(str);
        C5706c.m23089a();
        return (short) 0;
    }

    /* JADX INFO: renamed from: l */
    public static final C4694f0 m33198l(String str) {
        str.getClass();
        return m33199m(str, 10);
    }

    /* JADX INFO: renamed from: m */
    public static final C4694f0 m33199m(String str, int i10) {
        str.getClass();
        C4684a0 c4684a0M33193g = m33193g(str, i10);
        if (c4684a0M33193g == null) {
            return null;
        }
        int iM18707j = c4684a0M33193g.m18707j();
        if (Integer.compareUnsigned(iM18707j, C4684a0.m18703c(Settings.DEFAULT_INITIAL_WINDOW_SIZE)) > 0) {
            return null;
        }
        return C4694f0.m18756a(C4694f0.m18757c((short) iM18707j));
    }
}
