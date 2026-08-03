package com.google.android.material.timepicker;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a.C {
    public final /* synthetic */ com.google.android.material.timepicker.ClockFaceView d;

    public b(com.google.android.material.timepicker.ClockFaceView r1) {
            r0 = this;
            r0.d = r1
            r0.<init>()
            return
    }

    @Override // a.C
    public final void d(android.view.View r9, a.I r10) {
            r8 = this;
            android.view.View$AccessibilityDelegate r0 = r8.f36a
            android.view.accessibility.AccessibilityNodeInfo r1 = r10.f118a
            r0.onInitializeAccessibilityNodeInfo(r9, r1)
            int r0 = com.google.android.material.R.id.material_value_index
            java.lang.Object r0 = r9.getTag(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r4 = r0.intValue()
            if (r4 <= 0) goto L24
            com.google.android.material.timepicker.ClockFaceView r0 = r8.d
            android.util.SparseArray<android.widget.TextView> r0 = r0.x
            int r2 = r4 + (-1)
            java.lang.Object r0 = r0.get(r2)
            android.view.View r0 = (android.view.View) r0
            r1.setTraversalAfter(r0)
        L24:
            boolean r7 = r9.isSelected()
            r6 = 0
            r2 = 0
            r3 = 1
            r5 = 1
            android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r9 = android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(r2, r3, r4, r5, r6, r7)
            r1.setCollectionItemInfo(r9)
            r9 = 1
            r1.setClickable(r9)
            a.I$a r9 = a.I.a.e
            r10.b(r9)
            return
    }

    @Override // a.C
    public final boolean g(android.view.View r10, int r11, android.os.Bundle r12) {
            r9 = this;
            r0 = 16
            if (r11 != r0) goto L37
            long r1 = android.os.SystemClock.uptimeMillis()
            com.google.android.material.timepicker.ClockFaceView r11 = r9.d
            android.graphics.Rect r12 = r11.u
            r10.getHitRect(r12)
            android.graphics.Rect r10 = r11.u
            int r10 = r10.centerX()
            float r6 = (float) r10
            android.graphics.Rect r10 = r11.u
            int r10 = r10.centerY()
            float r7 = (float) r10
            com.google.android.material.timepicker.ClockHandView r10 = r11.t
            r5 = 0
            r8 = 0
            r3 = r1
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r1, r3, r5, r6, r7, r8)
            r10.onTouchEvent(r12)
            com.google.android.material.timepicker.ClockHandView r10 = r11.t
            r5 = 1
            r8 = 0
            r3 = r1
            android.view.MotionEvent r11 = android.view.MotionEvent.obtain(r1, r3, r5, r6, r7, r8)
            r10.onTouchEvent(r11)
            r10 = 1
            return r10
        L37:
            boolean r10 = super.g(r10, r11, r12)
            return r10
    }
}
