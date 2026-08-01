package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class kb1 extends ro0 {

    /* JADX INFO: renamed from: e */
    public final gp0 f3066e = r60.m3419u(new q11(0));

    /* JADX INFO: renamed from: f */
    public final gp0 f3067f = r60.m3419u(Boolean.FALSE);

    /* JADX INFO: renamed from: g */
    public final fb1 f3068g;

    /* JADX INFO: renamed from: h */
    public final gp0 f3069h;

    /* JADX INFO: renamed from: i */
    public float f3070i;

    /* JADX INFO: renamed from: j */
    public C0348ja f3071j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public kb1(C0035ay c0035ay) {
        fb1 fb1Var = new fb1(c0035ay);
        fb1Var.f1657f = new C0310i7(11, this);
        this.f3068g = fb1Var;
        this.f3069h = new gp0(na1.f4229a, C0496n2.f4133M);
        this.f3070i = 1.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.ro0
    /* JADX INFO: renamed from: a */
    public final void mo1566a(float f) {
        this.f3070i = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.ro0
    /* JADX INFO: renamed from: b */
    public final void mo1567b(C0348ja c0348ja) {
        this.f3071j = c0348ja;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.ro0
    /* JADX INFO: renamed from: d */
    public final long mo1568d() {
        return ((q11) this.f3066e.getValue()).f5022a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.ro0
    /* JADX INFO: renamed from: e */
    public final void mo1569e(d60 d60Var) {
        C0125dd c0125dd = d60Var.f976d;
        C0348ja c0348ja = this.f3071j;
        fb1 fb1Var = this.f3068g;
        if (c0348ja == null) {
            c0348ja = (C0348ja) fb1Var.f1658g.getValue();
        }
        if (((Boolean) this.f3067f.getValue()).booleanValue() && d60Var.getLayoutDirection() == k50.f3016e) {
            long jMo643K = c0125dd.mo643K();
            C0541o8 c0541o8 = c0125dd.f1053e;
            long jM2803h = c0541o8.m2803h();
            c0541o8.m2802f().mo243i();
            try {
                ((C0910x1) c0541o8.f4480a).m5079s(-1.0f, 1.0f, jMo643K);
                fb1Var.m1077e(d60Var, this.f3070i, c0348ja);
            } finally {
                c0541o8.m2802f().mo241g();
                c0541o8.m2812q(jM2803h);
            }
        } else {
            fb1Var.m1077e(d60Var, this.f3070i, c0348ja);
        }
        this.f3069h.getValue();
    }
}
