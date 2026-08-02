package p000;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ge1 extends th1 implements dq0, mc0, on2, os1 {

    /* JADX INFO: renamed from: A */
    public e02 f3457A;

    /* JADX INFO: renamed from: C */
    public n70 f3459C;

    /* JADX INFO: renamed from: E */
    public h11 f3461E;

    /* JADX INFO: renamed from: F */
    public C0356jn f3462F;

    /* JADX INFO: renamed from: v */
    public gp1 f3463v;

    /* JADX INFO: renamed from: w */
    public f03 f3464w;

    /* JADX INFO: renamed from: x */
    public f02 f3465x;

    /* JADX INFO: renamed from: y */
    public View f3466y;

    /* JADX INFO: renamed from: z */
    public e70 f3467z;

    /* JADX INFO: renamed from: B */
    public final nx1 f3458B = new nx1(null, gd3.f3416C);

    /* JADX INFO: renamed from: D */
    public long f3460D = 9205357640488583168L;

    public ge1(gp1 gp1Var, f03 f03Var, f02 f02Var) {
        this.f3463v = gp1Var;
        this.f3464w = f03Var;
        this.f3465x = f02Var;
    }

    @Override // p000.th1
    /* JADX INFO: renamed from: E0 */
    public final void mo212E0() {
        mo1847L();
        this.f3462F = fg1.m1630a(0, 7, null);
        AbstractC0570p7.m3745A(m5255A0(), null, new h50(this, (t00) null, 4), 1);
    }

    @Override // p000.th1
    /* JADX INFO: renamed from: F0 */
    public final void mo213F0() {
        e02 e02Var = this.f3457A;
        if (e02Var != null) {
            ((g02) e02Var).m1775b();
        }
        this.f3457A = null;
    }

    @Override // p000.os1
    /* JADX INFO: renamed from: L */
    public final void mo1847L() {
        s11.m4674S(this, new fe1(this, 0));
    }

    /* JADX INFO: renamed from: M0 */
    public final long m1848M0() {
        if (this.f3459C == null) {
            this.f3459C = op0.m3590m(new fe1(this, 2));
        }
        n70 n70Var = this.f3459C;
        if (n70Var != null) {
            return ((rs1) n70Var.getValue()).f9744a;
        }
        return 9205357640488583168L;
    }

    /* JADX INFO: renamed from: N0 */
    public final void m1849N0() {
        e02 e02Var = this.f3457A;
        if (e02Var != null) {
            ((g02) e02Var).m1775b();
        }
        View viewM5344H = this.f3466y;
        if (viewM5344H == null) {
            viewM5344H = tp0.m5344H(this);
        }
        this.f3466y = viewM5344H;
        e70 e70Var = this.f3467z;
        if (e70Var == null) {
            e70Var = sp0.m4933c0(this).f9365F;
        }
        this.f3467z = e70Var;
        this.f3457A = this.f3465x.mo1489b(viewM5344H, e70Var);
        m1852P0();
    }

    /* JADX INFO: renamed from: O0 */
    public final void m1850O0() {
        e70 e70Var = this.f3467z;
        if (e70Var == null) {
            e70Var = sp0.m4933c0(this).f9365F;
            this.f3467z = e70Var;
        }
        long j = ((rs1) this.f3463v.mo5j(e70Var)).f9744a;
        if ((j & 9223372034707292159L) == 9205357640488583168L || (9223372034707292159L & m1848M0()) == 9205357640488583168L) {
            this.f3460D = 9205357640488583168L;
            e02 e02Var = this.f3457A;
            if (e02Var != null) {
                ((g02) e02Var).m1775b();
                return;
            }
            return;
        }
        this.f3460D = rs1.m4612e(m1848M0(), j);
        if (this.f3457A == null) {
            m1849N0();
        }
        e02 e02Var2 = this.f3457A;
        if (e02Var2 != null) {
            e02Var2.mo1213a(this.f3460D, 9205357640488583168L);
        }
        m1852P0();
    }

    @Override // p000.mc0
    /* JADX INFO: renamed from: P */
    public final void mo1851P(t61 t61Var) {
        t61Var.m5125a();
        C0356jn c0356jn = this.f3462F;
        if (c0356jn != null) {
            c0356jn.mo2225s(a83.f116a);
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final void m1852P0() {
        e70 e70Var;
        e02 e02Var = this.f3457A;
        if (e02Var == null || (e70Var = this.f3467z) == null) {
            return;
        }
        g02 g02Var = (g02) e02Var;
        long jM1776c = g02Var.m1776c();
        h11 h11Var = this.f3461E;
        if (h11Var != null && jM1776c == h11Var.f3775a) {
            return;
        }
        this.f3464w.mo5j(new cb0(e70Var.mo703y(s11.m4715q0(g02Var.m1776c()))));
        this.f3461E = new h11(g02Var.m1776c());
    }

    @Override // p000.on2
    /* JADX INFO: renamed from: l0 */
    public final void mo232l0(zn2 zn2Var) {
        zn2Var.mo1533a(he1.f3973a, new fe1(this, 1));
    }

    @Override // p000.dq0
    /* JADX INFO: renamed from: w */
    public final void mo1069w(zn1 zn1Var) {
        this.f3458B.setValue(zn1Var);
    }
}
