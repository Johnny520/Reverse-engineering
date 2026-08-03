package com.kongzue.dialogx.util.views;

/* JADX INFO: loaded from: classes2.dex */
public class MaxLinearLayout extends android.widget.LinearLayout {
    private int maxHeight;
    private int maxWidth;
    private int minHeight;
    private int minWidth;
    private int preWidth;

    public MaxLinearLayout(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = -1
            r1.preWidth = r0
            r0 = 0
            r1.init(r2, r0)
            return
    }

    public MaxLinearLayout(android.content.Context r2, @Yue.InterfaceC4544 android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            r0 = -1
            r1.preWidth = r0
            r1.init(r2, r3)
            return
    }

    public MaxLinearLayout(android.content.Context r1, @Yue.InterfaceC4544 android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r3 = -1
            r0.preWidth = r3
            r0.init(r1, r2)
            return
    }

    private void init(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            if (r3 == 0) goto L2c
            int[] r0 = com.kongzue.dialogx.R.styleable.DialogXMaxLayout
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
            int r3 = com.kongzue.dialogx.R.styleable.DialogXMaxLayout_maxLayoutWidth
            r0 = 0
            int r3 = r2.getDimensionPixelSize(r3, r0)
            r1.maxWidth = r3
            int r3 = com.kongzue.dialogx.R.styleable.DialogXMaxLayout_maxLayoutHeight
            int r3 = r2.getDimensionPixelSize(r3, r0)
            r1.maxHeight = r3
            int r3 = com.kongzue.dialogx.R.styleable.DialogXMaxLayout_minLayoutWidth
            int r3 = r2.getDimensionPixelSize(r3, r0)
            r1.minWidth = r3
            int r3 = com.kongzue.dialogx.R.styleable.DialogXMaxLayout_minLayoutHeight
            int r3 = r2.getDimensionPixelSize(r3, r0)
            r1.minHeight = r3
            r2.recycle()
        L2c:
            int r2 = r1.minWidth
            if (r2 != 0) goto L34
            int r2 = r1.getMinimumWidth()
        L34:
            r1.minWidth = r2
            int r2 = r1.minHeight
            if (r2 != 0) goto L3e
            int r2 = r1.getMinimumHeight()
        L3e:
            r1.minHeight = r2
            return
    }

    public int dip2px(float r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r2 = r2 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r0
            int r2 = (int) r2
            return r2
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int r5, int r6) {
            r4 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r5)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r2 = r4.preWidth
            r3 = -1
            if (r2 != r3) goto L19
            if (r5 == 0) goto L19
            r4.preWidth = r5
        L19:
            int r2 = r4.maxHeight
            if (r6 <= r2) goto L20
            if (r2 == 0) goto L20
            r6 = r2
        L20:
            int r2 = r4.maxWidth
            if (r5 <= r2) goto L27
            if (r2 == 0) goto L27
            r5 = r2
        L27:
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
            super.onMeasure(r5, r6)
            return
    }

    public com.kongzue.dialogx.util.views.MaxLinearLayout setMaxHeight(int r1) {
            r0 = this;
            r0.maxHeight = r1
            return r0
    }

    public com.kongzue.dialogx.util.views.MaxLinearLayout setMaxWidth(int r1) {
            r0 = this;
            r0.maxWidth = r1
            return r0
    }

    @Override // android.view.View
    public void setMinimumHeight(int r1) {
            r0 = this;
            r0.minHeight = r1
            super.setMinimumHeight(r1)
            return
    }

    @Override // android.view.View
    public void setMinimumWidth(int r1) {
            r0 = this;
            r0.minWidth = r1
            super.setMinimumWidth(r1)
            return
    }
}
