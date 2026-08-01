package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class g51 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ pe0 f1859d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ x01 f1860e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ long f1861f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ float f1862g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ xg0 f1863h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean f1864i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC0298hw f1865j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ float f1866k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C0474mh f1867l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public g51(pe0 pe0Var, x01 x01Var, long j, float f, xg0 xg0Var, boolean z, InterfaceC0298hw interfaceC0298hw, float f2, C0474mh c0474mh) {
        this.f1859d = pe0Var;
        this.f1860e = x01Var;
        this.f1861f = j;
        this.f1862g = f;
        this.f1863h = xg0Var;
        this.f1864i = z;
        this.f1865j = interfaceC0298hw;
        this.f1866k = f2;
        this.f1867l = c0474mh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0356ji interfaceC0356ji = (InterfaceC0356ji) obj;
        int iIntValue = ((Number) obj2).intValue();
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        if (c0616pi.m3082O(iIntValue & 1, (iIntValue & 3) != 2)) {
            C0110cz c0110cz = j30.f2667a;
            pe0 pe0VarMo2499c = rd0.m3480i(h51.m1276b(this.f1859d.mo2499c(ke0.f3087a), this.f1860e, h51.m1277c(this.f1861f, this.f1862g, c0616pi), null, ((InterfaceC0968ym) c0616pi.m3112j(AbstractC0131dj.f1121h)).mo654p(this.f1866k)), this.f1863h, uv0.m4359a(0.0f, 7), this.f1864i, this.f1865j).mo2499c(new C0280he(new pg0(1)));
            xd0 xd0VarM5467d = AbstractC0993za.m5467d(C0496n2.f4145e, true);
            int iM2776p = o30.m2776p(c0616pi);
            fq0 fq0VarM3115l = c0616pi.m3115l();
            pe0 pe0VarM4020E = s91.m4020E(c0616pi, pe0VarMo2499c);
            InterfaceC0210fi.f1733b.getClass();
            C0094cj c0094cj = C0173ei.f1457b;
            c0616pi.m3093Z();
            if (c0616pi.f4877S) {
                c0616pi.m3114k(c0094cj);
            } else {
                c0616pi.m3113j0();
            }
            w60.m4888J(c0616pi, C0173ei.f1460e, xd0VarM5467d);
            w60.m4888J(c0616pi, C0173ei.f1459d, fq0VarM3115l);
            C0462m7 c0462m7 = C0173ei.f1461f;
            if (c0616pi.f4877S || !p30.m3002l(c0616pi.m3080L(), Integer.valueOf(iM2776p))) {
                AbstractC0748t1.m4157o(iM2776p, c0616pi, iM2776p, c0462m7);
            }
            w60.m4888J(c0616pi, C0173ei.f1458c, pe0VarM4020E);
            this.f1867l.invoke(c0616pi, 0);
            c0616pi.m3119p(true);
        } else {
            c0616pi.m3085R();
        }
        return na1.f4229a;
    }
}
