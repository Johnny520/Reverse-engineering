package p000;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qp1 implements mn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f9078h = 2;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f9079i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ boolean f9080j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ String f9081k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ un0 f9082l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ un0 f9083m;

    public /* synthetic */ qp1(uh1 uh1Var, boolean z, String str, nn0 nn0Var, C0402kw c0402kw) {
        this.f9079i = uh1Var;
        this.f9080j = z;
        this.f9081k = str;
        this.f9082l = nn0Var;
        this.f9083m = c0402kw;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f9078h;
        a83 a83Var = a83.f116a;
        un0 un0Var = this.f9083m;
        un0 un0Var2 = this.f9082l;
        Object obj3 = this.f9079i;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                qp0.m4251f((uh1) obj3, this.f9080j, this.f9081k, (nn0) un0Var2, (C0402kw) un0Var, (InterfaceC0596px) obj, pp0.m3902N(1));
                break;
            case 1:
                uh1 uh1Var = (uh1) obj3;
                nn0 nn0Var = (nn0) un0Var2;
                C0402kw c0402kw = (C0402kw) un0Var;
                InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj;
                int iIntValue = ((Integer) obj2).intValue();
                go0 go0Var = (go0) interfaceC0596px;
                if (!go0Var.m1958O(1 & iIntValue, (iIntValue & 3) != 2)) {
                    go0Var.m1961R();
                } else {
                    qp0.m4251f(uh1Var, this.f9080j, this.f9081k, nn0Var, c0402kw, go0Var, 0);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC0691se.m4850u(this.f9081k, (Set) obj3, this.f9080j, (xm0) un0Var2, (in0) un0Var, (InterfaceC0596px) obj, pp0.m3902N(3457));
                break;
        }
        return a83Var;
    }

    public /* synthetic */ qp1(uh1 uh1Var, boolean z, String str, nn0 nn0Var, C0402kw c0402kw, int i) {
        this.f9079i = uh1Var;
        this.f9080j = z;
        this.f9081k = str;
        this.f9082l = nn0Var;
        this.f9083m = c0402kw;
    }

    public /* synthetic */ qp1(String str, Set set, boolean z, xm0 xm0Var, in0 in0Var, int i) {
        this.f9081k = str;
        this.f9079i = set;
        this.f9080j = z;
        this.f9082l = xm0Var;
        this.f9083m = in0Var;
    }
}
