package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class id1 extends w51 implements xm0 {
    public final /* synthetic */ kd1 i;
    public final /* synthetic */ long j;
    public final /* synthetic */ long k;
    public final /* synthetic */ uz1 l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public id1(kd1 kd1Var, long j, long j2, uz1 uz1Var) {
        super(0);
        this.i = kd1Var;
        this.j = j;
        this.k = j2;
        this.l = uz1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xm0
    public final Object a() {
        kd1 kd1Var = this.i;
        kd1Var.D0().h = false;
        kd1Var.D0().i = this.j;
        kd1Var.D0().j = this.k;
        in0 in0VarD = this.l.h.d();
        if (in0VarD != null) {
            in0VarD.j(kd1Var.D0());
        }
        return a83.a;
    }
}
