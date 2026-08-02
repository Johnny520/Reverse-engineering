package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class wt1 extends w51 implements in0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ pl0 j;
    public final /* synthetic */ pl0 k;
    public final /* synthetic */ int l;
    public final /* synthetic */ ec m;
    public final /* synthetic */ Object n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wt1(pl0 pl0Var, pl0 pl0Var2, Object obj, int i, ec ecVar, int i2) {
        super(1);
        this.i = i2;
        this.j = pl0Var;
        this.k = pl0Var2;
        this.n = obj;
        this.l = i;
        this.m = ecVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        int i = this.i;
        ec ecVar = this.m;
        int i2 = this.l;
        Object obj2 = this.n;
        pl0 pl0Var = this.k;
        pl0 pl0Var2 = this.j;
        switch (i) {
            case 0:
                nk nkVar = (nk) obj;
                if (pl0Var2 != ((bl0) ((b7) sp0.f0(pl0Var)).getFocusOwner()).f()) {
                    return Boolean.TRUE;
                }
                boolean zP = t11.P(pl0Var, (pl0) obj2, i2, ecVar);
                Boolean boolValueOf = Boolean.valueOf(zP);
                if (zP || !nkVar.a()) {
                    return boolValueOf;
                }
                return null;
            default:
                nk nkVar2 = (nk) obj;
                if (pl0Var2 != ((bl0) ((b7) sp0.f0(pl0Var)).getFocusOwner()).f()) {
                    return Boolean.TRUE;
                }
                boolean zP2 = dd3.p(i2, ecVar, pl0Var, (o62) obj2);
                Boolean boolValueOf2 = Boolean.valueOf(zP2);
                if (zP2 || !nkVar2.a()) {
                    return boolValueOf2;
                }
                return null;
        }
    }
}
