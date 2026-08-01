package androidx.transition;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
final class GhostViewPort extends android.view.ViewGroup {
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r0 = this;
            super.onAttachedToWindow()
            r0 = 0
            throw r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r1) {
            r0 = this;
            r1.enableZ()
            r0 = 0
            r1.setMatrix(r0)
            int r1 = p000.da2.f3018
            throw r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            return
    }

    @Override // android.view.View
    public final void setVisibility(int r1) {
            r0 = this;
            super.setVisibility(r1)
            r0 = 0
            throw r0
    }
}
