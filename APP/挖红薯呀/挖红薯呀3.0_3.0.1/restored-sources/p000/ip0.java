package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
final class ip0 extends te0 {

    /* JADX INFO: renamed from: a */
    public final dp0 f2601a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ip0(dp0 dp0Var) {
        this.f2601a = dp0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: e */
    public final oe0 mo228e() {
        jp0 jp0Var = new jp0();
        jp0Var.f2923r = 1.0f;
        jp0Var.f2924s = this.f2601a;
        return jp0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ip0) && p30.m3002l(this.f2601a, ((ip0) obj).f2601a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: f */
    public final void mo229f(oe0 oe0Var) {
        jp0 jp0Var = (jp0) oe0Var;
        jp0Var.f2923r = 1.0f;
        jp0Var.f2924s = this.f2601a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        dp0 dp0Var = this.f2601a;
        return Float.hashCode(1.0f) + ((dp0Var != null ? dp0Var.hashCode() : 0) * 961);
    }
}
