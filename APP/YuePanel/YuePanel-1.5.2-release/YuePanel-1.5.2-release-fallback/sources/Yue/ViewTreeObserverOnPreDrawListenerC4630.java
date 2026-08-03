package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۣۡ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC4630 implements android.view.ViewTreeObserver.OnPreDrawListener, android.view.View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final android.view.View f14772;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public android.view.ViewTreeObserver f14773;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final java.lang.Runnable f14774;

    public ViewTreeObserverOnPreDrawListenerC4630(android.view.View r1, java.lang.Runnable r2) {
            r0 = this;
            r0.<init>()
            r0.f14772 = r1
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            r0.f14773 = r1
            r0.f14774 = r2
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static Yue.ViewTreeObserverOnPreDrawListenerC4630 m18451(@Yue.InterfaceC4410 android.view.View r1, @Yue.InterfaceC4410 java.lang.Runnable r2) {
            if (r1 == 0) goto L1c
            if (r2 == 0) goto L14
            Yue.ۥۣۣۡ۟ r0 = new Yue.ۥۣۣۡ۟
            r0.<init>(r1, r2)
            android.view.ViewTreeObserver r2 = r1.getViewTreeObserver()
            r2.addOnPreDrawListener(r0)
            r1.addOnAttachStateChangeListener(r0)
            return r0
        L14:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "runnable == null"
            r1.<init>(r2)
            throw r1
        L1c:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "view == null"
            r1.<init>(r2)
            throw r1
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
            r1 = this;
            r1.m18452()
            java.lang.Runnable r0 = r1.f14774
            r0.run()
            r0 = 1
            return r0
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@Yue.InterfaceC4410 android.view.View r1) {
            r0 = this;
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            r0.f14773 = r1
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@Yue.InterfaceC4410 android.view.View r1) {
            r0 = this;
            r0.m18452()
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void m18452() {
            r1 = this;
            android.view.ViewTreeObserver r0 = r1.f14773
            boolean r0 = r0.isAlive()
            if (r0 == 0) goto Le
            android.view.ViewTreeObserver r0 = r1.f14773
            r0.removeOnPreDrawListener(r1)
            goto L17
        Le:
            android.view.View r0 = r1.f14772
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r0.removeOnPreDrawListener(r1)
        L17:
            android.view.View r0 = r1.f14772
            r0.removeOnAttachStateChangeListener(r1)
            return
    }
}
