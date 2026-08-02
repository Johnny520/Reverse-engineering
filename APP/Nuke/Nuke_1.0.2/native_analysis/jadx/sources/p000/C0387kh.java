package p000;

import java.util.Set;

/* JADX INFO: renamed from: kh */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0387kh implements mn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f5530h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean f5531i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Set f5532j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ xm0 f5533k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ in0 f5534l;

    public /* synthetic */ C0387kh(boolean z, Set set, xm0 xm0Var, in0 in0Var, int i, int i2) {
        this.f5530h = i2;
        this.f5531i = z;
        this.f5532j = set;
        this.f5533k = xm0Var;
        this.f5534l = in0Var;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f5530h;
        a83 a83Var = a83.f116a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM3902N = pp0.m3902N(385);
                s11.m4714q(this.f5531i, this.f5532j, this.f5533k, this.f5534l, (InterfaceC0596px) obj, iM3902N);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM3902N2 = pp0.m3902N(385);
                t11.m5081g(this.f5531i, this.f5532j, this.f5533k, this.f5534l, (InterfaceC0596px) obj, iM3902N2);
                break;
        }
        return a83Var;
    }
}
