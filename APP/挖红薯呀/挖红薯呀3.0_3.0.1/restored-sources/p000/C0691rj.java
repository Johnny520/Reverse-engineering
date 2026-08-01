package p000;

/* JADX INFO: renamed from: rj */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
final class C0691rj extends te0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0742sw f5424a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0691rj(InterfaceC0742sw interfaceC0742sw) {
        this.f5424a = interfaceC0742sw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: e */
    public final oe0 mo228e() {
        C0728sj c0728sj = new C0728sj();
        c0728sj.f5773t = this.f5424a;
        return c0728sj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0691rj) && ((C0691rj) obj).f5424a == this.f5424a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: f */
    public final void mo229f(oe0 oe0Var) {
        C0728sj c0728sj = (C0728sj) oe0Var;
        InterfaceC0742sw interfaceC0742sw = c0728sj.f5773t;
        InterfaceC0742sw interfaceC0742sw2 = this.f5424a;
        if (interfaceC0742sw2 != interfaceC0742sw) {
            c0728sj.f5773t = interfaceC0742sw2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f5424a.hashCode();
    }
}
