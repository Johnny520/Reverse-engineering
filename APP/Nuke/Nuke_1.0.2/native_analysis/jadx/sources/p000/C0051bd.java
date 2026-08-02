package p000;

/* JADX INFO: renamed from: bd */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0051bd extends w51 implements nn0 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ in0 f786i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ y33 f787j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0051bd(in0 in0Var, y33 y33Var) {
        super(3);
        this.f786i = in0Var;
        this.f787j = y33Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0032  */
    @Override // p000.nn0
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo489e(Object obj, Object obj2, Object obj3) {
        long j;
        pf1 pf1Var = (pf1) obj;
        sz1 sz1VarMo2340e = ((if1) obj2).mo2340e(((C0221fz) obj3).f3199a);
        if (pf1Var.mo699u()) {
            if (((Boolean) this.f786i.mo5j(this.f787j.f13292d.getValue())).booleanValue()) {
                j = (((long) sz1VarMo2340e.f10438h) << 32) | (((long) sz1VarMo2340e.f10439i) & 4294967295L);
            } else {
                j = 0;
            }
        }
        return pf1Var.mo696j0((int) (j >> 32), (int) (4294967295L & j), ce0.f1492h, new C0487n6(sz1VarMo2340e, 2));
    }
}
