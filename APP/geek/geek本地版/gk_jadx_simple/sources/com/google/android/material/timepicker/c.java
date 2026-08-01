package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.ljx.wechatmod.R;
import defpackage.h0;
import defpackage.i0;
import defpackage.j0;
import defpackage.x;

/* JADX INFO: loaded from: classes.dex */
public final class c extends x {
    public final /* synthetic */ ClockFaceView d;

    public c(ClockFaceView r1) {
        this.d = r1;
    }

    @Override // defpackage.x
    public final void d(View r5, j0 r6) {
        AccessibilityNodeInfo r0 = r6.a;
        this.a.onInitializeAccessibilityNodeInfo(r5, r0);
        int r1 = ((Integer) r5.getTag(R.id.material_value_index)).intValue();
        if (r1 <= 0) goto L5;
        r0.setTraversalAfter((View) this.d.w.get(r1 - 1));
    L5:
        r6.f(i0.a(r5.isSelected(), 0, 1, r1, 1));
        r0.setClickable(true);
        r6.b(h0.e);
    }

    @Override // defpackage.x
    public final boolean g(View r10, int r11, Bundle r12) {
        if (r11 != 16) goto L7;
        long r1 = SystemClock.uptimeMillis();
        ClockFaceView r112 = this.d;
        r10.getHitRect(r112.t);
        float r6 = r112.t.centerX();
        float r7 = r112.t.centerY();
        r112.s.onTouchEvent(MotionEvent.obtain(r1, r1, 0, r6, r7, 0));
        r112.s.onTouchEvent(MotionEvent.obtain(r1, r1, 1, r6, r7, 0));
        return true;
    L7:
        return super.g(r10, r11, r12);
    }
}
