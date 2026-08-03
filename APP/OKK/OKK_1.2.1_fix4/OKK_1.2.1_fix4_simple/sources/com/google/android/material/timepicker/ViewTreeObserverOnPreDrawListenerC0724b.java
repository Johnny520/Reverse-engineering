package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: com.google.android.material.timepicker.b */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0724b implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ClockFaceView f2548a;

    public ViewTreeObserverOnPreDrawListenerC0724b(ClockFaceView r1) {
        this.f2548a = r1;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView r02 = this.f2548a;
        if (r02.isShown() == true) goto L5;
        return true;
    L5:
        r02.getViewTreeObserver().removeOnPreDrawListener(this);
        int r1 = ((r02.getHeight() / 2) - r02.f2524s.f2535d) - r02.f2517A;
        if (r1 == r02.f2551q) goto L8;
        r02.f2551q = r1;
        r02.mo1912f();
        int r12 = r02.f2551q;
        ClockHandView r03 = r02.f2524s;
        r03.f2543l = r12;
        r03.invalidate();
    L8:
        return true;
    }
}
