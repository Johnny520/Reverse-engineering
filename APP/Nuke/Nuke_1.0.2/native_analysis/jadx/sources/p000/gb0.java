package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gb0 extends th1 implements d43, a61 {

    /* JADX INFO: renamed from: v */
    public gb0 f3382v;

    /* JADX INFO: renamed from: w */
    public gb0 f3383w;

    /* JADX INFO: renamed from: x */
    public long f3384x;

    @Override // p000.th1
    /* JADX INFO: renamed from: F0 */
    public final void mo213F0() {
        this.f3383w = null;
        this.f3382v = null;
    }

    /* JADX INFO: renamed from: M0 */
    public final boolean m1822M0() {
        gb0 gb0Var = this.f3382v;
        if (gb0Var != null) {
            return gb0Var.m1822M0();
        }
        gb0 gb0Var2 = this.f3383w;
        if (gb0Var2 != null) {
            return gb0Var2.m1822M0();
        }
        return false;
    }

    /* JADX INFO: renamed from: N0 */
    public final void m1823N0() {
        gb0 gb0Var = this.f3383w;
        if (gb0Var != null) {
            gb0Var.m1823N0();
            return;
        }
        gb0 gb0Var2 = this.f3382v;
        if (gb0Var2 != null) {
            gb0Var2.m1823N0();
        }
    }

    /* JADX INFO: renamed from: O0 */
    public final void m1824O0() {
        gb0 gb0Var = this.f3383w;
        if (gb0Var != null) {
            gb0Var.m1824O0();
        }
        gb0 gb0Var2 = this.f3382v;
        if (gb0Var2 != null) {
            gb0Var2.m1824O0();
        }
        this.f3382v = null;
    }

    /* JADX INFO: renamed from: P0 */
    public final void m1825P0(C0485n4 c0485n4) {
        d43 d43Var;
        gb0 gb0Var;
        gb0 gb0Var2 = this.f3382v;
        int i = 1;
        if (gb0Var2 == null || !AbstractC0691se.m4852w(gb0Var2, AbstractC0731te.m5180I(c0485n4))) {
            if (this.f10757h.f10770u) {
                o72 o72Var = new o72();
                tb3.m5160f(this, new C0161ec(o72Var, this, c0485n4, i));
                d43Var = (d43) o72Var.f7574i;
            } else {
                d43Var = null;
            }
            gb0Var = (gb0) d43Var;
        } else {
            gb0Var = gb0Var2;
        }
        if (gb0Var != null && gb0Var2 == null) {
            gb0Var.m1823N0();
            gb0Var.m1825P0(c0485n4);
            gb0 gb0Var3 = this.f3383w;
            if (gb0Var3 != null) {
                gb0Var3.m1824O0();
            }
        } else if (gb0Var == null && gb0Var2 != null) {
            gb0 gb0Var4 = this.f3383w;
            if (gb0Var4 != null) {
                gb0Var4.m1823N0();
                gb0Var4.m1825P0(c0485n4);
            }
            gb0Var2.m1824O0();
        } else if (!t11.m5086l(gb0Var, gb0Var2)) {
            if (gb0Var != null) {
                gb0Var.m1823N0();
                gb0Var.m1825P0(c0485n4);
            }
            if (gb0Var2 != null) {
                gb0Var2.m1824O0();
            }
        } else if (gb0Var != null) {
            gb0Var.m1825P0(c0485n4);
        } else {
            gb0 gb0Var5 = this.f3383w;
            if (gb0Var5 != null) {
                gb0Var5.m1825P0(c0485n4);
            }
        }
        this.f3382v = gb0Var;
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m1826Q0() {
        gb0 gb0Var = this.f3383w;
        if (gb0Var != null) {
            gb0Var.m1826Q0();
            return;
        }
        gb0 gb0Var2 = this.f3382v;
        if (gb0Var2 != null) {
            gb0Var2.m1826Q0();
        }
    }

    @Override // p000.a61, p000.qf1
    /* JADX INFO: renamed from: c */
    public final void mo99c(long j) {
        this.f3384x = j;
    }

    @Override // p000.d43
    /* JADX INFO: renamed from: r */
    public final Object mo962r() {
        return gd3.f3440r;
    }
}
