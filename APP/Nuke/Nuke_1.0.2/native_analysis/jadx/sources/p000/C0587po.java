package p000;

/* JADX INFO: renamed from: po */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0587po extends th1 implements os1, InterfaceC0662rn, mc0 {

    /* JADX INFO: renamed from: v */
    public final C0626qo f8418v;

    /* JADX INFO: renamed from: w */
    public boolean f8419w;

    /* JADX INFO: renamed from: x */
    public in0 f8420x;

    public C0587po(C0626qo c0626qo, in0 in0Var) {
        this.f8418v = c0626qo;
        this.f8420x = in0Var;
        c0626qo.f9053h = this;
    }

    @Override // p000.th1
    /* JADX INFO: renamed from: G0 */
    public final void mo1486G0() {
        m3888M0();
    }

    @Override // p000.os1
    /* JADX INFO: renamed from: L */
    public final void mo1847L() {
        m3888M0();
    }

    /* JADX INFO: renamed from: M0 */
    public final void m3888M0() {
        this.f8419w = false;
        this.f8418v.f9054i = null;
        ci0.m788M(this);
    }

    @Override // p000.mc0
    /* JADX INFO: renamed from: P */
    public final void mo1851P(t61 t61Var) {
        boolean z = this.f8419w;
        C0626qo c0626qo = this.f8418v;
        if (!z) {
            c0626qo.f9054i = null;
            s11.m4674S(this, new C0723t6(3, this, c0626qo));
            if (c0626qo.f9054i == null) {
                throw vi0.m5686e("DrawResult not defined, did you forget to call onDraw?");
            }
            this.f8419w = true;
        }
        C0485n4 c0485n4 = c0626qo.f9054i;
        c0485n4.getClass();
        ((in0) c0485n4.f6983i).mo5j(t61Var);
    }

    @Override // p000.t60, p000.r12
    /* JADX INFO: renamed from: a */
    public final void mo225a() {
        m3888M0();
    }

    @Override // p000.InterfaceC0662rn
    /* JADX INFO: renamed from: b */
    public final e70 mo1840b() {
        return sp0.m4933c0(this).f9365F;
    }

    @Override // p000.InterfaceC0662rn
    /* JADX INFO: renamed from: d */
    public final long mo1842d() {
        return s11.m4715q0(sp0.m4927Z(this, 4).f10440j);
    }

    @Override // p000.InterfaceC0662rn
    public final d61 getLayoutDirection() {
        return sp0.m4933c0(this).f9366G;
    }

    @Override // p000.mc0
    /* JADX INFO: renamed from: r0 */
    public final void mo3057r0() {
        m3888M0();
    }

    @Override // p000.t60
    /* JADX INFO: renamed from: w0 */
    public final void mo2428w0() {
        m3888M0();
    }

    @Override // p000.th1
    /* JADX INFO: renamed from: F0 */
    public final void mo213F0() {
    }
}
