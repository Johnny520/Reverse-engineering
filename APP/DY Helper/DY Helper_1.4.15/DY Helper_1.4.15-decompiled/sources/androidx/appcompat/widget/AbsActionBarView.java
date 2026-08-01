package androidx.appcompat.widget;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
abstract class AbsActionBarView extends android.view.ViewGroup {

    /* JADX INFO: renamed from: ε */
    public final androidx.appcompat.widget.C0028 f456;

    /* JADX INFO: renamed from: ζ */
    public final android.content.Context f457;

    /* JADX INFO: renamed from: η */
    public androidx.appcompat.widget.ActionMenuView f458;

    /* JADX INFO: renamed from: θ */
    public androidx.appcompat.widget.C0030 f459;

    /* JADX INFO: renamed from: ι */
    public int f460;

    /* JADX INFO: renamed from: κ */
    public p000.x92 f461;

    /* JADX INFO: renamed from: λ */
    public boolean f462;

    /* JADX INFO: renamed from: μ */
    public boolean f463;

    public AbsActionBarView(android.content.Context r3, android.util.AttributeSet r4, int r5) {
            r2 = this;
            r2.<init>(r3, r4, r5)
            androidx.appcompat.widget.α r4 = new androidx.appcompat.widget.α
            r4.<init>(r2)
            r2.f456 = r4
            android.util.TypedValue r4 = new android.util.TypedValue
            r4.<init>()
            android.content.res.Resources$Theme r5 = r3.getTheme()
            r0 = 2130968578(0x7f040002, float:1.7545814E38)
            r1 = 1
            boolean r5 = r5.resolveAttribute(r0, r4, r1)
            if (r5 == 0) goto L2b
            int r5 = r4.resourceId
            if (r5 == 0) goto L2b
            android.view.ContextThemeWrapper r5 = new android.view.ContextThemeWrapper
            int r4 = r4.resourceId
            r5.<init>(r3, r4)
            r2.f457 = r5
            return
        L2b:
            r2.f457 = r3
            return
    }

    /* JADX INFO: renamed from: α */
    public static /* synthetic */ void m239(androidx.appcompat.widget.AbsActionBarView r1) {
            r0 = 0
            super.setVisibility(r0)
            return
    }

    /* JADX INFO: renamed from: β */
    public static /* synthetic */ void m240(androidx.appcompat.widget.AbsActionBarView r0, int r1) {
            super.setVisibility(r1)
            return
    }

    /* JADX INFO: renamed from: γ */
    public static int m241(android.view.View r1, int r2, int r3) {
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r1.measure(r0, r3)
            int r1 = r1.getMeasuredWidth()
            int r2 = r2 - r1
            r1 = 0
            int r1 = java.lang.Math.max(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: δ */
    public static int m242(int r2, int r3, int r4, android.view.View r5, boolean r6) {
            int r0 = r5.getMeasuredWidth()
            int r1 = r5.getMeasuredHeight()
            int r4 = r4 - r1
            int r4 = r4 / 2
            int r4 = r4 + r3
            if (r6 == 0) goto L15
            int r3 = r2 - r0
            int r1 = r1 + r4
            r5.layout(r3, r4, r2, r1)
            goto L1b
        L15:
            int r3 = r2 + r0
            int r1 = r1 + r4
            r5.layout(r2, r4, r3, r1)
        L1b:
            if (r6 == 0) goto L1f
            int r2 = -r0
            return r2
        L1f:
            return r0
    }

    @Override // android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration r5) {
            r4 = this;
            super.onConfigurationChanged(r5)
            android.content.Context r5 = r4.getContext()
            r0 = 0
            int[] r1 = p000.kk1.f5967
            r2 = 2130968581(0x7f040005, float:1.754582E38)
            r3 = 0
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r0, r1, r2, r3)
            r0 = 13
            int r0 = r5.getLayoutDimension(r0, r3)
            r4.setContentHeight(r0)
            r5.recycle()
            androidx.appcompat.widget.γ r4 = r4.f459
            if (r4 == 0) goto L36
            android.content.Context r5 = r4.f791
            ｍ r5 = p000.C1143.m7359(r5)
            int r5 = r5.m7360()
            r4.f805 = r5
            iz0 r4 = r4.f792
            if (r4 == 0) goto L36
            r5 = 1
            r4.m2836(r5)
        L36:
            return
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent r6) {
            r5 = this;
            int r0 = r6.getActionMasked()
            r1 = 0
            r2 = 9
            if (r0 != r2) goto Lb
            r5.f463 = r1
        Lb:
            boolean r3 = r5.f463
            r4 = 1
            if (r3 != 0) goto L1a
            boolean r6 = super.onHoverEvent(r6)
            if (r0 != r2) goto L1a
            if (r6 != 0) goto L1a
            r5.f463 = r4
        L1a:
            r6 = 10
            if (r0 == r6) goto L23
            r6 = 3
            if (r0 != r6) goto L22
            goto L23
        L22:
            return r4
        L23:
            r5.f463 = r1
            return r4
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r5) {
            r4 = this;
            int r0 = r5.getActionMasked()
            r1 = 0
            if (r0 != 0) goto L9
            r4.f462 = r1
        L9:
            boolean r2 = r4.f462
            r3 = 1
            if (r2 != 0) goto L18
            boolean r5 = super.onTouchEvent(r5)
            if (r0 != 0) goto L18
            if (r5 != 0) goto L18
            r4.f462 = r3
        L18:
            if (r0 == r3) goto L1f
            r5 = 3
            if (r0 != r5) goto L1e
            goto L1f
        L1e:
            return r3
        L1f:
            r4.f462 = r1
            return r3
    }

    public void setContentHeight(int r1) {
            r0 = this;
            r0.f460 = r1
            r0.requestLayout()
            return
    }

    @Override // android.view.View
    public void setVisibility(int r2) {
            r1 = this;
            int r0 = r1.getVisibility()
            if (r2 == r0) goto L10
            x92 r0 = r1.f461
            if (r0 == 0) goto Ld
            r0.m6541()
        Ld:
            super.setVisibility(r2)
        L10:
            return
    }
}
