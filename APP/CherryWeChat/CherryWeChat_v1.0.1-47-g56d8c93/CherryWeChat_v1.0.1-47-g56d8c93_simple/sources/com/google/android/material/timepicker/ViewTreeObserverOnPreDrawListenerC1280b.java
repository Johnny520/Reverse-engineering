package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: com.google.android.material.timepicker.b */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC1280b implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ClockFaceView f4703a;

    public ViewTreeObserverOnPreDrawListenerC1280b(ClockFaceView r1) {
        this.f4703a = r1;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView r0 = this.f4703a;
        if (r0.isShown() == true) goto L5;
        return true;
    L5:
        r0.getViewTreeObserver().removeOnPreDrawListener(this);
        int r1 = ((r0.getHeight() / 2) - r0.f4679t.f4690d) - r0.f4672B;
        if (r1 == r0.f3267r) goto L8;
        r0.f3267r = r1;
        r0.mo1936m();
        ClockHandView r12 = r0.f4679t;
        r12.f4698l = r0.f3267r;
        r12.invalidate();
    L8:
        return true;
    }
}
