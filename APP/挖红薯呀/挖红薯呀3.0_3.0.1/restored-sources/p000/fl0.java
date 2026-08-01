package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
final class fl0 extends te0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0742sw f1767a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public fl0(InterfaceC0742sw interfaceC0742sw) {
        this.f1767a = interfaceC0742sw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: e */
    public final oe0 mo228e() {
        gl0 gl0Var = new gl0();
        gl0Var.f2017r = this.f1767a;
        gl0Var.f2018s = -9223372034707292160L;
        return gl0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fl0) {
            return this.f1767a == ((fl0) obj).f1767a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: f */
    public final void mo229f(oe0 oe0Var) {
        gl0 gl0Var = (gl0) oe0Var;
        gl0Var.f2017r = this.f1767a;
        gl0Var.f2018s = -9223372034707292160L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f1767a.hashCode();
    }
}
