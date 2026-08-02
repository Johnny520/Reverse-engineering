package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class lg0 extends c20 {
    public static final /* synthetic */ int m = 0;
    public long j;
    public boolean k;
    public ag l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void G(boolean z) {
        long j = this.j - (z ? 4294967296L : 1L);
        this.j = j;
        if (j <= 0 && this.k) {
            shutdown();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void H(m90 m90Var) {
        ag agVar = this.l;
        if (agVar == null) {
            agVar = new ag();
            this.l = agVar;
        }
        agVar.addLast(m90Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void I(boolean z) {
        this.j = (z ? 4294967296L : 1L) + this.j;
        if (z) {
            return;
        }
        this.k = true;
    }

    public abstract long J();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean K() {
        ag agVar = this.l;
        if (agVar == null) {
            return false;
        }
        m90 m90Var = (m90) (agVar.isEmpty() ? null : agVar.removeFirst());
        if (m90Var == null) {
            return false;
        }
        m90Var.run();
        return true;
    }

    public abstract void shutdown();
}
