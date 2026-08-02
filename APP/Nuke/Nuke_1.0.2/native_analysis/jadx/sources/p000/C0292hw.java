package p000;

/* JADX INFO: renamed from: hw */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0292hw implements mn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f4145h = 1;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f4146i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f4147j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f4148k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f4149l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f4150m;

    public /* synthetic */ C0292hw(C0402kw c0402kw, C0206fk c0206fk, Object obj, Object obj2, int i) {
        this.f4148k = c0402kw;
        this.f4149l = c0206fk;
        this.f4146i = obj;
        this.f4150m = obj2;
        this.f4147j = i;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f4145h;
        int i2 = this.f4147j;
        Object obj3 = this.f4150m;
        a83 a83Var = a83.f116a;
        Object obj4 = this.f4149l;
        Object obj5 = this.f4148k;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM3902N = pp0.m3902N(i2) | 1;
                ((C0402kw) obj5).m2746f((C0206fk) obj4, this.f4146i, this.f4150m, (InterfaceC0596px) obj, iM3902N);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iM3902N2 = pp0.m3902N(i2 | 1);
                AbstractC0179eu.m1458h((Boolean) obj5, this.f4146i, (ia1) obj4, (in0) obj3, (InterfaceC0596px) obj, iM3902N2);
                break;
            default:
                ((Integer) obj2).getClass();
                tp0.m5358c((String) obj5, (uh1) obj4, (nn0) this.f4146i, (in0) obj3, (InterfaceC0596px) obj, pp0.m3902N(1), this.f4147j);
                break;
        }
        return a83Var;
    }

    public /* synthetic */ C0292hw(Boolean bool, Object obj, ia1 ia1Var, in0 in0Var, int i) {
        this.f4148k = bool;
        this.f4146i = obj;
        this.f4149l = ia1Var;
        this.f4150m = in0Var;
        this.f4147j = i;
    }

    public /* synthetic */ C0292hw(String str, uh1 uh1Var, nn0 nn0Var, in0 in0Var, int i, int i2) {
        this.f4148k = str;
        this.f4149l = uh1Var;
        this.f4146i = nn0Var;
        this.f4150m = in0Var;
        this.f4147j = i2;
    }
}
