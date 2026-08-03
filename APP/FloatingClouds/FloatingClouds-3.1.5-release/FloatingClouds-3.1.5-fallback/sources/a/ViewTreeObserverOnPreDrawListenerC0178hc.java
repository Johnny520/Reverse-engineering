package a;

/* JADX INFO: renamed from: a.hc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0178hc implements android.view.ViewTreeObserver.OnPreDrawListener, android.view.View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.view.View f498a;
    public android.view.ViewTreeObserver b;
    public final java.lang.Runnable c;

    public ViewTreeObserverOnPreDrawListenerC0178hc(android.view.View r1, java.lang.Runnable r2) {
            r0 = this;
            r0.<init>()
            r0.f498a = r1
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            r0.b = r1
            r0.c = r2
            return
    }

    public static void a(android.view.View r1, java.lang.Runnable r2) {
            if (r1 == 0) goto L12
            a.hc r0 = new a.hc
            r0.<init>(r1, r2)
            android.view.ViewTreeObserver r2 = r1.getViewTreeObserver()
            r2.addOnPreDrawListener(r0)
            r1.addOnAttachStateChangeListener(r0)
            return
        L12:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "view == null"
            r1.<init>(r2)
            throw r1
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
            r2 = this;
            android.view.ViewTreeObserver r0 = r2.b
            boolean r0 = r0.isAlive()
            android.view.View r1 = r2.f498a
            if (r0 == 0) goto L10
            android.view.ViewTreeObserver r0 = r2.b
            r0.removeOnPreDrawListener(r2)
            goto L17
        L10:
            android.view.ViewTreeObserver r0 = r1.getViewTreeObserver()
            r0.removeOnPreDrawListener(r2)
        L17:
            r1.removeOnAttachStateChangeListener(r2)
            java.lang.Runnable r0 = r2.c
            r0.run()
            r0 = 1
            return r0
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View r1) {
            r0 = this;
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            r0.b = r1
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View r2) {
            r1 = this;
            android.view.ViewTreeObserver r2 = r1.b
            boolean r2 = r2.isAlive()
            android.view.View r0 = r1.f498a
            if (r2 == 0) goto L10
            android.view.ViewTreeObserver r2 = r1.b
            r2.removeOnPreDrawListener(r1)
            goto L17
        L10:
            android.view.ViewTreeObserver r2 = r0.getViewTreeObserver()
            r2.removeOnPreDrawListener(r1)
        L17:
            r0.removeOnAttachStateChangeListener(r1)
            return
    }
}
