package p000;

/* JADX INFO: renamed from: az */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0036az extends te0 {

    /* JADX INFO: renamed from: a */
    public final C0202fa f301a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0036az(C0202fa c0202fa) {
        this.f301a = c0202fa;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: e */
    public final oe0 mo228e() {
        C0072bz c0072bz = new C0072bz();
        c0072bz.f611r = this.f301a;
        return c0072bz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C0036az c0036az = obj instanceof C0036az ? (C0036az) obj : null;
        if (c0036az == null) {
            return false;
        }
        return this.f301a.equals(c0036az.f301a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: f */
    public final void mo229f(oe0 oe0Var) {
        ((C0072bz) oe0Var).f611r = this.f301a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f301a.f1639a);
    }
}
