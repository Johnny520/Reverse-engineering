package com.google.android.material.internal;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
public class TouchObserverFrameLayout extends android.widget.FrameLayout {

    @Yue.InterfaceC4544
    private android.view.View.OnTouchListener onTouchListener;

    public TouchObserverFrameLayout(@Yue.InterfaceC4410 android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public TouchObserverFrameLayout(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4544 android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public TouchObserverFrameLayout(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4544 android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            android.view.View$OnTouchListener r0 = r1.onTouchListener
            if (r0 == 0) goto L7
            r0.onTouch(r1, r2)
        L7:
            boolean r2 = super.onInterceptTouchEvent(r2)
            return r2
    }

    @Override // android.view.View
    public void setOnTouchListener(@Yue.InterfaceC4544 android.view.View.OnTouchListener r1) {
            r0 = this;
            r0.onTouchListener = r1
            return
    }
}
