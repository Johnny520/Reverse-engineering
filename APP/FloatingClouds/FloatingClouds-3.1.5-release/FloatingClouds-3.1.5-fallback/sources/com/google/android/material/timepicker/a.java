package com.google.android.material.timepicker;

/* JADX INFO: loaded from: classes.dex */
public final class a implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.timepicker.ClockFaceView f1105a;

    public a(com.google.android.material.timepicker.ClockFaceView r1) {
            r0 = this;
            r0.<init>()
            r0.f1105a = r1
            return
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
            r4 = this;
            com.google.android.material.timepicker.ClockFaceView r0 = r4.f1105a
            boolean r1 = r0.isShown()
            r2 = 1
            if (r1 != 0) goto La
            return r2
        La:
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            r1.removeOnPreDrawListener(r4)
            int r1 = r0.getHeight()
            int r1 = r1 / 2
            com.google.android.material.timepicker.ClockHandView r3 = r0.t
            int r3 = r3.d
            int r1 = r1 - r3
            int r3 = r0.B
            int r1 = r1 - r3
            int r3 = r0.r
            if (r1 == r3) goto L31
            r0.r = r1
            r0.f()
            int r1 = r0.r
            com.google.android.material.timepicker.ClockHandView r0 = r0.t
            r0.l = r1
            r0.invalidate()
        L31:
            return r2
    }
}
