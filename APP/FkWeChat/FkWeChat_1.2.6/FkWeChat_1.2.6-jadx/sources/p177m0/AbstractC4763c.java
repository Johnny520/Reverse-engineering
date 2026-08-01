package p177m0;

import p015b0.AbstractC0783i3;
import p080f9.AbstractC2368o;
import p104h3.AbstractC2869v;
import p121i3.C3173c;

/* JADX INFO: renamed from: m0.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4763c {
    /* JADX INFO: renamed from: a */
    public static final long m19047a(long j10, boolean z10, int i10, float f10) {
        return C3173c.f8451b.m11980b(0, m19049c(j10, z10, i10, f10), 0, C3173c.m11972k(j10));
    }

    /* JADX INFO: renamed from: b */
    public static final int m19048b(boolean z10, int i10, int i11) {
        if (z10 || !m19050d(i10)) {
            return AbstractC2368o.m8578e(i11, 1);
        }
        return 1;
    }

    /* JADX INFO: renamed from: c */
    public static final int m19049c(long j10, boolean z10, int i10, float f10) {
        int iM11973l = ((z10 || m19050d(i10)) && C3173c.m11969h(j10)) ? C3173c.m11973l(j10) : Integer.MAX_VALUE;
        return C3173c.m11975n(j10) == iM11973l ? iM11973l : AbstractC2368o.m8586m(AbstractC0783i3.m2945a(f10), C3173c.m11975n(j10), iM11973l);
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m19050d(int i10) {
        AbstractC2869v.a aVar = AbstractC2869v.f7516a;
        return AbstractC2869v.m10303g(i10, aVar.m10307b()) || AbstractC2869v.m10303g(i10, aVar.m10309d()) || AbstractC2869v.m10303g(i10, aVar.m10308c());
    }
}
