package p274t;

import p010a9.InterfaceC0184l;
import p121i3.C3173c;
import p121i3.C3189s;
import p135j2.AbstractC3545l1;
import p135j2.InterfaceC3552n0;
import p135j2.InterfaceC3558p0;
import p135j2.InterfaceC3561q0;
import p135j2.InterfaceC3563r;
import p135j2.InterfaceC3566s;
import p165l1.InterfaceC4507m;
import p166l2.InterfaceC4534e0;
import p172l8.C4700i0;

/* JADX INFO: renamed from: t.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7844i extends InterfaceC4507m.c implements InterfaceC4534e0 {

    /* JADX INFO: renamed from: F */
    public float f26162F;

    /* JADX INFO: renamed from: G */
    public boolean f26163G;

    public C7844i(float f10, boolean z10) {
        this.f26162F = f10;
        this.f26163G = z10;
    }

    /* JADX INFO: renamed from: G2 */
    public static C4700i0 m30382G2(AbstractC3545l1 abstractC3545l1, AbstractC3545l1.a aVar) {
        AbstractC3545l1.a.m13270O(aVar, abstractC3545l1, 0, 0, 0.0f, 4, null);
        return C4700i0.f13910a;
    }

    @Override // p166l2.InterfaceC4534e0
    /* JADX INFO: renamed from: G */
    public int mo15345G(InterfaceC3566s interfaceC3566s, InterfaceC3563r interfaceC3563r, int i10) {
        return i10 != Integer.MAX_VALUE ? Math.round(i10 / this.f26162F) : interfaceC3563r.mo13151z0(i10);
    }

    /* JADX INFO: renamed from: H2 */
    public final long m30383H2(long j10) {
        if (this.f26163G) {
            long jM30386K2 = m30386K2(j10, true);
            C3189s.a aVar = C3189s.f8481b;
            if (!C3189s.m12084e(jM30386K2, aVar.m12088a())) {
                return jM30386K2;
            }
            long jM30387L2 = m30387L2(j10, true);
            if (!C3189s.m12084e(jM30387L2, aVar.m12088a())) {
                return jM30387L2;
            }
            long jM30388M2 = m30388M2(j10, true);
            if (!C3189s.m12084e(jM30388M2, aVar.m12088a())) {
                return jM30388M2;
            }
            long jM30389N2 = m30389N2(j10, true);
            if (!C3189s.m12084e(jM30389N2, aVar.m12088a())) {
                return jM30389N2;
            }
            long jM30386K22 = m30386K2(j10, false);
            if (!C3189s.m12084e(jM30386K22, aVar.m12088a())) {
                return jM30386K22;
            }
            long jM30387L22 = m30387L2(j10, false);
            if (!C3189s.m12084e(jM30387L22, aVar.m12088a())) {
                return jM30387L22;
            }
            long jM30388M22 = m30388M2(j10, false);
            if (!C3189s.m12084e(jM30388M22, aVar.m12088a())) {
                return jM30388M22;
            }
            long jM30389N22 = m30389N2(j10, false);
            if (!C3189s.m12084e(jM30389N22, aVar.m12088a())) {
                return jM30389N22;
            }
        } else {
            long jM30387L23 = m30387L2(j10, true);
            C3189s.a aVar2 = C3189s.f8481b;
            if (!C3189s.m12084e(jM30387L23, aVar2.m12088a())) {
                return jM30387L23;
            }
            long jM30386K23 = m30386K2(j10, true);
            if (!C3189s.m12084e(jM30386K23, aVar2.m12088a())) {
                return jM30386K23;
            }
            long jM30389N23 = m30389N2(j10, true);
            if (!C3189s.m12084e(jM30389N23, aVar2.m12088a())) {
                return jM30389N23;
            }
            long jM30388M23 = m30388M2(j10, true);
            if (!C3189s.m12084e(jM30388M23, aVar2.m12088a())) {
                return jM30388M23;
            }
            long jM30387L24 = m30387L2(j10, false);
            if (!C3189s.m12084e(jM30387L24, aVar2.m12088a())) {
                return jM30387L24;
            }
            long jM30386K24 = m30386K2(j10, false);
            if (!C3189s.m12084e(jM30386K24, aVar2.m12088a())) {
                return jM30386K24;
            }
            long jM30389N24 = m30389N2(j10, false);
            if (!C3189s.m12084e(jM30389N24, aVar2.m12088a())) {
                return jM30389N24;
            }
            long jM30388M24 = m30388M2(j10, false);
            if (!C3189s.m12084e(jM30388M24, aVar2.m12088a())) {
                return jM30388M24;
            }
        }
        return C3189s.f8481b.m12088a();
    }

    /* JADX INFO: renamed from: I2 */
    public final void m30384I2(float f10) {
        this.f26162F = f10;
    }

    /* JADX INFO: renamed from: J2 */
    public final void m30385J2(boolean z10) {
        this.f26163G = z10;
    }

    /* JADX INFO: renamed from: K2 */
    public final long m30386K2(long j10, boolean z10) {
        int iRound;
        int iM11972k = C3173c.m11972k(j10);
        return (iM11972k == Integer.MAX_VALUE || (iRound = Math.round(((float) iM11972k) * this.f26162F)) <= 0 || (z10 && !AbstractC7834g.m30359c(j10, iRound, iM11972k))) ? C3189s.f8481b.m12088a() : C3189s.m12082c((((long) iRound) << 32) | (((long) iM11972k) & 4294967295L));
    }

    /* JADX INFO: renamed from: L2 */
    public final long m30387L2(long j10, boolean z10) {
        int iRound;
        int iM11973l = C3173c.m11973l(j10);
        return (iM11973l == Integer.MAX_VALUE || (iRound = Math.round(((float) iM11973l) / this.f26162F)) <= 0 || (z10 && !AbstractC7834g.m30359c(j10, iM11973l, iRound))) ? C3189s.f8481b.m12088a() : C3189s.m12082c((((long) iM11973l) << 32) | (((long) iRound) & 4294967295L));
    }

    /* JADX INFO: renamed from: M2 */
    public final long m30388M2(long j10, boolean z10) {
        int iM11974m = C3173c.m11974m(j10);
        int iRound = Math.round(iM11974m * this.f26162F);
        return (iRound <= 0 || (z10 && !AbstractC7834g.m30359c(j10, iRound, iM11974m))) ? C3189s.f8481b.m12088a() : C3189s.m12082c((((long) iRound) << 32) | (((long) iM11974m) & 4294967295L));
    }

    /* JADX INFO: renamed from: N2 */
    public final long m30389N2(long j10, boolean z10) {
        int iM11975n = C3173c.m11975n(j10);
        int iRound = Math.round(iM11975n / this.f26162F);
        return (iRound <= 0 || (z10 && !AbstractC7834g.m30359c(j10, iM11975n, iRound))) ? C3189s.f8481b.m12088a() : C3189s.m12082c((((long) iM11975n) << 32) | (((long) iRound) & 4294967295L));
    }

    @Override // p166l2.InterfaceC4534e0
    /* JADX INFO: renamed from: d */
    public InterfaceC3558p0 mo1288d(InterfaceC3561q0 interfaceC3561q0, InterfaceC3552n0 interfaceC3552n0, long j10) {
        long jM30383H2 = m30383H2(j10);
        if (!C3189s.m12084e(jM30383H2, C3189s.f8481b.m12088a())) {
            j10 = C3173c.f8451b.m11981c((int) (jM30383H2 >> 32), (int) (jM30383H2 & 4294967295L));
        }
        final AbstractC3545l1 abstractC3545l1Mo13148X = interfaceC3552n0.mo13148X(j10);
        return InterfaceC3561q0.m13345n0(interfaceC3561q0, abstractC3545l1Mo13148X.m13264M0(), abstractC3545l1Mo13148X.m13259G0(), null, new InterfaceC0184l() { // from class: t.h
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C7844i.m30382G2(abstractC3545l1Mo13148X, (AbstractC3545l1.a) obj);
            }
        }, 4, null);
    }

    @Override // p166l2.InterfaceC4534e0
    /* JADX INFO: renamed from: g */
    public int mo15346g(InterfaceC3566s interfaceC3566s, InterfaceC3563r interfaceC3563r, int i10) {
        return i10 != Integer.MAX_VALUE ? Math.round(i10 / this.f26162F) : interfaceC3563r.mo13150t(i10);
    }

    @Override // p166l2.InterfaceC4534e0
    /* JADX INFO: renamed from: t */
    public int mo15347t(InterfaceC3566s interfaceC3566s, InterfaceC3563r interfaceC3563r, int i10) {
        return i10 != Integer.MAX_VALUE ? Math.round(i10 * this.f26162F) : interfaceC3563r.mo13146S(i10);
    }

    @Override // p166l2.InterfaceC4534e0
    /* JADX INFO: renamed from: v */
    public int mo15348v(InterfaceC3566s interfaceC3566s, InterfaceC3563r interfaceC3563r, int i10) {
        return i10 != Integer.MAX_VALUE ? Math.round(i10 * this.f26162F) : interfaceC3563r.mo13147W(i10);
    }
}
