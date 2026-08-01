package androidx.appcompat.widget;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ViewStubCompat extends android.view.View {

    /* JADX INFO: renamed from: ε */
    public int f779;

    /* JADX INFO: renamed from: ζ */
    public int f780;

    /* JADX INFO: renamed from: η */
    public java.lang.ref.WeakReference f781;

    /* JADX INFO: renamed from: θ */
    public android.view.LayoutInflater f782;

    public ViewStubCompat(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public ViewStubCompat(android.content.Context r3, android.util.AttributeSet r4, int r5) {
            r2 = this;
            r2.<init>(r3, r4, r5)
            r0 = 0
            r2.f779 = r0
            int[] r1 = p000.kk1.f5966
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r1, r5, r0)
            r4 = 2
            r5 = -1
            int r4 = r3.getResourceId(r4, r5)
            r2.f780 = r4
            r4 = 1
            int r1 = r3.getResourceId(r4, r0)
            r2.f779 = r1
            int r5 = r3.getResourceId(r0, r5)
            r2.setId(r5)
            r3.recycle()
            r3 = 8
            r2.setVisibility(r3)
            r2.setWillNotDraw(r4)
            return
    }

    @Override // android.view.View
    public final void dispatchDraw(android.graphics.Canvas r1) {
            r0 = this;
            return
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas r1) {
            r0 = this;
            return
    }

    public int getInflatedId() {
            r0 = this;
            int r0 = r0.f780
            return r0
    }

    public android.view.LayoutInflater getLayoutInflater() {
            r0 = this;
            android.view.LayoutInflater r0 = r0.f782
            return r0
    }

    public int getLayoutResource() {
            r0 = this;
            int r0 = r0.f779
            return r0
    }

    @Override // android.view.View
    public final void onMeasure(int r1, int r2) {
            r0 = this;
            r1 = 0
            r0.setMeasuredDimension(r1, r1)
            return
    }

    public void setInflatedId(int r1) {
            r0 = this;
            r0.f780 = r1
            return
    }

    public void setLayoutInflater(android.view.LayoutInflater r1) {
            r0 = this;
            r0.f782 = r1
            return
    }

    public void setLayoutResource(int r1) {
            r0 = this;
            r0.f779 = r1
            return
    }

    public void setOnInflateListener(p000.aa2 r1) {
            r0 = this;
            return
    }

    @Override // android.view.View
    public void setVisibility(int r2) {
            r1 = this;
            java.lang.ref.WeakReference r0 = r1.f781
            if (r0 == 0) goto L16
            java.lang.Object r1 = r0.get()
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L10
            r1.setVisibility(r2)
            return
        L10:
            java.lang.String r1 = "setVisibility called on un-referenced view"
            p000.C1080.m7279(r1)
            return
        L16:
            super.setVisibility(r2)
            if (r2 == 0) goto L20
            r0 = 4
            if (r2 != r0) goto L1f
            goto L20
        L1f:
            return
        L20:
            r1.m316()
            return
    }

    /* JADX INFO: renamed from: α */
    public final android.view.View m316() {
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L4d
            int r1 = r4.f779
            if (r1 == 0) goto L46
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.LayoutInflater r1 = r4.f782
            if (r1 == 0) goto L13
            goto L1b
        L13:
            android.content.Context r1 = r4.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
        L1b:
            int r2 = r4.f779
            r3 = 0
            android.view.View r1 = r1.inflate(r2, r0, r3)
            int r2 = r4.f780
            r3 = -1
            if (r2 == r3) goto L2a
            r1.setId(r2)
        L2a:
            int r2 = r0.indexOfChild(r4)
            r0.removeViewInLayout(r4)
            android.view.ViewGroup$LayoutParams r3 = r4.getLayoutParams()
            if (r3 == 0) goto L3b
            r0.addView(r1, r2, r3)
            goto L3e
        L3b:
            r0.addView(r1, r2)
        L3e:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            r4.f781 = r0
            return r1
        L46:
            java.lang.String r4 = "ViewStub must have a valid layoutResource"
            p000.C1080.m7275(r4)
        L4b:
            r4 = 0
            return r4
        L4d:
            java.lang.String r4 = "ViewStub must have a non-null ViewGroup viewParent"
            p000.C1080.m7279(r4)
            goto L4b
    }
}
