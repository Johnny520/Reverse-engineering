package yyds;

/* JADX INFO: renamed from: yyds.ᛶᛲᛸᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1288 extends AbstractRunnableC1665 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final RunnableC1993 f5932;

    public C1288(long j, RunnableC1993 runnableC1993) {
        super(j);
        this.f5932 = runnableC1993;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5932.run();
    }

    @Override // yyds.AbstractRunnableC1665
    public final String toString() {
        return super.toString() + this.f5932;
    }
}
