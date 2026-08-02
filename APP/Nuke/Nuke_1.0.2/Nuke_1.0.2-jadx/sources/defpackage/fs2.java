package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class fs2 extends ru2 {
    public float c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public fs2(float f, long j) {
        super(j);
        this.c = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ru2
    public final void a(ru2 ru2Var) {
        ru2Var.getClass();
        this.c = ((fs2) ru2Var).c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ru2
    public final ru2 b(long j) {
        return new fs2(this.c, j);
    }
}
