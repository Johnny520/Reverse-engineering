package androidx.appcompat.widget;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewStubCompat extends android.view.View {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public java.lang.ref.WeakReference f213;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public int f214;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public int f215;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public android.view.LayoutInflater f216;

    public ViewStubCompat(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            r0 = 0
            r3.<init>(r4, r5, r0)
            r3.f215 = r0
            int[] r1 = defpackage.AbstractC1070.f4797
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r0)
            r5 = 2
            r1 = -1
            int r5 = r4.getResourceId(r5, r1)
            r3.f214 = r5
            r5 = 1
            int r2 = r4.getResourceId(r5, r0)
            r3.f215 = r2
            int r0 = r4.getResourceId(r0, r1)
            r3.setId(r0)
            r4.recycle()
            r4 = 8
            r3.setVisibility(r4)
            r3.setWillNotDraw(r5)
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
            int r0 = r0.f214
            return r0
    }

    public android.view.LayoutInflater getLayoutInflater() {
            r0 = this;
            android.view.LayoutInflater r0 = r0.f216
            return r0
    }

    public int getLayoutResource() {
            r0 = this;
            int r0 = r0.f215
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
            r0.f214 = r1
            return
    }

    public void setLayoutInflater(android.view.LayoutInflater r1) {
            r0 = this;
            r0.f216 = r1
            return
    }

    public void setLayoutResource(int r1) {
            r0 = this;
            r0.f215 = r1
            return
    }

    public void setOnInflateListener(defpackage.InterfaceC0019 r1) {
            r0 = this;
            return
    }

    @Override // android.view.View
    public void setVisibility(int r2) {
            r1 = this;
            java.lang.ref.WeakReference r0 = r1.f213
            if (r0 == 0) goto L16
            java.lang.Object r1 = r0.get()
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L10
            r1.setVisibility(r2)
            return
        L10:
            java.lang.String r1 = "setVisibility called on un-referenced view"
            defpackage.C2264.m3676(r1)
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
            r1.m79()
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final android.view.View m79() {
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            r2 = 0
            if (r1 == 0) goto L4d
            int r1 = r4.f215
            if (r1 == 0) goto L47
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.LayoutInflater r1 = r4.f216
            if (r1 == 0) goto L14
            goto L1c
        L14:
            android.content.Context r1 = r4.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
        L1c:
            int r2 = r4.f215
            r3 = 0
            android.view.View r1 = r1.inflate(r2, r0, r3)
            int r2 = r4.f214
            r3 = -1
            if (r2 == r3) goto L2b
            r1.setId(r2)
        L2b:
            int r2 = r0.indexOfChild(r4)
            r0.removeViewInLayout(r4)
            android.view.ViewGroup$LayoutParams r3 = r4.getLayoutParams()
            if (r3 == 0) goto L3c
            r0.addView(r1, r2, r3)
            goto L3f
        L3c:
            r0.addView(r1, r2)
        L3f:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            r4.f213 = r0
            return r1
        L47:
            java.lang.String r4 = "ViewStub must have a valid layoutResource"
            defpackage.C2264.m3684(r4)
            return r2
        L4d:
            java.lang.String r4 = "ViewStub must have a non-null ViewGroup viewParent"
            defpackage.C2264.m3676(r4)
            return r2
    }
}
