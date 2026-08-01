package p000;

/* JADX INFO: renamed from: ed */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0168ed implements InterfaceC0904ww {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1417d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f1418e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f1419f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0168ed(int i, int i2, Object obj, Object obj2) {
        this.f1417d = i2;
        this.f1418e = obj;
        this.f1419f = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f1417d;
        na1 na1Var = na1.f4229a;
        Object obj3 = this.f1419f;
        Object obj4 = this.f1418e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                s91.m4037b((pe0) obj4, (InterfaceC0742sw) obj3, (InterfaceC0356ji) obj, j50.m1649A(1));
                break;
            case 1:
                iu0 iu0Var = (iu0) obj4;
                z11 z11Var = (z11) obj3;
                int iIntValue = ((Integer) obj).intValue();
                if (obj2 instanceof InterfaceC0852vh) {
                    iu0Var.f2623f.m4072b((InterfaceC0852vh) obj2);
                } else if (!(obj2 instanceof hv0)) {
                    if (obj2 instanceof ku0) {
                        pf1.m3036N(z11Var, iIntValue, obj2);
                        iu0Var.m1602e((ku0) obj2);
                    } else if (obj2 instanceof ht0) {
                        pf1.m3036N(z11Var, iIntValue, obj2);
                        ((ht0) obj2).m1505c();
                    }
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((C0555ol) obj4).m2937a((C0948y2) obj3, (InterfaceC0356ji) obj, j50.m1649A(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((C0324im) obj4).m1593a((pi0) obj3, (InterfaceC0356ji) obj, j50.m1649A(1));
                break;
            case 4:
                n70 n70Var = (n70) obj4;
                m70 m70Var = (m70) obj3;
                InterfaceC0356ji interfaceC0356ji = (InterfaceC0356ji) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                C0616pi c0616pi = (C0616pi) interfaceC0356ji;
                if (!c0616pi.m3082O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c0616pi.m3085R();
                } else {
                    o70 o70Var = (o70) n70Var.f4202b.invoke();
                    int iMo2795e = m70Var.f3854c;
                    Object obj5 = m70Var.f3852a;
                    if ((iMo2795e >= o70Var.mo2791a() || !o70Var.mo2793c(iMo2795e).equals(obj5)) && (iMo2795e = o70Var.mo2795e(obj5)) != -1) {
                        m70Var.f3854c = iMo2795e;
                    }
                    int i2 = iMo2795e;
                    if (i2 != -1) {
                        c0616pi.m3090W(-1664741271);
                        v50.m4399c(o70Var, n70Var.f4201a, i2, m70Var.f3852a, c0616pi, 0);
                    } else {
                        c0616pi.m3090W(-1668376610);
                    }
                    c0616pi.m3119p(false);
                    boolean zM3108h = c0616pi.m3108h(m70Var);
                    Object objM3080L = c0616pi.m3080L();
                    if (zM3108h || objM3080L == C0320ii.f2572a) {
                        objM3080L = new C0532o(6, m70Var);
                        c0616pi.m3107g0(objM3080L);
                    }
                    s91.m4038c(obj5, (InterfaceC0742sw) objM3080L, c0616pi);
                }
                break;
            case 5:
                break;
            case 6:
                C0474mh c0474mh = (C0474mh) obj4;
                f90 f90Var = (f90) obj3;
                InterfaceC0356ji interfaceC0356ji2 = (InterfaceC0356ji) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                C0616pi c0616pi2 = (C0616pi) interfaceC0356ji2;
                if (!c0616pi2.m3082O(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    c0616pi2.m3085R();
                } else {
                    c0474mh.mo353a(f90Var, c0616pi2, 0);
                }
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                wt0 wt0Var = (wt0) obj4;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                wt0Var.f7189d += ((ny0) ((C0479mm) obj3).f4006b).mo1511a(fFloatValue - wt0Var.f7189d);
                break;
            default:
                ((Integer) obj2).getClass();
                d71.m658a((s71) obj4, (InterfaceC0904ww) obj3, (InterfaceC0356ji) obj, j50.m1649A(1));
                break;
        }
        return na1Var;
    }

    public /* synthetic */ C0168ed(int i, Object obj, Object obj2) {
        this.f1417d = i;
        this.f1418e = obj;
        this.f1419f = obj2;
    }
}
