package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class rm extends tw2 implements mn0 {
    public /* synthetic */ Object l;
    public final /* synthetic */ sm m;
    public final /* synthetic */ zn1 n;
    public final /* synthetic */ t6 o;
    public final /* synthetic */ s1 p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rm(sm smVar, zn1 zn1Var, t6 t6Var, s1 s1Var, t00 t00Var) {
        super(2, t00Var);
        this.m = smVar;
        this.n = zn1Var;
        this.o = t6Var;
        this.p = s1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        return ((rm) p((t00) obj2, (j20) obj)).r(a83.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        rm rmVar = new rm(this.m, this.n, this.o, this.p, t00Var);
        rmVar.l = obj;
        return rmVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final Object r(Object obj) {
        fg1.T(obj);
        j20 j20Var = (j20) this.l;
        t6 t6Var = this.o;
        sm smVar = this.m;
        p7.A(j20Var, null, new b2(smVar, this.n, t6Var, null, 3), 3);
        return p7.A(j20Var, null, new a2(smVar, this.p, null, 7), 3);
    }
}
