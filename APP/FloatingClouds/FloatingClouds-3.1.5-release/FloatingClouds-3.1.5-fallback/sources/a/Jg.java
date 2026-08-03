package a;

/* JADX INFO: loaded from: classes.dex */
public final class Jg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference<android.view.View> f145a;

    public Jg(android.view.View r2) {
            r1 = this;
            r1.<init>()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.f145a = r0
            return
    }

    public final void a(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f145a
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
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f145a
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
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f145a
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.setDuration(r2)
        L11:
            return
    }

    public final void d(a.Lg r4) {
            r3 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r3.f145a
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L21
            if (r4 == 0) goto L19
            android.view.ViewPropertyAnimator r1 = r0.animate()
            a.v0 r2 = new a.v0
            r2.<init>(r4, r0)
            r1.setListener(r2)
            return
        L19:
            android.view.ViewPropertyAnimator r4 = r0.animate()
            r0 = 0
            r4.setListener(r0)
        L21:
            return
    }

    public final void e(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f145a
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.translationY(r2)
        L11:
            return
    }
}
