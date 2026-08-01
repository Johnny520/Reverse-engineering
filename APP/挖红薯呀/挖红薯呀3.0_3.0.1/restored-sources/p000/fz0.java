package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class fz0 extends te0 {

    /* JADX INFO: renamed from: a */
    public final py0 f1825a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public fz0(py0 py0Var) {
        this.f1825a = py0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: e */
    public final oe0 mo228e() {
        ly0 ly0Var = new ly0();
        ly0Var.f3619r = this.f1825a;
        ly0Var.f3620s = true;
        return ly0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof fz0) {
            return p30.m3002l(this.f1825a, ((fz0) obj).f1825a);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: f */
    public final void mo229f(oe0 oe0Var) {
        ly0 ly0Var = (ly0) oe0Var;
        ly0Var.f3619r = this.f1825a;
        ly0Var.f3620s = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(true) + AbstractC0748t1.m4145c(this.f1825a.hashCode() * 31, 31, false);
    }
}
