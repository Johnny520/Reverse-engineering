package g3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements android.view.ViewTreeObserver.OnPreDrawListener, android.view.View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final android.view.View f4196g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public android.view.ViewTreeObserver f4197h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final g3.v f4198i;

    public f(android.view.View r1, g3.v r2) {
            r0 = this;
            r0.<init>()
            r0.f4196g = r1
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            r0.f4197h = r1
            r0.f4198i = r2
            return
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
            r2 = this;
            android.view.ViewTreeObserver r0 = r2.f4197h
            boolean r0 = r0.isAlive()
            android.view.View r1 = r2.f4196g
            if (r0 == 0) goto L10
            android.view.ViewTreeObserver r0 = r2.f4197h
            r0.removeOnPreDrawListener(r2)
            goto L17
        L10:
            android.view.ViewTreeObserver r0 = r1.getViewTreeObserver()
            r0.removeOnPreDrawListener(r2)
        L17:
            r1.removeOnAttachStateChangeListener(r2)
            g3.v r0 = r2.f4198i
            r0.run()
            r0 = 1
            return r0
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View r1) {
            r0 = this;
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            r0.f4197h = r1
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View r2) {
            r1 = this;
            android.view.ViewTreeObserver r2 = r1.f4197h
            boolean r2 = r2.isAlive()
            android.view.View r0 = r1.f4196g
            if (r2 == 0) goto L10
            android.view.ViewTreeObserver r2 = r1.f4197h
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
