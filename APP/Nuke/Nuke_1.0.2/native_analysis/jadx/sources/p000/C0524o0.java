package p000;

import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: renamed from: o0 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0524o0 implements mn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f7386h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0402kw f7387i;

    public /* synthetic */ C0524o0(C0402kw c0402kw) {
        this.f7386h = 6;
        this.f7387i = c0402kw;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f7386h;
        a83 a83Var = a83.f116a;
        C0402kw c0402kw = this.f7387i;
        InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                AbstractC0691se.m4834e(c0402kw, interfaceC0596px, pp0.m3902N(7));
                break;
            case 1:
                num.getClass();
                s11.m4688d(c0402kw, interfaceC0596px, pp0.m3902N(7));
                break;
            case 2:
                num.getClass();
                t11.m5082h(c0402kw, interfaceC0596px, pp0.m3902N(7));
                break;
            case 3:
                num.getClass();
                pp0.m3906d(c0402kw, interfaceC0596px, pp0.m3902N(49));
                break;
            case 4:
                num.getClass();
                ci0.m815p(c0402kw, interfaceC0596px, pp0.m3902N(7));
                break;
            case 5:
                num.getClass();
                op0.m3580b(c0402kw, interfaceC0596px, pp0.m3902N(7));
                break;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                int iIntValue = num.intValue();
                go0 go0Var = (go0) interfaceC0596px;
                if (!go0Var.m1958O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    go0Var.m1961R();
                } else {
                    c0402kw.mo12g(go0Var, 0);
                }
                break;
            default:
                num.getClass();
                AbstractC0691se.m4840k(c0402kw, interfaceC0596px, pp0.m3902N(7));
                break;
        }
        return a83Var;
    }

    public /* synthetic */ C0524o0(C0402kw c0402kw, int i, int i2) {
        this.f7386h = i2;
        this.f7387i = c0402kw;
    }
}
