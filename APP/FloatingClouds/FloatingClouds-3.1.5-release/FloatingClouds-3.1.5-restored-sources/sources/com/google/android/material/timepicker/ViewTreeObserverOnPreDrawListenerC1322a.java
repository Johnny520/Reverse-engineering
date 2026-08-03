package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: com.google.android.material.timepicker.a */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC1322a implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ClockFaceView f6027a;

    public ViewTreeObserverOnPreDrawListenerC1322a(ClockFaceView clockFaceView) {
        this.f6027a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f6027a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f6004t.f6014d) - clockFaceView.f5997B;
        if (height != clockFaceView.f770r) {
            clockFaceView.f770r = height;
            clockFaceView.mo622f();
            int i = clockFaceView.f770r;
            ClockHandView clockHandView = clockFaceView.f6004t;
            clockHandView.f6022l = i;
            clockHandView.invalidate();
        }
        return true;
    }
}
