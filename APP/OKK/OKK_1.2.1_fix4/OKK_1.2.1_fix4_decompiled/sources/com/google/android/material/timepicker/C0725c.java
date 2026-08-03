package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.luckypray.dexkit.C1031R;
import p006D.C0091b;
import p008E.C0151e;
import p008E.C0155i;
import p008E.C0156j;

/* JADX INFO: renamed from: com.google.android.material.timepicker.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0725c extends C0091b {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ClockFaceView f2549d;

    public C0725c(ClockFaceView clockFaceView) {
        this.f2549d = clockFaceView;
    }

    @Override // p006D.C0091b
    /* JADX INFO: renamed from: d */
    public final void mo55d(View view, C0156j c0156j) {
        View.AccessibilityDelegate accessibilityDelegate = this.f243a;
        AccessibilityNodeInfo accessibilityNodeInfo = c0156j.f357a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int iIntValue = ((Integer) view.getTag(C1031R.id.material_value_index)).intValue();
        if (iIntValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.f2549d.f2528w.get(iIntValue - 1));
        }
        c0156j.m511h(C0155i.m503a(view.isSelected(), 0, 1, iIntValue, 1));
        accessibilityNodeInfo.setClickable(true);
        c0156j.m506b(C0151e.f344e);
    }

    @Override // p006D.C0091b
    /* JADX INFO: renamed from: g */
    public final boolean mo317g(View view, int i2, Bundle bundle) {
        if (i2 != 16) {
            return super.mo317g(view, i2, bundle);
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.f2549d;
        view.getHitRect(clockFaceView.f2525t);
        float fCenterX = clockFaceView.f2525t.centerX();
        float fCenterY = clockFaceView.f2525t.centerY();
        clockFaceView.f2524s.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
        clockFaceView.f2524s.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
        return true;
    }
}
