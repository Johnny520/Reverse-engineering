package yyds;

/* JADX INFO: renamed from: yyds.ᛸᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1873 implements Runnable {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f9424;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ RunnableC1421 f9425;

    public /* synthetic */ RunnableC1873(RunnableC1421 runnableC1421, int i) {
        this.f9424 = i;
        this.f9425 = runnableC1421;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f9424;
        RunnableC1421 runnableC1421 = this.f9425;
        switch (i) {
            case 0:
                new C1344().m2748();
                C2458 c2458 = (C2458) runnableC1421.f6712;
                c2458.m4500();
                long j = c2458.f12153.f8273;
                if (j > 0) {
                    c2458.f12149.postDelayed(new RunnableC0871(20, this), j);
                }
                break;
            default:
                C2458 c24582 = (C2458) runnableC1421.f6712;
                if (c24582.f12153.f8269 > -1) {
                    c24582.m4498(null);
                }
                break;
        }
    }
}
