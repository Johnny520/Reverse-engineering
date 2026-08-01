package p000;

/* JADX INFO: renamed from: ne */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0509ne extends te0 implements tz0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0742sw f4246a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0509ne(InterfaceC0742sw interfaceC0742sw) {
        this.f4246a = interfaceC0742sw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.tz0
    /* JADX INFO: renamed from: d */
    public final sz0 mo2694d() {
        sz0 sz0Var = new sz0();
        sz0Var.f5879f = false;
        sz0Var.f5880g = true;
        this.f4246a.invoke(sz0Var);
        return sz0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: e */
    public final oe0 mo228e() {
        return new C0434lk(this.f4246a, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0509ne) {
            return this.f4246a == ((C0509ne) obj).f4246a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: f */
    public final void mo229f(oe0 oe0Var) {
        ((C0434lk) oe0Var).f3510s = this.f4246a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f4246a.hashCode();
    }
}
