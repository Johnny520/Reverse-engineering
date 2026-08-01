package com.google.android.material.button;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.C2246;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import p124.C7412;
import p155.C7606;
import p155.C7609;

/* JADX INFO: renamed from: com.google.android.material.button.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3099 extends C2246 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f10168;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f10169;

    public /* synthetic */ C3099(Object obj, int i) {
        this.f10169 = i;
        this.f10168 = obj;
    }

    @Override // androidx.core.view.C2246
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo3581(View view, C7606 c7606) {
        int i = this.f10169;
        Object obj = this.f10168;
        View.AccessibilityDelegate accessibilityDelegate = this.f6546;
        switch (i) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c7606.f20635);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i2 = MaterialButtonToggleGroup.f10124;
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
                c7606.m12812(C7412.m12615(((MaterialButton) view).f10105, 0, 1, i3, 1));
                break;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c7606.f20635);
                MaterialCalendar materialCalendar = (MaterialCalendar) obj;
                c7606.m12805(new C7609(16, materialCalendar.f10247.getVisibility() == 0 ? materialCalendar.m4448(R.string.mtrl_picker_toggle_to_year_selection) : materialCalendar.m4448(R.string.mtrl_picker_toggle_to_day_selection)));
                break;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo = c7606.f20635;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo.setCheckable(checkableImageButton.f10408);
                accessibilityNodeInfo.setChecked(checkableImageButton.f10409);
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo2 = c7606.f20635;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) obj;
                accessibilityNodeInfo2.setCheckable(navigationMenuItemView.f10425);
                accessibilityNodeInfo2.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", navigationMenuItemView.getResources().getString(R.string.item_view_role_description));
                break;
        }
    }

    @Override // androidx.core.view.C2246
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo4187(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f10169) {
            case 2:
                super.mo4187(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f10168).f10409);
                break;
            default:
                super.mo4187(view, accessibilityEvent);
                break;
        }
    }
}
