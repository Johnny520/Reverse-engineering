package b;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b.c f325a = null;

    static {
            b.c r0 = new b.c
            r0.<init>()
            b.c.f325a = r0
            return
    }

    public final android.window.OnBackInvokedCallback a(fg.a r3) {
            r2 = this;
            r3.getClass()
            b.b r0 = new b.b
            r1 = 0
            r0.<init>(r3, r1)
            return r0
    }

    public final void b(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r1.getClass()
            r3.getClass()
            android.window.OnBackInvokedDispatcher r1 = (android.window.OnBackInvokedDispatcher) r1
            android.window.OnBackInvokedCallback r3 = (android.window.OnBackInvokedCallback) r3
            r1.registerOnBackInvokedCallback(r2, r3)
            return
    }

    public final void c(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            android.window.OnBackInvokedDispatcher r1 = (android.window.OnBackInvokedDispatcher) r1
            android.window.OnBackInvokedCallback r2 = (android.window.OnBackInvokedCallback) r2
            r1.unregisterOnBackInvokedCallback(r2)
            return
    }
}
