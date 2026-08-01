package p000;

/* JADX INFO: renamed from: m4 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0459m4 extends c50 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f3802d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f3803e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f3804f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0459m4(int i, Object obj, Object obj2) {
        super(2);
        this.f3802d = i;
        this.f3803e = obj;
        this.f3804f = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f3802d;
        na1 na1Var = na1.f4229a;
        Object obj3 = this.f3804f;
        Object obj4 = this.f3803e;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                AbstractC0676r4.m3378a((ViewTreeObserverOnGlobalLayoutListenerC0875w3) obj4, (InterfaceC0904ww) obj3, (InterfaceC0356ji) obj, j50.m1649A(1));
                break;
            case 1:
                int iIntValue = ((Number) obj).intValue();
                xz0 xz0Var = (xz0) obj2;
                ViewOnAttachStateChangeListenerC0827v4 viewOnAttachStateChangeListenerC0827v4 = (ViewOnAttachStateChangeListenerC0827v4) obj3;
                if (!((yz0) obj4).f7743b.m4745b(xz0Var.f7474g)) {
                    viewOnAttachStateChangeListenerC0827v4.m4394l(iIntValue, xz0Var);
                    viewOnAttachStateChangeListenerC0827v4.f6401k.mo1710s(na1Var);
                }
                break;
            case 2:
                InterfaceC0356ji interfaceC0356ji = (InterfaceC0356ji) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                C0616pi c0616pi = (C0616pi) interfaceC0356ji;
                if (!c0616pi.m3082O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c0616pi.m3085R();
                } else {
                    Boolean bool = (Boolean) ((i60) obj4).f2465g.getValue();
                    boolean zBooleanValue = bool.booleanValue();
                    InterfaceC0904ww interfaceC0904ww = (InterfaceC0904ww) obj3;
                    c0616pi.m3092Y(bool);
                    boolean zM3106g = c0616pi.m3106g(zBooleanValue);
                    if (zBooleanValue) {
                        interfaceC0904ww.invoke(c0616pi, 0);
                    } else {
                        if (c0616pi.f4891l != 0) {
                            AbstractC0653qi.m3252a("No nodes can be emitted before calling deactivateToEndGroup");
                        }
                        if (!c0616pi.f4877S) {
                            if (zM3106g) {
                                v11 v11Var = c0616pi.f4865G;
                                int i2 = v11Var.f6380g;
                                int i3 = v11Var.f6381h;
                                C0395ki c0395ki = c0616pi.f4871M;
                                c0395ki.getClass();
                                c0395ki.m1906d(false);
                                c0395ki.f3156b.f2797a.m4093I(ol0.f4592c);
                                pf1.m3051g(c0616pi.f4898s, i2, i3);
                                c0616pi.f4865G.m4384t();
                            } else {
                                c0616pi.m3084Q();
                            }
                        }
                    }
                    if (c0616pi.f4904y && c0616pi.f4865G.f6382i == c0616pi.f4905z) {
                        c0616pi.f4905z = -1;
                        c0616pi.f4904y = false;
                    }
                    c0616pi.m3119p(false);
                }
                break;
            case 3:
                InterfaceC0051bd interfaceC0051bd = (InterfaceC0051bd) obj;
                C0868vx c0868vx = (C0868vx) obj2;
                qj0 qj0Var = (qj0) obj4;
                b60 b60Var = qj0Var.f5180r;
                if (!b60Var.m273I()) {
                    qj0Var.f5178N = true;
                } else {
                    qj0Var.f5175K = interfaceC0051bd;
                    qj0Var.f5174J = c0868vx;
                    fn0 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) e60.m789a(b60Var)).getSnapshotObserver();
                    gv0 gv0Var = qj0.f5161P;
                    snapshotObserver.f1778a.m777b(qj0Var, C0601p3.f4726t, (nj0) obj3);
                    qj0Var.f5178N = false;
                }
                break;
            default:
                ((Number) obj2).intValue();
                AbstractC0307i4.m1530f((pe0) obj4, (InterfaceC0904ww) obj3, (InterfaceC0356ji) obj, j50.m1649A(1));
                break;
        }
        return na1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0459m4(Object obj, InterfaceC0904ww interfaceC0904ww, int i, int i2) {
        super(2);
        this.f3802d = i2;
        this.f3803e = obj;
        this.f3804f = interfaceC0904ww;
    }
}
