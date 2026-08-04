package yyds;

/* JADX INFO: renamed from: yyds.ᛱᛷᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0166 extends AbstractRunnableC1665 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final C1853 f990;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0467 f991;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0166(AbstractC0467 abstractC0467, long j, C1853 c1853) {
        super(j);
        this.f991 = abstractC0467;
        this.f990 = c1853;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f990.m3632(this.f991);
    }

    @Override // yyds.AbstractRunnableC1665
    public final String toString() {
        return super.toString() + this.f990;
    }
}
