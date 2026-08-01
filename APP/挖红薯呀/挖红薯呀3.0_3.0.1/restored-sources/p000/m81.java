package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
final class m81 extends te0 {

    /* JADX INFO: renamed from: a */
    public final boolean f3866a;

    /* JADX INFO: renamed from: b */
    public final xg0 f3867b;

    /* JADX INFO: renamed from: c */
    public final boolean f3868c;

    /* JADX INFO: renamed from: d */
    public final xv0 f3869d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0742sw f3870e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public m81(boolean z, xg0 xg0Var, boolean z2, xv0 xv0Var, InterfaceC0742sw interfaceC0742sw) {
        this.f3866a = z;
        this.f3867b = xg0Var;
        this.f3868c = z2;
        this.f3869d = xv0Var;
        this.f3870e = interfaceC0742sw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: e */
    public final oe0 mo228e() {
        return new o81(this.f3866a, this.f3867b, this.f3868c, this.f3869d, this.f3870e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m81.class != obj.getClass()) {
            return false;
        }
        m81 m81Var = (m81) obj;
        return this.f3866a == m81Var.f3866a && p30.m3002l(this.f3867b, m81Var.f3867b) && this.f3868c == m81Var.f3868c && this.f3869d.equals(m81Var.f3869d) && this.f3870e == m81Var.f3870e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: f */
    public final void mo229f(oe0 oe0Var) {
        o81 o81Var = (o81) oe0Var;
        boolean z = o81Var.f4484P;
        boolean z2 = this.f3866a;
        if (z != z2) {
            o81Var.f4484P = z2;
            z60.m5417D(o81Var);
        }
        o81Var.f4485Q = this.f3870e;
        o81Var.m2617K0(this.f3867b, null, false, this.f3868c, this.f3869d, o81Var.f4486R);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f3866a) * 31;
        xg0 xg0Var = this.f3867b;
        return this.f3870e.hashCode() + AbstractC0748t1.m4144b(this.f3869d.f7427a, AbstractC0748t1.m4145c(AbstractC0748t1.m4145c((iHashCode + (xg0Var != null ? xg0Var.hashCode() : 0)) * 961, 31, false), 31, this.f3868c), 31);
    }
}
