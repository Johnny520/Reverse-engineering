package com.google.android.material.button;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.C3079;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import p140.C8242;
import p171.C8436;
import p171.C8439;

/* JADX INFO: renamed from: com.google.android.material.button.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3932 extends C3079 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f10518;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f10519;

    public /* synthetic */ C3932(Object obj, int i) {
        this.f10519 = i;
        this.f10518 = obj;
    }

    @Override // androidx.core.view.C3079
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo4151(View view, C8436 c8436) {
        int i = this.f10519;
        Object obj = this.f10518;
        View.AccessibilityDelegate accessibilityDelegate = this.f6892;
        switch (i) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c8436.f20975);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i2 = MaterialButtonToggleGroup.f10474;
                int i3 = -1;
                if (view instanceof MaterialButton) {
                    int i4 = 0;
                    int i5 = 0;
                    while (true) {
                        if (i4 < materialButtonToggleGroup.getChildCount()) {
                            if (materialButtonToggleGroup.getChildAt(i4) == view) {
                                i3 = i5;
                            } else {
                                if ((materialButtonToggleGroup.getChildAt(i4) instanceof MaterialButton) && materialButtonToggleGroup.getChildAt(i4).getVisibility() != 8) {
                                    i5++;
                                }
                                i4++;
                            }
                        }
                    }
                }
                c8436.m13400(C8242.m13201(((MaterialButton) view).f10455, 0, 1, i3, 1));
                break;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c8436.f20975);
                MaterialCalendar materialCalendar = (MaterialCalendar) obj;
                c8436.m13393(new C8439(16, materialCalendar.f10597.getVisibility() == 0 ? materialCalendar.m5018(C0328R.string.mtrl_picker_toggle_to_year_selection) : materialCalendar.m5018(C0328R.string.mtrl_picker_toggle_to_day_selection)));
                break;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo = c8436.f20975;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo.setCheckable(checkableImageButton.f10758);
                accessibilityNodeInfo.setChecked(checkableImageButton.f10759);
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo2 = c8436.f20975;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) obj;
                accessibilityNodeInfo2.setCheckable(navigationMenuItemView.f10775);
                accessibilityNodeInfo2.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", navigationMenuItemView.getResources().getString(C0328R.string.item_view_role_description));
                break;
        }
    }

    @Override // androidx.core.view.C3079
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo4757(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f10519) {
            case 2:
                super.mo4757(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f10518).f10759);
                break;
            default:
                super.mo4757(view, accessibilityEvent);
                break;
        }
    }
}
