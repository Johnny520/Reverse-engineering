package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class x92 {

    /* JADX INFO: renamed from: α */
    public final java.lang.ref.WeakReference f12083;

    public x92(android.view.View r2) {
            r1 = this;
            r1.<init>()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.f12083 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m6540(float r1) {
            r0 = this;
            java.lang.ref.WeakReference r0 = r0.f12083
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.alpha(r1)
        L11:
            return
    }

    /* JADX INFO: renamed from: β */
    public final void m6541() {
            r0 = this;
            java.lang.ref.WeakReference r0 = r0.f12083
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.cancel()
        L11:
            return
    }

    /* JADX INFO: renamed from: γ */
    public final void m6542(long r1) {
            r0 = this;
            java.lang.ref.WeakReference r0 = r0.f12083
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.setDuration(r1)
        L11:
            return
    }

    /* JADX INFO: renamed from: δ */
    public final void m6543(p000.z92 r3) {
            r2 = this;
            java.lang.ref.WeakReference r2 = r2.f12083
            java.lang.Object r2 = r2.get()
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L21
            if (r3 == 0) goto L19
            android.view.ViewPropertyAnimator r0 = r2.animate()
            ｉ r1 = new ｉ
            r1.<init>(r3, r2)
            r0.setListener(r1)
            return
        L19:
            android.view.ViewPropertyAnimator r2 = r2.animate()
            r3 = 0
            r2.setListener(r3)
        L21:
            return
    }

    /* JADX INFO: renamed from: ε */
    public final void m6544(float r1) {
            r0 = this;
            java.lang.ref.WeakReference r0 = r0.f12083
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.translationY(r1)
        L11:
            return
    }
}
