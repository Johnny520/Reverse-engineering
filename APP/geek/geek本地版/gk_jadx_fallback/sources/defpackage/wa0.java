package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wa0 {
    public final java.lang.ref.WeakReference a;

    public wa0(android.view.View r2) {
            r1 = this;
            r1.<init>()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.a = r0
            return
    }

    public final void a(float r2) {
            r1 = this;
            java.lang.ref.WeakReference r0 = r1.a
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.alpha(r2)
        L11:
            return
    }

    public final void b() {
            r1 = this;
            java.lang.ref.WeakReference r0 = r1.a
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.cancel()
        L11:
            return
    }

    public final void c(long r2) {
            r1 = this;
            java.lang.ref.WeakReference r0 = r1.a
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.setDuration(r2)
        L11:
            return
    }

    public final void d(defpackage.ya0 r5) {
            r4 = this;
            java.lang.ref.WeakReference r0 = r4.a
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L22
            if (r5 == 0) goto L1a
            android.view.ViewPropertyAnimator r1 = r0.animate()
            o70 r2 = new o70
            r3 = 1
            r2.<init>(r5, r0, r3)
            r1.setListener(r2)
            return
        L1a:
            android.view.ViewPropertyAnimator r5 = r0.animate()
            r0 = 0
            r5.setListener(r0)
        L22:
            return
    }

    public final void e(float r2) {
            r1 = this;
            java.lang.ref.WeakReference r0 = r1.a
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.translationY(r2)
        L11:
            return
    }
}
