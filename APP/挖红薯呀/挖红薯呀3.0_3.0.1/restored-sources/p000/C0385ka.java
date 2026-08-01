package p000;

/* JADX INFO: renamed from: ka */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
final class C0385ka extends te0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0742sw f3054a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0385ka(InterfaceC0742sw interfaceC0742sw) {
        this.f3054a = interfaceC0742sw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: e */
    public final oe0 mo228e() {
        C0424la c0424la = new C0424la();
        c0424la.f3398r = this.f3054a;
        return c0424la;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0385ka) {
            return this.f3054a == ((C0385ka) obj).f3054a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: f */
    public final void mo229f(oe0 oe0Var) {
        qj0 qj0Var;
        C0424la c0424la = (C0424la) oe0Var;
        InterfaceC0742sw interfaceC0742sw = this.f3054a;
        c0424la.f3398r = interfaceC0742sw;
        if (c0424la.f4529d.f4542q && (qj0Var = pf1.m3037O(c0424la, 2).f5181s) != null) {
            qj0Var.m3287c1(interfaceC0742sw, true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3054a.hashCode();
    }
}
