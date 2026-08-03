package com.kongzue.dialogx.util.views;

/* JADX INFO: loaded from: classes2.dex */
public class RoundView extends android.widget.RelativeLayout {
    private android.graphics.Path mBoundPath;
    private float mRadius;

    public RoundView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public RoundView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public RoundView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 0
            r0.mRadius = r1
            r1 = 0
            r0.mBoundPath = r1
            r1 = 0
            r0.setWillNotDraw(r1)
            r1 = 1112014848(0x42480000, float:50.0)
            r0.mRadius = r1
            return
    }

    private android.graphics.Path caculateRoundRectPath(android.graphics.Rect r8) {
            r7 = this;
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            float r1 = r7.getRadius()
            android.graphics.RectF r2 = new android.graphics.RectF
            int r3 = r8.left
            float r3 = (float) r3
            r4 = 0
            float r3 = r3 + r4
            int r5 = r8.top
            float r5 = (float) r5
            float r5 = r5 + r4
            int r6 = r8.right
            float r6 = (float) r6
            float r6 = r6 - r4
            int r8 = r8.bottom
            float r8 = (float) r8
            float r8 = r8 - r4
            r2.<init>(r3, r5, r6, r8)
            android.graphics.Path$Direction r8 = android.graphics.Path.Direction.CW
            r0.addRoundRect(r2, r1, r1, r8)
            return r0
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas r2) {
            r1 = this;
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.getLocalVisibleRect(r0)
            android.graphics.Path r0 = r1.caculateRoundRectPath(r0)
            r1.mBoundPath = r0
            r2.clipPath(r0)
            super.draw(r2)
            return
    }

    public float getRadius() {
            r1 = this;
            float r0 = r1.mRadius
            return r0
    }

    public void setRadius(float r2) {
            r1 = this;
            float r0 = r1.mRadius
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L7
            return
        L7:
            r1.mRadius = r2
            r1.postInvalidate()
            return
    }
}
