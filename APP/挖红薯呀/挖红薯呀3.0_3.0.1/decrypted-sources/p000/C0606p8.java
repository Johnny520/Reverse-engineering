package p000;

/* JADX INFO: renamed from: p8 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0606p8 extends te0 implements tz0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0742sw f4777a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0606p8(InterfaceC0742sw interfaceC0742sw) {
        this.f4777a = interfaceC0742sw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.tz0
    /* JADX INFO: renamed from: d */
    public final sz0 mo2694d() {
        sz0 sz0Var = new sz0();
        sz0Var.f5879f = false;
        this.f4777a.invoke(sz0Var);
        return sz0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: e */
    public final oe0 mo228e() {
        return new C0434lk(this.f4777a, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0606p8) && this.f4777a == ((C0606p8) obj).f4777a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: f */
    public final void mo229f(oe0 oe0Var) {
        C0434lk c0434lk = (C0434lk) oe0Var;
        c0434lk.getClass();
        c0434lk.f3510s = this.f4777a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f4777a.hashCode() + (Boolean.hashCode(false) * 31);
    }
}
