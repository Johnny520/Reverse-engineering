package com.kongzue.dialogx.util.views;

/* JADX INFO: loaded from: classes2.dex */
public class MaxRelativeLayout extends android.widget.RelativeLayout implements com.kongzue.dialogx.interfaces.DialogXSafetyModeInterface {
    private android.view.View contentView;
    private int dialogXSafetyMode;
    private float endAnimValue;
    private boolean interceptTouch;
    private boolean lockWidth;
    private int maxHeight;
    private int maxWidth;
    private int minHeight;
    private int minWidth;
    int navBarHeight;
    android.graphics.Paint navBarPaint;
    private android.view.View.OnTouchListener onTouchListener;
    private com.kongzue.dialogx.util.views.MaxRelativeLayout.OnYChanged onYChangedListener;
    private int preWidth;
    boolean reInterceptTouch;
    private float startAnimValue;


    public interface OnYChanged {
        void y(float r1);
    }

    public MaxRelativeLayout(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = 1
            r1.interceptTouch = r0
            r0 = 0
            r1.startAnimValue = r0
            r1.endAnimValue = r0
            r0 = -1
            r1.preWidth = r0
            r0 = 0
            r1.init(r2, r0)
            return
    }

    public MaxRelativeLayout(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            r0 = 1
            r1.interceptTouch = r0
            r0 = 0
            r1.startAnimValue = r0
            r1.endAnimValue = r0
            r0 = -1
            r1.preWidth = r0
            r1.init(r2, r3)
            return
    }

    public MaxRelativeLayout(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r3 = 1
            r0.interceptTouch = r3
            r3 = 0
            r0.startAnimValue = r3
            r0.endAnimValue = r3
            r3 = -1
            r0.preWidth = r3
            r0.init(r1, r2)
            return
    }

    public static /* synthetic */ float access$000(com.kongzue.dialogx.util.views.MaxRelativeLayout r0) {
            float r0 = r0.startAnimValue
            return r0
    }

    public static /* synthetic */ float access$100(com.kongzue.dialogx.util.views.MaxRelativeLayout r0) {
            float r0 = r0.endAnimValue
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.util.views.MaxRelativeLayout.OnYChanged access$200(com.kongzue.dialogx.util.views.MaxRelativeLayout r0) {
            com.kongzue.dialogx.util.views.MaxRelativeLayout$OnYChanged r0 = r0.onYChangedListener
            return r0
    }

    private void init(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            if (r4 == 0) goto L45
            int[] r0 = com.kongzue.dialogx.R.styleable.DialogXMaxLayout
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r0)
            int r4 = com.kongzue.dialogx.R.styleable.DialogXMaxLayout_maxLayoutWidth
            r0 = 0
            int r4 = r3.getDimensionPixelSize(r4, r0)
            r2.maxWidth = r4
            int r4 = com.kongzue.dialogx.R.styleable.DialogXMaxLayout_maxLayoutHeight
            int r4 = r3.getDimensionPixelSize(r4, r0)
            r2.maxHeight = r4
            int r4 = com.kongzue.dialogx.R.styleable.DialogXMaxLayout_minLayoutWidth
            int r4 = r3.getDimensionPixelSize(r4, r0)
            r2.minWidth = r4
            int r4 = com.kongzue.dialogx.R.styleable.DialogXMaxLayout_minLayoutHeight
            int r4 = r3.getDimensionPixelSize(r4, r0)
            r2.minHeight = r4
            int r4 = com.kongzue.dialogx.R.styleable.DialogXMaxLayout_lockWidth
            boolean r4 = r3.getBoolean(r4, r0)
            r2.lockWidth = r4
            int r4 = com.kongzue.dialogx.R.styleable.DialogXMaxLayout_interceptTouch
            r1 = 1
            boolean r4 = r3.getBoolean(r4, r1)
            r2.interceptTouch = r4
            int r4 = com.kongzue.dialogx.R.styleable.DialogXMaxLayout_dialogXSafetyMode
            int r4 = r3.getInt(r4, r0)
            r2.dialogXSafetyMode = r4
            r3.recycle()
        L45:
            int r3 = r2.minWidth
            if (r3 != 0) goto L4d
            int r3 = r2.getMinimumWidth()
        L4d:
            r2.minWidth = r3
            int r3 = r2.minHeight
            if (r3 != 0) goto L57
            int r3 = r2.getMinimumHeight()
        L57:
            r2.minHeight = r3
            boolean r3 = r2.isInEditMode()
            if (r3 != 0) goto L6b
            android.view.ViewPropertyAnimator r3 = r2.animate()
            com.kongzue.dialogx.util.views.MaxRelativeLayout$1 r4 = new com.kongzue.dialogx.util.views.MaxRelativeLayout$1
            r4.<init>(r2)
            r3.setUpdateListener(r4)
        L6b:
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

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            android.view.View$OnTouchListener r0 = r1.onTouchListener
            if (r0 == 0) goto La
            boolean r0 = r0.onTouch(r1, r2)
            r1.reInterceptTouch = r0
        La:
            boolean r2 = super.dispatchTouchEvent(r2)
            return r2
    }

