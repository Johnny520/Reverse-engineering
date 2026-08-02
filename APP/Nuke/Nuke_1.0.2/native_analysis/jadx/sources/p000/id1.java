package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class id1 extends w51 implements xm0 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ kd1 f4569i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ long f4570j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ long f4571k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ uz1 f4572l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public id1(kd1 kd1Var, long j, long j2, uz1 uz1Var) {
        super(0);
        this.f4569i = kd1Var;
        this.f4570j = j;
        this.f4571k = j2;
        this.f4572l = uz1Var;
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        kd1 kd1Var = this.f4569i;
        kd1Var.m2633D0().f3957h = false;
        kd1Var.m2633D0().f3958i = this.f4570j;
        kd1Var.m2633D0().f3959j = this.f4571k;
        in0 in0VarMo107d = this.f4572l.f11567h.mo107d();
        if (in0VarMo107d != null) {
            in0VarMo107d.mo5j(kd1Var.m2633D0());
        }
        return a83.f116a;
    }
}
