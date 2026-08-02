package p000;

import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: renamed from: up */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0781up implements mn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f11389h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f11390i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f11391j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f11392k;

    public /* synthetic */ C0781up(String str, uh1 uh1Var, int i, int i2) {
        this.f11389h = 6;
        this.f11392k = str;
        this.f11391j = uh1Var;
        this.f11390i = i2;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f11389h;
        a83 a83Var = a83.f116a;
        int i2 = this.f11390i;
        Object obj3 = this.f11392k;
        Object obj4 = this.f11391j;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC0179eu.m1448b((uh1) obj4, (in0) obj3, (InterfaceC0596px) obj, pp0.m3902N(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((C0402kw) obj4).m2747h(obj3, (InterfaceC0596px) obj, pp0.m3902N(i2) | 1);
                break;
            case 2:
                ((Integer) obj2).getClass();
                ci0.m800a((f42) obj4, (C0402kw) obj3, (InterfaceC0596px) obj, pp0.m3902N(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ci0.m801b((f42[]) obj4, (mn0) obj3, (InterfaceC0596px) obj, pp0.m3902N(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                fg1.m1631d((String) obj4, (xm0) obj3, (InterfaceC0596px) obj, pp0.m3902N(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                s11.m4696h((String) obj4, (zt0) obj3, (InterfaceC0596px) obj, pp0.m3902N(i2 | 1));
                break;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                ((Integer) obj2).getClass();
                qp0.m4250e((String) obj3, (uh1) obj4, (InterfaceC0596px) obj, pp0.m3902N(1), i2);
                break;
            default:
                ((Integer) obj2).intValue();
                fg1.m1633f((xm0) obj4, (in0) obj3, (InterfaceC0596px) obj, pp0.m3902N(i2 | 1));
                break;
        }
        return a83Var;
    }

    public /* synthetic */ C0781up(int i, int i2, Object obj, Object obj2) {
        this.f11389h = i2;
        this.f11391j = obj;
        this.f11392k = obj2;
        this.f11390i = i;
    }
}
