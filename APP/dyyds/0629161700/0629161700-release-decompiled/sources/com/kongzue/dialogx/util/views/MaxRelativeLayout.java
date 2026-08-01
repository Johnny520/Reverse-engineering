package com.kongzue.dialogx.util.views;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class MaxRelativeLayout extends android.widget.RelativeLayout {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public int f406;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public android.view.View.OnTouchListener f407;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public boolean f408;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public int f409;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public int f410;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public int f411;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public int f412;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public int f413;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public int f414;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public boolean f415;

    public MaxRelativeLayout(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = -1
            r1.f409 = r0
            r0 = 0
            r1.m283(r2, r0)
            return
    }

    public MaxRelativeLayout(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            r0 = -1
            r1.f409 = r0
            r1.m283(r2, r3)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            android.view.View$OnTouchListener r0 = r1.f407
            if (r0 == 0) goto La
            boolean r0 = r0.onTouch(r1, r2)
            r1.f408 = r0
        La:
            boolean r1 = super.dispatchTouchEvent(r2)
            return r1
    }

    public int getDialogXSafetyMode() {
            r0 = this;
            int r0 = r0.f406
            return r0
    }

    public defpackage.InterfaceC1727 getOnYChanged() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r1) {
            r0 = this;
            super.onDraw(r1)
            int r0 = r0.f413
            if (r0 == 0) goto L9
            ᲈᛴᛵᲈ r0 = defpackage.AbstractC0042.f556
        L9:
            return
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r1) {
            r0 = this;
            boolean r0 = r0.f408
            return r0
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int r5, int r6) {
            r4 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r5)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r2 = r4.f409
            r3 = -1
            if (r2 != r3) goto L1a
            if (r5 == 0) goto L1a
            r4.f409 = r5
            r2 = r5
        L1a:
            boolean r3 = r4.f415
            if (r3 == 0) goto L2a
            int r3 = r4.f412
            int r2 = java.lang.Math.min(r5, r2)
            int r2 = java.lang.Math.min(r3, r2)
            r4.f412 = r2
        L2a:
            int r2 = r4.f411
            if (r6 <= r2) goto L3a
            if (r2 == 0) goto L3a
            int r6 = r4.getPaddingBottom()
            int r6 = r6 + r2
            int r2 = r4.getPaddingTop()
            int r6 = r6 + r2
        L3a:
            int r2 = r4.f412
            if (r5 <= r2) goto L4a
            if (r2 == 0) goto L4a
            int r5 = r4.getPaddingLeft()
            int r5 = r5 + r2
            int r2 = r4.getPaddingRight()
            int r5 = r5 + r2
        L4a:
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
            super.onMeasure(r5, r6)
            return
    }

    public void setContentView(android.view.View r1) {
            r0 = this;
            return
    }

    public void setMinHeight(int r1) {
            r0 = this;
            if (r1 <= 0) goto L4
            r0.f414 = r1
        L4:
            return
    }

    public void setMinWidth(int r1) {
            r0 = this;
            if (r1 <= 0) goto L4
            r0.f410 = r1
        L4:
            return
    }

    public void setNavBarHeight(int r1) {
            r0 = this;
            r0.f413 = r1
            r0.invalidate()
            return
    }

    @Override // android.view.View
    public void setOnTouchListener(android.view.View.OnTouchListener r1) {
            r0 = this;
            r0.f407 = r1
            return
    }

    @Override // android.view.View
    public void setTranslationY(float r1) {
            r0 = this;
            super.setTranslationY(r1)
            return
    }

    @Override // android.view.View
    public void setY(float r1) {
            r0 = this;
            super.setY(r1)
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m283(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            if (r3 == 0) goto L39
            int[] r0 = defpackage.AbstractC0875.f3952
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
            r3 = 4
            r0 = 0
            int r3 = r2.getDimensionPixelSize(r3, r0)
            r1.f412 = r3
            r3 = 3
            int r3 = r2.getDimensionPixelSize(r3, r0)
            r1.f411 = r3
            r3 = 6
            int r3 = r2.getDimensionPixelSize(r3, r0)
            r1.f410 = r3
            r3 = 5
            int r3 = r2.getDimensionPixelSize(r3, r0)
            r1.f414 = r3
            r3 = 2
            boolean r3 = r2.getBoolean(r3, r0)
            r1.f415 = r3
            r3 = 1
            r2.getBoolean(r3, r3)
            int r3 = r2.getInt(r0, r0)
            r1.f406 = r3
            r2.recycle()
        L39:
            int r2 = r1.f410
            if (r2 != 0) goto L41
            int r2 = r1.getMinimumWidth()
        L41:
            r1.f410 = r2
            int r2 = r1.f414
            if (r2 != 0) goto L4b
            int r2 = r1.getMinimumHeight()
        L4b:
            r1.f414 = r2
            boolean r2 = r1.isInEditMode()
            if (r2 != 0) goto L5f
            android.view.ViewPropertyAnimator r1 = r1.animate()
            ᲇᛱᲁᲀ r2 = new ᲇᛱᲁᲀ
            r2.<init>()
            r1.setUpdateListener(r2)
        L5f:
            return
    }
}
