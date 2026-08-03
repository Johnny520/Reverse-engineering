package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.C1247R;
import p000a.C0038C;
import p000a.C0146I;

/* JADX INFO: renamed from: com.google.android.material.timepicker.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1323b extends C0038C {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ClockFaceView f6028d;

    public C1323b(ClockFaceView clockFaceView) {
        this.f6028d = clockFaceView;
    }

    @Override // p000a.C0038C
    /* JADX INFO: renamed from: d */
    public final void mo115d(View view, C0146I c0146i) {
        View.AccessibilityDelegate accessibilityDelegate = this.f137a;
        AccessibilityNodeInfo accessibilityNodeInfo = c0146i.f505a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int iIntValue = ((Integer) view.getTag(C1247R.id.material_value_index)).intValue();
        if (iIntValue > 0) {
            accessibilityNodeInfo.setTraversalAfter(this.f6028d.f6008x.get(iIntValue - 1));
        }
        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, iIntValue, 1, false, view.isSelected()));
        accessibilityNodeInfo.setClickable(true);
        c0146i.m377b(C0146I.a.f507e);
    }

    @Override // p000a.C0038C
    /* JADX INFO: renamed from: g */
    public final boolean mo118g(View view, int i, Bundle bundle) {
        if (i != 16) {
            return super.mo118g(view, i, bundle);
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.f6028d;
        view.getHitRect(clockFaceView.f6005u);
        float fCenterX = clockFaceView.f6005u.centerX();
        float fCenterY = clockFaceView.f6005u.centerY();
        clockFaceView.f6004t.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
        clockFaceView.f6004t.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
        return true;
    }
}
