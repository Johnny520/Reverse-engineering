package p000;

/* JADX INFO: renamed from: i2 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0305i2 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC0904ww f2397d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC0904ww f2398e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ long f2399f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ long f2400g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ long f2401h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0474mh f2402i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0305i2(InterfaceC0904ww interfaceC0904ww, InterfaceC0904ww interfaceC0904ww2, long j, long j2, long j3, long j4, C0474mh c0474mh) {
        this.f2397d = interfaceC0904ww;
        this.f2398e = interfaceC0904ww2;
        this.f2399f = j2;
        this.f2400g = j3;
        this.f2401h = j4;
        this.f2402i = c0474mh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0356ji interfaceC0356ji = (InterfaceC0356ji) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = 1;
        int i2 = 0;
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        if (c0616pi.m3082O(iIntValue & 1, (iIntValue & 3) != 2)) {
            pe0 pe0VarM3444C = rd0.m3444C(me0.f3922a, AbstractC0457m2.f3787a);
            C0838vf c0838vfM4197a = AbstractC0762tf.m4197a(C0496n2.f4157q, c0616pi, 0);
            int iM2776p = o30.m2776p(c0616pi);
            fq0 fq0VarM3115l = c0616pi.m3115l();
            pe0 pe0VarM4020E = s91.m4020E(c0616pi, pe0VarM3444C);
            InterfaceC0210fi.f1733b.getClass();
            C0094cj c0094cj = C0173ei.f1457b;
            c0616pi.m3093Z();
            if (c0616pi.f4877S) {
                c0616pi.m3114k(c0094cj);
            } else {
                c0616pi.m3113j0();
            }
            C0462m7 c0462m7 = C0173ei.f1460e;
            w60.m4888J(c0616pi, c0462m7, c0838vfM4197a);
            C0462m7 c0462m72 = C0173ei.f1459d;
            w60.m4888J(c0616pi, c0462m72, fq0VarM3115l);
            C0462m7 c0462m73 = C0173ei.f1461f;
            if (c0616pi.f4877S || !p30.m3002l(c0616pi.m3080L(), Integer.valueOf(iM2776p))) {
                AbstractC0748t1.m4157o(iM2776p, c0616pi, iM2776p, c0462m73);
            }
            C0462m7 c0462m74 = C0173ei.f1458c;
            w60.m4888J(c0616pi, c0462m74, pe0VarM4020E);
            c0616pi.m3090W(346092326);
            c0616pi.m3119p(false);
            InterfaceC0904ww interfaceC0904ww = this.f2397d;
            if (interfaceC0904ww == null) {
                c0616pi.m3090W(346396529);
            } else {
                c0616pi.m3090W(346396530);
                r60.m3401c(this.f2399f, fa1.m1076a(s91.f5705g, c0616pi), AbstractC0398kl.m1937w(71284337, new C0268h2(i2, interfaceC0904ww), c0616pi), c0616pi, 384);
            }
            c0616pi.m3119p(false);
            InterfaceC0904ww interfaceC0904ww2 = this.f2398e;
            if (interfaceC0904ww2 == null) {
                c0616pi.m3090W(347174009);
            } else {
                c0616pi.m3090W(347174010);
                r60.m3401c(this.f2400g, fa1.m1076a(s91.f5707i, c0616pi), AbstractC0398kl.m1937w(705583346, new C0268h2(i, interfaceC0904ww2), c0616pi), c0616pi, 384);
            }
            c0616pi.m3119p(false);
            C0036az c0036az = new C0036az(C0496n2.f4159s);
            xd0 xd0VarM5467d = AbstractC0993za.m5467d(C0496n2.f4145e, false);
            int iM2776p2 = o30.m2776p(c0616pi);
            fq0 fq0VarM3115l2 = c0616pi.m3115l();
            pe0 pe0VarM4020E2 = s91.m4020E(c0616pi, c0036az);
            c0616pi.m3093Z();
            if (c0616pi.f4877S) {
                c0616pi.m3114k(c0094cj);
            } else {
                c0616pi.m3113j0();
            }
            w60.m4888J(c0616pi, c0462m7, xd0VarM5467d);
            w60.m4888J(c0616pi, c0462m72, fq0VarM3115l2);
            if (c0616pi.f4877S || !p30.m3002l(c0616pi.m3080L(), Integer.valueOf(iM2776p2))) {
                AbstractC0748t1.m4157o(iM2776p2, c0616pi, iM2776p2, c0462m73);
            }
            w60.m4888J(c0616pi, c0462m74, pe0VarM4020E2);
            r60.m3401c(this.f2401h, fa1.m1076a(s91.f5701c, c0616pi), this.f2402i, c0616pi, 0);
            c0616pi.m3119p(true);
            c0616pi.m3119p(true);
        } else {
            c0616pi.m3085R();
        }
        return na1.f4229a;
    }
}
