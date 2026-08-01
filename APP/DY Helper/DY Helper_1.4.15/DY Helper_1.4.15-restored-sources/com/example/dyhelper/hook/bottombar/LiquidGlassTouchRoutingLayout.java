package com.example.dyhelper.hook.bottombar;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class LiquidGlassTouchRoutingLayout extends android.widget.FrameLayout {

    /* JADX INFO: renamed from: ε */
    public final androidx.compose.p001ui.platform.ComposeView f2260;

    /* JADX INFO: renamed from: ζ */
    public boolean f2261;

    /* JADX INFO: renamed from: η */
    public float f2262;

    public LiquidGlassTouchRoutingLayout(android.content.Context r5) {
            r4 = this;
            r5.getClass()
            r4.<init>(r5)
            androidx.compose.ui.platform.ComposeView r0 = new androidx.compose.ui.platform.ComposeView
            r1 = 0
            r2 = 6
            r3 = 0
            r0.<init>(r5, r1, r2, r3)
            r4.f2260 = r0
            r5 = 1065353216(0x3f800000, float:1.0)
            r4.f2262 = r5
            r4.setClipChildren(r3)
            r4.setClipToPadding(r3)
            r4.setClickable(r3)
            r4.setFocusable(r3)
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r1 = -1
            r5.<init>(r1, r1)
            r4.addView(r0, r5)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(android.view.MotionEvent r13) {
            r12 = this;
            r13.getClass()
            int r0 = r13.getActionMasked()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L8f
            float r0 = r13.getX()
            float r3 = r13.getY()
            int r4 = r12.getWidth()
            int r5 = r12.getHeight()
            android.content.res.Resources r6 = r12.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r7 = r12.f2262
            tt0 r4 = p000.AbstractC0978xb.m6574(r6, r7, r4, r5)
            if (r4 != 0) goto L2e
            goto L88
        L2e:
            int r5 = r4.f10447
            float r5 = (float) r5
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 < 0) goto L88
            int r5 = r4.f10449
            float r5 = (float) r5
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L88
            int r0 = r4.f10448
            float r0 = (float) r0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L88
            int r0 = r4.f10450
            float r0 = (float) r0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L88
            float r0 = r13.getRawX()
            float r3 = r13.getRawY()
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>()
            android.content.res.Resources r4 = r12.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            r5 = 1092616192(0x41200000, float:10.0)
            float r4 = r4 * r5
            int r4 = p000.jx0.m3061(r4)
            if (r4 >= 0) goto L6c
            r8 = r2
            goto L6d
        L6c:
            r8 = r4
        L6d:
            android.view.View r5 = r12.getRootView()
            r5.getClass()
            int r6 = p000.jx0.m3061(r0)
            int r7 = p000.jx0.m3061(r3)
            r10 = 1065353216(0x3f800000, float:1.0)
            r11 = 0
            r4 = r12
            boolean r12 = r4.m1353(r5, r6, r7, r8, r9, r10, r11)
            if (r12 != 0) goto L89
            r12 = r1
            goto L8a
        L88:
            r4 = r12
        L89:
            r12 = r2
        L8a:
            r4.f2261 = r12
            if (r12 != 0) goto L95
            return r2
        L8f:
            r4 = r12
            boolean r12 = r4.f2261
            if (r12 != 0) goto L95
            return r2
        L95:
            boolean r12 = super.dispatchTouchEvent(r13)
            int r0 = r13.getActionMasked()
            if (r0 == r1) goto Lb2
            int r0 = r13.getActionMasked()
            r1 = 3
            if (r0 != r1) goto La7
            goto Lb2
        La7:
            int r13 = r13.getActionMasked()
            if (r13 != 0) goto Lb1
            if (r12 != 0) goto Lb1
            r4.f2261 = r2
        Lb1:
            return r12
        Lb2:
            r4.f2261 = r2
            return r12
    }

    public final androidx.compose.p001ui.platform.ComposeView getComposeView() {
            r0 = this;
            androidx.compose.ui.platform.ComposeView r0 = r0.f2260
            return r0
    }

    /* JADX INFO: renamed from: α */
    public final boolean m1353(android.view.View r13, int r14, int r15, int r16, android.graphics.Rect r17, float r18, int r19) {
            r12 = this;
            r5 = r17
            r8 = r19
            r9 = 0
            if (r13 == r12) goto Lb2
            r0 = 24
            if (r8 > r0) goto Lb2
            int r0 = r13.getVisibility()
            if (r0 != 0) goto Lb2
            boolean r0 = r13.isShown()
            if (r0 != 0) goto L19
            goto Lb2
        L19:
            float r0 = r13.getAlpha()
            float r6 = r0 * r18
            r0 = 1017370378(0x3ca3d70a, float:0.02)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 > 0) goto L28
            goto Lb2
        L28:
            boolean r0 = r13.isEnabled()
            r10 = 1
            if (r0 == 0) goto L82
            java.lang.Class r0 = r13.getClass()
            java.lang.String r0 = r0.getName()
            boolean r1 = r13 instanceof android.widget.SeekBar
            int r2 = r13.getWidth()
            int r3 = r13.getHeight()
            if (r2 <= 0) goto L82
            if (r3 >= 0) goto L46
            goto L82
        L46:
            int r3 = java.lang.Math.max(r3, r10)
            int r3 = r3 * 3
            if (r2 < r3) goto L82
            if (r1 == 0) goto L51
            goto L6f
        L51:
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = p000.AbstractC0602nx.m4134(r1, r0, r1)
            java.lang.String r1 = "seekbar"
            boolean r1 = p000.q02.m4654(r0, r1, r9)
            if (r1 != 0) goto L6f
            java.lang.String r1 = "lineprogressbar"
            boolean r1 = p000.x02.m6479(r0, r1, r9)
            if (r1 != 0) goto L6f
            java.lang.String r1 = "progressbar"
            boolean r0 = p000.q02.m4654(r0, r1, r9)
            if (r0 == 0) goto L82
        L6f:
            boolean r0 = r13.getGlobalVisibleRect(r5)
            if (r0 == 0) goto L82
            r4 = r16
            int r0 = -r4
            r5.inset(r0, r0)
            boolean r0 = r5.contains(r14, r15)
            if (r0 == 0) goto L84
            goto Laa
        L82:
            r4 = r16
        L84:
            boolean r0 = r13 instanceof android.view.ViewGroup
            if (r0 == 0) goto L8b
            android.view.ViewGroup r13 = (android.view.ViewGroup) r13
            goto L8c
        L8b:
            r13 = 0
        L8c:
            if (r13 != 0) goto L8f
            goto Lb2
        L8f:
            int r0 = r13.getChildCount()
            int r0 = r0 - r10
            r11 = r0
        L95:
            r0 = -1
            if (r0 >= r11) goto Lb2
            android.view.View r1 = r13.getChildAt(r11)
            r1.getClass()
            int r7 = r8 + 1
            r0 = r12
            r2 = r14
            r3 = r15
            boolean r1 = r0.m1353(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto Lab
        Laa:
            return r10
        Lab:
            int r11 = r11 + (-1)
            r4 = r16
            r5 = r17
            goto L95
        Lb2:
            return r9
    }
}
