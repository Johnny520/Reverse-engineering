package androidx.compose.p001ui.platform;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class DrawChildContainer extends android.view.ViewGroup {

    /* JADX INFO: renamed from: ε */
    public boolean f964;

    public DrawChildContainer(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r2 = 0
            r1.setClipChildren(r2)
            r2 = 2131296642(0x7f090182, float:1.8211206E38)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.setTag(r2, r0)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas r5) {
            r4 = this;
            int r0 = super.getChildCount()
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r0) goto L25
            android.view.View r3 = r4.getChildAt(r2)
            r3.getClass()
            androidx.compose.ui.platform.ViewLayer r3 = (androidx.compose.p001ui.platform.ViewLayer) r3
            boolean r3 = r3.f969
            if (r3 == 0) goto L22
            r0 = 1
            r4.f964 = r0
            super.dispatchDraw(r5)     // Catch: java.lang.Throwable -> L1e
            r4.f964 = r1
            return
        L1e:
            r5 = move-exception
            r4.f964 = r1
            throw r5
        L22:
            int r2 = r2 + 1
            goto L6
        L25:
            return
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
            r1 = this;
            boolean r0 = r1.f964
            if (r0 == 0) goto L9
            int r1 = super.getChildCount()
            return r1
        L9:
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
