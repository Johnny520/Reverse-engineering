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

    public C0725c(ClockFaceView r1) {
        this.f2549d = r1;
    }

    @Override // p006D.C0091b
    /* JADX INFO: renamed from: d */
    public final void mo55d(View r5, C0156j r6) {
        View.AccessibilityDelegate r02 = this.f243a;
        AccessibilityNodeInfo r1 = r6.f357a;
        r02.onInitializeAccessibilityNodeInfo(r5, r1);
        int r03 = ((Integer) r5.getTag(C1031R.id.material_value_index)).intValue();
        if (r03 <= 0) goto L5;
        r1.setTraversalAfter((View) this.f2549d.f2528w.get(r03 - 1));
    L5:
        r6.m511h(C0155i.m503a(r5.isSelected(), 0, 1, r03, 1));
        r1.setClickable(true);
        r6.m506b(C0151e.f344e);
    }

    @Override // p006D.C0091b
    /* JADX INFO: renamed from: g */
    public final boolean mo317g(View r12, int r13, Bundle r14) {
        if (r13 != 16) goto L7;
        long r132 = SystemClock.uptimeMillis();
        ClockFaceView r02 = this.f2549d;
        r12.getHitRect(r02.f2525t);
        float r122 = r02.f2525t.centerX();
        float r9 = r02.f2525t.centerY();
        r02.f2524s.onTouchEvent(MotionEvent.obtain(r132, r132, 0, r122, r9, 0));
        r02.f2524s.onTouchEvent(MotionEvent.obtain(r132, r132, 1, r122, r9, 0));
        return true;
    L7:
        return super.mo317g(r12, r13, r14);
    }
}
