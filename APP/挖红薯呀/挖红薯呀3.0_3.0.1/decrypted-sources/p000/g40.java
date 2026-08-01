package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class g40 extends C0884wc {

    /* JADX INFO: renamed from: n */
    public final C0550og f1854n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public g40(InterfaceC0322ik interfaceC0322ik, C0550og c0550og) {
        super(1, interfaceC0322ik);
        this.f1854n = c0550og;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.C0884wc
    /* JADX INFO: renamed from: C */
    public final String mo1200C() {
        return "AwaitContinuation";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.C0884wc
    /* JADX INFO: renamed from: r */
    public final Throwable mo1201r(j40 j40Var) {
        Throwable thM1553e;
        Object objM1622N = this.f1854n.m1622N();
        return (!(objM1622N instanceof i40) || (thM1553e = ((i40) objM1622N).m1553e()) == null) ? objM1622N instanceof C0688rg ? ((C0688rg) objM1622N).f5416a : j40Var.mo481o() : thM1553e;
    }
}
