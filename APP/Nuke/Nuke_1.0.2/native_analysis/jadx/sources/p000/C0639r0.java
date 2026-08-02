package p000;

import nuke.module.wechat.p002ai.AIModelInfo;

/* JADX INFO: renamed from: r0 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0639r0 implements mn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f9301h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f9302i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ boolean f9303j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f9304k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f9305l;

    public /* synthetic */ C0639r0(uh1 uh1Var, xm0 xm0Var, boolean z, int i) {
        this.f9301h = 1;
        this.f9305l = uh1Var;
        this.f9302i = xm0Var;
        this.f9303j = z;
        this.f9304k = i;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f9301h;
        a83 a83Var = a83.f116a;
        int i2 = this.f9304k;
        Object obj3 = this.f9302i;
        Object obj4 = this.f9305l;
        boolean z = this.f9303j;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC0691se.m4832c((AIModelInfo) obj4, z, (xm0) obj3, (InterfaceC0596px) obj, pp0.m3902N(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                rp0.m4527M((uh1) obj4, (xm0) obj3, z, (InterfaceC0596px) obj, pp0.m3902N(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ur1.m5571a((lp1) obj4, z, (C0402kw) obj3, (InterfaceC0596px) obj, pp0.m3902N(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                up0.m5538c(z, (c92) obj4, (b03) obj3, (InterfaceC0596px) obj, pp0.m3902N(i2 | 1));
                break;
        }
        return a83Var;
    }

    public /* synthetic */ C0639r0(Object obj, boolean z, un0 un0Var, int i, int i2) {
        this.f9301h = i2;
        this.f9305l = obj;
        this.f9303j = z;
        this.f9302i = un0Var;
        this.f9304k = i;
    }

    public /* synthetic */ C0639r0(boolean z, c92 c92Var, b03 b03Var, int i) {
        this.f9301h = 3;
        this.f9303j = z;
        this.f9305l = c92Var;
        this.f9302i = b03Var;
        this.f9304k = i;
    }
}
