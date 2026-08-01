package p000;

/* JADX INFO: renamed from: qq */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
final class C0661qq extends te0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0742sw f5208a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0661qq(InterfaceC0742sw interfaceC0742sw) {
        this.f5208a = interfaceC0742sw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: e */
    public final oe0 mo228e() {
        C0624pq c0624pq = new C0624pq();
        c0624pq.f4941r = this.f5208a;
        return c0624pq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0661qq) {
            return this.f5208a == ((C0661qq) obj).f5208a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: f */
    public final void mo229f(oe0 oe0Var) {
        ((C0624pq) oe0Var).f4941r = this.f5208a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f5208a.hashCode();
    }
}
