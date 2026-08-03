package com.kongzue.dialogx.util.views;

/* JADX INFO: loaded from: classes2.dex */
public class ExtendChildLayoutParamsFrameLayout extends android.widget.FrameLayout {
    public ExtendChildLayoutParamsFrameLayout(@Yue.InterfaceC4410 android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public ExtendChildLayoutParamsFrameLayout(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4544 android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public ExtendChildLayoutParamsFrameLayout(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4544 android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View r4, int r5, android.view.ViewGroup.LayoutParams r6) {
            r3 = this;
            android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams
            int r1 = r6.width
            int r2 = r6.height
            r0.<init>(r1, r2)
            r3.setLayoutParams(r0)
            super.addView(r4, r5, r6)
            return
    }
}
