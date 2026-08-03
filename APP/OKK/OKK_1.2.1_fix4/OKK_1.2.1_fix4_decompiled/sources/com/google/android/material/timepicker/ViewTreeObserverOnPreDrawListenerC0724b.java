package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: com.google.android.material.timepicker.b */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0724b implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ClockFaceView f2548a;

    public ViewTreeObserverOnPreDrawListenerC0724b(ClockFaceView clockFaceView) {
        this.f2548a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f2548a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f2524s.f2535d) - clockFaceView.f2517A;
        if (height != clockFaceView.f2551q) {
            clockFaceView.f2551q = height;
            clockFaceView.mo1912f();
            int i2 = clockFaceView.f2551q;
            ClockHandView clockHandView = clockFaceView.f2524s;
            clockHandView.f2543l = i2;
            clockHandView.invalidate();
        }
        return true;
    }
}
