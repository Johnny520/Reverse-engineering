package yyds;

/* JADX INFO: renamed from: yyds.ᛴᛱᛸᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0773 implements Runnable {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ boolean f3567;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ C0750 f3568;

    public RunnableC0773(C0750 c0750, boolean z) {
        this.f3568 = c0750;
        this.f3567 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC0181.m744();
        C2115 c2115 = this.f3568.f3461;
        boolean z = c2115.f10454;
        boolean z2 = this.f3567;
        c2115.f10454 = z2;
        if (z != z2) {
            ((C2487) c2115.f10455).mo3740(z2);
        }
    }
}
