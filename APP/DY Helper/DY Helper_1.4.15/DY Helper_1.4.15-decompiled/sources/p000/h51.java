package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class h51 implements android.view.ViewTreeObserver.OnPreDrawListener, android.view.View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ε */
    public final android.view.View f4576;

    /* JADX INFO: renamed from: ζ */
    public android.view.ViewTreeObserver f4577;

    /* JADX INFO: renamed from: η */
    public final java.lang.Runnable f4578;

    public h51(android.view.View r1, java.lang.Runnable r2) {
            r0 = this;
            r0.<init>()
            r0.f4576 = r1
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            r0.f4577 = r1
            r0.f4578 = r2
            return
    }

    /* JADX INFO: renamed from: α */
    public static void m2360(android.view.View r1, java.lang.Runnable r2) {
            if (r1 == 0) goto L12
            h51 r0 = new h51
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
            android.view.ViewTreeObserver r0 = r2.f4577
            boolean r0 = r0.isAlive()
            android.view.View r1 = r2.f4576
            if (r0 == 0) goto L10
            android.view.ViewTreeObserver r0 = r2.f4577
            r0.removeOnPreDrawListener(r2)
            goto L17
        L10:
            android.view.ViewTreeObserver r0 = r1.getViewTreeObserver()
            r0.removeOnPreDrawListener(r2)
        L17:
            r1.removeOnAttachStateChangeListener(r2)
            java.lang.Runnable r2 = r2.f4578
            r2.run()
            r2 = 1
            return r2
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View r1) {
            r0 = this;
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            r0.f4577 = r1
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View r2) {
            r1 = this;
            android.view.ViewTreeObserver r2 = r1.f4577
            boolean r2 = r2.isAlive()
            android.view.View r0 = r1.f4576
            if (r2 == 0) goto L10
            android.view.ViewTreeObserver r2 = r1.f4577
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
