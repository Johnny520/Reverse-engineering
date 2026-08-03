package y1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends android.view.ViewGroup {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f22058g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f22059h;

    public r0(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.setClipChildren(r1)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.f22058g = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.f22059h = r1
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
            r1 = 1
            return r1
    }

    public final java.util.HashMap<x2.h, x1.f0> getHolderToLayoutNode() {
            r1 = this;
            java.util.HashMap r0 = r1.f22058g
            return r0
    }

    public final java.util.HashMap<x1.f0, x2.h> getLayoutNodeToHolder() {
            r1 = this;
            java.util.HashMap r0 = r1.f22059h
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ android.view.ViewParent invalidateChildInParent(int[] r1, android.graphics.Rect r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(android.view.View r1, android.view.View r2) {
            r0 = this;
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            java.util.HashMap r2 = r1.f22058g
            java.util.Set r2 = r2.keySet()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        Lc:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2c
            java.lang.Object r3 = r2.next()
            x2.h r3 = (x2.h) r3
            int r4 = r3.getLeft()
            int r5 = r3.getTop()
            int r6 = r3.getRight()
            int r0 = r3.getBottom()
            r3.layout(r4, r5, r6, r0)
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
            u1.a.a(r0)
        L14:
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            if (r0 != r3) goto L1b
            r1 = r2
        L1b:
            if (r1 != 0) goto L22
            java.lang.String r0 = "heightMeasureSpec should be EXACTLY"
            u1.a.a(r0)
        L22:
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            r4.setMeasuredDimension(r5, r6)
            java.util.HashMap r5 = r4.f22058g
            java.util.Set r5 = r5.keySet()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L39:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L54
            java.lang.Object r6 = r5.next()
            x2.h r6 = (x2.h) r6
            int r0 = r6.B
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L39
            int r2 = r6.C
            if (r2 != r1) goto L50
            goto L39
        L50:
            r6.measure(r0, r2)
            goto L39
        L54:
            return
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
            java.util.HashMap r4 = r5.f22058g
            java.lang.Object r4 = r4.get(r3)
            x1.f0 r4 = (x1.f0) r4
            boolean r3 = r3.isLayoutRequested()
            if (r3 == 0) goto L23
            if (r4 == 0) goto L23
            r3 = 7
            x1.f0.V(r4, r1, r3)
        L23:
            int r2 = r2 + 1
            goto L9
        L26:
            return
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
            r1 = this;
            r0 = 0
            return r0
    }
}
