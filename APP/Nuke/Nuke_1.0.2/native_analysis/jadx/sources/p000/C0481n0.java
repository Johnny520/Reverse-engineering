package p000;

import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: renamed from: n0 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0481n0 implements mn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f6946h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f6947i;

    public /* synthetic */ C0481n0(String str, int i) {
        this.f6946h = i;
        this.f6947i = str;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f6946h;
        a83 a83Var = a83.f116a;
        String str = this.f6947i;
        InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                AbstractC0691se.m4831b(str, interfaceC0596px, pp0.m3902N(1));
                break;
            case 1:
                num.getClass();
                AbstractC0691se.m4835f(str, interfaceC0596px, pp0.m3902N(1));
                break;
            case 2:
                num.getClass();
                AbstractC0731te.m5214i(str, interfaceC0596px, pp0.m3902N(1));
                break;
            case 3:
                num.getClass();
                rg3.m4466b(str, interfaceC0596px, pp0.m3902N(1));
                break;
            case 4:
                num.getClass();
                s11.m4686c(str, interfaceC0596px, pp0.m3902N(1));
                break;
            case 5:
                num.getClass();
                s11.m4690e(str, interfaceC0596px, pp0.m3902N(1));
                break;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                num.getClass();
                t11.m5078d(str, interfaceC0596px, pp0.m3902N(1));
                break;
            case 7:
                num.getClass();
                t11.m5083i(str, interfaceC0596px, pp0.m3902N(1));
                break;
            case 8:
                num.getClass();
                AbstractC0933yr.m6312a(str, interfaceC0596px, pp0.m3902N(1));
                break;
            case 9:
                int iIntValue = num.intValue();
                go0 go0Var = (go0) interfaceC0596px;
                if (!go0Var.m1958O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    go0Var.m1961R();
                } else {
                    ci0.m812m(str, go0Var, 0);
                }
                break;
            case 10:
                num.getClass();
                ci0.m812m(str, interfaceC0596px, pp0.m3902N(1));
                break;
            case 11:
                int iIntValue2 = num.intValue();
                go0 go0Var2 = (go0) interfaceC0596px;
                if (!go0Var2.m1958O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    go0Var2.m1961R();
                } else {
                    gf1.m1890h(AbstractC0570p7.m3758N(str), null, false, 22.0f, null, go0Var2, 3072, 22);
                }
                break;
            case 12:
                num.getClass();
                gf1.m1889g(str, interfaceC0596px, pp0.m3902N(1));
                break;
            default:
                num.getClass();
                AbstractC0691se.m4841l(str, interfaceC0596px, pp0.m3902N(1));
                break;
        }
        return a83Var;
    }

    public /* synthetic */ C0481n0(String str, int i, int i2) {
        this.f6946h = i2;
        this.f6947i = str;
    }
}
