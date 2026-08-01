package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j3 implements android.window.OnBackInvokedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ j3(int r1, java.lang.Object r2) {
            r0 = this;
            r0.a = r1
            r0.b = r2
            r0.<init>()
            return
    }

    public final void onBackInvoked() {
            r2 = this;
            int r0 = r2.a
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
            hm r0 = (defpackage.hm) r0
            java.lang.String r1 = "$onBackInvoked"
            defpackage.ip.o(r1, r0)
            r0.a()
            return
        L1a:
            java.lang.Object r0 = r2.b
            r3 r0 = (defpackage.r3) r0
            r0.D()
            return
    }
}
