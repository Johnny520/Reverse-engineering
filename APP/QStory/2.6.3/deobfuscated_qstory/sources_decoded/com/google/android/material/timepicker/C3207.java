package com.google.android.material.timepicker;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import androidx.core.view.C2246;
import com.davemorrissey.labs.subscaleview.R;
import p124.C7413;
import p155.C7607;
import p155.C7610;

/* JADX INFO: renamed from: com.google.android.material.timepicker.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3207 extends C2246 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ ViewGroup f10844;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f10845;

    public /* synthetic */ C3207(int i, ViewGroup viewGroup) {
        this.f10845 = i;
        this.f10844 = viewGroup;
    }

    @Override // androidx.core.view.C2246
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo3591(View view, C7607 c7607) {
        int i = this.f10845;
        ViewGroup viewGroup = this.f10844;
        View.AccessibilityDelegate accessibilityDelegate = this.f6547;
        switch (i) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = c7607.f20630;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                c7607.m12836(((EditText) view).getText());
                accessibilityNodeInfo.setHintText(((ChipTextInputComboView) viewGroup).f10803.getText());
                accessibilityNodeInfo.setMaxTextLength(2);
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo2 = c7607.f20630;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                int iIntValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
                if (iIntValue > 0) {
                    accessibilityNodeInfo2.setTraversalAfter((View) ((ClockFaceView) viewGroup).f10816.get(iIntValue - 1));
                }
                c7607.m12841(C7413.m12642(view.isSelected(), 0, 1, iIntValue, 1));
                accessibilityNodeInfo2.setClickable(true);
                c7607.m12834(C7610.f20632);
                break;
        }
    }

    @Override // androidx.core.view.C2246
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public boolean mo4200(View view, int i, Bundle bundle) {
        switch (this.f10845) {
            case 1:
                ClockFaceView clockFaceView = (ClockFaceView) this.f10844;
                ClockHandView clockHandView = clockFaceView.f10818;
                Rect rect = clockFaceView.f10817;
                if (i == 16) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    view.getHitRect(rect);
                    float fCenterX = rect.centerX();
                    float fCenterY = rect.centerY();
                    clockHandView.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
                    clockHandView.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
                }
                break;
        }
        return super.mo4200(view, i, bundle);
    }
}
