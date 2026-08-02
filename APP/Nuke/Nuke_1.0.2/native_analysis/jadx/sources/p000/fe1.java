package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fe1 implements xm0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f2919h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ ge1 f2920i;

    public /* synthetic */ fe1(ge1 ge1Var, int i) {
        this.f2919h = i;
        this.f2920i = ge1Var;
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        int i = this.f2919h;
        ge1 ge1Var = this.f2920i;
        switch (i) {
            case 0:
                ge1Var.m1850O0();
                return a83.f116a;
            case 1:
                return new rs1(ge1Var.f3460D);
            default:
                c61 c61Var = (c61) ge1Var.f3458B.getValue();
                return new rs1(c61Var != null ? c61Var.mo646M(0L) : 9205357640488583168L);
        }
    }
}
