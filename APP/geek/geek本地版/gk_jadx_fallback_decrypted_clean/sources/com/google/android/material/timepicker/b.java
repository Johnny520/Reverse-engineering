package com.google.android.material.timepicker;

/* JADX INFO: loaded from: classes.dex */
public final class b implements android.view.ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ com.google.android.material.timepicker.ClockFaceView a;

    public b(com.google.android.material.timepicker.ClockFaceView r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
            r4 = this;
            com.google.android.material.timepicker.ClockFaceView r0 = r4.a
            boolean r1 = r0.isShown()
            r2 = 1
            if (r1 != 0) goto La
            return r2
        La:
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            r1.removeOnPreDrawListener(r4)
            int r1 = r0.getHeight()
            int r1 = r1 / 2
            com.google.android.material.timepicker.ClockHandView r3 = r0.s
            int r3 = r3.d
            int r1 = r1 - r3
            int r3 = r0.A
            int r1 = r1 - r3
            int r3 = r0.q
            if (r1 == r3) goto L31
            r0.q = r1
            r0.e()
            com.google.android.material.timepicker.ClockHandView r1 = r0.s
            int r0 = r0.q
            r1.l = r0
            r1.invalidate()
        L31:
            return r2
    }
}
