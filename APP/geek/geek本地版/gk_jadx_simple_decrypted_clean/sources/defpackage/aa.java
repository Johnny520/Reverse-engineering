package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import com.ljx.wechatmod.R;

/* JADX INFO: loaded from: classes.dex */
public final class aa extends x {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ aa(int r1, Object r2) {
        this.d = r1;
        this.e = r2;
    }

    @Override // defpackage.x
    public void c(View r2, AccessibilityEvent r3) {
        switch(this.d) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        super.c(r2, r3);
        return;
    L6:
        super.c(r2, r3);
        r3.setChecked(((CheckableImageButton) this.e).d);
    }

    @Override // defpackage.x
    public final void d(View r7, j0 r8) {
        int r0 = this.d;
        Object r1 = this.e;
        View.AccessibilityDelegate r2 = this.a;
        switch(r0) {
            case 0: goto L29;
            case 1: goto L12;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        AccessibilityNodeInfo r82 = r8.a;
        r2.onInitializeAccessibilityNodeInfo(r7, r82);
        r82.setCheckable(((NavigationMenuItemView) r1).x);
        return;
    L6:
        AccessibilityNodeInfo r83 = r8.a;
        r2.onInitializeAccessibilityNodeInfo(r7, r83);
        ut r12 = (ut) r1;
        if (r12.c0.getVisibility() != 0) goto L9;
        String r72 = r12.z().getResources().getString(R.string.mtrl_picker_toggle_to_year_selection);
    L10:
        r83.setHintText(r72);
        return;
    L9:
        r72 = r12.z().getResources().getString(R.string.mtrl_picker_toggle_to_day_selection);
        goto L10
    L12:
        r2.onInitializeAccessibilityNodeInfo(r7, r8.a);
        MaterialButtonToggleGroup r13 = (MaterialButtonToggleGroup) r1;
        int r02 = MaterialButtonToggleGroup.k;
        int r3 = -1;
        if ((r7 instanceof MaterialButton) == false) goto L27;
        int r03 = 0;
        int r4 = 0;
    L17:
        if (r03 >= r13.getChildCount()) goto L27;
        if (r13.getChildAt(r03) == r7) goto L20;
        if ((r13.getChildAt(r03) instanceof MaterialButton) == false) goto L26;
        if (r13.c(r03) == false) goto L26;
        r4 = r4 + 1;
    L26:
        r03 = r03 + 1;
        goto L17
    L20:
        r3 = r4;
    L27:
        r8.f(i0.a(((MaterialButton) r7).o, 0, 1, r3, 1));
        return;
    L29:
        AccessibilityNodeInfo r84 = r8.a;
        r2.onInitializeAccessibilityNodeInfo(r7, r84);
        CheckableImageButton r14 = (CheckableImageButton) r1;
        r84.setCheckable(r14.e);
        r84.setChecked(r14.d);
    }
}
