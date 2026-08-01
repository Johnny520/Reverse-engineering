package p000;

/* JADX INFO: renamed from: k2 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0377k2 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2992d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC0904ww f2993e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0474mh f2994f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0377k2(InterfaceC0904ww interfaceC0904ww, C0474mh c0474mh, int i) {
        this.f2992d = i;
        this.f2993e = interfaceC0904ww;
        this.f2994f = c0474mh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f2992d;
        na1 na1Var = na1.f4229a;
        C0474mh c0474mh = this.f2994f;
        InterfaceC0904ww interfaceC0904ww = this.f2993e;
        int i2 = 0;
        switch (i) {
            case 0:
                InterfaceC0356ji interfaceC0356ji = (InterfaceC0356ji) obj;
                int iIntValue = ((Number) obj2).intValue();
                C0616pi c0616pi = (C0616pi) interfaceC0356ji;
                if (!c0616pi.m3082O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c0616pi.m3085R();
                } else {
                    if (interfaceC0904ww == null) {
                        c0616pi.m3090W(-1102039173);
                    } else {
                        c0616pi.m3090W(795734342);
                        interfaceC0904ww.invoke(c0616pi, 0);
                    }
                    c0616pi.m3119p(false);
                    c0474mh.invoke(c0616pi, 0);
                }
                break;
            default:
                InterfaceC0356ji interfaceC0356ji2 = (InterfaceC0356ji) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                C0616pi c0616pi2 = (C0616pi) interfaceC0356ji2;
                if (!c0616pi2.m3082O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c0616pi2.m3085R();
                } else {
                    ln0 ln0Var = AbstractC0457m2.f3787a;
                    AbstractC0457m2.m2426b(AbstractC0398kl.m1937w(-459506658, new C0377k2(interfaceC0904ww, c0474mh, i2), c0616pi2), c0616pi2, 438);
                }
                break;
        }
        return na1Var;
    }
}
