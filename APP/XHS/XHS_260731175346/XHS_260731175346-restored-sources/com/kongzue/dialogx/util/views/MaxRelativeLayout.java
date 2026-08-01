package com.kongzue.dialogx.util.views;

/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public class MaxRelativeLayout extends android.widget.RelativeLayout {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public int f116;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public int f117;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public boolean f118;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public int f119;

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public android.view.View.OnTouchListener f120;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public int f121;

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public boolean f122;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public int f123;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public int f124;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public int f125;

    public MaxRelativeLayout(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = -1
            r1.f123 = r0
            r0 = 0
            r1.m73(r2, r0)
            return
    }

    public MaxRelativeLayout(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            r0 = -1
            r1.f123 = r0
            r1.m73(r2, r3)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            android.view.View$OnTouchListener r0 = r1.f120
            if (r0 == 0) goto La
            boolean r0 = r0.onTouch(r1, r2)
            r1.f122 = r0
        La:
            boolean r1 = super.dispatchTouchEvent(r2)
            return r1
    }

    public int getDialogXSafetyMode() {
            r0 = this;
            int r0 = r0.f125
            return r0
    }

    public xhss.InterfaceC0484 getOnYChanged() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r1) {
            r0 = this;
            super.onDraw(r1)
            int r0 = r0.f121
            if (r0 == 0) goto L9
            xhss.ᛶᛵᲇᛸ r0 = xhss.AbstractC1069.f3451
        L9:
            return
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r1) {
            r0 = this;
            boolean r0 = r0.f122
            return r0
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int r5, int r6) {
            r4 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r5)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r2 = r4.f123
            r3 = -1
            if (r2 != r3) goto L1a
            if (r5 == 0) goto L1a
            r4.f123 = r5
            r2 = r5
        L1a:
            boolean r3 = r4.f118
            if (r3 == 0) goto L2a
            int r3 = r4.f119
            int r2 = java.lang.Math.min(r5, r2)
            int r2 = java.lang.Math.min(r3, r2)
            r4.f119 = r2
        L2a:
            int r2 = r4.f116
            if (r6 <= r2) goto L3a
            if (r2 == 0) goto L3a
            int r6 = r4.getPaddingBottom()
            int r6 = r6 + r2
            int r2 = r4.getPaddingTop()
            int r6 = r6 + r2
        L3a:
            int r2 = r4.f119
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
            r0.f124 = r1
        L4:
            return
    }

    public void setMinWidth(int r1) {
            r0 = this;
            if (r1 <= 0) goto L4
            r0.f117 = r1
        L4:
            return
    }

    public void setNavBarHeight(int r1) {
            r0 = this;
            r0.f121 = r1
            r0.invalidate()
            return
    }

    @Override // android.view.View
    public void setOnTouchListener(android.view.View.OnTouchListener r1) {
            r0 = this;
            r0.f120 = r1
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

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final void m73(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            if (r3 == 0) goto L39
            int[] r0 = xhss.AbstractC1143.f3688
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
            r3 = 4
            r0 = 0
            int r3 = r2.getDimensionPixelSize(r3, r0)
            r1.f119 = r3
            r3 = 3
            int r3 = r2.getDimensionPixelSize(r3, r0)
            r1.f116 = r3
            r3 = 6
            int r3 = r2.getDimensionPixelSize(r3, r0)
            r1.f117 = r3
            r3 = 5
            int r3 = r2.getDimensionPixelSize(r3, r0)
            r1.f124 = r3
            r3 = 2
            boolean r3 = r2.getBoolean(r3, r0)
            r1.f118 = r3
            r3 = 1
            r2.getBoolean(r3, r3)
            int r3 = r2.getInt(r0, r0)
            r1.f125 = r3
            r2.recycle()
        L39:
            int r2 = r1.f117
            if (r2 != 0) goto L41
            int r2 = r1.getMinimumWidth()
        L41:
            r1.f117 = r2
            int r2 = r1.f124
            if (r2 != 0) goto L4b
            int r2 = r1.getMinimumHeight()
        L4b:
            r1.f124 = r2
            boolean r2 = r1.isInEditMode()
            if (r2 != 0) goto L5f
            android.view.ViewPropertyAnimator r1 = r1.animate()
            xhss.ᲁᛵᛱᛵ r2 = new xhss.ᲁᛵᛱᛵ
            r2.<init>()
            r1.setUpdateListener(r2)
        L5f:
            return
    }
}
