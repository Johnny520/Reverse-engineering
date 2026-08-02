package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qs0 extends th1 implements InterfaceC0257gy, j61, os1 {

    /* JADX INFO: renamed from: A */
    public int f9144A;

    /* JADX INFO: renamed from: B */
    public m13 f9145B;

    /* JADX INFO: renamed from: C */
    public m63 f9146C;

    /* JADX INFO: renamed from: v */
    public m13 f9147v;

    /* JADX INFO: renamed from: w */
    public int f9148w;

    /* JADX INFO: renamed from: x */
    public int f9149x;

    /* JADX INFO: renamed from: y */
    public boolean f9150y;

    /* JADX INFO: renamed from: z */
    public int f9151z;

    @Override // p000.th1
    /* JADX INFO: renamed from: B0 */
    public final boolean mo210B0() {
        return false;
    }

    @Override // p000.th1
    /* JADX INFO: renamed from: E0 */
    public final void mo212E0() {
        xl0 xl0Var = (xl0) p40.m3733p(this, AbstractC0441ly.f6385k);
        this.f9145B = xe1.m6130k0(this.f9147v, sp0.m4933c0(this).f9366G);
        mx2 mx2Var = m4278M0().f6435a.f6306f;
        im0 im0Var = m4278M0().f6435a.f6303c;
        if (im0Var == null) {
            im0Var = im0.f4680j;
        }
        gm0 gm0Var = m4278M0().f6435a.f6304d;
        int i = gm0Var != null ? gm0Var.f3581a : 0;
        hm0 hm0Var = m4278M0().f6435a.f6305e;
        this.f9146C = ((yl0) xl0Var).m6288b(mx2Var, im0Var, i, hm0Var != null ? hm0Var.f4076a : 65535);
        s11.m4674S(this, new ps0(this, 0));
        this.f9150y = true;
    }

    @Override // p000.th1
    /* JADX INFO: renamed from: F0 */
    public final void mo213F0() {
        this.f9145B = null;
        this.f9146C = null;
        this.f9150y = false;
    }

    @Override // p000.os1
    /* JADX INFO: renamed from: L */
    public final void mo1847L() {
        if (this.f9146C != null) {
            s11.m4674S(this, new ps0(this, 1));
        }
        this.f9150y = true;
        gf1.m1853A(this);
    }

    /* JADX INFO: renamed from: M0 */
    public final m13 m4278M0() {
        m13 m13Var = this.f9145B;
        if (m13Var != null) {
            return m13Var;
        }
        nz0.m3457b("Resolved style is not set.");
        C0676s.m4644b();
        return null;
    }

    @Override // p000.t60, p000.r12
    /* JADX INFO: renamed from: a */
    public final void mo225a() {
        this.f9150y = true;
        gf1.m1853A(this);
    }

    @Override // p000.j61
    /* JADX INFO: renamed from: e */
    public final of1 mo1363e(pf1 pf1Var, if1 if1Var, long j) {
        if (this.f9150y) {
            m13 m13VarM4278M0 = m4278M0();
            xl0 xl0Var = (xl0) p40.m3733p(this, AbstractC0441ly.f6385k);
            String str = lz2.f6414a;
            int iM3020a = (int) (lz2.m3020a(m13VarM4278M0, pf1Var, xl0Var, str, 1) & 4294967295L);
            int iM3020a2 = ((int) (lz2.m3020a(m13VarM4278M0, pf1Var, xl0Var, str + '\n' + str, 2) & 4294967295L)) - iM3020a;
            int i = this.f9148w;
            this.f9151z = i == 1 ? -1 : ((i - 1) * iM3020a2) + iM3020a;
            int i2 = this.f9149x;
            this.f9144A = i2 == Integer.MAX_VALUE ? -1 : ((i2 - 1) * iM3020a2) + iM3020a;
            this.f9150y = false;
        }
        int i3 = this.f9151z;
        int iM779D = i3 != -1 ? ci0.m779D(i3, C0221fz.m1764i(j), C0221fz.m1762g(j)) : C0221fz.m1764i(j);
        int i4 = this.f9144A;
        sz1 sz1VarMo2340e = if1Var.mo2340e(C0221fz.m1756a(j, 0, 0, iM779D, i4 != -1 ? ci0.m779D(i4, C0221fz.m1764i(j), C0221fz.m1762g(j)) : C0221fz.m1762g(j), 3));
        return pf1Var.mo696j0(sz1VarMo2340e.f10438h, sz1VarMo2340e.f10439i, ce0.f1492h, new C0579pg(sz1VarMo2340e, 2));
    }

    @Override // p000.t60
    /* JADX INFO: renamed from: w0 */
    public final void mo2428w0() {
        this.f9145B = xe1.m6130k0(this.f9147v, sp0.m4933c0(this).f9366G);
        this.f9150y = true;
        gf1.m1853A(this);
    }
}
