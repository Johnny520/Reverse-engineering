package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
final class kn0 extends te0 {

    /* JADX INFO: renamed from: a */
    public final jn0 f3221a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public kn0(jn0 jn0Var) {
        this.f3221a = jn0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: e */
    public final oe0 mo228e() {
        mn0 mn0Var = new mn0();
        mn0Var.f4009r = this.f3221a;
        return mn0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        kn0 kn0Var = obj instanceof kn0 ? (kn0) obj : null;
        if (kn0Var == null) {
            return false;
        }
        return p30.m3002l(this.f3221a, kn0Var.f3221a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: f */
    public final void mo229f(oe0 oe0Var) {
        ((mn0) oe0Var).f4009r = this.f3221a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3221a.hashCode();
    }
}
