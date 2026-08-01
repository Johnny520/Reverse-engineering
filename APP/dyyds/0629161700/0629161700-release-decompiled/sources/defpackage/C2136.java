package defpackage;

/* JADX INFO: renamed from: ᲇᲇᛱᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2136 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.ref.WeakReference f9108;

    public C2136(android.view.View r2) {
            r1 = this;
            r1.<init>()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.f9108 = r0
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final void m3552(float r1) {
            r0 = this;
            java.lang.ref.WeakReference r0 = r0.f9108
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.translationY(r1)
        L11:
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final void m3553(defpackage.InterfaceC2045 r3) {
            r2 = this;
            java.lang.ref.WeakReference r2 = r2.f9108
            java.lang.Object r2 = r2.get()
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L21
            if (r3 == 0) goto L19
            android.view.ViewPropertyAnimator r0 = r2.animate()
            ᲀᛷᛲᛴ r1 = new ᲀᛷᛲᛴ
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

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final void m3554(long r1) {
            r0 = this;
            java.lang.ref.WeakReference r0 = r0.f9108
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.setDuration(r1)
        L11:
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m3555(float r1) {
            r0 = this;
            java.lang.ref.WeakReference r0 = r0.f9108
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.alpha(r1)
        L11:
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final void m3556() {
            r0 = this;
            java.lang.ref.WeakReference r0 = r0.f9108
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.cancel()
        L11:
            return
    }
}
