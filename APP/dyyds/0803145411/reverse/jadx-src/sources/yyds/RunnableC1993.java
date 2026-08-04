package yyds;

/* JADX INFO: renamed from: yyds.ᲀᛴᛸᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1993 extends C1612 implements Runnable {

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final long f9999;

    public RunnableC1993(long j, C0081 c0081) {
        super(c0081.f6070, c0081);
        this.f9999 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC0902.m2019(this.f1119);
        m2143(new C1263("Timed out waiting for " + this.f9999 + " ms", this));
    }

    @Override // yyds.AbstractC0986
    /* JADX INFO: renamed from: ᲁᛶᛴᛸ */
    public final String mo2165() {
        return super.mo2165() + "(timeMillis=" + this.f9999 + ')';
    }
}
