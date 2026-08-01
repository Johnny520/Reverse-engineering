package p000;

/* JADX INFO: renamed from: ns */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
final class C0523ns extends te0 {

    /* JADX INFO: renamed from: a */
    public final b91 f4320a;

    /* JADX INFO: renamed from: b */
    public final w81 f4321b;

    /* JADX INFO: renamed from: c */
    public final w81 f4322c;

    /* JADX INFO: renamed from: d */
    public final C0863vs f4323d;

    /* JADX INFO: renamed from: e */
    public final C0367jt f4324e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC0298hw f4325f;

    /* JADX INFO: renamed from: g */
    public final C0589os f4326g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0523ns(b91 b91Var, w81 w81Var, w81 w81Var2, C0863vs c0863vs, C0367jt c0367jt, InterfaceC0298hw interfaceC0298hw, C0589os c0589os) {
        this.f4320a = b91Var;
        this.f4321b = w81Var;
        this.f4322c = w81Var2;
        this.f4323d = c0863vs;
        this.f4324e = c0367jt;
        this.f4325f = interfaceC0298hw;
        this.f4326g = c0589os;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: e */
    public final oe0 mo228e() {
        return new C0814us(this.f4320a, this.f4321b, this.f4322c, this.f4323d, this.f4324e, this.f4325f, this.f4326g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C0523ns)) {
            return false;
        }
        C0523ns c0523ns = (C0523ns) obj;
        return c0523ns.f4320a == this.f4320a && p30.m3002l(c0523ns.f4321b, this.f4321b) && p30.m3002l(c0523ns.f4322c, this.f4322c) && c0523ns.f4323d.equals(this.f4323d) && c0523ns.f4324e.equals(this.f4324e) && c0523ns.f4325f == this.f4325f && p30.m3002l(c0523ns.f4326g, this.f4326g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: f */
    public final void mo229f(oe0 oe0Var) {
        C0814us c0814us = (C0814us) oe0Var;
        c0814us.f6287r = this.f4320a;
        c0814us.f6288s = this.f4321b;
        c0814us.f6289t = this.f4322c;
        c0814us.f6290u = this.f4323d;
        c0814us.f6291v = this.f4324e;
        c0814us.f6292w = this.f4325f;
        c0814us.f6293x = this.f4326g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.f4320a.hashCode() * 31;
        w81 w81Var = this.f4321b;
        int iHashCode2 = (iHashCode + (w81Var != null ? w81Var.hashCode() : 0)) * 31;
        w81 w81Var2 = this.f4322c;
        return this.f4326g.hashCode() + ((this.f4325f.hashCode() + ((this.f4324e.f2940a.hashCode() + ((this.f4323d.f6810a.hashCode() + ((iHashCode2 + (w81Var2 != null ? w81Var2.hashCode() : 0)) * 961)) * 31)) * 31)) * 31);
    }
}
