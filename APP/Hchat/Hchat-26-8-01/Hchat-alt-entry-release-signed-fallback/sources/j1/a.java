package j1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends android.view.ViewGroup {
    public final void a(f1.u r1, android.view.View r2, long r3) {
            r0 = this;
            android.graphics.Canvas r1 = f1.c.a(r1)
            super.drawChild(r1, r2, r3)
            return
    }

    @Override // android.view.View
    public final void forceLayout() {
            r0 = this;
            return
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final android.view.ViewParent invalidateChildInParent(int[] r1, android.graphics.Rect r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            return
    }

    @Override // android.view.View
    public final void onMeasure(int r1, int r2) {
            r0 = this;
            r1 = 0
            r0.setMeasuredDimension(r1, r1)
            return
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
            r0 = this;
            return
    }
}
