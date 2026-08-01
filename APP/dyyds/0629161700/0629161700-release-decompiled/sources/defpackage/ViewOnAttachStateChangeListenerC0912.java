package defpackage;

/* JADX INFO: renamed from: ᛵᛶᛵᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0912 implements android.view.View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f4148;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f4149;

    public /* synthetic */ ViewOnAttachStateChangeListenerC0912(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f4149 = r1
            r0.f4148 = r2
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    private final void m1881(android.view.View r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    private final void m1882(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View r1) {
            r0 = this;
            int r0 = r0.f4149
            switch(r0) {
                case 0: goto Ld;
                case 1: goto Ld;
                default: goto L5;
            }
        L5:
            r0 = -393775771196974(0xfffe99dcef0961d2, double:NaN)
        Ld:
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View r5) {
            r4 = this;
            int r0 = r4.f4149
            java.lang.Object r1 = r4.f4148
            switch(r0) {
                case 0: goto L35;
                case 1: goto L18;
                default: goto L7;
            }
        L7:
            r2 = -393784361131566(0xfffe99daef0961d2, double:NaN)
            android.animation.ValueAnimator r1 = (android.animation.ValueAnimator) r1
            r1.cancel()
            r5.removeOnAttachStateChangeListener(r4)
            return
        L18:
            ᲇᲇᲇᲇ r1 = (defpackage.ViewOnKeyListenerC2155) r1
            android.view.ViewTreeObserver r0 = r1.f9169
            if (r0 == 0) goto L31
            boolean r0 = r0.isAlive()
            if (r0 != 0) goto L2a
            android.view.ViewTreeObserver r0 = r5.getViewTreeObserver()
            r1.f9169 = r0
        L2a:
            android.view.ViewTreeObserver r0 = r1.f9169
            ᛴᲈᛶᛳ r1 = r1.f9156
            r0.removeGlobalOnLayoutListener(r1)
        L31:
            r5.removeOnAttachStateChangeListener(r4)
            return
        L35:
            ᛸᛱᛷᛸ r1 = (defpackage.ViewOnKeyListenerC1423) r1
            android.view.ViewTreeObserver r0 = r1.f6245
            if (r0 == 0) goto L4e
            boolean r0 = r0.isAlive()
            if (r0 != 0) goto L47
            android.view.ViewTreeObserver r0 = r5.getViewTreeObserver()
            r1.f6245 = r0
        L47:
            android.view.ViewTreeObserver r0 = r1.f6245
            ᛴᲈᛶᛳ r1 = r1.f6226
            r0.removeGlobalOnLayoutListener(r1)
        L4e:
            r5.removeOnAttachStateChangeListener(r4)
            return
    }
}
