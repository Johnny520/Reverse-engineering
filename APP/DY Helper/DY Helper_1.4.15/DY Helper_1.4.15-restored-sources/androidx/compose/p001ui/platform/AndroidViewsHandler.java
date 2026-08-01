package androidx.compose.p001ui.platform;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidViewsHandler extends android.view.ViewGroup {

    /* JADX INFO: renamed from: ε */
    public final java.util.HashMap f960;

    /* JADX INFO: renamed from: ζ */
    public final java.util.HashMap f961;

    public AndroidViewsHandler(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.setClipChildren(r1)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.f960 = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.f961 = r1
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(android.graphics.Canvas r1) {
            r0 = this;
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(android.view.MotionEvent r1) {
            r0 = this;
            r0 = 1
            return r0
    }

    public final java.util.HashMap<androidx.compose.p001ui.viewinterop.AndroidViewHolder, p000.yp0> getHolderToLayoutNode() {
            r0 = this;
            java.util.HashMap r0 = r0.f960
            return r0
    }

    public final java.util.HashMap<p000.yp0, androidx.compose.p001ui.viewinterop.AndroidViewHolder> getLayoutNodeToHolder() {
            r0 = this;
            java.util.HashMap r0 = r0.f961
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ android.view.ViewParent invalidateChildInParent(int[] r1, android.graphics.Rect r2) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(android.view.View r1, android.view.View r2) {
            r0 = this;
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            java.util.HashMap r0 = r0.f960
            java.util.Set r0 = r0.keySet()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r0.next()
            androidx.compose.ui.viewinterop.AndroidViewHolder r1 = (androidx.compose.p001ui.viewinterop.AndroidViewHolder) r1
            int r2 = r1.getLeft()
            int r3 = r1.getTop()
            int r4 = r1.getRight()
            int r5 = r1.getBottom()
            r1.layout(r2, r3, r4, r5)
            goto Lc
        L2c:
            return
    }

    @Override // android.view.View
    public final void onMeasure(int r5, int r6) {
            r4 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            r1 = 0
            r2 = 1
            r3 = 1073741824(0x40000000, float:2.0)
            if (r0 != r3) goto Lc
            r0 = r2
            goto Ld
        Lc:
            r0 = r1
        Ld:
            if (r0 != 0) goto L14
            java.lang.String r0 = "widthMeasureSpec should be EXACTLY"
            p000.am0.m177(r0)
        L14:
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            if (r0 != r3) goto L1b
            r1 = r2
        L1b:
            if (r1 != 0) goto L22
            java.lang.String r0 = "heightMeasureSpec should be EXACTLY"
            p000.am0.m177(r0)
        L22:
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            r4.setMeasuredDimension(r5, r6)
            java.util.HashMap r4 = r4.f960
            java.util.Set r4 = r4.keySet()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
            boolean r5 = r4.hasNext()
            if (r5 != 0) goto L40
            return
        L40:
            java.lang.Object r4 = r4.next()
            androidx.compose.ui.viewinterop.AndroidViewHolder r4 = (androidx.compose.p001ui.viewinterop.AndroidViewHolder) r4
            r4 = 0
            throw r4
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
            r5 = this;
            r5.cleanupLayoutState(r5)
            int r0 = r5.getChildCount()
            r1 = 0
            r2 = r1
        L9:
            if (r2 >= r0) goto L26
            android.view.View r3 = r5.getChildAt(r2)
            java.util.HashMap r4 = r5.f960
            java.lang.Object r4 = r4.get(r3)
            yp0 r4 = (p000.yp0) r4
            boolean r3 = r3.isLayoutRequested()
            if (r3 == 0) goto L23
            if (r4 == 0) goto L23
            r3 = 7
            p000.yp0.m6968(r4, r1, r3)
        L23:
            int r2 = r2 + 1
            goto L9
        L26:
            return
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
            r0 = this;
            r0 = 0
            return r0
    }
}
