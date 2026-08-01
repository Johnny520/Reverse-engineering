package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
final class re1 extends te0 {

    /* JADX INFO: renamed from: a */
    public final EnumC0062bo f5384a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0904ww f5385b;

    /* JADX INFO: renamed from: c */
    public final Object f5386c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public re1(EnumC0062bo enumC0062bo, InterfaceC0904ww interfaceC0904ww, Object obj) {
        this.f5384a = enumC0062bo;
        this.f5385b = interfaceC0904ww;
        this.f5386c = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: e */
    public final oe0 mo228e() {
        te1 te1Var = new te1();
        te1Var.f5990r = this.f5384a;
        te1Var.f5991s = this.f5385b;
        return te1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || re1.class != obj.getClass()) {
            return false;
        }
        re1 re1Var = (re1) obj;
        return this.f5384a == re1Var.f5384a && this.f5386c.equals(re1Var.f5386c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: f */
    public final void mo229f(oe0 oe0Var) {
        te1 te1Var = (te1) oe0Var;
        te1Var.f5990r = this.f5384a;
        te1Var.f5991s = this.f5385b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f5386c.hashCode() + AbstractC0748t1.m4145c(this.f5384a.hashCode() * 31, 31, false);
    }
}
