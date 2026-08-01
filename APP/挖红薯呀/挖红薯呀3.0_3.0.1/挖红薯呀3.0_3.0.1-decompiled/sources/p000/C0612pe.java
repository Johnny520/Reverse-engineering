package p000;

/* JADX INFO: renamed from: pe */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0612pe implements InterfaceC0941xw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ f10 f4815d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f4816e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC0298hw f4817f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0612pe(f10 f10Var, boolean z, InterfaceC0298hw interfaceC0298hw) {
        this.f4815d = f10Var;
        this.f4816e = z;
        this.f4817f = interfaceC0298hw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0941xw
    /* JADX INFO: renamed from: a */
    public final Object mo353a(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        C0616pi c0616pi = (C0616pi) ((InterfaceC0356ji) obj2);
        c0616pi.m3090W(-1525724089);
        Object objM3080L = c0616pi.m3080L();
        if (objM3080L == C0320ii.f2572a) {
            objM3080L = new xg0();
            c0616pi.m3107g0(objM3080L);
        }
        xg0 xg0Var = (xg0) objM3080L;
        pe0 pe0VarMo2499c = c10.m386a(me0.f3922a, xg0Var, this.f4815d).mo2499c(new C0548oe(xg0Var, null, false, this.f4816e, this.f4817f));
        c0616pi.m3119p(false);
        return pe0VarMo2499c;
    }
}
