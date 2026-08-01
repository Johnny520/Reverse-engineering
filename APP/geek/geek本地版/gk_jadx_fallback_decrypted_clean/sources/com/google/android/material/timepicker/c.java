package com.google.android.material.timepicker;

/* JADX INFO: loaded from: classes.dex */
public final class c extends defpackage.x {
    public final /* synthetic */ com.google.android.material.timepicker.ClockFaceView d;

    public c(com.google.android.material.timepicker.ClockFaceView r1) {
            r0 = this;
            r0.d = r1
            r0.<init>()
            return
    }

    @Override // defpackage.x
    public final void d(android.view.View r5, defpackage.j0 r6) {
            r4 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r6.a
            android.view.View$AccessibilityDelegate r1 = r4.a
            r1.onInitializeAccessibilityNodeInfo(r5, r0)
            r1 = 2131296489(0x7f0900e9, float:1.8210896E38)
            java.lang.Object r1 = r5.getTag(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 <= 0) goto L25
            com.google.android.material.timepicker.ClockFaceView r2 = r4.d
            android.util.SparseArray r2 = r2.w
            int r3 = r1 + (-1)
            java.lang.Object r2 = r2.get(r3)
            android.view.View r2 = (android.view.View) r2
            r0.setTraversalAfter(r2)
        L25:
            r2 = 0
            boolean r5 = r5.isSelected()
            r3 = 1
            i0 r5 = defpackage.i0.a(r5, r2, r3, r1, r3)
            r6.f(r5)
            r0.setClickable(r3)
            h0 r5 = defpackage.h0.e
            r6.b(r5)
            return
    }

    @Override // defpackage.x
    public final boolean g(android.view.View r10, int r11, android.os.Bundle r12) {
            r9 = this;
            r0 = 16
            if (r11 != r0) goto L35
            long r1 = android.os.SystemClock.uptimeMillis()
            com.google.android.material.timepicker.ClockFaceView r11 = r9.d
            android.graphics.Rect r12 = r11.t
            r10.getHitRect(r12)
            android.graphics.Rect r10 = r11.t
            int r10 = r10.centerX()
            float r6 = (float) r10
            android.graphics.Rect r10 = r11.t
            int r10 = r10.centerY()
            float r7 = (float) r10
            com.google.android.material.timepicker.ClockHandView r10 = r11.s
            r5 = 0
            r8 = 0
            r3 = r1
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r1, r3, r5, r6, r7, r8)
            r10.onTouchEvent(r12)
            com.google.android.material.timepicker.ClockHandView r10 = r11.s
            r5 = 1
            android.view.MotionEvent r11 = android.view.MotionEvent.obtain(r1, r3, r5, r6, r7, r8)
            r10.onTouchEvent(r11)
            r10 = 1
            return r10
        L35:
            boolean r10 = super.g(r10, r11, r12)
            return r10
    }
}
