package com.google.android.material.internal;

/* JADX INFO: loaded from: classes.dex */
public class ClippableRoundedCornerLayout extends android.widget.FrameLayout {
    public ClippableRoundedCornerLayout(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(android.graphics.Canvas r1) {
            r0 = this;
            super.dispatchDraw(r1)
            return
    }

    public float getCornerRadius() {
            r1 = this;
            r0 = 0
            return r0
    }
}
