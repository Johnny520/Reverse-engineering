package p189n;

import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p080f9.AbstractC2368o;
import p121i3.C3173c;
import p135j2.AbstractC3545l1;
import p135j2.InterfaceC3552n0;
import p135j2.InterfaceC3558p0;
import p135j2.InterfaceC3561q0;
import p135j2.InterfaceC3563r;
import p135j2.InterfaceC3566s;
import p165l1.InterfaceC4507m;
import p166l2.InterfaceC4524b2;
import p166l2.InterfaceC4534e0;
import p172l8.C4700i0;
import p219p.EnumC5898w0;
import p277t2.AbstractC8070f0;
import p277t2.C8083m;
import p277t2.InterfaceC8074h0;

/* JADX INFO: renamed from: n.a3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5191a3 extends InterfaceC4507m.c implements InterfaceC4534e0, InterfaceC4524b2 {

    /* JADX INFO: renamed from: F */
    public C5221g3 f15828F;

    /* JADX INFO: renamed from: G */
    public boolean f15829G;

    /* JADX INFO: renamed from: H */
    public boolean f15830H;

    public C5191a3(C5221g3 c5221g3, boolean z10, boolean z11) {
        this.f15828F = c5221g3;
        this.f15829G = z10;
        this.f15830H = z11;
    }

    /* JADX INFO: renamed from: G2 */
    public static float m21281G2(C5191a3 c5191a3) {
        return c5191a3.f15828F.m21415o();
    }

    /* JADX INFO: renamed from: H2 */
    public static C4700i0 m21282H2(AbstractC3545l1 abstractC3545l1, int i10, int i11, AbstractC3545l1.a aVar) {
        AbstractC3545l1.a.m13272T(aVar, abstractC3545l1, i10, i11, 0.0f, null, 12, null);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: I2 */
    public static float m21283I2(C5191a3 c5191a3) {
        return c5191a3.f15828F.m21414n();
    }

    /* JADX INFO: renamed from: J2 */
    public static C4700i0 m21284J2(C5191a3 c5191a3, int i10, final AbstractC3545l1 abstractC3545l1, AbstractC3545l1.a aVar) {
        int iM21415o = c5191a3.f15828F.m21415o();
        if (iM21415o < 0) {
            iM21415o = 0;
        }
        if (iM21415o > i10) {
            iM21415o = i10;
        }
        int i11 = c5191a3.f15829G ? iM21415o - i10 : -iM21415o;
        boolean z10 = c5191a3.f15830H;
        final int i12 = z10 ? 0 : i11;
        final int i13 = z10 ? i11 : 0;
        aVar.m13290r0(new InterfaceC0184l() { // from class: n.z2
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C5191a3.m21282H2(abstractC3545l1, i12, i13, (AbstractC3545l1.a) obj);
            }
        });
        return C4700i0.f13910a;
    }

    @Override // p166l2.InterfaceC4534e0
    /* JADX INFO: renamed from: G */
    public int mo15345G(InterfaceC3566s interfaceC3566s, InterfaceC3563r interfaceC3563r, int i10) {
        if (!this.f15830H) {
            i10 = Integer.MAX_VALUE;
        }
        return interfaceC3563r.mo13151z0(i10);
    }

    /* JADX INFO: renamed from: K2 */
    public final void m21285K2(boolean z10) {
        this.f15829G = z10;
    }

    /* JADX INFO: renamed from: L2 */
    public final void m21286L2(C5221g3 c5221g3) {
        this.f15828F = c5221g3;
    }

    /* JADX INFO: renamed from: M2 */
    public final void m21287M2(boolean z10) {
        this.f15830H = z10;
    }

    @Override // p166l2.InterfaceC4534e0
    /* JADX INFO: renamed from: d */
    public InterfaceC3558p0 mo1288d(InterfaceC3561q0 interfaceC3561q0, InterfaceC3552n0 interfaceC3552n0, long j10) {
        AbstractC5188a0.m21278a(j10, this.f15830H ? EnumC5898w0.f18786q : EnumC5898w0.f18787r);
        final AbstractC3545l1 abstractC3545l1Mo13148X = interfaceC3552n0.mo13148X(C3173c.m11965d(j10, 0, this.f15830H ? C3173c.m11973l(j10) : Integer.MAX_VALUE, 0, this.f15830H ? Integer.MAX_VALUE : C3173c.m11972k(j10), 5, null));
        int iM8582i = AbstractC2368o.m8582i(abstractC3545l1Mo13148X.m13264M0(), C3173c.m11973l(j10));
        int iM8582i2 = AbstractC2368o.m8582i(abstractC3545l1Mo13148X.m13259G0(), C3173c.m11972k(j10));
        final int iM13259G0 = abstractC3545l1Mo13148X.m13259G0() - iM8582i2;
        int iM13264M0 = abstractC3545l1Mo13148X.m13264M0() - iM8582i;
        if (!this.f15830H) {
            iM13259G0 = iM13264M0;
        }
        this.f15828F.m21416p(iM13259G0);
        this.f15828F.m21418r(this.f15830H ? iM8582i2 : iM8582i);
        return InterfaceC3561q0.m13345n0(interfaceC3561q0, iM8582i, iM8582i2, null, new InterfaceC0184l() { // from class: n.w2
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C5191a3.m21284J2(this.f16263q, iM13259G0, abstractC3545l1Mo13148X, (AbstractC3545l1.a) obj);
            }
        }, 4, null);
    }

    @Override // p166l2.InterfaceC4534e0
    /* JADX INFO: renamed from: g */
    public int mo15346g(InterfaceC3566s interfaceC3566s, InterfaceC3563r interfaceC3563r, int i10) {
        if (!this.f15830H) {
            i10 = Integer.MAX_VALUE;
        }
        return interfaceC3563r.mo13150t(i10);
    }

    @Override // p166l2.InterfaceC4534e0
    /* JADX INFO: renamed from: t */
    public int mo15347t(InterfaceC3566s interfaceC3566s, InterfaceC3563r interfaceC3563r, int i10) {
        if (this.f15830H) {
            i10 = Integer.MAX_VALUE;
        }
        return interfaceC3563r.mo13146S(i10);
    }

    @Override // p166l2.InterfaceC4534e0
    /* JADX INFO: renamed from: v */
    public int mo15348v(InterfaceC3566s interfaceC3566s, InterfaceC3563r interfaceC3563r, int i10) {
        if (this.f15830H) {
            i10 = Integer.MAX_VALUE;
        }
        return interfaceC3563r.mo13147W(i10);
    }

    @Override // p166l2.InterfaceC4524b2
    /* JADX INFO: renamed from: z0 */
    public void mo1261z0(InterfaceC8074h0 interfaceC8074h0) {
        AbstractC8070f0.m31147x0(interfaceC8074h0, true);
        C8083m c8083m = new C8083m(new InterfaceC0173a() { // from class: n.x2
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return Float.valueOf(C5191a3.m21281G2(this.f16268q));
            }
        }, new InterfaceC0173a() { // from class: n.y2
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return Float.valueOf(C5191a3.m21283I2(this.f16294q));
            }
        }, this.f15829G);
        if (this.f15830H) {
            AbstractC8070f0.m31151z0(interfaceC8074h0, c8083m);
        } else {
            AbstractC8070f0.m31103b0(interfaceC8074h0, c8083m);
        }
    }
}
