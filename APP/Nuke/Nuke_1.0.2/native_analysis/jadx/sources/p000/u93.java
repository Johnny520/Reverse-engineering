package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class u93 extends lw1 {

    /* JADX INFO: renamed from: e */
    public final nx1 f11172e = op0.m3598u(new gr2(0));

    /* JADX INFO: renamed from: f */
    public final nx1 f11173f = op0.m3598u(Boolean.FALSE);

    /* JADX INFO: renamed from: g */
    public final q93 f11174g;

    /* JADX INFO: renamed from: h */
    public final nx1 f11175h;

    /* JADX INFO: renamed from: i */
    public float f11176i;

    /* JADX INFO: renamed from: j */
    public C0095cl f11177j;

    public u93(ar0 ar0Var) {
        q93 q93Var = new q93(ar0Var);
        q93Var.f8842f = new C0159ea(22, this);
        this.f11174g = q93Var;
        this.f11175h = new nx1(a83.f116a, gd3.f3416C);
        this.f11176i = 1.0f;
    }

    @Override // p000.lw1
    /* JADX INFO: renamed from: a */
    public final void mo2974a(float f) {
        this.f11176i = f;
    }

    @Override // p000.lw1
    /* JADX INFO: renamed from: b */
    public final void mo2975b(C0095cl c0095cl) {
        this.f11177j = c0095cl;
    }

    @Override // p000.lw1
    /* JADX INFO: renamed from: d */
    public final long mo2977d() {
        return ((gr2) this.f11172e.getValue()).f3684a;
    }

    @Override // p000.lw1
    /* JADX INFO: renamed from: e */
    public final void mo2978e(t61 t61Var) {
        C0702sp c0702sp = t61Var.f10581h;
        C0095cl c0095cl = this.f11177j;
        q93 q93Var = this.f11174g;
        if (c0095cl == null) {
            c0095cl = (C0095cl) q93Var.f8843g.getValue();
        }
        if (((Boolean) this.f11173f.getValue()).booleanValue() && t61Var.getLayoutDirection() == d61.f1886i) {
            long jMo3278a0 = c0702sp.mo3278a0();
            C0043b5 c0043b5 = c0702sp.f10257i;
            long jM434u = c0043b5.m434u();
            c0043b5.m430q().mo1522l();
            try {
                ((C0485n4) c0043b5.f562i).m3234A(-1.0f, 1.0f, jMo3278a0);
                q93Var.m4103e(t61Var, this.f11176i, c0095cl);
            } finally {
                vi0.m5699r(c0043b5, jM434u);
            }
        } else {
            q93Var.m4103e(t61Var, this.f11176i, c0095cl);
        }
        this.f11175h.getValue();
    }
}
