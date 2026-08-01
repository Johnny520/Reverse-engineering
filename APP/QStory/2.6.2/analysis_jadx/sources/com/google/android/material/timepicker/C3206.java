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
import p124.C7412;
import p155.C7606;
import p155.C7609;

/* JADX INFO: renamed from: com.google.android.material.timepicker.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3206 extends C2246 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ ViewGroup f10839;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f10840;

    public /* synthetic */ C3206(int i, ViewGroup viewGroup) {
        this.f10840 = i;
        this.f10839 = viewGroup;
    }

    @Override // androidx.core.view.C2246
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo3581(View view, C7606 c7606) {
        int i = this.f10840;
        ViewGroup viewGroup = this.f10839;
        View.AccessibilityDelegate accessibilityDelegate = this.f6546;
        switch (i) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = c7606.f20635;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                c7606.m12807(((EditText) view).getText());
                accessibilityNodeInfo.setHintText(((ChipTextInputComboView) viewGroup).f10798.getText());
                accessibilityNodeInfo.setMaxTextLength(2);
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo2 = c7606.f20635;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                int iIntValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
                if (iIntValue > 0) {
                    accessibilityNodeInfo2.setTraversalAfter((View) ((ClockFaceView) viewGroup).f10811.get(iIntValue - 1));
                }
                c7606.m12812(C7412.m12615(view.isSelected(), 0, 1, iIntValue, 1));
                accessibilityNodeInfo2.setClickable(true);
                c7606.m12805(C7609.f20637);
                break;
        }
    }

    @Override // androidx.core.view.C2246
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public boolean mo4190(View view, int i, Bundle bundle) {
        switch (this.f10840) {
            case 1:
                ClockFaceView clockFaceView = (ClockFaceView) this.f10839;
                ClockHandView clockHandView = clockFaceView.f10813;
                Rect rect = clockFaceView.f10812;
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
        return super.mo4190(view, i, bundle);
    }
}
