package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.ljx.wechatmod.R;
import p000.C0281h0;
import p000.C0318i0;
import p000.C0357j0;
import p000.C0875x;

/* JADX INFO: renamed from: com.google.android.material.timepicker.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0118c extends C0875x {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ClockFaceView f1209d;

    public C0118c(ClockFaceView clockFaceView) {
        this.f1209d = clockFaceView;
    }

    @Override // p000.C0875x
    /* JADX INFO: renamed from: d */
    public final void mo760d(View view, C0357j0 c0357j0) {
        AccessibilityNodeInfo accessibilityNodeInfo = c0357j0.f2619a;
        this.f5147a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int iIntValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (iIntValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.f1209d.f1188w.get(iIntValue - 1));
        }
        c0357j0.m1552f(C0318i0.m1418a(view.isSelected(), 0, 1, iIntValue, 1));
        accessibilityNodeInfo.setClickable(true);
        c0357j0.m1548b(C0281h0.f2068e);
    }

    @Override // p000.C0875x
    /* JADX INFO: renamed from: g */
    public final boolean mo761g(View view, int i, Bundle bundle) {
        if (i != 16) {
            return super.mo761g(view, i, bundle);
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.f1209d;
        view.getHitRect(clockFaceView.f1185t);
        float fCenterX = clockFaceView.f1185t.centerX();
        float fCenterY = clockFaceView.f1185t.centerY();
        clockFaceView.f1184s.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
        clockFaceView.f1184s.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
        return true;
    }
}
