package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class y41 {

    /* JADX INFO: renamed from: α */
    public static final p000.y41 f12453 = null;

    static {
            y41 r0 = new y41
            r0.<init>()
            p000.y41.f12453 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public final android.window.OnBackInvokedCallback m6831(p000.p70 r2) {
            r1 = this;
            r2.getClass()
            b5 r1 = new b5
            r0 = 1
            r1.<init>(r0, r2)
            return r1
    }

    /* JADX INFO: renamed from: β */
    public final void m6832(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r1.getClass()
            r3.getClass()
            android.window.OnBackInvokedDispatcher r1 = (android.window.OnBackInvokedDispatcher) r1
            android.window.OnBackInvokedCallback r3 = (android.window.OnBackInvokedCallback) r3
            r1.registerOnBackInvokedCallback(r2, r3)
            return
    }

    /* JADX INFO: renamed from: γ */
    public final void m6833(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            android.window.OnBackInvokedDispatcher r1 = (android.window.OnBackInvokedDispatcher) r1
            android.window.OnBackInvokedCallback r2 = (android.window.OnBackInvokedCallback) r2
            r1.unregisterOnBackInvokedCallback(r2)
            return
    }
}
