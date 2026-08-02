package p000;

import me.dartcv.nuke.R;

/* JADX INFO: renamed from: fe */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0200fe implements nn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f2912h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ xm0 f2913i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ in0 f2914j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ xk1 f2915k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ boolean f2916l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f2917m;

    public /* synthetic */ C0200fe(xm0 xm0Var, in0 in0Var, xk1 xk1Var, Object obj, boolean z, int i) {
        this.f2912h = i;
        this.f2913i = xm0Var;
        this.f2914j = in0Var;
        this.f2915k = xk1Var;
        this.f2917m = obj;
        this.f2916l = z;
    }

    @Override // p000.nn0
    /* JADX INFO: renamed from: e */
    public final Object mo489e(Object obj, Object obj2, Object obj3) {
        int i = this.f2912h;
        a83 a83Var = a83.f116a;
        C0160eb c0160eb = C0520nx.f7360a;
        Object obj4 = this.f2917m;
        xk1 xk1Var = this.f2915k;
        in0 in0Var = this.f2914j;
        int i2 = 1;
        switch (i) {
            case 0:
                xk1 xk1Var2 = (xk1) obj4;
                pb2 pb2Var = (pb2) obj;
                InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                pb2Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((go0) interfaceC0596px).m1980f(pb2Var) ? 4 : 2;
                }
                go0 go0Var = (go0) interfaceC0596px;
                if (!go0Var.m1958O(iIntValue & 1, (iIntValue & 19) != 18)) {
                    go0Var.m1961R();
                } else {
                    AbstractC0691se.m4847r(rg3.m4462P(R.string.home_settings_cancel, go0Var), this.f2913i, pb2.m3843a(pb2Var), false, 0, go0Var, 0, 56);
                    String strM4462P = rg3.m4462P(R.string.home_settings_save, go0Var);
                    uh1 uh1VarM3843a = pb2.m3843a(pb2Var);
                    boolean zM1980f = go0Var.m1980f(in0Var) | go0Var.m1980f(xk1Var) | go0Var.m1980f(xk1Var2);
                    Object objM1956L = go0Var.m1956L();
                    if (zM1980f || objM1956L == c0160eb) {
                        objM1956L = new C0678s1((Object) in0Var, xk1Var, xk1Var2, i2);
                        go0Var.m1981f0(objM1956L);
                    }
                    AbstractC0691se.m4846q(strM4462P, (xm0) objM1956L, uh1VarM3843a, this.f2916l, 0, go0Var, 0, 48);
                }
                break;
            default:
                Integer num = (Integer) obj4;
                pb2 pb2Var2 = (pb2) obj;
                InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                pb2Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((go0) interfaceC0596px2).m1980f(pb2Var2) ? 4 : 2;
                }
                go0 go0Var2 = (go0) interfaceC0596px2;
                if (!go0Var2.m1958O(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    go0Var2.m1961R();
                } else {
                    AbstractC0691se.m4847r(rg3.m4462P(R.string.home_settings_cancel, go0Var2), this.f2913i, pb2.m3843a(pb2Var2), false, 0, go0Var2, 0, 56);
                    String strM4462P2 = rg3.m4462P(R.string.home_settings_save, go0Var2);
                    uh1 uh1VarM3843a2 = pb2.m3843a(pb2Var2);
                    boolean zM1980f2 = go0Var2.m1980f(in0Var) | go0Var2.m1980f(xk1Var) | go0Var2.m1980f(num);
                    Object objM1956L2 = go0Var2.m1956L();
                    if (zM1980f2 || objM1956L2 == c0160eb) {
                        objM1956L2 = new C0678s1(in0Var, num, xk1Var, 15);
                        go0Var2.m1981f0(objM1956L2);
                    }
                    AbstractC0691se.m4846q(strM4462P2, (xm0) objM1956L2, uh1VarM3843a2, this.f2916l, 0, go0Var2, 0, 48);
                }
                break;
        }
        return a83Var;
    }
}
