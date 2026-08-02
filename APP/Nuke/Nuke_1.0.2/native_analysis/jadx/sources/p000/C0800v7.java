package p000;

/* JADX INFO: renamed from: v7 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0800v7 extends w51 implements mn0 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f11800i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f11801j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f11802k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0800v7(int i, Object obj, Object obj2) {
        super(2);
        this.f11800i = i;
        this.f11801j = obj;
        this.f11802k = obj2;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f11800i;
        a83 a83Var = a83.f116a;
        Object obj3 = this.f11802k;
        Object obj4 = this.f11801j;
        switch (i) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                qn2 qn2Var = (qn2) obj2;
                ViewOnAttachStateChangeListenerC0837w7 viewOnAttachStateChangeListenerC0837w7 = (ViewOnAttachStateChangeListenerC0837w7) obj3;
                if (!((rn2) obj4).f9651b.m183b(qn2Var.f9052f)) {
                    viewOnAttachStateChangeListenerC0837w7.m5857l(iIntValue, qn2Var);
                    viewOnAttachStateChangeListenerC0837w7.f12375o.mo2225s(a83Var);
                }
                break;
            case 1:
                InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                go0 go0Var = (go0) interfaceC0596px;
                if (!go0Var.m1958O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    go0Var.m1961R();
                } else {
                    Boolean bool = (Boolean) ((x61) obj4).f12848g.getValue();
                    boolean zBooleanValue = bool.booleanValue();
                    mn0 mn0Var = (mn0) obj3;
                    go0Var.m1968Y(bool);
                    boolean zM1982g = go0Var.m1982g(zBooleanValue);
                    if (zBooleanValue) {
                        mn0Var.mo12g(go0Var, 0);
                    } else {
                        if (go0Var.f3627l != 0) {
                            AbstractC0752tx.m5443a("No nodes can be emitted before calling deactivateToEndGroup");
                        }
                        if (!go0Var.f3613S) {
                            if (zM1982g) {
                                pr2 pr2Var = go0Var.f3601G;
                                int i2 = pr2Var.f8521g;
                                int i3 = pr2Var.f8522h;
                                C0635qx c0635qx = go0Var.f3607M;
                                c0635qx.getClass();
                                c0635qx.m4294d(false);
                                c0635qx.f9262b.f2145t.m2743X(hu1.f4141c);
                                AbstractC0570p7.m3773i(go0Var.f3634s, i2, i3);
                                go0Var.f3601G.m3967t();
                            } else {
                                go0Var.m1960Q();
                            }
                        }
                    }
                    if (go0Var.f3640y && go0Var.f3601G.f8523i == go0Var.f3641z) {
                        go0Var.f3641z = -1;
                        go0Var.f3640y = false;
                    }
                    go0Var.m1994p(false);
                }
                break;
            default:
                InterfaceC0627qp interfaceC0627qp = (InterfaceC0627qp) obj;
                pq0 pq0Var = (pq0) obj2;
                zn1 zn1Var = (zn1) obj4;
                r61 r61Var = zn1Var.f13985v;
                if (!r61Var.m4351I()) {
                    zn1Var.f13983R = true;
                } else {
                    zn1Var.f13980O = interfaceC0627qp;
                    zn1Var.f13979N = pq0Var;
                    bw1 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) u61.m5471a(r61Var)).getSnapshotObserver();
                    ca2 ca2Var = zn1.f13961T;
                    snapshotObserver.f1051a.m5436c(zn1Var, oq0.f7775m, (yn1) obj3);
                    zn1Var.f13983R = false;
                }
                break;
        }
        return a83Var;
    }
}
