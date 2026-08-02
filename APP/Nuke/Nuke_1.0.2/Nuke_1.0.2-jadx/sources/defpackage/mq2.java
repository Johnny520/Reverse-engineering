package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class mq2 extends o3 {
    public long a;
    public mp b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.o3
    public final boolean a(n3 n3Var) {
        lq2 lq2Var = (lq2) n3Var;
        if (this.a >= 0) {
            return false;
        }
        long j = lq2Var.p;
        if (j < lq2Var.q) {
            lq2Var.q = j;
        }
        this.a = j;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.o3
    public final t00[] b(n3 n3Var) {
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((lq2) n3Var).u(j);
    }
}
