package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import io.github.cherrywechat.R;
import p000.C0645P;
import p000.C0902V;
import p000.C1118a0;

/* JADX INFO: renamed from: com.google.android.material.timepicker.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1281c extends C0645P {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ClockFaceView f4704d;

    public C1281c(ClockFaceView clockFaceView) {
        this.f4704d = clockFaceView;
    }

    @Override // p000.C0645P
    /* JADX INFO: renamed from: d */
    public final void mo319d(View view, C1118a0 c1118a0) {
        AccessibilityNodeInfo accessibilityNodeInfo = c1118a0.f3530a;
        this.f2082a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int iIntValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (iIntValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.f4704d.f4683x.get(iIntValue - 1));
        }
        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, iIntValue, 1, false, view.isSelected()));
        accessibilityNodeInfo.setClickable(true);
        c1118a0.m2041b(C0902V.f2802e);
    }

    @Override // p000.C0645P
    /* JADX INFO: renamed from: g */
    public final boolean mo322g(View view, int i, Bundle bundle) {
        if (i != 16) {
            return super.mo322g(view, i, bundle);
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.f4704d;
        view.getHitRect(clockFaceView.f4680u);
        float fCenterX = clockFaceView.f4680u.centerX();
        float fCenterY = clockFaceView.f4680u.centerY();
        clockFaceView.f4679t.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
        clockFaceView.f4679t.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
        return true;
    }
}
