package p000;

import me.dartcv.nuke.R;

/* JADX INFO: renamed from: gf */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0238gf implements mn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f3472h = 1;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ c73 f3473i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ in0 f3474j;

    public /* synthetic */ C0238gf(in0 in0Var, c73 c73Var) {
        this.f3474j = in0Var;
        this.f3473i = c73Var;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f3472h;
        a83 a83Var = a83.f116a;
        C0160eb c0160eb = C0520nx.f7360a;
        in0 in0Var = this.f3474j;
        c73 c73Var = this.f3473i;
        switch (i) {
            case 0:
                InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj;
                int iIntValue = ((Integer) obj2).intValue();
                go0 go0Var = (go0) interfaceC0596px;
                if (!go0Var.m1958O(1 & iIntValue, (iIntValue & 3) != 2)) {
                    go0Var.m1961R();
                } else {
                    String strM4462P = rg3.m4462P(R.string.home_settings_click_haptic, go0Var);
                    String strM4462P2 = rg3.m4462P(R.string.home_settings_click_haptic_subtitle, go0Var);
                    C0402kw c0402kwM6126i0 = xe1.m6126i0(-136923485, new C0238gf(c73Var, in0Var), go0Var);
                    boolean zM1980f = go0Var.m1980f(in0Var) | go0Var.m1984h(c73Var);
                    Object objM1956L = go0Var.m1956L();
                    if (zM1980f || objM1956L == c0160eb) {
                        objM1956L = new C0640r1(4, in0Var, c73Var);
                        go0Var.m1981f0(objM1956L);
                    }
                    sp0.m4940g(strM4462P, null, strM4462P2, null, c0402kwM6126i0, null, false, (xm0) objM1956L, null, go0Var, 24576, 362);
                }
                break;
            default:
                InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                go0 go0Var2 = (go0) interfaceC0596px2;
                if (!go0Var2.m1958O(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    go0Var2.m1961R();
                } else {
                    boolean z = c73Var.f1223c;
                    boolean zM1980f2 = go0Var2.m1980f(in0Var) | go0Var2.m1984h(c73Var);
                    Object objM1956L2 = go0Var2.m1956L();
                    if (zM1980f2 || objM1956L2 == c0160eb) {
                        objM1956L2 = new C0275hf(in0Var, c73Var, 2);
                        go0Var2.m1981f0(objM1956L2);
                    }
                    sp0.m4944i(z, (in0) objM1956L2, null, false, 0, go0Var2, 0, 60);
                }
                break;
        }
        return a83Var;
    }

    public /* synthetic */ C0238gf(c73 c73Var, in0 in0Var) {
        this.f3473i = c73Var;
        this.f3474j = in0Var;
    }
}
