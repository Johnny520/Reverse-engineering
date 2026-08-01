package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tw {
    public static final defpackage.tw a = null;

    static {
            tw r0 = new tw
            r0.<init>()
            defpackage.tw.a = r0
            return
    }

    public final android.window.OnBackInvokedCallback a(defpackage.hm r3) {
            r2 = this;
            java.lang.String r0 = "onBackInvoked"
            defpackage.ip.o(r0, r3)
            j3 r0 = new j3
            r1 = 1
            r0.<init>(r1, r3)
            return r0
    }

    public final void b(java.lang.Object r2, int r3, java.lang.Object r4) {
            r1 = this;
            java.lang.String r0 = "dispatcher"
            defpackage.ip.o(r0, r2)
            java.lang.String r0 = "callback"
            defpackage.ip.o(r0, r4)
            android.window.OnBackInvokedDispatcher r2 = (android.window.OnBackInvokedDispatcher) r2
            android.window.OnBackInvokedCallback r4 = (android.window.OnBackInvokedCallback) r4
            r2.registerOnBackInvokedCallback(r3, r4)
            return
    }

    public final void c(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            java.lang.String r0 = "dispatcher"
            defpackage.ip.o(r0, r2)
            java.lang.String r0 = "callback"
            defpackage.ip.o(r0, r3)
            android.window.OnBackInvokedDispatcher r2 = (android.window.OnBackInvokedDispatcher) r2
            android.window.OnBackInvokedCallback r3 = (android.window.OnBackInvokedCallback) r3
            r2.unregisterOnBackInvokedCallback(r3)
            return
    }
}
