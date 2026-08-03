package p249qg;

/* JADX INFO: renamed from: qg.i0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3571i0 extends AbstractRunnableC3574j0 {

    /* JADX INFO: renamed from: i */
    public final RunnableC3575j1 f11578i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3571i0(long j3, RunnableC3575j1 runnableC3575j1) {
        super(j3);
        this.f11578i = runnableC3575j1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        this.f11578i.run();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.AbstractRunnableC3574j0
    public final String toString() {
        return super.toString() + this.f11578i;
    }
}
