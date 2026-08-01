package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class p61 extends o61 {

    /* JADX INFO: renamed from: f */
    public final Runnable f4769f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public p61(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.f4769f = runnable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        this.f4769f.run();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f4769f;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC0398kl.m1927m(runnable));
        sb.append(", ");
        sb.append(this.f4469d);
        sb.append(", ");
        sb.append(this.f4470e ? "Blocking" : "Non-blocking");
        sb.append(']');
        return sb.toString();
    }
}
