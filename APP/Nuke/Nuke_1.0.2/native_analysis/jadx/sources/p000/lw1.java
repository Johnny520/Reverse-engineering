package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class lw1 {

    /* JADX INFO: renamed from: a */
    public C0611q9 f6344a;

    /* JADX INFO: renamed from: b */
    public C0095cl f6345b;

    /* JADX INFO: renamed from: c */
    public float f6346c = 1.0f;

    /* JADX INFO: renamed from: d */
    public d61 f6347d = d61.f1885h;

    /* JADX INFO: renamed from: a */
    public abstract void mo2974a(float f);

    /* JADX INFO: renamed from: b */
    public abstract void mo2975b(C0095cl c0095cl);

    /* JADX INFO: renamed from: c */
    public final void m2976c(t61 t61Var, long j, float f, C0095cl c0095cl) {
        C0702sp c0702sp = t61Var.f10581h;
        if (this.f6346c != f) {
            mo2974a(f);
            this.f6346c = f;
        }
        if (!t11.m5086l(this.f6345b, c0095cl)) {
            mo2975b(c0095cl);
            this.f6345b = c0095cl;
        }
        d61 layoutDirection = t61Var.getLayoutDirection();
        if (this.f6347d != layoutDirection) {
            this.f6347d = layoutDirection;
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c0702sp.mo3280d() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c0702sp.mo3280d() & 4294967295L)) - Float.intBitsToFloat(i2);
        ((C0485n4) c0702sp.f10257i.f562i).m3243u(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i2) > 0.0f) {
                    mo2978e(t61Var);
                }
            } finally {
                ((C0485n4) c0702sp.f10257i.f562i).m3243u(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract long mo2977d();

    /* JADX INFO: renamed from: e */
    public abstract void mo2978e(t61 t61Var);
}
