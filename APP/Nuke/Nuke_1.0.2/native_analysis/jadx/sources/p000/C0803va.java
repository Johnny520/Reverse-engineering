package p000;

import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: renamed from: va */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0803va implements mn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f11851h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f11852i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f11853j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f11854k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f11855l;

    public /* synthetic */ C0803va(t81 t81Var, Object obj, int i, Object obj2, int i2) {
        this.f11851h = 8;
        this.f11853j = t81Var;
        this.f11854k = obj;
        this.f11852i = i;
        this.f11855l = obj2;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f11851h;
        int i2 = this.f11852i;
        Object obj3 = this.f11855l;
        Object obj4 = this.f11854k;
        a83 a83Var = a83.f116a;
        Object obj5 = this.f11853j;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                rp0.m4521G((ws1) obj5, (InterfaceC0644r5) obj4, (C0402kw) obj3, (InterfaceC0596px) obj, pp0.m3902N(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                rg3.m4465a((C0127de) obj5, (xm0) obj4, (in0) obj3, (InterfaceC0596px) obj, pp0.m3902N(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                rp0.m4523I((uh1) obj5, (e42) obj4, (C0402kw) obj3, (InterfaceC0596px) obj, pp0.m3902N(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((C0402kw) obj3).m2750l(obj5, obj4, (InterfaceC0596px) obj, pp0.m3902N(i2) | 1);
                break;
            case 4:
                ((Integer) obj2).getClass();
                r00.m4303b((uh1) obj5, (m00) obj4, (in0) obj3, (InterfaceC0596px) obj, pp0.m3902N(1), this.f11852i);
                break;
            case 5:
                ((Integer) obj2).getClass();
                r00.m4302a((m00) obj5, (uh1) obj4, (C0402kw) obj3, (InterfaceC0596px) obj, pp0.m3902N(i2 | 1));
                break;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                ((Integer) obj2).intValue();
                k60.m2608c((cz2) obj5, (ry2) obj4, (xm0) obj3, (InterfaceC0596px) obj, pp0.m3902N(i2 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                ci0.m806g((uh1) obj5, (String) obj4, (String) obj3, (InterfaceC0596px) obj, pp0.m3902N(1), this.f11852i);
                break;
            case 8:
                ((Integer) obj2).getClass();
                int iM3902N = pp0.m3902N(1);
                AbstractC0691se.m4848s((t81) obj5, this.f11854k, this.f11852i, this.f11855l, (InterfaceC0596px) obj, iM3902N);
                break;
            case 9:
                ((Integer) obj2).getClass();
                ((g91) obj5).mo742e(obj4, (C0402kw) obj3, (InterfaceC0596px) obj, pp0.m3902N(i2 | 1));
                break;
            case 10:
                ((Integer) obj2).intValue();
                AbstractC0179eu.m1459i((ia1) obj5, (pa1) obj4, (in0) obj3, (InterfaceC0596px) obj, pp0.m3902N(i2 | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                pp0.m3907e((ci1) obj5, (xm0) obj4, (in0) obj3, (InterfaceC0596px) obj, pp0.m3902N(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((dc2) obj5).mo742e(obj4, (C0402kw) obj3, (InterfaceC0596px) obj, pp0.m3902N(i2 | 1));
                break;
        }
        return a83Var;
    }

    public /* synthetic */ C0803va(C0402kw c0402kw, Object obj, Object obj2, int i) {
        this.f11851h = 3;
        this.f11855l = c0402kw;
        this.f11853j = obj;
        this.f11854k = obj2;
        this.f11852i = i;
    }

    public /* synthetic */ C0803va(uh1 uh1Var, Object obj, Object obj2, int i, int i2, int i3) {
        this.f11851h = i3;
        this.f11853j = uh1Var;
        this.f11854k = obj;
        this.f11855l = obj2;
        this.f11852i = i2;
    }

    public /* synthetic */ C0803va(Object obj, Object obj2, un0 un0Var, int i, int i2) {
        this.f11851h = i2;
        this.f11853j = obj;
        this.f11854k = obj2;
        this.f11855l = un0Var;
        this.f11852i = i;
    }
}
