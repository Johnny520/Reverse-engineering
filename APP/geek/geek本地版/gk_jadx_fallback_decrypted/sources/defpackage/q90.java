package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q90 implements android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.View.OnAttachStateChangeListener {
    public final java.util.WeakHashMap a;

    public q90() {
            r1 = this;
            r1.<init>()
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r1.a = r0
            return
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
            r5 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L4f
            java.util.WeakHashMap r0 = r5.a
            java.util.Set r1 = r0.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L10:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4f
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            android.view.View r3 = (android.view.View) r3
            java.lang.Object r2 = r2.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            boolean r4 = r3.isShown()
            if (r4 == 0) goto L3a
            int r4 = r3.getWindowVisibility()
            if (r4 != 0) goto L3a
            r4 = 1
            goto L3b
        L3a:
            r4 = 0
        L3b:
            if (r2 == r4) goto L10
            if (r4 == 0) goto L42
            r2 = 16
            goto L44
        L42:
            r2 = 32
        L44:
            defpackage.ja0.g(r3, r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            r0.put(r3, r2)
            goto L10
        L4f:
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View r1) {
            r0 = this;
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            r1.addOnGlobalLayoutListener(r0)
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View r1) {
            r0 = this;
            return
    }
}
