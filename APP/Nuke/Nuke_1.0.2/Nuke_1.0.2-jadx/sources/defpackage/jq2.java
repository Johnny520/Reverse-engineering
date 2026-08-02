package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class jq2 implements ca0 {
    public final lq2 h;
    public final long i;
    public final Object j;
    public final mp k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public jq2(lq2 lq2Var, long j, Object obj, mp mpVar) {
        this.h = lq2Var;
        this.i = j;
        this.j = obj;
        this.k = mpVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ca0
    public final void a() {
        lq2 lq2Var = this.h;
        synchronized (lq2Var) {
            if (this.i >= lq2Var.n()) {
                Object[] objArr = lq2Var.o;
                objArr.getClass();
                long j = this.i;
                if (objArr[((int) j) & (objArr.length - 1)] == this) {
                    p7.j(objArr, j, p7.f);
                    lq2Var.h();
                }
            }
        }
    }
}
