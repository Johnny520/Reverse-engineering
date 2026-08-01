package com.google.android.material.button;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.C2246;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import p124.C7413;
import p155.C7607;
import p155.C7610;

/* JADX INFO: renamed from: com.google.android.material.button.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3100 extends C2246 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f10173;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f10174;

    public /* synthetic */ C3100(Object obj, int i) {
        this.f10174 = i;
        this.f10173 = obj;
    }

    @Override // androidx.core.view.C2246
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo3591(View view, C7607 c7607) {
        int i = this.f10174;
        Object obj = this.f10173;
        View.AccessibilityDelegate accessibilityDelegate = this.f6547;
        switch (i) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c7607.f20630);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i2 = MaterialButtonToggleGroup.f10129;
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
                c7607.m12841(C7413.m12642(((MaterialButton) view).f10110, 0, 1, i3, 1));
                break;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c7607.f20630);
                MaterialCalendar materialCalendar = (MaterialCalendar) obj;
                c7607.m12834(new C7610(16, materialCalendar.f10252.getVisibility() == 0 ? materialCalendar.m4458(R.string.mtrl_picker_toggle_to_year_selection) : materialCalendar.m4458(R.string.mtrl_picker_toggle_to_day_selection)));
                break;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo = c7607.f20630;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo.setCheckable(checkableImageButton.f10413);
                accessibilityNodeInfo.setChecked(checkableImageButton.f10414);
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo2 = c7607.f20630;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) obj;
                accessibilityNodeInfo2.setCheckable(navigationMenuItemView.f10430);
                accessibilityNodeInfo2.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", navigationMenuItemView.getResources().getString(R.string.item_view_role_description));
                break;
        }
    }

    @Override // androidx.core.view.C2246
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo4197(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f10174) {
            case 2:
                super.mo4197(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f10173).f10414);
                break;
            default:
                super.mo4197(view, accessibilityEvent);
                break;
        }
    }
}
