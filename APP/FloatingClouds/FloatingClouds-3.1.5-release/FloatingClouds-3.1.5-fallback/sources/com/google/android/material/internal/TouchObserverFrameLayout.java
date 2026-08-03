package com.google.android.material.internal;

/* JADX INFO: loaded from: classes.dex */
public class TouchObserverFrameLayout extends android.widget.FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public android.view.View.OnTouchListener f1083a;

    public TouchObserverFrameLayout(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            android.view.View$OnTouchListener r0 = r1.f1083a
            if (r0 == 0) goto L7
            r0.onTouch(r1, r2)
        L7:
            boolean r2 = super.onInterceptTouchEvent(r2)
            return r2
    }

    @Override // android.view.View
    public void setOnTouchListener(android.view.View.OnTouchListener r1) {
            r0 = this;
            r0.f1083a = r1
            return
    }
}
