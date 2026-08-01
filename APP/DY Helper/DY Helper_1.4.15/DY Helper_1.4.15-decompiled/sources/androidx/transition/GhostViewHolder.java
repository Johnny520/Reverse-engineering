package androidx.transition;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
final class GhostViewHolder extends android.widget.FrameLayout {
    @Override // android.view.ViewGroup
    public final void onViewAdded(android.view.View r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(android.view.View r3) {
            r2 = this;
            super.onViewRemoved(r3)
            int r0 = r2.getChildCount()
            r1 = 1
            if (r0 != r1) goto L11
            r0 = 0
            android.view.View r0 = r2.getChildAt(r0)
            if (r0 == r3) goto L18
        L11:
            int r2 = r2.getChildCount()
            if (r2 == 0) goto L18
            return
        L18:
            r2 = 0
            throw r2
    }
}
