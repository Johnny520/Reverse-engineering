package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class s60 extends te0 {

    /* JADX INFO: renamed from: a */
    public final float f5658a;

    /* JADX INFO: renamed from: b */
    public final boolean f5659b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public s60(float f, boolean z) {
        this.f5658a = f;
        this.f5659b = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: e */
    public final oe0 mo228e() {
        t60 t60Var = new t60();
        t60Var.f5933r = this.f5658a;
        t60Var.f5934s = this.f5659b;
        return t60Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        s60 s60Var = obj instanceof s60 ? (s60) obj : null;
        return s60Var != null && this.f5658a == s60Var.f5658a && this.f5659b == s60Var.f5659b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: f */
    public final void mo229f(oe0 oe0Var) {
        t60 t60Var = (t60) oe0Var;
        t60Var.f5933r = this.f5658a;
        t60Var.f5934s = this.f5659b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f5659b) + (Float.hashCode(this.f5658a) * 31);
    }
}
