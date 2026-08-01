package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class k81 extends gy0 implements Runnable {

    /* JADX INFO: renamed from: j */
    public final long f3049j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public k81(long j, l81 l81Var) {
        super(l81Var, l81Var.mo540e());
        this.f3049j = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.j40
    /* JADX INFO: renamed from: U */
    public final String mo1628U() {
        return super.mo1628U() + "(timeMillis=" + this.f3049j + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        s91.m4061z(this.f5614h);
        m1612A(new j81("Timed out waiting for " + this.f3049j + " ms", this));
    }
}
