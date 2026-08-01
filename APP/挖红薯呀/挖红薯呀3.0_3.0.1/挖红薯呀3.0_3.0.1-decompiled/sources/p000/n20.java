package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
final class n20 extends te0 {

    /* JADX INFO: renamed from: a */
    public final fd1 f4168a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public n20(fd1 fd1Var) {
        this.f4168a = fd1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: e */
    public final oe0 mo228e() {
        p20 p20Var = new p20();
        p20Var.f4696t = this.f4168a;
        return p20Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n20) {
            return p30.m3002l(((n20) obj).f4168a, this.f4168a);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: f */
    public final void mo229f(oe0 oe0Var) {
        p20 p20Var = (p20) oe0Var;
        fd1 fd1Var = p20Var.f4696t;
        fd1 fd1Var2 = this.f4168a;
        if (p30.m3002l(fd1Var2, fd1Var)) {
            return;
        }
        p20Var.f4696t = fd1Var2;
        p20Var.mo1762x0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f4168a.hashCode();
    }
}
