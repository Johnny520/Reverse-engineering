package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class of0 extends w51 implements in0 {
    public final /* synthetic */ sz1 i;
    public final /* synthetic */ long j;
    public final /* synthetic */ long k;
    public final /* synthetic */ ec l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public of0(sz1 sz1Var, long j, long j2, ec ecVar) {
        super(1);
        this.i = sz1Var;
        this.j = j;
        this.k = j2;
        this.l = ecVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        rz1 rz1Var = (rz1) obj;
        long j = this.j;
        long j2 = this.k;
        rz1Var.getClass();
        sz1 sz1Var = this.i;
        rz1.a(rz1Var, sz1Var);
        sz1Var.f0(z01.c((((long) (((int) (j >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) (((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L), sz1Var.l), 0.0f, this.l);
        return a83.a;
    }
}
