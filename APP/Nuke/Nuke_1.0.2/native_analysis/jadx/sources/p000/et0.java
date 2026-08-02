package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class et0 implements mn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f2588h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f2589i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ uh1 f2590j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ long f2591k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f2592l;

    public /* synthetic */ et0(sx0 sx0Var, uh1 uh1Var, long j, int i, int i2) {
        this.f2588h = 0;
        this.f2589i = sx0Var;
        this.f2590j = uh1Var;
        this.f2591k = j;
        this.f2592l = i2;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f2588h;
        int i2 = this.f2592l;
        a83 a83Var = a83.f116a;
        Object obj3 = this.f2589i;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM3902N = pp0.m3902N(1);
                ci0.m811l((sx0) obj3, this.f2590j, this.f2591k, (InterfaceC0596px) obj, iM3902N, this.f2592l);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iM3902N2 = pp0.m3902N(i2 | 1);
                fx0.m1724a((sx0) obj3, this.f2590j, this.f2591k, (InterfaceC0596px) obj, iM3902N2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM3902N3 = pp0.m3902N(i2 | 1);
                fx0.m1725b((lw1) obj3, this.f2590j, this.f2591k, (InterfaceC0596px) obj, iM3902N3);
                break;
        }
        return a83Var;
    }

    public /* synthetic */ et0(Object obj, uh1 uh1Var, long j, int i, int i2) {
        this.f2588h = i2;
        this.f2589i = obj;
        this.f2590j = uh1Var;
        this.f2591k = j;
        this.f2592l = i;
    }
}
