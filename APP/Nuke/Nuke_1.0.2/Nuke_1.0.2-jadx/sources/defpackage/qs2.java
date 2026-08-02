package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qs2 extends ru2 {
    public zy1 c;
    public int d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public qs2(long j, zy1 zy1Var) {
        super(j);
        this.c = zy1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ru2
    public final void a(ru2 ru2Var) {
        ru2Var.getClass();
        qs2 qs2Var = (qs2) ru2Var;
        synchronized (p40.m) {
            this.c = qs2Var.c;
            this.d = qs2Var.d;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ru2
    public final ru2 b(long j) {
        return new qs2(j, this.c);
    }
}
