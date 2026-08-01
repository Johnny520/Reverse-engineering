package p244u;

import p000A.C0034R0;
import p029F0.AbstractC0391b0;
import p029F0.InterfaceC0376N;
import p029F0.InterfaceC0378P;
import p029F0.InterfaceC0379Q;
import p041H0.AbstractC0572Q;
import p041H0.InterfaceC0627x;
import p061L2.C0982v;
import p153e1.AbstractC2006b;
import p153e1.AbstractC2013i;
import p153e1.C2005a;
import p153e1.C2016l;
import p169h0.AbstractC2206o;

/* JADX INFO: renamed from: u.k */
/* JADX INFO: loaded from: classes.dex */
public final class C3277k extends AbstractC2206o implements InterfaceC0627x {

    /* JADX INFO: renamed from: r */
    public float f10117r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J0 */
    public final long m5552J0(long j5, boolean z5) {
        int iRound;
        int iM3679g = C2005a.m3679g(j5);
        if (iM3679g == Integer.MAX_VALUE || (iRound = Math.round(iM3679g * this.f10117r)) <= 0) {
            return 0L;
        }
        if (!z5 || AbstractC3261c.m5524k(iRound, iM3679g, j5)) {
            return (((long) iRound) << 32) | (((long) iM3679g) & 4294967295L);
        }
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K0 */
    public final long m5553K0(long j5, boolean z5) {
        int iRound;
        int iM3680h = C2005a.m3680h(j5);
        if (iM3680h == Integer.MAX_VALUE || (iRound = Math.round(iM3680h / this.f10117r)) <= 0) {
            return 0L;
        }
        if (!z5 || AbstractC3261c.m5524k(iM3680h, iRound, j5)) {
            return (((long) iM3680h) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L0 */
    public final long m5554L0(long j5, boolean z5) {
        int iM3681i = C2005a.m3681i(j5);
        int iRound = Math.round(iM3681i * this.f10117r);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z5 || AbstractC3261c.m5524k(iRound, iM3681i, j5)) {
            return (((long) iRound) << 32) | (((long) iM3681i) & 4294967295L);
        }
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M0 */
    public final long m5555M0(long j5, boolean z5) {
        int iM3682j = C2005a.m3682j(j5);
        int iRound = Math.round(iM3682j / this.f10117r);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z5 || AbstractC3261c.m5524k(iM3682j, iRound, j5)) {
            return (((long) iM3682j) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0627x
    /* JADX INFO: renamed from: T */
    public final int mo941T(AbstractC0572Q abstractC0572Q, InterfaceC0376N interfaceC0376N, int i5) {
        return i5 != Integer.MAX_VALUE ? Math.round(i5 / this.f10117r) : interfaceC0376N.mo649f(i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0627x
    /* JADX INFO: renamed from: d */
    public final InterfaceC0378P mo687d(InterfaceC0379Q interfaceC0379Q, InterfaceC0376N interfaceC0376N, long j5) {
        long jM5553K0 = m5553K0(j5, true);
        if (C2016l.m3704a(jM5553K0, 0L)) {
            jM5553K0 = m5552J0(j5, true);
            if (C2016l.m3704a(jM5553K0, 0L)) {
                jM5553K0 = m5555M0(j5, true);
                if (C2016l.m3704a(jM5553K0, 0L)) {
                    jM5553K0 = m5554L0(j5, true);
                    if (C2016l.m3704a(jM5553K0, 0L)) {
                        jM5553K0 = m5553K0(j5, false);
                        if (C2016l.m3704a(jM5553K0, 0L)) {
                            jM5553K0 = m5552J0(j5, false);
                            if (C2016l.m3704a(jM5553K0, 0L)) {
                                jM5553K0 = m5555M0(j5, false);
                                if (C2016l.m3704a(jM5553K0, 0L)) {
                                    jM5553K0 = m5554L0(j5, false);
                                    if (C2016l.m3704a(jM5553K0, 0L)) {
                                        jM5553K0 = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!C2016l.m3704a(jM5553K0, 0L)) {
            int i5 = (int) (jM5553K0 >> 32);
            int i6 = (int) (jM5553K0 & 4294967295L);
            if (!((i6 >= 0) & (i5 >= 0))) {
                AbstractC2013i.m3698a("width and height must be >= 0");
            }
            j5 = AbstractC2006b.m3691h(i5, i5, i6, i6);
        }
        AbstractC0391b0 abstractC0391b0Mo648e = interfaceC0376N.mo648e(j5);
        return interfaceC0379Q.mo604f0(abstractC0391b0Mo648e.f1206d, abstractC0391b0Mo648e.f1207e, C0982v.f3048d, new C0034R0(abstractC0391b0Mo648e, 2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0627x
    /* JADX INFO: renamed from: j */
    public final int mo948j(AbstractC0572Q abstractC0572Q, InterfaceC0376N interfaceC0376N, int i5) {
        return i5 != Integer.MAX_VALUE ? Math.round(i5 * this.f10117r) : interfaceC0376N.mo645T(i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0627x
    /* JADX INFO: renamed from: l0 */
    public final int mo949l0(AbstractC0572Q abstractC0572Q, InterfaceC0376N interfaceC0376N, int i5) {
        return i5 != Integer.MAX_VALUE ? Math.round(i5 / this.f10117r) : interfaceC0376N.mo647Z(i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0627x
    /* JADX INFO: renamed from: w0 */
    public final int mo954w0(AbstractC0572Q abstractC0572Q, InterfaceC0376N interfaceC0376N, int i5) {
        return i5 != Integer.MAX_VALUE ? Math.round(i5 * this.f10117r) : interfaceC0376N.mo646X(i5);
    }
}
