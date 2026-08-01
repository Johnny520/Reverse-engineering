package androidx.compose.p001ui.window;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class PopupLayout extends androidx.compose.p001ui.platform.AbstractComposeView {

    /* JADX INFO: renamed from: ο */
    public java.lang.String f985;

    /* JADX INFO: renamed from: π */
    public p000.np0 f986;

    private final p000.e80 getContent() {
            r0 = this;
            r0 = 0
            throw r0
    }

    private final p000.ym0 getDisplayBounds() {
            r0 = this;
            r0 = 0
            throw r0
    }

    public static /* synthetic */ void getParams$ui$annotations() {
            return
    }

    private final p000.mp0 getParentLayoutCoordinates() {
            r0 = this;
            r0 = 0
            throw r0
    }

    private final void setContent(p000.e80 r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    private final void setParentLayoutCoordinates(p000.mp0 r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(android.view.KeyEvent r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    public final boolean getCanCalculatePosition() {
            r0 = this;
            r0 = 0
            throw r0
    }

    public final android.view.WindowManager.LayoutParams getParams$ui() {
            r0 = this;
            r0 = 0
            return r0
    }

    public final p000.np0 getParentLayoutDirection() {
            r0 = this;
            np0 r0 = r0.f986
            return r0
    }

    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final p000.bn0 m7376getPopupContentSizebOM6tXw() {
            r0 = this;
            r0 = 0
            throw r0
    }

    public final p000.ii1 getPositionProvider() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.compose.p001ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
            r0 = this;
            r0 = 0
            return r0
    }

    public androidx.compose.p001ui.platform.AbstractComposeView getSubCompositionView() {
            r0 = this;
            return r0
    }

    public final java.lang.String getTestTag() {
            r0 = this;
            java.lang.String r0 = r0.f985
            return r0
    }

    public /* bridge */ /* synthetic */ android.view.View getViewRoot() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.compose.p001ui.platform.AbstractComposeView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r0 = this;
            super.onAttachedToWindow()
            r0 = 0
            throw r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r0 = this;
            super.onDetachedFromWindow()
            r0 = 0
            throw r0
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // android.view.View
    public void setLayoutDirection(int r1) {
            r0 = this;
            return
    }

    public final void setParentLayoutDirection(p000.np0 r1) {
            r0 = this;
            r0.f986 = r1
            return
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m7377setPopupContentSizefhxjrPA(p000.bn0 r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    public final void setPositionProvider(p000.ii1 r1) {
            r0 = this;
            return
    }

    public final void setTestTag(java.lang.String r1) {
            r0 = this;
            r0.f985 = r1
            return
    }

    @Override // androidx.compose.p001ui.platform.AbstractComposeView
    /* JADX INFO: renamed from: α */
    public final void mo355(p000.v80 r6, int r7) {
            r5 = this;
            r0 = -857613600(0xffffffffcce1dae0, float:-1.1841306E8)
            r6.m6083(r0)
            boolean r0 = r6.m6092(r5)
            r1 = 2
            if (r0 == 0) goto Lf
            r0 = 4
            goto L10
        Lf:
            r0 = r1
        L10:
            r0 = r0 | r7
            r2 = r0 & 3
            r3 = 0
            r4 = 1
            if (r2 == r1) goto L19
            r1 = r4
            goto L1a
        L19:
            r1 = r3
        L1a:
            r0 = r0 & r4
            boolean r0 = r6.m6075(r0, r1)
            if (r0 == 0) goto L2d
            e80 r0 = r5.getContent()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0.invoke(r6, r1)
            goto L30
        L2d:
            r6.m6078()
        L30:
            bl1 r6 = r6.m6101()
            if (r6 == 0) goto L3e
            ξ r0 = new ξ
            r1 = 3
            r0.<init>(r5, r7, r1)
            r6.f1780 = r0
        L3e:
            return
    }

    @Override // androidx.compose.p001ui.platform.AbstractComposeView
    /* JADX INFO: renamed from: ζ */
    public final void mo360(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.mo360(r1, r2, r3, r4, r5)
            r0 = 0
            throw r0
    }

    @Override // androidx.compose.p001ui.platform.AbstractComposeView
    /* JADX INFO: renamed from: θ */
    public final void mo361(int r1, int r2) {
            r0 = this;
            r0 = 0
            throw r0
    }
}
