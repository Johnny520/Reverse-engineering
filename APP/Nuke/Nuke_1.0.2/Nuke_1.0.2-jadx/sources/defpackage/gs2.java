package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gs2 extends ru2 {
    public int c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public gs2(long j, int i) {
        super(j);
        this.c = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ru2
    public final void a(ru2 ru2Var) {
        ru2Var.getClass();
        this.c = ((gs2) ru2Var).c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ru2
    public final ru2 b(long j) {
        return new gs2(j, this.c);
    }
}
