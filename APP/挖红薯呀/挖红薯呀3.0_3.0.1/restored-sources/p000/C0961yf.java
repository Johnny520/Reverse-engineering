package p000;

/* JADX INFO: renamed from: yf */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
final class C0961yf extends te0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0298hw f7617a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0298hw f7618b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0961yf(InterfaceC0298hw interfaceC0298hw, InterfaceC0298hw interfaceC0298hw2) {
        this.f7617a = interfaceC0298hw;
        this.f7618b = interfaceC0298hw2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: e */
    public final oe0 mo228e() {
        return new C0128dg(this.f7617a, this.f7618b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0961yf.class != obj.getClass()) {
            return false;
        }
        C0961yf c0961yf = (C0961yf) obj;
        return this.f7617a == c0961yf.f7617a && this.f7618b == c0961yf.f7618b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: f */
    public final void mo229f(oe0 oe0Var) {
        s51 s51Var;
        C0128dg c0128dg = (C0128dg) oe0Var;
        c0128dg.f1094P = true;
        boolean z = false;
        boolean z2 = c0128dg.f1093O == null;
        InterfaceC0298hw interfaceC0298hw = this.f7618b;
        if (z2 != (interfaceC0298hw == null)) {
            c0128dg.m2612C0();
            z60.m5417D(c0128dg);
            z = true;
        }
        c0128dg.f1093O = interfaceC0298hw;
        boolean z3 = c0128dg.f4108x ? z : true;
        c0128dg.m2617K0(null, null, true, true, null, this.f7617a);
        if (!z3 || (s51Var = c0128dg.f4092B) == null) {
            return;
        }
        s51Var.m4007x0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.f7617a.hashCode() + AbstractC0748t1.m4145c(Boolean.hashCode(true) * 31, 29791, true)) * 961;
        InterfaceC0298hw interfaceC0298hw = this.f7618b;
        return Boolean.hashCode(true) + ((iHashCode + (interfaceC0298hw != null ? interfaceC0298hw.hashCode() : 0)) * 961);
    }
}
