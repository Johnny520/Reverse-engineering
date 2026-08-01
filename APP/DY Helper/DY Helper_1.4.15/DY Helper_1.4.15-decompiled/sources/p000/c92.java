package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class c92 implements android.view.View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f2021;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ androidx.compose.p001ui.platform.AbstractComposeView f2022;

    public /* synthetic */ c92(androidx.compose.p001ui.platform.AbstractComposeView r1, int r2) {
            r0 = this;
            r0.f2021 = r2
            r0.f2022 = r1
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: α */
    private final void m1171(android.view.View r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: β */
    private final void m1172(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View r1) {
            r0 = this;
            int r0 = r0.f2021
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View r4) {
            r3 = this;
            int r4 = r3.f2021
            androidx.compose.ui.platform.AbstractComposeView r3 = r3.f2022
            switch(r4) {
                case 0: goto L49;
                default: goto L7;
            }
        L7:
            android.view.ViewParent r4 = r3.getParent()
            k92 r0 = p000.k92.f5821
            ss1 r4 = p000.us1.m5954(r4, r0)
            java.util.Iterator r4 = r4.iterator()
        L15:
            boolean r0 = r4.hasNext()
            r1 = 0
            if (r0 == 0) goto L43
            java.lang.Object r0 = r4.next()
            android.view.ViewParent r0 = (android.view.ViewParent) r0
            boolean r2 = r0 instanceof android.view.View
            if (r2 == 0) goto L15
            android.view.View r0 = (android.view.View) r0
            r0.getClass()
            r2 = 2131296764(0x7f0901fc, float:1.8211454E38)
            java.lang.Object r0 = r0.getTag(r2)
            boolean r2 = r0 instanceof java.lang.Boolean
            if (r2 == 0) goto L39
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            goto L3a
        L39:
            r0 = 0
        L3a:
            if (r0 == 0) goto L40
            boolean r1 = r0.booleanValue()
        L40:
            if (r1 == 0) goto L15
            r1 = 1
        L43:
            if (r1 != 0) goto L48
            r3.m358()
        L48:
            return
        L49:
            r3.m358()
            return
    }
}
