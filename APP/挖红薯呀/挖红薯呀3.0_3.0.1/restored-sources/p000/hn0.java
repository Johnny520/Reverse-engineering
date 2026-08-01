package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
final class hn0 extends te0 {

    /* JADX INFO: renamed from: a */
    public final float f2325a;

    /* JADX INFO: renamed from: b */
    public final float f2326b;

    /* JADX INFO: renamed from: c */
    public final float f2327c;

    /* JADX INFO: renamed from: d */
    public final float f2328d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public hn0(float f, float f2, float f3, float f4) {
        this.f2325a = f;
        this.f2326b = f2;
        this.f2327c = f3;
        this.f2328d = f4;
        boolean z = true;
        boolean z2 = (f >= 0.0f || Float.isNaN(f)) & (f2 >= 0.0f || Float.isNaN(f2)) & (f3 >= 0.0f || Float.isNaN(f3));
        if (f4 < 0.0f && !Float.isNaN(f4)) {
            z = false;
        }
        if (!z2 || !z) {
            u10.m4244a("Padding must be non-negative");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: e */
    public final oe0 mo228e() {
        in0 in0Var = new in0();
        in0Var.f2587r = this.f2325a;
        in0Var.f2588s = this.f2326b;
        in0Var.f2589t = this.f2327c;
        in0Var.f2590u = this.f2328d;
        in0Var.f2591v = true;
        return in0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        hn0 hn0Var = obj instanceof hn0 ? (hn0) obj : null;
        return hn0Var != null && C0520np.m2732b(this.f2325a, hn0Var.f2325a) && C0520np.m2732b(this.f2326b, hn0Var.f2326b) && C0520np.m2732b(this.f2327c, hn0Var.f2327c) && C0520np.m2732b(this.f2328d, hn0Var.f2328d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: f */
    public final void mo229f(oe0 oe0Var) {
        in0 in0Var = (in0) oe0Var;
        in0Var.f2587r = this.f2325a;
        in0Var.f2588s = this.f2326b;
        in0Var.f2589t = this.f2327c;
        in0Var.f2590u = this.f2328d;
        in0Var.f2591v = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(true) + AbstractC0748t1.m4143a(this.f2328d, AbstractC0748t1.m4143a(this.f2327c, AbstractC0748t1.m4143a(this.f2326b, Float.hashCode(this.f2325a) * 31, 31), 31), 31);
    }
}
