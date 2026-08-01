package p000;

/* JADX INFO: renamed from: k2 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0454k2 implements android.view.View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f5711;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f5712;

    public /* synthetic */ ViewOnAttachStateChangeListenerC0454k2(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f5711 = r1
            r0.f5712 = r2
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: α */
    private final void m3123(android.view.View r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: β */
    private final void m3124(android.view.View r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: γ */
    private final void m3125(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View r2) {
            r1 = this;
            int r0 = r1.f5711
            java.lang.Object r1 = r1.f5712
            switch(r0) {
                case 0: goto L28;
                case 1: goto L27;
                case 2: goto L1d;
                case 3: goto L8;
                case 4: goto L7;
                default: goto L7;
            }
        L7:
            return
        L8:
            r2.getClass()
            gt0 r1 = (p000.gt0) r1
            w0 r2 = r1.f4450
            java.lang.Object r2 = r2.invoke()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r1.m2323(r2)
            return
        L1d:
            r2.getClass()
            com.example.dyhelper.hook.γ r0 = com.example.dyhelper.hook.C0157.f2411
            k20 r1 = (p000.k20) r1
            com.example.dyhelper.hook.C0157.m1518(r2, r1)
        L27:
            return
        L28:
            l2 r1 = (p000.C0497l2) r1
            android.content.Context r2 = r2.getContext()
            boolean r0 = r1.f6389
            if (r0 != 0) goto L3e
            android.content.Context r2 = r2.getApplicationContext()
            j2 r0 = r1.f6390
            r2.registerComponentCallbacks(r0)
            r2 = 1
            r1.f6389 = r2
        L3e:
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View r3) {
            r2 = this;
            int r0 = r2.f5711
            switch(r0) {
                case 0: goto L5f;
                case 1: goto L40;
                case 2: goto L3c;
                case 3: goto L30;
                case 4: goto L11;
                default: goto L5;
            }
        L5:
            r3.removeOnAttachStateChangeListener(r2)
            java.lang.Object r2 = r2.f5712
            xz1 r2 = (p000.xz1) r2
            r3 = 0
            r2.mo2180(r3)
            return
        L11:
            java.lang.Object r0 = r2.f5712
            yz1 r0 = (p000.yz1) r0
            android.view.ViewTreeObserver r1 = r0.f12906
            if (r1 == 0) goto L2c
            boolean r1 = r1.isAlive()
            if (r1 != 0) goto L25
            android.view.ViewTreeObserver r1 = r3.getViewTreeObserver()
            r0.f12906 = r1
        L25:
            android.view.ViewTreeObserver r1 = r0.f12906
            d r0 = r0.f12900
            r1.removeGlobalOnLayoutListener(r0)
        L2c:
            r3.removeOnAttachStateChangeListener(r2)
            return
        L30:
            r3.getClass()
            java.lang.Object r2 = r2.f5712
            gt0 r2 = (p000.gt0) r2
            r3 = 0
            r2.m2323(r3)
            return
        L3c:
            r3.getClass()
            return
        L40:
            java.lang.Object r0 = r2.f5712
            ie r0 = (p000.ViewOnKeyListenerC0393ie) r0
            android.view.ViewTreeObserver r1 = r0.f5038
            if (r1 == 0) goto L5b
            boolean r1 = r1.isAlive()
            if (r1 != 0) goto L54
            android.view.ViewTreeObserver r1 = r3.getViewTreeObserver()
            r0.f5038 = r1
        L54:
            android.view.ViewTreeObserver r1 = r0.f5038
            d r0 = r0.f5048
            r1.removeGlobalOnLayoutListener(r0)
        L5b:
            r3.removeOnAttachStateChangeListener(r2)
            return
        L5f:
            java.lang.Object r2 = r2.f5712
            l2 r2 = (p000.C0497l2) r2
            android.content.Context r3 = r3.getContext()
            boolean r0 = r2.f6389
            if (r0 == 0) goto L77
            android.content.Context r3 = r3.getApplicationContext()
            j2 r0 = r2.f6390
            r3.unregisterComponentCallbacks(r0)
            r3 = 0
            r2.f6389 = r3
        L77:
            return
    }
}
