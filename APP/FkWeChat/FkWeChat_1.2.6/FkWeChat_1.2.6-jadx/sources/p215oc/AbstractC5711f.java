package p215oc;

import p376zd.C10010p0;

/* JADX INFO: renamed from: oc.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5711f {
    /* JADX INFO: renamed from: a */
    public static final long m23128a(C5708d c5708d, byte b10, long j10, long j11) {
        long jM23150j;
        long j12;
        c5708d.getClass();
        long jMin = Math.min(j11, c5708d.m23111j());
        AbstractC5709d0.m23124a(c5708d.m23111j(), j10, jMin);
        if (j10 == jMin || c5708d.m23109h() == null) {
            return -1L;
        }
        if (c5708d.m23111j() - j10 < j10) {
            C5721p c5721pM23113l = c5708d.m23113l();
            jM23150j = c5708d.m23111j();
            while (c5721pM23113l != null && jM23150j > j10) {
                jM23150j -= (long) (c5721pM23113l.m23144d() - c5721pM23113l.m23146f());
                if (jM23150j <= j10) {
                    break;
                }
                c5721pM23113l = c5721pM23113l.m23147g();
            }
            if (jM23150j == -1) {
                return -1L;
            }
            while (jMin > jM23150j) {
                c5721pM23113l.getClass();
                int iM23169a = AbstractC5723r.m23169a(c5721pM23113l, b10, Math.max((int) (j10 - jM23150j), 0), Math.min(c5721pM23113l.m23150j(), (int) (jMin - jM23150j)));
                if (iM23169a != -1) {
                    j12 = iM23169a;
                    return jM23150j + j12;
                }
                jM23150j += (long) c5721pM23113l.m23150j();
                c5721pM23113l = c5721pM23113l.m23145e();
                if (c5721pM23113l == null || jM23150j >= jMin) {
                    return -1L;
                }
            }
            C10010p0.m38820a("Check failed.");
            return 0L;
        }
        C5721p c5721pM23109h = c5708d.m23109h();
        jM23150j = 0;
        while (c5721pM23109h != null) {
            long jM23144d = ((long) (c5721pM23109h.m23144d() - c5721pM23109h.m23146f())) + jM23150j;
            if (jM23144d > j10) {
                break;
            }
            c5721pM23109h = c5721pM23109h.m23145e();
            jM23150j = jM23144d;
        }
        if (jM23150j == -1) {
            return -1L;
        }
        while (jMin > jM23150j) {
            c5721pM23109h.getClass();
            int iM23169a2 = AbstractC5723r.m23169a(c5721pM23109h, b10, Math.max((int) (j10 - jM23150j), 0), Math.min(c5721pM23109h.m23150j(), (int) (jMin - jM23150j)));
            if (iM23169a2 != -1) {
                j12 = iM23169a2;
                return jM23150j + j12;
            }
            jM23150j += (long) c5721pM23109h.m23150j();
            c5721pM23109h = c5721pM23109h.m23145e();
            if (c5721pM23109h == null || jM23150j >= jMin) {
                return -1L;
            }
        }
        C10010p0.m38820a("Check failed.");
        return 0L;
    }
}
