package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ex0 implements v90, AutoCloseable {

    /* JADX INFO: renamed from: d */
    public final String f1542d;

    /* JADX INFO: renamed from: e */
    public final dx0 f1543e;

    /* JADX INFO: renamed from: f */
    public boolean f1544f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ex0(String str, dx0 dx0Var) {
        this.f1542d = str;
        this.f1543e = dx0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m975d(s90 s90Var, kx0 kx0Var) {
        kx0Var.getClass();
        s90Var.getClass();
        if (this.f1544f) {
            C0921xc.m5134o("Already attached to lifecycleOwner");
            return;
        }
        this.f1544f = true;
        s90Var.mo4014a(this);
        kx0Var.m1962c(this.f1542d, (C0925xg) this.f1543e.f1207a.f5331e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.v90
    /* JADX INFO: renamed from: e */
    public final void mo350e(x90 x90Var, q90 q90Var) {
        if (q90Var == q90.ON_DESTROY) {
            this.f1544f = false;
            x90Var.getLifecycle().mo4015b(this);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
