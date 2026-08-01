package defpackage;

/* JADX INFO: renamed from: ᲀᲈᛸᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1785 implements android.window.OnBackInvokedCallback {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f7864;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f7865;

    public /* synthetic */ C1785(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f7864 = r1
            r0.f7865 = r2
            r0.<init>()
            return
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
            r1 = this;
            int r0 = r1.f7864
            java.lang.Object r1 = r1.f7865
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
            ᲀᲈᛵᲇ r1 = (defpackage.InterfaceC1781) r1
            r1.mo1032()
            return
        L13:
            ᛸᛱᛱᛲ r1 = (defpackage.LayoutInflaterFactory2C1411) r1
            r1.m2588()
            return
    }
}
