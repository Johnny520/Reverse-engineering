package p000;

/* JADX INFO: renamed from: id */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0316id implements InterfaceC0904ww {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2521d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0474mh f2522e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0316id(C0474mh c0474mh, int i) {
        this.f2521d = i;
        this.f2522e = c0474mh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f2521d;
        na1 na1Var = na1.f4229a;
        me0 me0Var = me0.f3922a;
        C0474mh c0474mh = this.f2522e;
        switch (i) {
            case 0:
                InterfaceC0356ji interfaceC0356ji = (InterfaceC0356ji) obj;
                int iIntValue = ((Number) obj2).intValue();
                C0616pi c0616pi = (C0616pi) interfaceC0356ji;
                if (!c0616pi.m3082O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c0616pi.m3085R();
                } else {
                    C0838vf c0838vfM4197a = AbstractC0762tf.m4197a(C0496n2.f4157q, c0616pi, 0);
                    int iM2776p = o30.m2776p(c0616pi);
                    fq0 fq0VarM3115l = c0616pi.m3115l();
                    pe0 pe0VarM4020E = s91.m4020E(c0616pi, me0Var);
                    InterfaceC0210fi.f1733b.getClass();
                    C0094cj c0094cj = C0173ei.f1457b;
                    c0616pi.m3093Z();
                    if (c0616pi.f4877S) {
                        c0616pi.m3114k(c0094cj);
                    } else {
                        c0616pi.m3113j0();
                    }
                    w60.m4888J(c0616pi, C0173ei.f1460e, c0838vfM4197a);
                    w60.m4888J(c0616pi, C0173ei.f1459d, fq0VarM3115l);
                    C0462m7 c0462m7 = C0173ei.f1461f;
                    if (c0616pi.f4877S || !p30.m3002l(c0616pi.m3080L(), Integer.valueOf(iM2776p))) {
                        AbstractC0748t1.m4157o(iM2776p, c0616pi, iM2776p, c0462m7);
                    }
                    w60.m4888J(c0616pi, C0173ei.f1458c, pe0VarM4020E);
                    c0474mh.mo353a(C0924xf.f7341a, c0616pi, 6);
                    c0616pi.m3119p(true);
                }
                break;
            default:
                InterfaceC0356ji interfaceC0356ji2 = (InterfaceC0356ji) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                C0616pi c0616pi2 = (C0616pi) interfaceC0356ji2;
                if (!c0616pi2.m3082O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c0616pi2.m3085R();
                } else {
                    xd0 xd0VarM5467d = AbstractC0993za.m5467d(C0496n2.f4145e, false);
                    int iM2776p2 = o30.m2776p(c0616pi2);
                    fq0 fq0VarM3115l2 = c0616pi2.m3115l();
                    pe0 pe0VarM4020E2 = s91.m4020E(c0616pi2, me0Var);
                    InterfaceC0210fi.f1733b.getClass();
                    C0094cj c0094cj2 = C0173ei.f1457b;
                    c0616pi2.m3093Z();
                    if (c0616pi2.f4877S) {
                        c0616pi2.m3114k(c0094cj2);
                    } else {
                        c0616pi2.m3113j0();
                    }
                    w60.m4888J(c0616pi2, C0173ei.f1460e, xd0VarM5467d);
                    w60.m4888J(c0616pi2, C0173ei.f1459d, fq0VarM3115l2);
                    C0462m7 c0462m72 = C0173ei.f1461f;
                    if (c0616pi2.f4877S || !p30.m3002l(c0616pi2.m3080L(), Integer.valueOf(iM2776p2))) {
                        AbstractC0748t1.m4157o(iM2776p2, c0616pi2, iM2776p2, c0462m72);
                    }
                    w60.m4888J(c0616pi2, C0173ei.f1458c, pe0VarM4020E2);
                    c0474mh.invoke(c0616pi2, 0);
                    c0616pi2.m3119p(true);
                }
                break;
        }
        return na1Var;
    }
}
