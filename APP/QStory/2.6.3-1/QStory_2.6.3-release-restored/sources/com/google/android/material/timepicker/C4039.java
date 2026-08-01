package com.google.android.material.timepicker;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import androidx.core.view.C3079;
import com.davemorrissey.labs.subscaleview.C0328R;
import p140.C8242;
import p171.C8436;
import p171.C8439;

/* JADX INFO: renamed from: com.google.android.material.timepicker.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4039 extends C3079 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ ViewGroup f11189;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f11190;

    public /* synthetic */ C4039(int i, ViewGroup viewGroup) {
        this.f11190 = i;
        this.f11189 = viewGroup;
    }

    @Override // androidx.core.view.C3079
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo4151(View view, C8436 c8436) {
        int i = this.f11190;
        ViewGroup viewGroup = this.f11189;
        View.AccessibilityDelegate accessibilityDelegate = this.f6892;
        switch (i) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = c8436.f20975;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                c8436.m13395(((EditText) view).getText());
                accessibilityNodeInfo.setHintText(((ChipTextInputComboView) viewGroup).f11148.getText());
                accessibilityNodeInfo.setMaxTextLength(2);
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo2 = c8436.f20975;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                int iIntValue = ((Integer) view.getTag(C0328R.id.material_value_index)).intValue();
                if (iIntValue > 0) {
                    accessibilityNodeInfo2.setTraversalAfter((View) ((ClockFaceView) viewGroup).f11161.get(iIntValue - 1));
                }
                c8436.m13400(C8242.m13201(view.isSelected(), 0, 1, iIntValue, 1));
                accessibilityNodeInfo2.setClickable(true);
                c8436.m13393(C8439.f20977);
                break;
        }
    }

    @Override // androidx.core.view.C3079
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public boolean mo4760(View view, int i, Bundle bundle) {
        switch (this.f11190) {
            case 1:
                ClockFaceView clockFaceView = (ClockFaceView) this.f11189;
                ClockHandView clockHandView = clockFaceView.f11163;
                Rect rect = clockFaceView.f11162;
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
        return super.mo4760(view, i, bundle);
    }
}
