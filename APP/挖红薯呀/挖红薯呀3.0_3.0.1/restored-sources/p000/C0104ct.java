package p000;

/* JADX INFO: renamed from: ct */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0104ct extends AbstractRunnableC0140dt {

    /* JADX INFO: renamed from: f */
    public final k81 f885f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0104ct(long j, k81 k81Var) {
        super(j);
        this.f885f = k81Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        this.f885f.run();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractRunnableC0140dt
    public final String toString() {
        return super.toString() + this.f885f;
    }
}
