package p000;

/* JADX INFO: renamed from: oe */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
final class C0548oe extends te0 {

    /* JADX INFO: renamed from: a */
    public final xg0 f4524a;

    /* JADX INFO: renamed from: b */
    public final f10 f4525b;

    /* JADX INFO: renamed from: c */
    public final boolean f4526c;

    /* JADX INFO: renamed from: d */
    public final boolean f4527d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0298hw f4528e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0548oe(xg0 xg0Var, f10 f10Var, boolean z, boolean z2, InterfaceC0298hw interfaceC0298hw) {
        this.f4524a = xg0Var;
        this.f4525b = f10Var;
        this.f4526c = z;
        this.f4527d = z2;
        this.f4528e = interfaceC0298hw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: e */
    public final oe0 mo228e() {
        return new C0649qe(this.f4524a, this.f4525b, this.f4526c, this.f4527d, null, this.f4528e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0548oe.class != obj.getClass()) {
            return false;
        }
        C0548oe c0548oe = (C0548oe) obj;
        return p30.m3002l(this.f4524a, c0548oe.f4524a) && p30.m3002l(this.f4525b, c0548oe.f4525b) && this.f4526c == c0548oe.f4526c && this.f4527d == c0548oe.f4527d && this.f4528e == c0548oe.f4528e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: f */
    public final void mo229f(oe0 oe0Var) {
        ((C0649qe) oe0Var).m2617K0(this.f4524a, this.f4525b, this.f4526c, this.f4527d, null, this.f4528e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        xg0 xg0Var = this.f4524a;
        int iHashCode = (xg0Var != null ? xg0Var.hashCode() : 0) * 31;
        f10 f10Var = this.f4525b;
        return this.f4528e.hashCode() + AbstractC0748t1.m4145c(AbstractC0748t1.m4145c((iHashCode + (f10Var != null ? f10Var.hashCode() : 0)) * 31, 31, this.f4526c), 29791, this.f4527d);
    }
}
