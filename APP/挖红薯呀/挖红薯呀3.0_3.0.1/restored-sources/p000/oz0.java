package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
final class oz0 extends te0 {

    /* JADX INFO: renamed from: a */
    public final boolean f4681a;

    /* JADX INFO: renamed from: b */
    public final xg0 f4682b;

    /* JADX INFO: renamed from: c */
    public final boolean f4683c;

    /* JADX INFO: renamed from: d */
    public final xv0 f4684d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0298hw f4685e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public oz0(boolean z, xg0 xg0Var, boolean z2, xv0 xv0Var, InterfaceC0298hw interfaceC0298hw) {
        this.f4681a = z;
        this.f4682b = xg0Var;
        this.f4683c = z2;
        this.f4684d = xv0Var;
        this.f4685e = interfaceC0298hw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: e */
    public final oe0 mo228e() {
        pz0 pz0Var = new pz0(this.f4682b, null, false, this.f4683c, this.f4684d, this.f4685e);
        pz0Var.f5005P = this.f4681a;
        return pz0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || oz0.class != obj.getClass()) {
            return false;
        }
        oz0 oz0Var = (oz0) obj;
        return this.f4681a == oz0Var.f4681a && p30.m3002l(this.f4682b, oz0Var.f4682b) && this.f4683c == oz0Var.f4683c && this.f4684d.equals(oz0Var.f4684d) && this.f4685e == oz0Var.f4685e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: f */
    public final void mo229f(oe0 oe0Var) {
        pz0 pz0Var = (pz0) oe0Var;
        boolean z = pz0Var.f5005P;
        boolean z2 = this.f4681a;
        if (z != z2) {
            pz0Var.f5005P = z2;
            z60.m5417D(pz0Var);
        }
        pz0Var.m2617K0(this.f4682b, null, false, this.f4683c, this.f4684d, this.f4685e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f4681a) * 31;
        xg0 xg0Var = this.f4682b;
        return this.f4685e.hashCode() + AbstractC0748t1.m4144b(this.f4684d.f7427a, AbstractC0748t1.m4145c(AbstractC0748t1.m4145c((iHashCode + (xg0Var != null ? xg0Var.hashCode() : 0)) * 961, 31, false), 31, this.f4683c), 31);
    }
}
