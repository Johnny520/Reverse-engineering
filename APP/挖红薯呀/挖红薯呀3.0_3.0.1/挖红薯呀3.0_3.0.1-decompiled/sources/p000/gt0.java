package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class gt0 implements x31, InterfaceC0296hu, InterfaceC0334ix {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ z31 f2048d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public gt0(z31 z31Var) {
        this.f2048d = z31Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0296hu
    /* JADX INFO: renamed from: b */
    public final Object mo609b(InterfaceC0331iu interfaceC0331iu, InterfaceC0322ik interfaceC0322ik) throws Throwable {
        this.f2048d.mo609b(interfaceC0331iu, interfaceC0322ik);
        return EnumC1007zk.f7916d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0334ix
    /* JADX INFO: renamed from: c */
    public final InterfaceC0296hu mo981c(InterfaceC0618pk interfaceC0618pk, int i, EnumC0758tb enumC0758tb) {
        return ((((i < 0 || i >= 2) && i != -2) || enumC0758tb != EnumC0758tb.f5969e) && !((i == 0 || i == -3) && enumC0758tb == EnumC0758tb.f5968d)) ? new C0611pd(this, interfaceC0618pk, i, enumC0758tb) : this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.x31
    public final Object getValue() {
        return this.f2048d.getValue();
    }
}
