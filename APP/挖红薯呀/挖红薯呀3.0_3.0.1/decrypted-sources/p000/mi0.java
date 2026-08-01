package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class mi0 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ei0 f3984d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f3985e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean f3986f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ o31 f3987g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC0904ww f3988h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public mi0(ei0 ei0Var, boolean z, boolean z2, o31 o31Var, InterfaceC0904ww interfaceC0904ww) {
        this.f3984d = ei0Var;
        this.f3985e = z;
        this.f3986f = z2;
        this.f3987g = o31Var;
        this.f3988h = interfaceC0904ww;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0356ji interfaceC0356ji = (InterfaceC0356ji) obj;
        int iIntValue = ((Number) obj2).intValue();
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        if (c0616pi.m3082O(iIntValue & 1, (iIntValue & 3) != 2)) {
            s71 s71VarM1076a = fa1.m1076a(AbstractC0307i4.f2432m, c0616pi);
            boolean z = this.f3986f;
            ei0 ei0Var = this.f3984d;
            r60.m3401c(((C0207ff) p11.m2964a(!z ? ei0Var.f1469g : this.f3985e ? ei0Var.f1464b : ei0Var.f1467e, this.f3987g, c0616pi).getValue()).f1709a, s71VarM1076a, this.f3988h, c0616pi, 0);
        } else {
            c0616pi.m3085R();
        }
        return na1.f4229a;
    }
}
