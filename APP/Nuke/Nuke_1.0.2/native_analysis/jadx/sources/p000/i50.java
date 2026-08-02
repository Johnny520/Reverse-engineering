package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class i50 extends th1 implements mc0 {

    /* JADX INFO: renamed from: v */
    public final bk1 f4277v;

    /* JADX INFO: renamed from: w */
    public boolean f4278w;

    /* JADX INFO: renamed from: x */
    public boolean f4279x;

    /* JADX INFO: renamed from: y */
    public boolean f4280y;

    public i50(bk1 bk1Var) {
        this.f4277v = bk1Var;
    }

    @Override // p000.th1
    /* JADX INFO: renamed from: E0 */
    public final void mo212E0() {
        AbstractC0570p7.m3745A(m5255A0(), null, new h50(this, (t00) null, 0), 3);
    }

    @Override // p000.mc0
    /* JADX INFO: renamed from: P */
    public final void mo1851P(t61 t61Var) {
        t61Var.m5125a();
        C0702sp c0702sp = t61Var.f10581h;
        if (this.f4278w) {
            nc0.m3270i0(t61Var, C0363ju.m2565b(0.3f, C0363ju.f5212b), 0L, c0702sp.mo3280d(), 122);
        } else if (this.f4279x || this.f4280y) {
            nc0.m3270i0(t61Var, C0363ju.m2565b(0.1f, C0363ju.f5212b), 0L, c0702sp.mo3280d(), 122);
        }
    }
}
