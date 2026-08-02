package p000;

import me.dartcv.nuke.R;

/* JADX INFO: renamed from: sr */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0704sr implements mn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f10324h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ in0 f10325i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ boolean f10326j;

    public /* synthetic */ C0704sr(in0 in0Var, boolean z) {
        this.f10324h = 1;
        this.f10325i = in0Var;
        this.f10326j = z;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f10324h;
        a83 a83Var = a83.f116a;
        int i2 = 2;
        switch (i) {
            case 0:
                InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj;
                int iIntValue = ((Integer) obj2).intValue();
                go0 go0Var = (go0) interfaceC0596px;
                if (!go0Var.m1958O(1 & iIntValue, (iIntValue & 3) != 2)) {
                    go0Var.m1961R();
                } else {
                    sp0.m4944i(this.f10326j, this.f10325i, fg1.m1615G(rh1.f9587a, 0.0f, 0.0f, 14.0f, 0.0f, 11), false, 0, go0Var, 384, 56);
                }
                break;
            case 1:
                InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                go0 go0Var2 = (go0) interfaceC0596px2;
                if (!go0Var2.m1958O(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    go0Var2.m1961R();
                } else {
                    String strM4462P = rg3.m4462P(R.string.home_settings_safety_mode, go0Var2);
                    String strM4462P2 = rg3.m4462P(R.string.home_settings_safety_mode_description, go0Var2);
                    C0402kw c0402kw = sp0.f10263d;
                    in0 in0Var = this.f10325i;
                    boolean z = this.f10326j;
                    C0402kw c0402kwM6126i0 = xe1.m6126i0(842521472, new C0704sr(i2, in0Var, z), go0Var2);
                    boolean zM1980f = go0Var2.m1980f(in0Var) | go0Var2.m1982g(z);
                    Object objM1956L = go0Var2.m1956L();
                    if (zM1980f || objM1956L == C0520nx.f7360a) {
                        objM1956L = new C0619qh(4, in0Var, z);
                        go0Var2.m1981f0(objM1956L);
                    }
                    sp0.m4940g(strM4462P, null, strM4462P2, c0402kw, c0402kwM6126i0, null, false, (xm0) objM1956L, null, go0Var2, 27648, 354);
                }
                break;
            default:
                InterfaceC0596px interfaceC0596px3 = (InterfaceC0596px) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                go0 go0Var3 = (go0) interfaceC0596px3;
                if (!go0Var3.m1958O(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    go0Var3.m1961R();
                } else {
                    sp0.m4944i(this.f10326j, this.f10325i, null, false, 0, go0Var3, 0, 60);
                }
                break;
        }
        return a83Var;
    }

    public /* synthetic */ C0704sr(int i, in0 in0Var, boolean z) {
        this.f10324h = i;
        this.f10326j = z;
        this.f10325i = in0Var;
    }
}
