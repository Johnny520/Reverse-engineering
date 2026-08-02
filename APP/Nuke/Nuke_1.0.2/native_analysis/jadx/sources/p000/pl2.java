package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class pl2 extends u60 implements InterfaceC0257gy, os1 {

    /* JADX INFO: renamed from: A */
    public n50 f8391A;

    /* JADX INFO: renamed from: B */
    public bk1 f8392B;

    /* JADX INFO: renamed from: C */
    public boolean f8393C;

    /* JADX INFO: renamed from: D */
    public C0685s8 f8394D;

    /* JADX INFO: renamed from: E */
    public am2 f8395E;

    /* JADX INFO: renamed from: F */
    public t60 f8396F;

    /* JADX INFO: renamed from: G */
    public C0725t8 f8397G;

    /* JADX INFO: renamed from: H */
    public C0685s8 f8398H;

    /* JADX INFO: renamed from: I */
    public boolean f8399I;

    /* JADX INFO: renamed from: x */
    public bm2 f8400x;

    /* JADX INFO: renamed from: y */
    public qv1 f8401y;

    /* JADX INFO: renamed from: z */
    public boolean f8402z;

    @Override // p000.th1
    /* JADX INFO: renamed from: B0 */
    public final boolean mo210B0() {
        return false;
    }

    @Override // p000.th1
    /* JADX INFO: renamed from: E0 */
    public final void mo212E0() {
        this.f8399I = m3880Q0();
        m3879P0();
        if (this.f8395E == null) {
            bm2 bm2Var = this.f8400x;
            am2 am2Var = new am2(this.f8393C ? this.f8398H : this.f8394D, this.f8391A, this.f8392B, this.f8401y, bm2Var, this.f8402z, this.f8399I);
            m5468M0(am2Var);
            this.f8395E = am2Var;
        }
    }

    @Override // p000.th1
    /* JADX INFO: renamed from: F0 */
    public final void mo213F0() {
        t60 t60Var = this.f8396F;
        if (t60Var != null) {
            m5469N0(t60Var);
        }
    }

    @Override // p000.os1
    /* JADX INFO: renamed from: L */
    public final void mo1847L() {
        C0725t8 c0725t8 = (C0725t8) p40.m3733p(this, xv1.f13194a);
        if (t11.m5086l(c0725t8, this.f8397G)) {
            return;
        }
        this.f8397G = c0725t8;
        this.f8398H = null;
        t60 t60Var = this.f8396F;
        if (t60Var != null) {
            m5469N0(t60Var);
        }
        this.f8396F = null;
        m3879P0();
        am2 am2Var = this.f8395E;
        if (am2Var != null) {
            bm2 bm2Var = this.f8400x;
            qv1 qv1Var = this.f8401y;
            am2Var.m229d1(this.f8393C ? this.f8398H : this.f8394D, this.f8391A, this.f8392B, qv1Var, bm2Var, this.f8402z, this.f8399I);
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final void m3879P0() {
        t60 t60Var = this.f8396F;
        if (t60Var != null) {
            if (((th1) t60Var).f10757h.f10770u) {
                return;
            }
            m5468M0(t60Var);
            return;
        }
        if (this.f8393C) {
            s11.m4674S(this, new C0727ta(22, this));
        }
        C0685s8 c0685s8 = this.f8393C ? this.f8398H : this.f8394D;
        if (c0685s8 != null) {
            u60 u60Var = c0685s8.f9970i;
            if (u60Var.f10757h.f10770u) {
                return;
            }
            m5468M0(u60Var);
            this.f8396F = u60Var;
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public final boolean m3880Q0() {
        return (this.f10770u ? sp0.m4933c0(this).f9366G : d61.f1885h) != d61.f1886i || this.f8401y == qv1.f9205h;
    }

    /* JADX INFO: renamed from: R0 */
    public final void m3881R0(C0685s8 c0685s8, n50 n50Var, bk1 bk1Var, qv1 qv1Var, bm2 bm2Var, boolean z, boolean z2) {
        boolean z3;
        this.f8400x = bm2Var;
        this.f8401y = qv1Var;
        boolean z4 = true;
        if (this.f8393C != z) {
            this.f8393C = z;
            z3 = true;
        } else {
            z3 = false;
        }
        if (t11.m5086l(this.f8394D, c0685s8)) {
            z4 = false;
        } else {
            this.f8394D = c0685s8;
        }
        if (z3 || (z4 && !z)) {
            t60 t60Var = this.f8396F;
            if (t60Var != null) {
                m5469N0(t60Var);
            }
            this.f8396F = null;
            m3879P0();
        }
        this.f8402z = z2;
        this.f8391A = n50Var;
        this.f8392B = bk1Var;
        boolean zM3880Q0 = m3880Q0();
        this.f8399I = zM3880Q0;
        am2 am2Var = this.f8395E;
        if (am2Var != null) {
            am2Var.m229d1(this.f8393C ? this.f8398H : this.f8394D, n50Var, bk1Var, qv1Var, bm2Var, z2, zM3880Q0);
        }
    }

    @Override // p000.t60
    /* JADX INFO: renamed from: w0 */
    public final void mo2428w0() {
        boolean zM3880Q0 = m3880Q0();
        if (this.f8399I != zM3880Q0) {
            this.f8399I = zM3880Q0;
            bm2 bm2Var = this.f8400x;
            qv1 qv1Var = this.f8401y;
            boolean z = this.f8393C;
            m3881R0(z ? this.f8398H : this.f8394D, this.f8391A, this.f8392B, qv1Var, bm2Var, z, this.f8402z);
        }
    }
}
