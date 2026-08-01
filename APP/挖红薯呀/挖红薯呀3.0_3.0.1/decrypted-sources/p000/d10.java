package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
final class d10 extends te0 {

    /* JADX INFO: renamed from: a */
    public final g30 f924a;

    /* JADX INFO: renamed from: b */
    public final f10 f925b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d10(g30 g30Var, f10 f10Var) {
        this.f924a = g30Var;
        this.f925b = f10Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: e */
    public final oe0 mo228e() {
        InterfaceC0694rm interfaceC0694rmMo979a = this.f925b.mo979a(this.f924a);
        e10 e10Var = new e10();
        e10Var.f1259t = interfaceC0694rmMo979a;
        e10Var.m4086w0(interfaceC0694rmMo979a);
        return e10Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d10)) {
            return false;
        }
        d10 d10Var = (d10) obj;
        return p30.m3002l(this.f924a, d10Var.f924a) && p30.m3002l(this.f925b, d10Var.f925b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: f */
    public final void mo229f(oe0 oe0Var) {
        e10 e10Var = (e10) oe0Var;
        InterfaceC0694rm interfaceC0694rmMo979a = this.f925b.mo979a(this.f924a);
        e10Var.m4087x0(e10Var.f1259t);
        e10Var.f1259t = interfaceC0694rmMo979a;
        e10Var.m4086w0(interfaceC0694rmMo979a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f925b.hashCode() + (this.f924a.hashCode() * 31);
    }
}
