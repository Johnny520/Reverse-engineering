package g3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends androidx.lifecycle.x {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public android.view.View f4216i;

    @Override // androidx.lifecycle.x
    public final void b0() {
            r3 = this;
            android.view.View r0 = r3.f4216i
            if (r0 == 0) goto L19
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 >= r2) goto L19
            android.content.Context r1 = r0.getContext()
            java.lang.String r2 = "input_method"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
            r1.isActive()
        L19:
            if (r0 == 0) goto L20
            android.view.WindowInsetsController r0 = g3.h.k(r0)
            goto L21
        L20:
            r0 = 0
        L21:
            if (r0 == 0) goto L2a
            int r1 = g3.h.b()
            g3.h.p(r0, r1)
        L2a:
            super.b0()
            return
    }

    @Override // androidx.lifecycle.x
    public final void y() {
            r6 = this;
            android.view.View r0 = r6.f4216i
            if (r0 == 0) goto L9
            android.view.WindowInsetsController r1 = g3.h.k(r0)
            goto La
        L9:
            r1 = 0
        La:
            if (r1 == 0) goto L40
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r3 = 0
            r2.<init>(r3)
            g3.i r4 = new g3.i
            r4.<init>(r2)
            g3.h.q(r1, r4)
            boolean r2 = r2.get()
            if (r2 != 0) goto L35
            if (r0 == 0) goto L35
            android.content.Context r2 = r0.getContext()
            java.lang.String r5 = "input_method"
            java.lang.Object r2 = r2.getSystemService(r5)
            android.view.inputmethod.InputMethodManager r2 = (android.view.inputmethod.InputMethodManager) r2
            android.os.IBinder r0 = r0.getWindowToken()
            r2.hideSoftInputFromWindow(r0, r3)
        L35:
            g3.h.x(r1, r4)
            int r0 = g3.h.b()
            g3.h.w(r1, r0)
            return
        L40:
            super.y()
            return
    }
}
