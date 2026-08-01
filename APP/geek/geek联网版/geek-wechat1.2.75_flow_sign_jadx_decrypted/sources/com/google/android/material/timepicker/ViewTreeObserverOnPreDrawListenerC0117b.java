package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: com.google.android.material.timepicker.b */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0117b implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ClockFaceView f1208a;

    public ViewTreeObserverOnPreDrawListenerC0117b(ClockFaceView clockFaceView) {
        this.f1208a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f1208a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f1184s.f1195d) - clockFaceView.f1177A;
        if (height != clockFaceView.f1850q) {
            clockFaceView.f1850q = height;
            clockFaceView.mo756e();
            ClockHandView clockHandView = clockFaceView.f1184s;
            clockHandView.f1203l = clockFaceView.f1850q;
            clockHandView.invalidate();
        }
        return true;
    }
}
