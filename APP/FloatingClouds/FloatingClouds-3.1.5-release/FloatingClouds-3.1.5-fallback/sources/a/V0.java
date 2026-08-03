package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class V0 implements android.window.OnBackInvokedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f297a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ V0(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f297a = r1
            r0.b = r2
            r0.<init>()
            return
    }

    public final void onBackInvoked() {
            r2 = this;
            int r0 = r2.f297a
            switch(r0) {
                case 0: goto L1a;
                case 1: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r2.b
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            return
        Ld:
            java.lang.Object r0 = r2.b
            a.s7 r0 = (a.InterfaceC0369s7) r0
            java.lang.String r1 = "$onBackInvoked"
            a.C0193i9.e(r0, r1)
            r0.a()
            return
        L1a:
            java.lang.Object r0 = r2.b
            a.Q0 r0 = (a.Q0) r0
            r0.T()
            return
    }
}
