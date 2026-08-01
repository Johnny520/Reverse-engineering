package androidx.compose.p001ui.graphics.layer;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ViewLayer extends android.view.View {

    /* JADX INFO: renamed from: η */
    public static final /* synthetic */ int f858 = 0;

    /* JADX INFO: renamed from: ε */
    public boolean f859;

    /* JADX INFO: renamed from: ζ */
    public boolean f860;

    static {
            l92 r0 = new l92
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // android.view.View
    public final void dispatchDraw(android.graphics.Canvas r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // android.view.View
    public final void forceLayout() {
            r0 = this;
            return
    }

    public final boolean getCanUseCompositingLayer$ui_graphics() {
            r0 = this;
            boolean r0 = r0.f860
            return r0
    }

    public final p000.C0319ge getCanvasHolder() {
            r0 = this;
            r0 = 0
            return r0
    }

    public final android.view.View getOwnerView() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
            r0 = this;
            boolean r0 = r0.f860
            return r0
    }

    @Override // android.view.View
    public final void invalidate() {
            r1 = this;
            boolean r0 = r1.f859
            if (r0 != 0) goto La
            r0 = 1
            r1.f859 = r0
            super.invalidate()
        La:
            return
    }

    @Override // android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            return
    }

    public final void setCanUseCompositingLayer$ui_graphics(boolean r2) {
            r1 = this;
            boolean r0 = r1.f860
            if (r0 == r2) goto L9
            r1.f860 = r2
            r1.invalidate()
        L9:
            return
    }

    public final void setInvalidated(boolean r1) {
            r0 = this;
            r0.f859 = r1
            return
    }
}
