package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
final class f81 extends te0 {

    /* JADX INFO: renamed from: a */
    public final g30 f1628a;

    /* JADX INFO: renamed from: b */
    public final boolean f1629b;

    /* JADX INFO: renamed from: c */
    public final o31 f1630c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f81(g30 g30Var, boolean z, o31 o31Var) {
        this.f1628a = g30Var;
        this.f1629b = z;
        this.f1630c = o31Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: e */
    public final oe0 mo228e() {
        i81 i81Var = new i81();
        i81Var.f2482r = this.f1628a;
        i81Var.f2483s = this.f1629b;
        i81Var.f2484t = this.f1630c;
        i81Var.f2488x = Float.NaN;
        i81Var.f2489y = Float.NaN;
        return i81Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f81)) {
            return false;
        }
        f81 f81Var = (f81) obj;
        return p30.m3002l(this.f1628a, f81Var.f1628a) && this.f1629b == f81Var.f1629b && this.f1630c.equals(f81Var.f1630c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: f */
    public final void mo229f(oe0 oe0Var) {
        i81 i81Var = (i81) oe0Var;
        i81Var.f2482r = this.f1628a;
        boolean z = i81Var.f2483s;
        boolean z2 = this.f1629b;
        if (z != z2) {
            v50.m4407m(i81Var);
        }
        i81Var.f2483s = z2;
        i81Var.f2484t = this.f1630c;
        if (i81Var.f2487w == null && !Float.isNaN(i81Var.f2489y)) {
            i81Var.f2487w = AbstractC0398kl.m1916b(i81Var.f2489y);
        }
        if (i81Var.f2486v != null || Float.isNaN(i81Var.f2488x)) {
            return;
        }
        i81Var.f2486v = AbstractC0398kl.m1916b(i81Var.f2488x);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f1630c.hashCode() + AbstractC0748t1.m4145c(this.f1628a.hashCode() * 31, 31, this.f1629b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ThumbElement(interactionSource=" + this.f1628a + ", checked=" + this.f1629b + ", animationSpec=" + this.f1630c + ')';
    }
}
