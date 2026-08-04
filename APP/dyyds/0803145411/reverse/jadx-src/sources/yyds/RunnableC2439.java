package yyds;

/* JADX INFO: renamed from: yyds.ᲇᛴᛷᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2439 implements Runnable {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f11999;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ C0763 f12000;

    public /* synthetic */ RunnableC2439(C0763 c0763, int i) {
        this.f11999 = i;
        this.f12000 = c0763;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f11999;
        C0763 c0763 = this.f12000;
        switch (i) {
            case 0:
                C2457 c2457 = c0763.f3516;
                if (c2457 != null) {
                    c2457.m4497();
                }
                break;
            default:
                C2457 c24572 = c0763.f3516;
                if (c24572 != null) {
                    c24572.m4495(null);
                    break;
                }
                break;
        }
    }
}
