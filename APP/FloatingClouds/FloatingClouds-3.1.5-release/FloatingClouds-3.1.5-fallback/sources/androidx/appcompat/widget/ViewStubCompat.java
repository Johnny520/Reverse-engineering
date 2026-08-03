package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public final class ViewStubCompat extends android.view.View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f851a;
    public int b;
    public java.lang.ref.WeakReference<android.view.View> c;
    public android.view.LayoutInflater d;

    public interface a {
    }

    public ViewStubCompat(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r0 = 0
            r2.<init>(r3, r4, r0)
            r2.f851a = r0
            int[] r1 = androidx.appcompat.R.styleable.ViewStubCompat
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r1, r0, r0)
            int r4 = androidx.appcompat.R.styleable.ViewStubCompat_android_inflatedId
            r1 = -1
            int r4 = r3.getResourceId(r4, r1)
            r2.b = r4
            int r4 = androidx.appcompat.R.styleable.ViewStubCompat_android_layout
            int r4 = r3.getResourceId(r4, r0)
            r2.f851a = r4
            int r4 = androidx.appcompat.R.styleable.ViewStubCompat_android_id
            int r4 = r3.getResourceId(r4, r1)
            r2.setId(r4)
            r3.recycle()
            r3 = 8
            r2.setVisibility(r3)
            r3 = 1
            r2.setWillNotDraw(r3)
            return
    }

    public final android.view.View a() {
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L4e
            int r1 = r4.f851a
            if (r1 == 0) goto L46
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.LayoutInflater r1 = r4.d
            if (r1 == 0) goto L13
            goto L1b
        L13:
            android.content.Context r1 = r4.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
        L1b:
            int r2 = r4.f851a
            r3 = 0
            android.view.View r1 = r1.inflate(r2, r0, r3)
            int r2 = r4.b
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
            r4.c = r0
            return r1
        L46:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "ViewStub must have a valid layoutResource"
            r0.<init>(r1)
            throw r0
        L4e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "ViewStub must have a non-null ViewGroup viewParent"
            r0.<init>(r1)
            throw r0
    }

    @Override // android.view.View
    public final void dispatchDraw(android.graphics.Canvas r1) {
            r0 = this;
            return
    }

    @Override // android.view.View
    @android.annotation.SuppressLint({"MissingSuperCall"})
    public final void draw(android.graphics.Canvas r1) {
            r0 = this;
            return
    }

    public int getInflatedId() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    public android.view.LayoutInflater getLayoutInflater() {
            r1 = this;
            android.view.LayoutInflater r0 = r1.d
            return r0
    }

    public int getLayoutResource() {
            r1 = this;
            int r0 = r1.f851a
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
            r0.b = r1
            return
    }

    public void setLayoutInflater(android.view.LayoutInflater r1) {
            r0 = this;
            r0.d = r1
            return
    }

    public void setLayoutResource(int r1) {
            r0 = this;
            r0.f851a = r1
            return
    }

    public void setOnInflateListener(androidx.appcompat.widget.ViewStubCompat.a r1) {
            r0 = this;
            return
    }

    @Override // android.view.View
    public void setVisibility(int r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.c
            if (r0 == 0) goto L18
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L10
            r0.setVisibility(r2)
            return
        L10:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "setVisibility called on un-referenced view"
            r2.<init>(r0)
            throw r2
        L18:
            super.setVisibility(r2)
            if (r2 == 0) goto L22
            r0 = 4
            if (r2 != r0) goto L21
            goto L22
        L21:
            return
        L22:
            r1.a()
            return
    }
}
