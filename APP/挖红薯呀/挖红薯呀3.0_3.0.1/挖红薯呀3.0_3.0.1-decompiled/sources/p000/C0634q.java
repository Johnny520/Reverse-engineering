package p000;

/* JADX INFO: renamed from: q */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0634q extends c50 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5006d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f5007e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0634q(int i, Object obj) {
        super(2);
        this.f5006d = i;
        this.f5007e = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f5006d;
        me0 me0Var = me0.f3922a;
        na1 na1Var = na1.f4229a;
        Object obj3 = this.f5007e;
        switch (i) {
            case 0:
                InterfaceC0356ji interfaceC0356ji = (InterfaceC0356ji) obj;
                int iIntValue = ((Number) obj2).intValue();
                C0616pi c0616pi = (C0616pi) interfaceC0356ji;
                if (c0616pi.m3082O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ((AbstractC0671r) obj3).mo1246b(c0616pi, 0);
                } else {
                    c0616pi.m3085R();
                }
                return na1Var;
            case 1:
                ((ViewOnAttachStateChangeListenerC0827v4) obj3).m4394l(((Number) obj).intValue(), (xz0) obj2);
                return na1Var;
            case 2:
                InterfaceC0356ji interfaceC0356ji2 = (InterfaceC0356ji) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                C0616pi c0616pi2 = (C0616pi) interfaceC0356ji2;
                if (c0616pi2.m3082O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Object objM3080L = c0616pi2.m3080L();
                    if (objM3080L == C0320ii.f2572a) {
                        objM3080L = C0601p3.f4714h;
                        c0616pi2.m3107g0(objM3080L);
                    }
                    AbstractC0307i4.m1532h(uz0.m4362a(me0Var, (InterfaceC0742sw) objM3080L), (InterfaceC0904ww) ((oh0) obj3).getValue(), c0616pi2, 0);
                } else {
                    c0616pi2.m3085R();
                }
                return na1Var;
            case 3:
                ((Number) obj2).intValue();
                ((C0247gi) obj3).mo1246b((InterfaceC0356ji) obj, j50.m1649A(1));
                return na1Var;
            case 4:
                pe0 pe0Var = (pe0) obj;
                pe0 pe0VarM4019D = (ne0) obj2;
                InterfaceC0356ji interfaceC0356ji3 = (InterfaceC0356ji) obj3;
                if (pe0VarM4019D instanceof C0284hi) {
                    InterfaceC0941xw interfaceC0941xw = ((C0284hi) pe0VarM4019D).f2262a;
                    s91.m4048m(3, interfaceC0941xw);
                    pe0VarM4019D = s91.m4019D(interfaceC0356ji3, (pe0) interfaceC0941xw.mo353a(me0Var, interfaceC0356ji3, 0));
                }
                return pe0Var.mo2499c(pe0VarM4019D);
            default:
                ((Number) obj2).intValue();
                ((C0895wn) obj3).mo1246b((InterfaceC0356ji) obj, j50.m1649A(1));
                return na1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0634q(AbstractC0671r abstractC0671r, int i, int i2) {
        super(2);
        this.f5006d = i2;
        this.f5007e = abstractC0671r;
    }
}
