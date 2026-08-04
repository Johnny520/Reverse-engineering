package yyds;

/* JADX INFO: renamed from: yyds.ᲀᛸᲀᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2056 implements Runnable {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ float f10197;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ RunnableC0871 f10198;

    public RunnableC2056(RunnableC0871 runnableC0871, float f) {
        this.f10198 = runnableC0871;
        this.f10197 = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2332 c2332 = ((C0291) this.f10198.f3989).f1545;
        int i = c2332.f11480;
        float f = this.f10197;
        switch (i) {
            case 0:
                C2312 c2312 = c2332.f11481;
                c2312.f11326 = f;
                c2312.invalidate();
                break;
            case 1:
                C2312 c23122 = c2332.f11481;
                if (c23122.isAttachedToWindow()) {
                    c23122.f11326 = f;
                    c23122.invalidate();
                    break;
                }
                break;
            default:
                c2332.f11481.f11329 = f;
                break;
        }
    }
}
