package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vw {
    public static final defpackage.vw a = null;

    static {
            vw r0 = new vw
            r0.<init>()
            defpackage.vw.a = r0
            return
    }

    public final android.window.OnBackInvokedCallback a(defpackage.sm r2, defpackage.sm r3, defpackage.hm r4, defpackage.hm r5) {
            r1 = this;
            java.lang.String r0 = "onBackStarted"
            defpackage.ip.o(r0, r2)
            java.lang.String r0 = "onBackProgressed"
            defpackage.ip.o(r0, r3)
            java.lang.String r0 = "onBackInvoked"
            defpackage.ip.o(r0, r4)
            java.lang.String r0 = "onBackCancelled"
            defpackage.ip.o(r0, r5)
            uw r0 = new uw
            r0.<init>(r2, r3, r4, r5)
            return r0
    }
}
