package yyds;

/* JADX INFO: renamed from: yyds.ᛱᲇᲀᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0241 implements Runnable {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f1337;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ C0912 f1338;

    public /* synthetic */ RunnableC0241(C0912 c0912, int i) {
        this.f1337 = i;
        this.f1338 = c0912;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1337;
        C0912 c0912 = this.f1338;
        switch (i) {
            case 0:
                ViewOnTouchListenerC0565 viewOnTouchListenerC0565 = c0912.f4148;
                if (viewOnTouchListenerC0565 != null) {
                    viewOnTouchListenerC0565.m1435();
                }
                break;
            case 1:
                c0912.m2027();
                break;
            default:
                c0912.m2030();
                break;
        }
    }
}
