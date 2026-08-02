package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class bd extends w51 implements nn0 {
    public final /* synthetic */ in0 i;
    public final /* synthetic */ y33 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd(in0 in0Var, y33 y33Var) {
        super(3);
        this.i = in0Var;
        this.j = y33Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0032  */
    @Override // defpackage.nn0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Object obj, Object obj2, Object obj3) {
        long j;
        pf1 pf1Var = (pf1) obj;
        sz1 sz1VarE = ((if1) obj2).e(((fz) obj3).a);
        if (pf1Var.u()) {
            if (((Boolean) this.i.j(this.j.d.getValue())).booleanValue()) {
                j = (((long) sz1VarE.h) << 32) | (((long) sz1VarE.i) & 4294967295L);
            } else {
                j = 0;
            }
        }
        return pf1Var.j0((int) (j >> 32), (int) (4294967295L & j), ce0.h, new n6(sz1VarE, 2));
    }
}
