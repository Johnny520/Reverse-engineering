package androidx.appcompat.widget;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends android.widget.FrameLayout {

    /* JADX INFO: renamed from: ε */
    public android.util.TypedValue f598;

    /* JADX INFO: renamed from: ζ */
    public android.util.TypedValue f599;

    /* JADX INFO: renamed from: η */
    public android.util.TypedValue f600;

    /* JADX INFO: renamed from: θ */
    public android.util.TypedValue f601;

    /* JADX INFO: renamed from: ι */
    public android.util.TypedValue f602;

    /* JADX INFO: renamed from: κ */
    public android.util.TypedValue f603;

    /* JADX INFO: renamed from: λ */
    public final android.graphics.Rect f604;

    /* JADX INFO: renamed from: μ */
    public p000.InterfaceC0219dp f605;

    public ContentFrameLayout(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ContentFrameLayout(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public ContentFrameLayout(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f604 = r1
            return
    }

    public android.util.TypedValue getFixedHeightMajor() {
            r1 = this;
            android.util.TypedValue r0 = r1.f602
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r1.f602 = r0
        Lb:
            android.util.TypedValue r1 = r1.f602
            return r1
    }

    public android.util.TypedValue getFixedHeightMinor() {
            r1 = this;
            android.util.TypedValue r0 = r1.f603
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r1.f603 = r0
        Lb:
            android.util.TypedValue r1 = r1.f603
            return r1
    }

    public android.util.TypedValue getFixedWidthMajor() {
            r1 = this;
            android.util.TypedValue r0 = r1.f600
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r1.f600 = r0
        Lb:
            android.util.TypedValue r1 = r1.f600
            return r1
    }

    public android.util.TypedValue getFixedWidthMinor() {
            r1 = this;
            android.util.TypedValue r0 = r1.f601
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r1.f601 = r0
        Lb:
            android.util.TypedValue r1 = r1.f601
            return r1
    }

    public android.util.TypedValue getMinWidthMajor() {
            r1 = this;
            android.util.TypedValue r0 = r1.f598
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r1.f598 = r0
        Lb:
            android.util.TypedValue r1 = r1.f598
            return r1
    }

    public android.util.TypedValue getMinWidthMinor() {
            r1 = this;
            android.util.TypedValue r0 = r1.f599
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r1.f599 = r0
        Lb:
            android.util.TypedValue r1 = r1.f599
            return r1
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r0 = this;
            super.onAttachedToWindow()
            dp r0 = r0.f605
            if (r0 == 0) goto La
            r0.getClass()
        La:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r2 = this;
            super.onDetachedFromWindow()
            dp r2 = r2.f605
            if (r2 == 0) goto L67
            x4 r2 = (p000.C0971x4) r2
            androidx.appcompat.app.β r2 = r2.f12047
            xq r0 = r2.f405
            if (r0 == 0) goto L34
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.m259()
            yq r0 = r0.f501
            b52 r0 = (p000.b52) r0
            androidx.appcompat.widget.Toolbar r0 = r0.f1484
            androidx.appcompat.widget.ActionMenuView r0 = r0.f759
            if (r0 == 0) goto L34
            androidx.appcompat.widget.γ r0 = r0.f528
            if (r0 == 0) goto L34
            r0.m323()
            ｑ r0 = r0.f809
            if (r0 == 0) goto L34
            boolean r1 = r0.m5039()
            if (r1 == 0) goto L34
            oz0 r0 = r0.f9171
            r0.dismiss()
        L34:
            android.widget.PopupWindow r0 = r2.f375
            if (r0 == 0) goto L53
            android.view.Window r0 = r2.f399
            android.view.View r0 = r0.getDecorView()
            w4 r1 = r2.f376
            r0.removeCallbacks(r1)
            android.widget.PopupWindow r0 = r2.f375
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L50
            android.widget.PopupWindow r0 = r2.f375     // Catch: java.lang.IllegalArgumentException -> L50
            r0.dismiss()     // Catch: java.lang.IllegalArgumentException -> L50
        L50:
            r0 = 0
            r2.f375 = r0
        L53:
            x92 r0 = r2.f377
            if (r0 == 0) goto L5a
            r0.m6541()
        L5a:
            r0 = 0
            g5 r2 = r2.m210(r0)
            iz0 r2 = r2.f4242
            if (r2 == 0) goto L67
            r0 = 1
            r2.m2831(r0)
        L67:
            return
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int r17, int r18) {
            r16 = this;
            r0 = r16
            android.content.Context r1 = r0.getContext()
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r2 = r1.widthPixels
            int r3 = r1.heightPixels
            r4 = 1
            r5 = 0
            if (r2 >= r3) goto L18
            r2 = r4
            goto L19
        L18:
            r2 = r5
        L19:
            int r3 = android.view.View.MeasureSpec.getMode(r17)
            int r6 = android.view.View.MeasureSpec.getMode(r18)
            android.graphics.Rect r7 = r0.f604
            r8 = 6
            r9 = 5
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = 1073741824(0x40000000, float:2.0)
            if (r3 != r10) goto L62
            if (r2 == 0) goto L30
            android.util.TypedValue r12 = r0.f601
            goto L32
        L30:
            android.util.TypedValue r12 = r0.f600
        L32:
            if (r12 == 0) goto L62
            int r13 = r12.type
            if (r13 == 0) goto L62
            if (r13 != r9) goto L40
            float r12 = r12.getDimension(r1)
        L3e:
            int r12 = (int) r12
            goto L4c
        L40:
            if (r13 != r8) goto L4b
            int r13 = r1.widthPixels
            float r14 = (float) r13
            float r13 = (float) r13
            float r12 = r12.getFraction(r14, r13)
            goto L3e
        L4b:
            r12 = r5
        L4c:
            if (r12 <= 0) goto L62
            int r13 = r7.left
            int r14 = r7.right
            int r13 = r13 + r14
            int r12 = r12 - r13
            int r13 = android.view.View.MeasureSpec.getSize(r17)
            int r12 = java.lang.Math.min(r12, r13)
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r11)
            r13 = r4
            goto L65
        L62:
            r12 = r17
            r13 = r5
        L65:
            if (r6 != r10) goto L9d
            if (r2 == 0) goto L6c
            android.util.TypedValue r6 = r0.f602
            goto L6e
        L6c:
            android.util.TypedValue r6 = r0.f603
        L6e:
            if (r6 == 0) goto L9d
            int r14 = r6.type
            if (r14 == 0) goto L9d
            if (r14 != r9) goto L7c
            float r6 = r6.getDimension(r1)
        L7a:
            int r6 = (int) r6
            goto L88
        L7c:
            if (r14 != r8) goto L87
            int r14 = r1.heightPixels
            float r15 = (float) r14
            float r14 = (float) r14
            float r6 = r6.getFraction(r15, r14)
            goto L7a
        L87:
            r6 = r5
        L88:
            if (r6 <= 0) goto L9d
            int r14 = r7.top
            int r15 = r7.bottom
            int r14 = r14 + r15
            int r6 = r6 - r14
            int r14 = android.view.View.MeasureSpec.getSize(r18)
            int r6 = java.lang.Math.min(r6, r14)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r11)
            goto L9f
        L9d:
            r6 = r18
        L9f:
            super.onMeasure(r12, r6)
            int r12 = r0.getMeasuredWidth()
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r11)
            if (r13 != 0) goto Lde
            if (r3 != r10) goto Lde
            if (r2 == 0) goto Lb3
            android.util.TypedValue r2 = r0.f599
            goto Lb5
        Lb3:
            android.util.TypedValue r2 = r0.f598
        Lb5:
            if (r2 == 0) goto Lde
            int r3 = r2.type
            if (r3 == 0) goto Lde
            if (r3 != r9) goto Lc3
            float r1 = r2.getDimension(r1)
        Lc1:
            int r1 = (int) r1
            goto Lcf
        Lc3:
            if (r3 != r8) goto Lce
            int r1 = r1.widthPixels
            float r3 = (float) r1
            float r1 = (float) r1
            float r1 = r2.getFraction(r3, r1)
            goto Lc1
        Lce:
            r1 = r5
        Lcf:
            if (r1 <= 0) goto Ld7
            int r2 = r7.left
            int r3 = r7.right
            int r2 = r2 + r3
            int r1 = r1 - r2
        Ld7:
            if (r12 >= r1) goto Lde
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r11)
            goto Ldf
        Lde:
            r4 = r5
        Ldf:
            if (r4 == 0) goto Le4
            super.onMeasure(r14, r6)
        Le4:
            return
    }

    public void setAttachListener(p000.InterfaceC0219dp r1) {
            r0 = this;
            r0.f605 = r1
            return
    }
}
