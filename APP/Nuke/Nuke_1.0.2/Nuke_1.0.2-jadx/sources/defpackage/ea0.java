package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ea0 extends w51 implements xm0 {
    public final /* synthetic */ boolean i;
    public final /* synthetic */ qc2 j;
    public final /* synthetic */ String k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea0(boolean z, qc2 qc2Var, String str) {
        super(0);
        this.i = z;
        this.j = qc2Var;
        this.k = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xm0
    public final Object a() {
        if (this.i) {
            qc2 qc2Var = this.j;
            String str = this.k;
            sc2 sc2Var = qc2Var.a;
            synchronized (sc2Var.c) {
            }
        }
        return a83.a;
    }
}
