package p000;

/* JADX INFO: renamed from: b5 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0065b5 implements android.window.OnBackInvokedCallback {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f1474;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ java.lang.Object f1475;

    public /* synthetic */ C0065b5(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f1474 = r1
            r0.f1475 = r2
            r0.<init>()
            return
    }

    public final void onBackInvoked() {
            r1 = this;
            int r0 = r1.f1474
            java.lang.Object r1 = r1.f1475
            switch(r0) {
                case 0: goto L13;
                case 1: goto Ld;
                default: goto L7;
            }
        L7:
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r1.run()
            return
        Ld:
            p70 r1 = (p000.p70) r1
            r1.invoke()
            return
        L13:
            androidx.appcompat.app.β r1 = (androidx.appcompat.app.LayoutInflaterFactory2C0026) r1
            r1.m214()
            return
    }
}
