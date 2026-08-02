package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class iv implements cp {
    public final /* synthetic */ int h;
    public final kv i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ iv(kv kvVar, int i) {
        this.h = i;
        this.i = kvVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.cp
    public final void b(wo woVar, q92 q92Var) {
        int i = this.h;
        kv kvVar = this.i;
        switch (i) {
            case 0:
                if (!q92Var.a.w) {
                    kvVar.completeExceptionally(new pv(q92Var));
                } else {
                    kvVar.complete(q92Var.b);
                }
                break;
            default:
                kvVar.complete(q92Var);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.cp
    public final void d(wo woVar, Throwable th) {
        int i = this.h;
        kv kvVar = this.i;
        switch (i) {
            case 0:
                kvVar.completeExceptionally(th);
                break;
            default:
                kvVar.completeExceptionally(th);
                break;
        }
    }
}
