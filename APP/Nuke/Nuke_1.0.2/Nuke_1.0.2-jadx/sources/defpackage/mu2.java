package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class mu2 extends ru2 {
    public c3 c;
    public int d;
    public int e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public mu2(long j, c3 c3Var) {
        super(j);
        this.c = c3Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ru2
    public final void a(ru2 ru2Var) {
        synchronized (tl.g) {
            ru2Var.getClass();
            this.c = ((mu2) ru2Var).c;
            this.d = ((mu2) ru2Var).d;
            this.e = ((mu2) ru2Var).e;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ru2
    public final ru2 b(long j) {
        return new mu2(j, this.c);
    }
}
