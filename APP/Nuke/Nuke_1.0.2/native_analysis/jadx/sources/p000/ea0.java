package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ea0 extends w51 implements xm0 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean f2370i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ qc2 f2371j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ String f2372k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea0(boolean z, qc2 qc2Var, String str) {
        super(0);
        this.f2370i = z;
        this.f2371j = qc2Var;
        this.f2372k = str;
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        if (this.f2370i) {
            qc2 qc2Var = this.f2371j;
            String str = this.f2372k;
            sc2 sc2Var = qc2Var.f8891a;
            synchronized (sc2Var.f10040c) {
            }
        }
        return a83.f116a;
    }
}
