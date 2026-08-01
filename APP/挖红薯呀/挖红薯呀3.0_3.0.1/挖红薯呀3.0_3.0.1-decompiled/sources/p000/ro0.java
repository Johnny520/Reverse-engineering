package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ro0 {

    /* JADX INFO: renamed from: a */
    public C0877w5 f5517a;

    /* JADX INFO: renamed from: b */
    public C0348ja f5518b;

    /* JADX INFO: renamed from: c */
    public float f5519c = 1.0f;

    /* JADX INFO: renamed from: d */
    public k50 f5520d = k50.f3015d;

    /* JADX INFO: renamed from: a */
    public abstract void mo1566a(float f);

    /* JADX INFO: renamed from: b */
    public abstract void mo1567b(C0348ja c0348ja);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m3980c(d60 d60Var, long j, float f, C0348ja c0348ja) {
        C0125dd c0125dd = d60Var.f976d;
        if (this.f5519c != f) {
            mo1566a(f);
            this.f5519c = f;
        }
        if (!p30.m3002l(this.f5518b, c0348ja)) {
            mo1567b(c0348ja);
            this.f5518b = c0348ja;
        }
        k50 layoutDirection = d60Var.getLayoutDirection();
        if (this.f5520d != layoutDirection) {
            this.f5520d = layoutDirection;
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c0125dd.mo649c() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c0125dd.mo649c() & 4294967295L)) - Float.intBitsToFloat(i2);
        ((C0910x1) c0125dd.f1053e.f4480a).m5071k(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i2) > 0.0f) {
                    mo1569e(d60Var);
                }
            } finally {
                ((C0910x1) c0125dd.f1053e.f4480a).m5071k(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract long mo1568d();

    /* JADX INFO: renamed from: e */
    public abstract void mo1569e(d60 d60Var);
}
