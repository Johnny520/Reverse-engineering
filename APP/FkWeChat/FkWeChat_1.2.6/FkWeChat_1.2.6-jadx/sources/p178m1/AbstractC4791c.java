package p178m1;

import p117i.C3082r0;
import p277t2.C8064c0;
import p277t2.C8086o;
import p277t2.C8087p;

/* JADX INFO: renamed from: m1.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4791c {
    /* JADX INFO: renamed from: d */
    public static final boolean m19199d(C8087p c8087p) {
        C3082r0 c3082r0M31256t = c8087p.m31256t();
        C8086o c8086o = C8086o.f26998a;
        return c3082r0M31256t.m11235b(c8086o.m31231k()) || c8087p.m31256t().m11235b(c8086o.m31233m());
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m19200e(C8087p c8087p) {
        return c8087p.m31256t().m11235b(C8064c0.f26891a.m31022e());
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m19201f(C8087p c8087p) {
        C3082r0 c3082r0M31256t = c8087p.m31256t();
        C8086o c8086o = C8086o.f26998a;
        if (c3082r0M31256t.m11235b(c8086o.m31231k()) || c8087p.m31256t().m11235b(c8086o.m31233m())) {
            return true;
        }
        C3082r0 c3082r0M31256t2 = c8087p.m31256t();
        C8064c0 c8064c0 = C8064c0.f26891a;
        return c3082r0M31256t2.m11235b(c8064c0.m31022e()) || c8087p.m31256t().m11235b(c8064c0.m31020c());
    }
}
