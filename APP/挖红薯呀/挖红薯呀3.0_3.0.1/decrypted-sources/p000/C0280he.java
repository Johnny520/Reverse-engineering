package p000;

/* JADX INFO: renamed from: he */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0280he extends te0 {

    /* JADX INFO: renamed from: a */
    public final pg0 f2220a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0280he(pg0 pg0Var) {
        this.f2220a = pg0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: e */
    public final oe0 mo228e() {
        C0243ge c0243ge = new C0243ge();
        c0243ge.f1929r = this.f2220a;
        return c0243ge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0280he) {
            return this.f2220a == ((C0280he) obj).f2220a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: f */
    public final void mo229f(oe0 oe0Var) {
        C0243ge c0243ge = (C0243ge) oe0Var;
        c0243ge.f1929r = this.f2220a;
        z60.m5417D(c0243ge);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f2220a.hashCode();
    }
}
