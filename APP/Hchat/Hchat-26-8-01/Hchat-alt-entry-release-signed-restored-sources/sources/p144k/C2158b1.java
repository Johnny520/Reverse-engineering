package p144k;

import android.view.View;
import ci.C0575c;
import p057e1.C0807b;
import p072f2.InterfaceC1062y;
import p100h0.C1520g1;
import p100h0.C1523h1;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1845j1;
import p117i0.C1892x;
import p249qg.AbstractC3603v;
import p259r9.AbstractC3754e0;
import p276sf.C3967n;
import p293u2.C4238h;
import p293u2.C4242l;
import p293u2.InterfaceC4233c;
import p339x1.AbstractC5614i1;
import p339x1.AbstractC5618k;
import p339x1.C5610h0;
import p339x1.InterfaceC5624m;
import p339x1.InterfaceC5626m1;
import p339x1.InterfaceC5627n;
import p339x1.InterfaceC5665z1;
import p356y0.AbstractC5852n;
import sg.AbstractC3978j;
import sg.C3971c;

/* JADX INFO: renamed from: k.b1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2158b1 extends AbstractC5852n implements InterfaceC5627n, InterfaceC5624m, InterfaceC5665z1, InterfaceC5626m1 {

    /* JADX INFO: renamed from: B */
    public C1892x f7144B;

    /* JADX INFO: renamed from: D */
    public C4242l f7146D;

    /* JADX INFO: renamed from: E */
    public C3971c f7147E;

    /* JADX INFO: renamed from: u */
    public C1520g1 f7148u;

    /* JADX INFO: renamed from: v */
    public C1523h1 f7149v;

    /* JADX INFO: renamed from: w */
    public InterfaceC2197o1 f7150w;

    /* JADX INFO: renamed from: x */
    public View f7151x;

    /* JADX INFO: renamed from: y */
    public InterfaceC4233c f7152y;

    /* JADX INFO: renamed from: z */
    public InterfaceC2194n1 f7153z;

    /* JADX INFO: renamed from: A */
    public final C1845j1 f7143A = new C1845j1(null, C1823e.f6049j);

    /* JADX INFO: renamed from: C */
    public long f7145C = 9205357640488583168L;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2158b1(C1520g1 c1520g1, C1523h1 c1523h1, InterfaceC2197o1 interfaceC2197o1) {
        this.f7148u = c1520g1;
        this.f7149v = c1523h1;
        this.f7150w = interfaceC2197o1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5624m
    /* JADX INFO: renamed from: B */
    public final void mo1326B(C5610h0 c5610h0) {
        c5610h0.m10064e();
        C3971c c3971c = this.f7147E;
        if (c3971c != null) {
            c3971c.mo8208p(C3967n.f12976a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5626m1
    /* JADX INFO: renamed from: C0 */
    public final void mo1327C0() {
        AbstractC5618k.m10162r(this, new C2155a1(this, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5665z1
    /* JADX INFO: renamed from: X0 */
    public final void mo1610X0(InterfaceC1062y interfaceC1062y) {
        interfaceC1062y.mo2644a(AbstractC2161c1.f7163a, new C2155a1(this, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: c1 */
    public final void mo1323c1() {
        mo1327C0();
        this.f7147E = AbstractC3978j.m8218a(0, 7, null);
        AbstractC3603v.m7563q(m10550Y0(), null, new C0575c(this, null, 6), 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: d1 */
    public final void mo743d1() {
        InterfaceC2194n1 interfaceC2194n1 = this.f7153z;
        if (interfaceC2194n1 != null) {
            ((C2200p1) interfaceC2194n1).m5450b();
        }
        this.f7153z = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k1 */
    public final long m5384k1() {
        if (this.f7144B == null) {
            this.f7144B = AbstractC1874r.m4634p(new C2155a1(this, 2));
        }
        C1892x c1892x = this.f7144B;
        if (c1892x != null) {
            return ((C0807b) c1892x.getValue()).f2414a;
        }
        return 9205357640488583168L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l1 */
    public final void m5385l1() {
        InterfaceC2194n1 interfaceC2194n1 = this.f7153z;
        if (interfaceC2194n1 != null) {
            ((C2200p1) interfaceC2194n1).m5450b();
        }
        View viewM10169y = this.f7151x;
        if (viewM10169y == null) {
            viewM10169y = AbstractC5618k.m10169y(this);
        }
        this.f7151x = viewM10169y;
        InterfaceC4233c interfaceC4233c = this.f7152y;
        if (interfaceC4233c == null) {
            interfaceC4233c = AbstractC5618k.m10167w(this).f22771E;
        }
        this.f7152y = interfaceC4233c;
        this.f7153z = this.f7150w.mo5449b(viewM10169y, interfaceC4233c);
        m5387n1();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m1 */
    public final void m5386m1() {
        InterfaceC4233c interfaceC4233c = this.f7152y;
        if (interfaceC4233c == null) {
            interfaceC4233c = AbstractC5618k.m10167w(this).f22771E;
            this.f7152y = interfaceC4233c;
        }
        long j3 = ((C0807b) this.f7148u.invoke(interfaceC4233c)).f2414a;
        if ((j3 & 9223372034707292159L) == 9205357640488583168L || (9223372034707292159L & m5384k1()) == 9205357640488583168L) {
            this.f7145C = 9205357640488583168L;
            InterfaceC2194n1 interfaceC2194n1 = this.f7153z;
            if (interfaceC2194n1 != null) {
                ((C2200p1) interfaceC2194n1).m5450b();
                return;
            }
            return;
        }
        this.f7145C = C0807b.m2042e(m5384k1(), j3);
        if (this.f7153z == null) {
            m5385l1();
        }
        InterfaceC2194n1 interfaceC2194n12 = this.f7153z;
        if (interfaceC2194n12 != null) {
            interfaceC2194n12.mo5447a(this.f7145C, 9205357640488583168L);
        }
        m5387n1();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n1 */
    public final void m5387n1() {
        InterfaceC4233c interfaceC4233c;
        InterfaceC2194n1 interfaceC2194n1 = this.f7153z;
        if (interfaceC2194n1 == null || (interfaceC4233c = this.f7152y) == null) {
            return;
        }
        C2200p1 c2200p1 = (C2200p1) interfaceC2194n1;
        long jM5451c = c2200p1.m5451c();
        C4242l c4242l = this.f7146D;
        if (c4242l != null && jM5451c == c4242l.f13918a) {
            return;
        }
        this.f7149v.invoke(new C4238h(interfaceC4233c.mo1592K(AbstractC3754e0.m7908q0(c2200p1.m5451c()))));
        this.f7146D = new C4242l(c2200p1.m5451c());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5627n
    /* JADX INFO: renamed from: w */
    public final void mo1318w(AbstractC5614i1 abstractC5614i1) {
        this.f7143A.setValue(abstractC5614i1);
    }
}
