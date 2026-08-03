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

    public C1281c(ClockFaceView r1) {
        this.f4704d = r1;
    }

    @Override // p000.C0645P
    /* JADX INFO: renamed from: d */
    public final void mo319d(View r9, C1118a0 r10) {
        AccessibilityNodeInfo r0 = r10.f3530a;
        this.f2082a.onInitializeAccessibilityNodeInfo(r9, r0);
        int r4 = ((Integer) r9.getTag(R.id.material_value_index)).intValue();
        if (r4 <= 0) goto L5;
        r0.setTraversalAfter((View) this.f4704d.f4683x.get(r4 - 1));
    L5:
        r0.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, r4, 1, false, r9.isSelected()));
        r0.setClickable(true);
        r10.m2041b(C0902V.f2802e);
    }

    @Override // p000.C0645P
    /* JADX INFO: renamed from: g */
    public final boolean mo322g(View r10, int r11, Bundle r12) {
        if (r11 != 16) goto L7;
        long r1 = SystemClock.uptimeMillis();
        ClockFaceView r112 = this.f4704d;
        r10.getHitRect(r112.f4680u);
        float r6 = r112.f4680u.centerX();
        float r7 = r112.f4680u.centerY();
        r112.f4679t.onTouchEvent(MotionEvent.obtain(r1, r1, 0, r6, r7, 0));
        r112.f4679t.onTouchEvent(MotionEvent.obtain(r1, r1, 1, r6, r7, 0));
        return true;
    L7:
        return super.mo322g(r10, r11, r12);
    }
}
