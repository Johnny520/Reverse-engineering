package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class o31 implements w41 {

    /* JADX INFO: renamed from: a */
    public static final o31 f7461a = new o31();

    /* JADX INFO: renamed from: b */
    public static final ap2 f7462b = up0.m5544i("kotlinx.serialization.json.JsonElement", x12.f12766g, new yo2[0], new nx0(9));

    @Override // p000.w41
    /* JADX INFO: renamed from: a */
    public final Object mo165a(y40 y40Var) {
        return rg3.m4479o(y40Var).m904r0();
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: d */
    public final void mo167d(ve0 ve0Var, Object obj) {
        j31 j31Var = (j31) obj;
        j31Var.getClass();
        rg3.m4477m(ve0Var);
        if (j31Var instanceof i41) {
            ve0Var.mo1180e(k41.f5332a, j31Var);
            return;
        }
        if (j31Var instanceof d41) {
            ve0Var.mo1180e(g41.f3302a, j31Var);
        } else if (j31Var instanceof z21) {
            ve0Var.mo1180e(c31.f1122a, j31Var);
        } else {
            c80.m675s();
        }
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: e */
    public final yo2 mo168e() {
        return f7462b;
    }
}