    @Override // com.kongzue.dialogx.interfaces.DialogXSafetyModeInterface
    public int getDialogXSafetyMode() {
            r1 = this;
            int r0 = r1.dialogXSafetyMode
            return r0
    }

    public com.kongzue.dialogx.util.views.MaxRelativeLayout.OnYChanged getOnYChanged() {
            r1 = this;
            com.kongzue.dialogx.util.views.MaxRelativeLayout$OnYChanged r0 = r1.onYChangedListener
            return r0
    }

    public boolean isLockWidth() {
            r1 = this;
            boolean r0 = r1.lockWidth
            return r0
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas r8) {
            r7 = this;
            super.onDraw(r8)
            int r0 = r7.navBarHeight
            if (r0 == 0) goto L34
            int r0 = com.kongzue.dialogx.DialogX.bottomDialogNavbarColor
            if (r0 == 0) goto L34
            android.graphics.Paint r0 = r7.navBarPaint
            if (r0 != 0) goto L1b
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r7.navBarPaint = r0
            int r1 = com.kongzue.dialogx.DialogX.bottomDialogNavbarColor
            r0.setColor(r1)
        L1b:
            int r0 = r7.getHeight()
            int r1 = r7.navBarHeight
            int r0 = r0 - r1
            float r3 = (float) r0
            int r0 = r7.getWidth()
            float r4 = (float) r0
            int r0 = r7.getHeight()
            float r5 = (float) r0
            android.graphics.Paint r6 = r7.navBarPaint
            r2 = 0
            r1 = r8
            r1.drawRect(r2, r3, r4, r5, r6)
        L34:
            return
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent r1) {
            r0 = this;
            boolean r1 = r0.reInterceptTouch
            return r1
    }

    @Override // android.widget.RelativeLayout, android.view.View
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
            boolean r2 = r4.lockWidth
            if (r2 == 0) goto L2b
            int r2 = r4.maxWidth
            int r3 = r4.preWidth
            int r3 = java.lang.Math.min(r5, r3)
            int r2 = java.lang.Math.min(r2, r3)
            r4.maxWidth = r2
        L2b:
            int r2 = r4.maxHeight
            if (r6 <= r2) goto L3b
            if (r2 == 0) goto L3b
            int r6 = r4.getPaddingBottom()
            int r2 = r2 + r6
            int r6 = r4.getPaddingTop()
            int r6 = r6 + r2
        L3b:
            int r2 = r4.maxWidth
            if (r5 <= r2) goto L4b
            if (r2 == 0) goto L4b
            int r5 = r4.getPaddingLeft()
            int r2 = r2 + r5
            int r5 = r4.getPaddingRight()
            int r5 = r5 + r2
        L4b:
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
            super.onMeasure(r5, r6)
            return
    }

    public void setContentView(android.view.View r1) {
            r0 = this;
            r0.contentView = r1
            return
    }

    public com.kongzue.dialogx.util.views.MaxRelativeLayout setDialogXSafetyMode(int r1) {
            r0 = this;
            r0.dialogXSafetyMode = r1
            return r0
    }

    public com.kongzue.dialogx.util.views.MaxRelativeLayout setLockWidth(boolean r1) {
            r0 = this;
            r0.lockWidth = r1
            return r0
    }

    public com.kongzue.dialogx.util.views.MaxRelativeLayout setMaxHeight(int r1) {
            r0 = this;
            if (r1 <= 0) goto L4
            r0.maxHeight = r1
        L4:
            return r0
    }

    public com.kongzue.dialogx.util.views.MaxRelativeLayout setMaxWidth(int r1) {
            r0 = this;
            if (r1 <= 0) goto L4
            r0.maxWidth = r1
        L4:
            return r0
    }

    public void setMinHeight(int r1) {
            r0 = this;
            if (r1 <= 0) goto L4
            r0.minHeight = r1
        L4:
            return
    }

    public void setMinWidth(int r1) {
            r0 = this;
            if (r1 <= 0) goto L4
            r0.minWidth = r1
        L4:
            return
    }

    public void setNavBarHeight(int r1) {
            r0 = this;
            r0.navBarHeight = r1
            r0.invalidate()
            return
    }

    @Override // android.view.View
    public void setOnTouchListener(android.view.View.OnTouchListener r1) {
            r0 = this;
            r0.onTouchListener = r1
            return
    }

    public com.kongzue.dialogx.util.views.MaxRelativeLayout setOnYChanged(com.kongzue.dialogx.util.views.MaxRelativeLayout.OnYChanged r1) {
            r0 = this;
            r0.onYChangedListener = r1
            return r0
    }

    @Override // android.view.View
    public void setTranslationY(float r2) {
            r1 = this;
            super.setTranslationY(r2)
            com.kongzue.dialogx.util.views.MaxRelativeLayout$OnYChanged r0 = r1.onYChangedListener
            if (r0 == 0) goto La
            r0.y(r2)
        La:
            return
    }

    @Override // android.view.View
    public void setY(float r1) {
            r0 = this;
            super.setY(r1)
            return
    }
}
