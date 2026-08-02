package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class j03 extends th1 implements InterfaceC0257gy, j61 {

    /* JADX INFO: renamed from: v */
    public final m13 f4874v;

    /* JADX INFO: renamed from: w */
    public m63 f4875w;

    /* JADX INFO: renamed from: x */
    public h03 f4876x;

    public j03(m13 m13Var) {
        this.f4874v = m13Var;
    }

    @Override // p000.th1
    /* JADX INFO: renamed from: B0 */
    public final boolean mo210B0() {
        return false;
    }

    @Override // p000.th1
    /* JADX INFO: renamed from: E0 */
    public final void mo212E0() {
        m13 m13VarM6130k0 = xe1.m6130k0(this.f4874v, sp0.m4933c0(this).f9366G);
        xl0 xl0Var = (xl0) p40.m3733p(this, AbstractC0441ly.f6385k);
        m2427M0(m13VarM6130k0, xl0Var);
        d61 d61Var = sp0.m4933c0(this).f9366G;
        e70 e70Var = sp0.m4933c0(this).f9365F;
        m63 m63Var = this.f4875w;
        if (m63Var != null) {
            this.f4876x = new h03(d61Var, e70Var, xl0Var, m13VarM6130k0, m63Var.f6489h);
        } else {
            nz0.m3457b("Font resolution state is not set.");
            C0676s.m4644b();
        }
    }

    @Override // p000.th1
    /* JADX INFO: renamed from: F0 */
    public final void mo213F0() {
        this.f4875w = null;
        this.f4876x = null;
    }

    /* JADX INFO: renamed from: M0 */
    public final void m2427M0(m13 m13Var, xl0 xl0Var) {
        lt2 lt2Var = m13Var.f6435a;
        mx2 mx2Var = lt2Var.f6306f;
        im0 im0Var = lt2Var.f6303c;
        if (im0Var == null) {
            im0Var = im0.f4680j;
        }
        gm0 gm0Var = lt2Var.f6304d;
        int i = gm0Var != null ? gm0Var.f3581a : 0;
        hm0 hm0Var = lt2Var.f6305e;
        this.f4875w = ((yl0) xl0Var).m6288b(mx2Var, im0Var, i, hm0Var != null ? hm0Var.f4076a : 65535);
        gf1.m1853A(this);
    }

    @Override // p000.t60, p000.r12
    /* JADX INFO: renamed from: a */
    public final void mo225a() {
        h03 h03Var = this.f4876x;
        if (h03Var != null) {
            h03.m2040a(h03Var, null, sp0.m4933c0(this).f9365F, null, 29);
        }
        gf1.m1853A(this);
    }

    @Override // p000.j61
    /* JADX INFO: renamed from: e */
    public final of1 mo1363e(pf1 pf1Var, if1 if1Var, long j) {
        h03 h03Var = this.f4876x;
        if (h03Var == null) {
            nz0.m3457b("Min size state is not set.");
            C0676s.m4644b();
            return null;
        }
        nx1 nx1Var = h03Var.f3762f;
        m63 m63Var = this.f4875w;
        if (m63Var == null) {
            nz0.m3457b("Font resolution state is not set.");
            C0676s.m4644b();
            return null;
        }
        Object obj = m63Var.f6489h;
        if (!t11.m5086l(obj, h03Var.f3761e)) {
            h03Var.f3761e = obj;
            nx1Var.setValue(Boolean.TRUE);
        }
        if (((Boolean) nx1Var.getValue()).booleanValue()) {
            h03Var.f3763g = lz2.m3020a(h03Var.f3760d, h03Var.f3758b, h03Var.f3759c, lz2.f6414a, 1);
            nx1Var.setValue(Boolean.FALSE);
        }
        long j2 = h03Var.f3763g;
        sz1 sz1VarMo2340e = if1Var.mo2340e(AbstractC0258gz.m2031e(j, AbstractC0258gz.m2028b((int) (j2 >> 32), 0, (int) (j2 & 4294967295L), 0, 10)));
        return pf1Var.mo696j0(sz1VarMo2340e.f10438h, sz1VarMo2340e.f10439i, ce0.f1492h, new C0579pg(sz1VarMo2340e, 6));
    }

    @Override // p000.t60
    /* JADX INFO: renamed from: w0 */
    public final void mo2428w0() {
        h03 h03Var = this.f4876x;
        if (h03Var != null) {
            h03.m2040a(h03Var, sp0.m4933c0(this).f9366G, null, null, 30);
        }
        gf1.m1853A(this);
    }
}
