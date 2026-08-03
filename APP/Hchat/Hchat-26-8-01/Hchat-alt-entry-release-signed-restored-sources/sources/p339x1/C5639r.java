package p339x1;

import p071f1.AbstractC0996c0;
import p071f1.C1005h;
import p071f1.C1034w;
import p071f1.InterfaceC1031u;
import p085fg.InterfaceC1231l;
import p118i1.C1902b;
import p131j0.C2046b;
import p227p4.C3315t;
import p308v1.AbstractC4377b1;
import p308v1.C4399j;
import p308v1.InterfaceC4412n0;
import p356y0.AbstractC5852n;
import p357y1.ViewTreeObserverOnGlobalLayoutListenerC5934t;

/* JADX INFO: renamed from: x1.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5639r extends AbstractC5614i1 {

    /* JADX INFO: renamed from: a0 */
    public static final C1005h f22949a0;

    /* JADX INFO: renamed from: Y */
    public final C5588b2 f22950Y;

    /* JADX INFO: renamed from: Z */
    public C5636q f22951Z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C1005h c1005hM2510f = AbstractC0996c0.m2510f();
        int i9 = C1034w.f3264h;
        c1005hM2510f.m2588w(C1034w.f3260d);
        c1005hM2510f.m2564C(1.0f);
        c1005hM2510f.m2565D(1);
        f22949a0 = c1005hM2510f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5639r(C5602f0 c5602f0) {
        super(c5602f0);
        C5588b2 c5588b2 = new C5588b2();
        c5588b2.f23791j = 0;
        this.f22950Y = c5588b2;
        c5588b2.f23795n = this;
        this.f22951Z = c5602f0.f22797n != null ? new C5636q(this) : null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.AbstractC4377b1
    /* JADX INFO: renamed from: A0 */
    public final void mo8820A0(long j3, float f3, InterfaceC1231l interfaceC1231l) {
        m10076H1(j3, f3, interfaceC1231l, null);
        if (this.f22923p) {
            return;
        }
        this.f22868u.f22779M.f22891p.m10218R0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5614i1, p308v1.AbstractC4377b1
    /* JADX INFO: renamed from: B0 */
    public final void mo8821B0(long j3, float f3, C1902b c1902b) {
        m10076H1(j3, f3, null, c1902b);
        if (this.f22923p) {
            return;
        }
        this.f22868u.f22779M.f22891p.m10218R0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4409m0
    /* JADX INFO: renamed from: G */
    public final int mo8829G(int i9) {
        C3315t c3315tM10048t = this.f22868u.m10048t();
        InterfaceC4412n0 interfaceC4412n0M7030x = c3315tM10048t.m7030x();
        C5602f0 c5602f0 = (C5602f0) c3315tM10048t.f10677h;
        return interfaceC4412n0M7030x.mo3992c(c5602f0.f22778L.f22717d, c5602f0.m10041m(), i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5614i1
    /* JADX INFO: renamed from: G1 */
    public final void mo10075G1(InterfaceC1031u interfaceC1031u, C1902b c1902b) {
        C5602f0 c5602f0 = this.f22868u;
        InterfaceC5641r1 interfaceC5641r1M10067a = AbstractC5613i0.m10067a(c5602f0);
        C2046b c2046bM10052x = c5602f0.m10052x();
        Object[] objArr = c2046bM10052x.f6891g;
        int i9 = c2046bM10052x.f6893i;
        for (int i10 = 0; i10 < i9; i10++) {
            C5602f0 c5602f02 = (C5602f0) objArr[i10];
            if (c5602f02.m10011H()) {
                c5602f02.m10038i(interfaceC1031u, c1902b);
            }
        }
        if (((ViewTreeObserverOnGlobalLayoutListenerC5934t) interfaceC5641r1M10067a).getShowLayoutBounds()) {
            long j3 = this.f14595i;
            interfaceC1031u.mo2501t(0.5f, 0.5f, ((int) (j3 >> 32)) - 0.5f, ((int) (j3 & 4294967295L)) - 0.5f, f22949a0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5628n0
    /* JADX INFO: renamed from: K0 */
    public final int mo10174K0(C4399j c4399j) {
        C5636q c5636q = this.f22951Z;
        if (c5636q != null) {
            return c5636q.mo10174K0(c4399j);
        }
        C5652v0 c5652v0 = this.f22868u.f22779M.f22891p;
        EnumC5586b0 enumC5586b0 = c5652v0.f23029l.f22879d;
        C5606g0 c5606g0 = c5652v0.f23014D;
        if (enumC5586b0 == EnumC5586b0.f22708g) {
            c5606g0.f22819d = true;
            if (c5606g0.f22817b) {
                c5652v0.f23012B = true;
                c5652v0.f23013C = true;
            }
        } else {
            c5606g0.f22820e = true;
        }
        C5639r c5639rMo9967A = c5652v0.mo9967A();
        boolean z9 = c5639rMo9967A.f22924q;
        c5639rMo9967A.f22924q = true;
        c5652v0.mo9972h0();
        c5639rMo9967A.f22924q = z9;
        Integer num = (Integer) c5606g0.f22822g.get(c4399j);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4409m0
    /* JADX INFO: renamed from: M */
    public final int mo8830M(int i9) {
        C3315t c3315tM10048t = this.f22868u.m10048t();
        InterfaceC4412n0 interfaceC4412n0M7030x = c3315tM10048t.m7030x();
        C5602f0 c5602f0 = (C5602f0) c3315tM10048t.f10677h;
        return interfaceC4412n0M7030x.mo3991a(c5602f0.f22778L.f22717d, c5602f0.m10041m(), i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4409m0
    /* JADX INFO: renamed from: Q */
    public final AbstractC4377b1 mo8831Q(long j3) {
        m8823E0(j3);
        C5602f0 c5602f0 = this.f22868u;
        C2046b c2046bM10053y = c5602f0.m10053y();
        Object[] objArr = c2046bM10053y.f6891g;
        int i9 = c2046bM10053y.f6893i;
        for (int i10 = 0; i10 < i9; i10++) {
            ((C5602f0) objArr[i10]).f22779M.f22891p.f23035r = EnumC5594d0.f22745i;
        }
        m10079K1(c5602f0.f22769C.mo3994h(this, c5602f0.m10041m(), j3));
        m10070B1();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4409m0
    /* JADX INFO: renamed from: j */
    public final int mo8832j(int i9) {
        C3315t c3315tM10048t = this.f22868u.m10048t();
        InterfaceC4412n0 interfaceC4412n0M7030x = c3315tM10048t.m7030x();
        C5602f0 c5602f0 = (C5602f0) c3315tM10048t.f10677h;
        return interfaceC4412n0M7030x.mo3993g(c5602f0.f22778L.f22717d, c5602f0.m10041m(), i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5614i1
    /* JADX INFO: renamed from: m1 */
    public final void mo10101m1() {
        if (this.f22951Z == null) {
            this.f22951Z = new C5636q(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4409m0
    /* JADX INFO: renamed from: p0 */
    public final int mo8833p0(int i9) {
        C3315t c3315tM10048t = this.f22868u.m10048t();
        InterfaceC4412n0 interfaceC4412n0M7030x = c3315tM10048t.m7030x();
        C5602f0 c5602f0 = (C5602f0) c3315tM10048t.f10677h;
        return interfaceC4412n0M7030x.mo3995i(c5602f0.f22778L.f22717d, c5602f0.m10041m(), i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5614i1
    /* JADX INFO: renamed from: p1 */
    public final AbstractC5631o0 mo10104p1() {
        return this.f22951Z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5614i1
    /* JADX INFO: renamed from: r1 */
    public final AbstractC5852n mo10106r1() {
        return this.f22950Y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // p339x1.AbstractC5614i1
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo10112x1(InterfaceC5599e1 interfaceC5599e1, long j3, C5633p c5633p, int i9, boolean z9) {
        int i10;
        boolean z10;
        C5602f0 c5602f0 = this.f22868u;
        boolean z11 = false;
        if (interfaceC5599e1.mo9987c(c5602f0)) {
            if (m10087S1(j3)) {
                i10 = i9;
                z10 = z9;
            } else {
                i10 = i9;
                if (i10 == 1 && (Float.floatToRawIntBits(m10098j1(j3, m10105q1())) & Integer.MAX_VALUE) < 2139095040) {
                    z10 = false;
                }
            }
            z11 = true;
            if (z11) {
                return;
            }
            int i11 = c5633p.f22942i;
            C2046b c2046bM10052x = c5602f0.m10052x();
            Object[] objArr = c2046bM10052x.f6891g;
            int i12 = c2046bM10052x.f6893i - 1;
            while (i12 >= 0) {
                C5602f0 c5602f02 = (C5602f0) objArr[i12];
                if (c5602f02.m10011H()) {
                    interfaceC5599e1.mo9989e(c5602f02, j3, c5633p, i10, z10);
                    long jM10185a = c5633p.m10185a();
                    if (AbstractC5618k.m10155k(jM10185a) < 0.0f && AbstractC5618k.m10160p(jM10185a) && !AbstractC5618k.m10159o(jM10185a) && !interfaceC5599e1.mo9988d(c5633p, c5602f02)) {
                        break;
                    }
                }
                i12--;
                i10 = i9;
            }
            c5633p.f22942i = i11;
            return;
        }
        i10 = i9;
        z10 = z9;
        if (z11) {
        }
    }
}
