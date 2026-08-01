package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class zx0 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f8029d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC0904ww f8030e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0474mh f8031f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC0904ww f8032g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC0904ww f8033h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ uh0 f8034i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C0474mh f8035j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public zx0(int i, InterfaceC0904ww interfaceC0904ww, C0474mh c0474mh, InterfaceC0904ww interfaceC0904ww2, InterfaceC0904ww interfaceC0904ww3, uh0 uh0Var, C0474mh c0474mh2) {
        this.f8029d = i;
        this.f8030e = interfaceC0904ww;
        this.f8031f = c0474mh;
        this.f8032g = interfaceC0904ww2;
        this.f8033h = interfaceC0904ww3;
        this.f8034i = uh0Var;
        this.f8035j = c0474mh2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0356ji interfaceC0356ji = (InterfaceC0356ji) obj;
        int iIntValue = ((Number) obj2).intValue();
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        if (c0616pi.m3082O(iIntValue & 1, (iIntValue & 3) != 2)) {
            z60.m5433c(this.f8029d, this.f8030e, this.f8031f, this.f8032g, this.f8033h, this.f8034i, this.f8035j, c0616pi, 0);
        } else {
            c0616pi.m3085R();
        }
        return na1.f4229a;
    }
}
