package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ClockFaceView a;

    public b(ClockFaceView r1) {
        this.a = r1;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView r0 = this.a;
        if (r0.isShown() == true) goto L5;
        return true;
    L5:
        r0.getViewTreeObserver().removeOnPreDrawListener(this);
        int r1 = ((r0.getHeight() / 2) - r0.s.d) - r0.A;
        if (r1 == r0.q) goto L8;
        r0.q = r1;
        r0.e();
        ClockHandView r12 = r0.s;
        r12.l = r0.q;
        r12.invalidate();
    L8:
        return true;
    }
}
