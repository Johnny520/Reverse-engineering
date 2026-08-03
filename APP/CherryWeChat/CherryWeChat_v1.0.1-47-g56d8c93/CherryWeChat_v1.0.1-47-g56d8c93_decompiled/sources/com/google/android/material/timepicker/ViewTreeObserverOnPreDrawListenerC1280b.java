package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: com.google.android.material.timepicker.b */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC1280b implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ClockFaceView f4703a;

    public ViewTreeObserverOnPreDrawListenerC1280b(ClockFaceView clockFaceView) {
        this.f4703a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f4703a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f4679t.f4690d) - clockFaceView.f4672B;
        if (height != clockFaceView.f3267r) {
            clockFaceView.f3267r = height;
            clockFaceView.mo1936m();
            ClockHandView clockHandView = clockFaceView.f4679t;
            clockHandView.f4698l = clockFaceView.f3267r;
            clockHandView.invalidate();
        }
        return true;
    }
}
