package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: com.google.android.material.timepicker.b */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0117b implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ClockFaceView f1283a;

    public ViewTreeObserverOnPreDrawListenerC0117b(ClockFaceView clockFaceView) {
        this.f1283a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f1283a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f1259s.f1270d) - clockFaceView.f1252A;
        if (height != clockFaceView.f5413q) {
            clockFaceView.f5413q = height;
            clockFaceView.mo797e();
            ClockHandView clockHandView = clockFaceView.f1259s;
            clockHandView.f1278l = clockFaceView.f5413q;
            clockHandView.invalidate();
        }
        return true;
    }
}
