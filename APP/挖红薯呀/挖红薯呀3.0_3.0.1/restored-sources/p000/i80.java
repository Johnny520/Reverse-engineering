package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
final class i80 extends te0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0298hw f2478a;

    /* JADX INFO: renamed from: b */
    public final f80 f2479b;

    /* JADX INFO: renamed from: c */
    public final um0 f2480c;

    /* JADX INFO: renamed from: d */
    public final boolean f2481d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public i80(InterfaceC0298hw interfaceC0298hw, f80 f80Var, um0 um0Var, boolean z) {
        this.f2478a = interfaceC0298hw;
        this.f2479b = f80Var;
        this.f2480c = um0Var;
        this.f2481d = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: e */
    public final oe0 mo228e() {
        return new m80(this.f2478a, this.f2479b, this.f2480c, this.f2481d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i80)) {
            return false;
        }
        i80 i80Var = (i80) obj;
        return this.f2478a == i80Var.f2478a && p30.m3002l(this.f2479b, i80Var.f2479b) && this.f2480c == i80Var.f2480c && this.f2481d == i80Var.f2481d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: f */
    public final void mo229f(oe0 oe0Var) {
        m80 m80Var = (m80) oe0Var;
        m80Var.f3859r = this.f2478a;
        m80Var.f3860s = this.f2479b;
        um0 um0Var = m80Var.f3861t;
        um0 um0Var2 = this.f2480c;
        if (um0Var != um0Var2) {
            m80Var.f3861t = um0Var2;
            z60.m5417D(m80Var);
        }
        boolean z = m80Var.f3862u;
        boolean z2 = this.f2481d;
        if (z == z2) {
            return;
        }
        m80Var.f3862u = z2;
        m80Var.m2448w0();
        z60.m5417D(m80Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(false) + AbstractC0748t1.m4145c((this.f2480c.hashCode() + ((this.f2479b.hashCode() + (this.f2478a.hashCode() * 31)) * 31)) * 31, 31, this.f2481d);
    }
}
